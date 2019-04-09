package testTransformer;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.google.gson.Gson;

import dcpDescription.DcpIPv4Type;
import dcpDescription.DcpSlaveDescription;
import dcpDescription.DcpSlaveDescription.TransportProtocols.TCPIPv4;
import dcpDescription.DcpVariable;
import dcpTestExtension.AddTransition;
import dcpTestExtension.AddTransition.Receiving;
import dcpTestExtension.AddTransition.Sending;
import dcpTestExtension.AddTransition.Sending.ClockTime;
import dcpTestExtension.DcpTestSuiteExtension;
import dcpTestExtension.ExtensionSet;
import dcpTestExtension.ForEach;
import dcpTestExtension.If;
import dcpTestExtension.IfVariableNotInDcpSlaveDescription;
import dcpTestExtension.Update;
import dcpTestExtension.UpdateMaxStep;
import dcpTestProcedure.DcpTestProcedure;
import dcpTestProcedure.DcpTestProcedure.Transition;
import main.Launcher;
import objectCreatorHelper.TransitionCreator;
import util.Environment;
import util.SetHelper;
import wrappers.DcpWrapper;

/**
 * This class is used to transform a basic path template xml file into a fully
 * test xml file, using the expansion steps described in the loaded test
 * extension procedure xml file and using the information from the loaded dcp
 * slave description xml file
 * 
 * 
 *
 */
public class TestTransformer {

	private DcpWrapper dcpWrapper;
	private DcpTestSuiteExtension testExtension;
	private DcpTestProcedure templateProcedure;
	private SetHelper setHelper;
	private long nextUnusedNodeNumber;
	private List<Transition> newTransitions;
	private Gson gson;
	private Environment environment;
	private String slavePort;
	private String slaveIp;

	/**
	 * Class constructor
	 * 
	 * @param dcpD          - the dcp slave description object
	 * @param testTemplate  - the basic path template object
	 * @param testExtension - the template extension object
	 * @param testerIp      - the tester ip that should be used during the expanding
	 *                      process
	 * @param testerPort    - the tester port that should be used during the
	 *                      expanding process
	 * 
	 * @param slaveUdpPort  - the udp port of the slave given as program parameter
	 * 
	 * @param slaveUdpIp    - the udp ip of the slave given as program parameter
	 */
	public TestTransformer(DcpSlaveDescription dcpD, DcpTestProcedure testTemplate, DcpTestSuiteExtension testExtension,
			String testerIp, String testerPort, String slavePort, String slaveIp) {

		dcpWrapper = new DcpWrapper(dcpD, 1, slavePort, slaveIp);

		gson = new Gson();
		this.testExtension = testExtension;
		templateProcedure = testTemplate;
		setHelper = new SetHelper(dcpWrapper, templateProcedure, newTransitions);
		environment = new Environment(dcpWrapper, templateProcedure, testerIp, testerPort, slavePort, slaveIp);
		nextUnusedNodeNumber = 0;
		this.slavePort = slavePort;
		this.slaveIp = slaveIp;

		// nextUnusedNodeNumber is max node Number +1
		for (Transition t : templateProcedure.getTransition()) {

			if (t.getFrom() > nextUnusedNodeNumber) {
				nextUnusedNodeNumber = t.getFrom();
			}

			if (t.getTo() > nextUnusedNodeNumber) {
				nextUnusedNodeNumber = t.getTo();
			}

		}

		nextUnusedNodeNumber++;

		newTransitions = new LinkedList<>();
	}

	/**
	 * Function generates a expanded test xml file according to the loaded test
	 * expansion xml, the loaded dcp slave description and the basic path xml file,
	 * which path is passed to this function as an argument
	 * 
	 * @param pathToXml - path to the basic path template
	 */
	public void generateFinalTestProcedure(String pathToXml, boolean printOutPath) {

		if (Launcher.DEBUG) {
			System.out.println("Generating file for : " + pathToXml);
		}

		copyAcuDrivers();

		// All the xml extension nodes from the extension xml file
		List<Object> xmlNodes = testExtension.getExtensionSetOrForEachOrAddTransition();

		// handle each xml node individually
		for (Object xmlNode : xmlNodes) {

			// create and pass a new hashMap that holds local variables during
			// the recursive process of xml node processing.
			// the map holds information that should be passed to following,
			// recursive called functions like the current state for example,
			// for which
			// the outer handleXmlNode function was called.
			// the handleXmlNode takes also a OuterIterationContext-String
			// (optional) that specifies for which outer XmlNode a following
			// recursive function call
			// was made
			handleXmlNode(xmlNode, new HashMap<String, Object>(), 0, "");

		}

		// Add All new generated Transitions to Set of current Transitions
		for (Transition t : newTransitions) {
			templateProcedure.getTransition().add(t);
		}

		templateProcedure.setName("Final_" + templateProcedure.getName());

		// Write the final testXmlFile
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(DcpTestProcedure.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			String fileName = templateProcedure.getName();
			File file = new File(pathToXml);
			jaxbMarshaller.marshal(templateProcedure, file);
		} catch (JAXBException e) {

			System.out.println("Error occured while writing final xml test file");
			e.printStackTrace();
			System.exit(1);
		}

		// Uncomment following lines to check generated transition set for
		// reachability (useful for debug)

		if (Launcher.DEBUG) {
			Stack<Long> reachableSteps = new Stack<>();
			List<Long> reachableStepsList = new ArrayList<>();

			reachableSteps.add(0L);
			reachableStepsList.add(0L);

			while (!reachableSteps.isEmpty()) {

				Long start = reachableSteps.pop();
				for (Transition t : templateProcedure.getTransition()) {

					if (t.getFrom() == start && !reachableStepsList.contains(t.getTo())) {
						reachableSteps.add(t.getTo());
						reachableStepsList.add(t.getTo());
					}

				}

			}

			Set<Long> allSteps = new HashSet<>();

			for (Transition t : templateProcedure.getTransition()) {

				allSteps.add(t.getFrom());
				allSteps.add(t.getTo());

			}

			if (reachableStepsList.size() == allSteps.size()) {

				System.out.println("Valid Path  ");
			} else {

				System.out.println("Invalid Path");

				for (Long l : allSteps) {

					if (!reachableStepsList.contains(l)) {
						System.out.println("Not reachable --> " + l);
					}

				}

			}
		}
		if(Launcher.DEBUG || printOutPath) {
			System.out.println(pathToXml + " generated");
		}

	}

	// Copy all the dcp Driver Information from the test procedure to the
	// expanded test file
	private void copyAcuDrivers() {

		DcpTestProcedure.TransportProtocols drivers = new DcpTestProcedure.TransportProtocols();

		DcpSlaveDescription desc = dcpWrapper.getDcpDesc();

		if (desc.getTransportProtocols().getTCPIPv4() != null) {

			DcpTestProcedure.TransportProtocols.TCPIPv4 tcp = new DcpTestProcedure.TransportProtocols.TCPIPv4();

			DcpTestProcedure.TransportProtocols.TCPIPv4.Control tcpControl = new DcpTestProcedure.TransportProtocols.TCPIPv4.Control();

			DcpTestProcedure.TransportProtocols.TCPIPv4.DATInputOutput tcpDatInputOutput = null;

			DcpTestProcedure.TransportProtocols.TCPIPv4.DATInputOutput.AvailablePort tcpDatInputOutputPort = null;

			DcpTestProcedure.TransportProtocols.TCPIPv4.DATInputOutput.AvailablePortRange tcpDatInputOutputPortRange = null;

			DcpTestProcedure.TransportProtocols.TCPIPv4.DATParameter tcpParam = null;
			DcpTestProcedure.TransportProtocols.TCPIPv4.DATParameter.AvailablePort tcpParamPort = null;
			DcpTestProcedure.TransportProtocols.TCPIPv4.DATParameter.AvailablePortRange tcpParamPortRange = null;

			if (dcpWrapper.getTcpParamPortRange() != null) {

				tcpParam = new DcpTestProcedure.TransportProtocols.TCPIPv4.DATParameter();
				tcpParamPortRange = new DcpTestProcedure.TransportProtocols.TCPIPv4.DATParameter.AvailablePortRange();
				tcpParamPortRange.setFrom(dcpWrapper.getTcpParamPortRange().getFrom());
				tcpParamPortRange.setTo(dcpWrapper.getTcpParamPortRange().getTo());
				tcpParam.setAvailablePortRange(tcpParamPortRange);
			}
			if (dcpWrapper.getTcpParamPort() != null) {
				if (tcpParam == null) {
					tcpParam = new DcpTestProcedure.TransportProtocols.TCPIPv4.DATParameter();
				}
				tcpParamPort = new DcpTestProcedure.TransportProtocols.TCPIPv4.DATParameter.AvailablePort();
				tcpParamPort.setPort(dcpWrapper.getTcpParamPort().getPort());
				tcpParam.setAvailablePort(tcpParamPort);
			}
			if (dcpWrapper.getTcpParamIp() != null) {
				if (tcpParam == null) {
					tcpParam = new DcpTestProcedure.TransportProtocols.TCPIPv4.DATParameter();
				}
				tcpParam.setHost(dcpWrapper.getTcpParamIp());
			}
			if (dcpWrapper.getTcpDatInputOutputPortRange() != null) {

				tcpDatInputOutputPortRange = new DcpTestProcedure.TransportProtocols.TCPIPv4.DATInputOutput.AvailablePortRange();
				tcpDatInputOutput = new DcpTestProcedure.TransportProtocols.TCPIPv4.DATInputOutput();
				tcpDatInputOutputPortRange.setFrom(dcpWrapper.getTcpDatInputOutputPortRange().getFrom());
				tcpDatInputOutputPortRange.setTo(dcpWrapper.getTcpDatInputOutputPortRange().getTo());
				tcpDatInputOutput.setAvailablePortRange(tcpDatInputOutputPortRange);
				tcpDatInputOutput.setHost(dcpWrapper.getTcpDatInputOutputIp());
			}
			if (dcpWrapper.getTcpDatInputOutputPort() != null) {
				tcpDatInputOutputPort = new DcpTestProcedure.TransportProtocols.TCPIPv4.DATInputOutput.AvailablePort();
				if (tcpDatInputOutput == null) {
					tcpDatInputOutput = new DcpTestProcedure.TransportProtocols.TCPIPv4.DATInputOutput();
				}
				tcpDatInputOutputPort.setPort(dcpWrapper.getTcpDatInputOutputPort().getPort());
				tcpDatInputOutput.setAvailablePort(tcpDatInputOutputPort);
				tcpDatInputOutput.setHost(dcpWrapper.getTcpDatInputOutputIp());
			}
			boolean hasTcpControl = false;
			try {
				if (dcpWrapper.getTcpControl() != null && dcpWrapper.getTcpControl().getHost() != null
						&& dcpWrapper.getTcpControl().getPort() != null) {
					hasTcpControl = true;
				}
			} catch (NullPointerException e) {
			}
			if ((slavePort == null || slaveIp == null) && !hasTcpControl) {
				System.err.println("Error : No tcp port and ip configured in the xml file or given as parameter");
				System.exit(1);
			}
			if (slavePort != null && !slavePort.trim().equals("") && hasTcpControl) {
				try {
					tcpControl.setPort(Integer.parseInt(slavePort));
				} catch (NumberFormatException e) {
					System.out.println("Error : Slave tcp port given as parameter must be a number");
					System.exit(1);
				}
			}
			if (slavePort != null && !slavePort.trim().equals("") && !hasTcpControl) {
				try {
					tcpControl.setPort(Integer.parseInt(slavePort));
				} catch (NumberFormatException e) {
					System.err.println("Error : Slave tcp port given as parameter must be a number");
					System.exit(1);
				}
			}
			if ((slavePort == null || slavePort != null && slavePort.trim().equals("")) && hasTcpControl) {
				tcpControl.setPort(dcpWrapper.getTcpControl().getPort());
			}
			if (slaveIp != null && !slaveIp.trim().equals("") && hasTcpControl) {
				try {
					tcpControl.setHost(slaveIp);
				} catch (NumberFormatException e) {
					System.out.println("Error : Slave tcp ip given as parameter must be a number");
					System.exit(1);
				}
			}
			if (slaveIp != null && !slaveIp.trim().equals("") && !hasTcpControl) {
				try {
					tcpControl.setHost(slaveIp);
				} catch (NumberFormatException e) {
					System.err.println("Error : Slave tcp ip given as parameter must be a number");
					System.exit(1);
				}
			}
			if ((slaveIp == null || slaveIp.trim().equals("")) && hasTcpControl) {
				tcpControl.setHost(dcpWrapper.getTcpControl().getHost());
			}
			if (tcpParam != null) {
				tcp.setDATParameter(tcpParam);
			}
			if (tcpDatInputOutput != null) {
				tcp.setDATInputOutput(tcpDatInputOutput);
			}
			tcp.setControl(tcpControl);

			drivers.setTCPIPv4(tcp);
		}

		if (dcpWrapper.isBluetoothSupported()) {

			DcpTestProcedure.TransportProtocols.Bluetooth bluetooth = new DcpTestProcedure.TransportProtocols.Bluetooth();
			DcpTestProcedure.TransportProtocols.Bluetooth.Address bluetoothAddress = new DcpTestProcedure.TransportProtocols.Bluetooth.Address();

			DcpSlaveDescription.TransportProtocols.Bluetooth bluetoothInfo = dcpWrapper.getDcpDesc()
					.getTransportProtocols().getBluetooth();

			bluetoothAddress.setPort(bluetoothInfo.getAddress().getPort());

			bluetoothAddress.setAlias(bluetoothInfo.getAddress().getAlias());
			bluetoothAddress.setBdAddr(bluetoothInfo.getAddress().getBdAddr());

			bluetooth.setAddress(bluetoothAddress);
			drivers.setBluetooth(bluetooth);
		}
		if (dcpWrapper.isUdpSupported()) {

			DcpTestProcedure.TransportProtocols.UDPIPv4 udp = new DcpTestProcedure.TransportProtocols.UDPIPv4();

			DcpTestProcedure.TransportProtocols.UDPIPv4.Control udpControl = new DcpTestProcedure.TransportProtocols.UDPIPv4.Control();

			DcpTestProcedure.TransportProtocols.UDPIPv4.DATInputOutput udpDatInputOutput = null;

			DcpTestProcedure.TransportProtocols.UDPIPv4.DATInputOutput.AvailablePort udpDatInputOutputPort = null;

			DcpTestProcedure.TransportProtocols.UDPIPv4.DATInputOutput.AvailablePortRange udpDatInputOutputPortRange = null;

			DcpTestProcedure.TransportProtocols.UDPIPv4.DATParameter udpParam = null;
			DcpTestProcedure.TransportProtocols.UDPIPv4.DATParameter.AvailablePort udpParamPort = null;
			DcpTestProcedure.TransportProtocols.UDPIPv4.DATParameter.AvailablePortRange udpParamPortRange = null;

			if (dcpWrapper.getUdpParamPortRange() != null) {

				udpParam = new DcpTestProcedure.TransportProtocols.UDPIPv4.DATParameter();
				udpParamPortRange = new DcpTestProcedure.TransportProtocols.UDPIPv4.DATParameter.AvailablePortRange();
				udpParamPortRange.setFrom(dcpWrapper.getUdpParamPortRange().getFrom());
				udpParamPortRange.setTo(dcpWrapper.getUdpParamPortRange().getTo());
				udpParam.setAvailablePortRange(udpParamPortRange);
			}
			if (dcpWrapper.getUdpParamPort() != null) {
				if (udpParam == null) {
					udpParam = new DcpTestProcedure.TransportProtocols.UDPIPv4.DATParameter();
				}
				udpParamPort = new DcpTestProcedure.TransportProtocols.UDPIPv4.DATParameter.AvailablePort();
				udpParamPort.setPort(dcpWrapper.getUdpParamPort().getPort());
				udpParam.setAvailablePort(udpParamPort);
			}
			if (dcpWrapper.getUdpParamIp() != null) {
				if (udpParam == null) {
					udpParam = new DcpTestProcedure.TransportProtocols.UDPIPv4.DATParameter();
				}
				udpParam.setHost(dcpWrapper.getUdpParamIp());
			}
			if (dcpWrapper.getUdpDatInputOutputPortRange() != null) {

				udpDatInputOutputPortRange = new DcpTestProcedure.TransportProtocols.UDPIPv4.DATInputOutput.AvailablePortRange();
				udpDatInputOutput = new DcpTestProcedure.TransportProtocols.UDPIPv4.DATInputOutput();
				udpDatInputOutputPortRange.setFrom(dcpWrapper.getUdpDatInputOutputPortRange().getFrom());
				udpDatInputOutputPortRange.setTo(dcpWrapper.getUdpDatInputOutputPortRange().getTo());
				udpDatInputOutput.setAvailablePortRange(udpDatInputOutputPortRange);
				udpDatInputOutput.setHost(dcpWrapper.getUdpDatInputOutputIp());
			}
			if (dcpWrapper.getUdpDatInputOutputPort() != null) {
				udpDatInputOutputPort = new DcpTestProcedure.TransportProtocols.UDPIPv4.DATInputOutput.AvailablePort();
				if (udpDatInputOutput == null) {
					udpDatInputOutput = new DcpTestProcedure.TransportProtocols.UDPIPv4.DATInputOutput();
				}
				udpDatInputOutputPort.setPort(dcpWrapper.getUdpDatInputOutputPort().getPort());
				udpDatInputOutput.setAvailablePort(udpDatInputOutputPort);
				udpDatInputOutput.setHost(dcpWrapper.getUdpDatInputOutputIp());
			}
			boolean hasUdpControl = false;
			try {
				if (dcpWrapper.getUdpControl() != null && dcpWrapper.getUdpControl().getHost() != null
						&& dcpWrapper.getUdpControl().getPort() != null) {
					hasUdpControl = true;
				}
			} catch (NullPointerException e) {
			}
			if ((slavePort == null || slaveIp == null) && !hasUdpControl) {
				System.err.println("Error : No udp port and ip configured in the xml file or given as parameter");
				System.exit(1);
			}
			if (slavePort != null && !slavePort.trim().equals("") && hasUdpControl) {
				try {
					udpControl.setPort(Integer.parseInt(slavePort));
				} catch (NumberFormatException e) {
					System.out.println("Error : Slave udp port given as parameter must be a number");
					System.exit(1);
				}
			}
			if (slavePort != null && !slavePort.trim().equals("") && !hasUdpControl) {
				try {
					udpControl.setPort(Integer.parseInt(slavePort));
				} catch (NumberFormatException e) {
					System.err.println("Error : Slave udp port given as parameter must be a number");
					System.exit(1);
				}
			}
			if ((slavePort == null || slavePort != null && slavePort.trim().equals("")) && hasUdpControl) {
				udpControl.setPort(dcpWrapper.getUdpControl().getPort());
			}
			if (slaveIp != null && !slaveIp.trim().equals("") && hasUdpControl) {
				try {
					udpControl.setHost(slaveIp);
				} catch (NumberFormatException e) {
					System.out.println("Error : Slave udp ip given as parameter must be a number");
					System.exit(1);
				}
			}
			if (slaveIp != null && !slaveIp.trim().equals("") && !hasUdpControl) {
				try {
					udpControl.setHost(slaveIp);
				} catch (NumberFormatException e) {
					System.err.println("Error : Slave udp ip given as parameter must be a number");
					System.exit(1);
				}
			}
			if ((slaveIp == null || slaveIp.trim().equals("")) && hasUdpControl) {
				udpControl.setHost(dcpWrapper.getUdpControl().getHost());
			}
			if (udpParam != null) {
				udp.setDATParameter(udpParam);
			}
			if (udpDatInputOutput != null) {
				udp.setDATInputOutput(udpDatInputOutput);
			}
			udp.setControl(udpControl);

			drivers.setUDPIPv4(udp);
		}
		if (dcpWrapper.isUsbSupported()) {

			DcpTestProcedure.TransportProtocols.USB usb = new DcpTestProcedure.TransportProtocols.USB();

			DcpTestProcedure.TransportProtocols.USB.DataPipe usbDataPipe = new DcpTestProcedure.TransportProtocols.USB.DataPipe();

			usbDataPipe.setDirection(dcpWrapper.getUsbDataPipe().getDirection());
			usbDataPipe.setEndpointAddress(dcpWrapper.getUsbDataPipe().getEndpointAddress());
			usbDataPipe.setIntervall(dcpWrapper.getUsbDataPipe().getIntervall());
			usb.getDataPipe().add(usbDataPipe);
			drivers.setUSB(usb);
		}

		templateProcedure.setTransportProtocols(drivers);

	}

	// Handle the xml expansion Node "ExtensionSet"
	private void handleExtensionSetItem(ExtensionSet extSetItem) {

		List<Object> xmlNodes = extSetItem.getAddTransitionOrUpdateMaxStepOrForEach();

		// Create a copy of used map and put the current state, that should be
		// expanded , into the map
		Map<String, Object> env = new HashMap<>();
		env.put("state", extSetItem.getState());

		short currentStateId = extSetItem.getState();

		// List of accepting states from the basic path Xml (no expansion needed
		// of this states)
		List<Long> acceptingStatesList = templateProcedure.getAcceptingSteps();

		for (int i = 0; i < templateProcedure.getTransition().size(); i++) {

			Transition t = templateProcedure.getTransition().get(i);

			// first node should be expanded
			boolean isFirstNode = t.getFrom() == 0 && currentStateId == 0 && t.getTo() == 1;
			// each Node that represents a new entered state should be expanded
			boolean isNodeAfterStateChanged = t.getReceiving() != null && t.getReceiving().getNTFStateChanged() != null
					&& t.getReceiving().getNTFStateChanged().getStateId() == currentStateId;

			if (isFirstNode || isNodeAfterStateChanged) {

				long startNode = isFirstNode ? 0 : t.getTo();

				if (!acceptingStatesList.contains(startNode)) {

					long entry = nextUnusedNodeNumber;

					// Handle each xml Node inside the "ExtensionSet" Node for
					// the current state
					for (Object xmlNode : xmlNodes) {

						handleXmlNode(xmlNode, env, startNode, "");

					}

					// change the node numbers / order of transitions according
					// to the new generated transitions
					for (int y = 0; y < templateProcedure.getTransition().size(); y++) {

						Transition trans = templateProcedure.getTransition().get(y);

						if (trans.getFrom() == startNode && trans.getTo() == startNode) {
							trans.setFrom(nextUnusedNodeNumber);
							trans.setTo(nextUnusedNodeNumber);
						}

						if (trans.getFrom() == startNode) {
							trans.setFrom(nextUnusedNodeNumber);
						}

						if (trans.getFrom() == entry && trans.getTo() == entry) {
							trans.setFrom(startNode);
							trans.setTo(startNode);
						}

						if (trans.getFrom() == entry) {
							trans.setFrom(startNode);
						}

					}

					for (int y = 0; y < newTransitions.size(); y++) {

						Transition trans = newTransitions.get(y);

						if (trans.getFrom() == startNode && trans.getTo() == startNode) {
							trans.setFrom(nextUnusedNodeNumber);
							trans.setTo(nextUnusedNodeNumber);
						}

						if (trans.getFrom() == startNode) {
							trans.setFrom(nextUnusedNodeNumber);
						}

						if (trans.getFrom() == entry && trans.getTo() == entry) {
							trans.setFrom(startNode);
							trans.setTo(startNode);
						}

						if (trans.getFrom() == entry) {
							trans.setFrom(startNode);
						}

						newTransitions.set(y, trans);
					}

					// Pass the new generated Transitions to the javascript
					// engine
					environment.updateEnvironmentTransitionSet(templateProcedure, newTransitions);

					nextUnusedNodeNumber++;

				}
			}
		}

	}

	// handle the UpdateMaxStep xml expansion Node
	private void handleUpdateMaxStep(UpdateMaxStep updateMaxItem) {

		nextUnusedNodeNumber = nextUnusedNodeNumber + updateMaxItem.getIncrease().intValue();

	}

	// Handle a xml Node from the expansion xml file
	private void handleXmlNode(Object xmlNode, Map<String, Object> env, long startNode, String outerIterationContext) {

		String objectClass = xmlNode.getClass().getName().substring(xmlNode.getClass().getName().lastIndexOf(".") + 1);

		// Call a special handle function according to the class of the xml node
		switch (objectClass) {

		case "ExtensionSet":

			dcpTestExtension.ExtensionSet extSet = (dcpTestExtension.ExtensionSet) xmlNode;
			handleExtensionSetItem(extSet);

			break;

		case "AddTransition":

			AddTransition addTransItem = (AddTransition) xmlNode;
			handleAddTransition(addTransItem, env, startNode);

			break;

		case "IfVariableNotInDcpSlaveDescription":

			IfVariableNotInDcpSlaveDescription ifVNot = (IfVariableNotInDcpSlaveDescription) xmlNode;
			handleIfVariableNotInDcpSlaveDescription(ifVNot, env, startNode, outerIterationContext);

			break;

		case "UpdateMaxStep":

			UpdateMaxStep updateMaxItem = (UpdateMaxStep) xmlNode;
			handleUpdateMaxStep(updateMaxItem);

			break;

		case "If":

			If ifItem = (If) xmlNode;
			handleIfItem(ifItem, env, startNode);

			break;

		case "ForEach":

			ForEach forEachItem2 = (ForEach) xmlNode;
			handleForEach(forEachItem2, env, startNode);

			break;

		case "Update":

			Update updateItem = (Update) xmlNode;
			handleUpdate(updateItem, env, startNode);

			break;

		default:

			System.err.println("Error : Unkown XmlNode : " + xmlNode.getClass().getName());
			System.exit(1);

			break;

		}

	}

	// Handle a ForEach xml Node from the expansion xml file
	private void handleForEach(ForEach forEachItem, Map<String, Object> oldEnv, long startNode) {

		Map<String, Object> env = new HashMap<>(oldEnv);
		env.put("variableName", forEachItem.getVariableName());

		// ForEach Node was specified for OpModes as Iteration Set
		if (forEachItem.getSet().getDcpOpModes() != null) {

			List<Short> opModes = setHelper.getAllDcpOpModes();

			// Iterate through all opModes
			for (Short opMode : opModes) {

				// Put the current opMode under the variable name, that is used
				// as the iteration variable
				env.put((String) env.get("variableName"), opMode);
				List<Object> xmlNodes = forEachItem.getAddTransitionOrIfVariableNotInDcpSlaveDescriptionOrIf();

				for (Object xmlNode : xmlNodes) {

					handleXmlNode(xmlNode, env, startNode, "opMode");

				}

			}

		}

		// For Each Node was specified for the dcp States
		if (forEachItem.getSet().getDcpStates() != null) {

			List<Short> dcpStates = setHelper.getAllDcpStates();

			for (Short dcpState : dcpStates) {

				// Put current state under the variable Name, used as the
				// iteration variable
				env.put((String) env.get("variableName"), dcpState);

				List<Object> xmlNodes = forEachItem.getAddTransitionOrIfVariableNotInDcpSlaveDescriptionOrIf();

				for (Object xmlNode : xmlNodes) {

					handleXmlNode(xmlNode, env, startNode, "aciState");

				}
			}

		}

		// For Each Node was specified for the dcp Transport protocols
		if (forEachItem.getSet().getDcpTransportProtocols() != null) {

			List<Short> acuTransportProtocols = setHelper.getAllDcpTransportProtocols();

			for (Short proto : acuTransportProtocols) {

				// Put current transport protocol under the variable name, that
				// is used as iteration variable
				env.put((String) env.get("variableName"), proto);

				List<Object> xmlNodes = forEachItem.getAddTransitionOrIfVariableNotInDcpSlaveDescriptionOrIf();

				for (Object xmlNode : xmlNodes) {

					handleXmlNode(xmlNode, env, startNode, "transportProtocol");

				}

			}

		}

		// For Each Node was specified for the slave Inputs
		if (forEachItem.getSet().getSlaveInputs() != null) {

			List<DcpVariable> inputVariables = dcpWrapper.getInputs();

			for (DcpVariable v : inputVariables) {

				// Put current slave input variable into the javascript engine
				environment.eval("var " + forEachItem.getVariableName() + " = JSON.parse('" + gson.toJson(v) + "');");

				List<Object> xmlNodes = forEachItem.getAddTransitionOrIfVariableNotInDcpSlaveDescriptionOrIf();

				for (Object xmlNode : xmlNodes) {

					handleXmlNode(xmlNode, env, startNode, "slaveInput");

				}

			}

		}

		// For Each Node was specified for the slave output variables
		if (forEachItem.getSet().getSlaveOutputs() != null) {

			List<DcpVariable> outputVariables = dcpWrapper.getOutputs();

			for (DcpVariable v : outputVariables) {

				// write every output Variable in a javascript variable named
				// after the current loop variable

				environment.eval("var " + forEachItem.getVariableName() + " = JSON.parse('" + gson.toJson(v) + "');");

				List<Object> xmlNodes = forEachItem.getAddTransitionOrIfVariableNotInDcpSlaveDescriptionOrIf();

				for (Object xmlNode : xmlNodes) {

					handleXmlNode(xmlNode, env, startNode, "slaveOutput");

				}

			}

		}

		// For Each Node was specified for the slave parameters variables
		if (forEachItem.getSet().getSlaveParameters() != null) {

			List<DcpVariable> params = dcpWrapper.getParameter();

			for (DcpVariable param : params) {

				// Put each slave parameter variable into the javascript engine
				environment
						.eval("var " + forEachItem.getVariableName() + " = JSON.parse('" + gson.toJson(param) + "');");

				List<Object> xmlNodes = forEachItem.getAddTransitionOrIfVariableNotInDcpSlaveDescriptionOrIf();

				for (Object xmlNode : xmlNodes) {

					handleXmlNode(xmlNode, env, startNode, "slaveParameter");

				}

			}

		}

		// For Each Node was specified for the slave tunable parameters
		// variables
		if (forEachItem.getSet().getSlaveTunableParameters() != null) {

			List<DcpVariable> tParams = dcpWrapper.getTunableParameter();

			for (DcpVariable tparam : tParams) {

				// Put the current slave tunable parameter into the javascript
				// engine
				environment
						.eval("var " + forEachItem.getVariableName() + " = JSON.parse('" + gson.toJson(tparam) + "');");

				List<Object> xmlNodes = forEachItem.getAddTransitionOrIfVariableNotInDcpSlaveDescriptionOrIf();

				for (Object xmlNode : xmlNodes) {

					handleXmlNode(xmlNode, env, startNode, "slaveTunableParameter");

				}

			}

		}

		// For Each Node was specified for all the test steps (node numbers)
		if (forEachItem.getSet().getTestSteps() != null) {

			Set<Long> testStates = new HashSet<>();
			testStates.addAll(setHelper.getAllTestSteps(newTransitions));
			testStates.addAll(setHelper.getAllTestSteps(templateProcedure.getTransition()));

			for (Long testState : testStates) {

				// Put current node number into the env-map
				env.put((String) env.get("variableName"), testState);

				List<Object> xmlNodes = forEachItem.getAddTransitionOrIfVariableNotInDcpSlaveDescriptionOrIf();

				for (Object xmlNode : xmlNodes) {

					handleXmlNode(xmlNode, env, startNode, "testStep");

				}

			}

		}

		// For Each Node was specified for a test successor transition set for a
		// specific node
		if (forEachItem.getSet().getTestSuccessor() != null) {

			List<Transition> transitions = setHelper.getAllTestSuccessor(
					environment.getFromEnvironment(env, forEachItem.getSet().getTestSuccessor().getStepVariable()),
					newTransitions);

			for (Transition transition : transitions) {

				// Put the current transition into the javascript engine
				environment.eval(
						"var " + forEachItem.getVariableName() + " = JSON.parse('" + gson.toJson(transition) + "');");

				List<Object> xmlNodes = forEachItem.getAddTransitionOrIfVariableNotInDcpSlaveDescriptionOrIf();

				for (Object xmlNode : xmlNodes) {

					handleXmlNode(xmlNode, env, startNode, "testSuccessor");

				}

			}

		}

		// For Each Node was specified for all available Transitions
		if (forEachItem.getSet().getTestTransitions() != null) {

			List<Transition> transitions = setHelper.getAllTestTransitions(newTransitions);

			for (Transition transition : transitions) {

				// Put the current transition into the javascript engine
				environment.eval(
						"var " + forEachItem.getVariableName() + " = JSON.parse('" + gson.toJson(transition) + "');");

				List<Object> xmlNodes = forEachItem.getAddTransitionOrIfVariableNotInDcpSlaveDescriptionOrIf();

				for (Object xmlNode : xmlNodes) {

					handleXmlNode(xmlNode, env, startNode, "testTransition");

				}

			}

		}

		// For Each Node was specified for range of integers
		if (forEachItem.getSet().getIntegerRange() != null) {

			int min = forEachItem.getSet().getIntegerRange().getMin().intValue();
			int max = forEachItem.getSet().getIntegerRange().getMax().intValue();
			List<Integer> intList = setHelper.getIntegerRange(min, max);

			for (Integer integer : intList) {

				// Put the current integer into the environment
				env.put((String) env.get("variableName"), integer);

				List<Object> xmlNodes = forEachItem.getAddTransitionOrIfVariableNotInDcpSlaveDescriptionOrIf();

				for (Object xmlNode : xmlNodes) {

					handleXmlNode(xmlNode, env, startNode, "intRange");

				}

			}

		}

	}

	// Handle a If Variable Not In Slave Description
	private void handleIfVariableNotInDcpSlaveDescription(IfVariableNotInDcpSlaveDescription ifVNot,
			Map<String, Object> envOld, long startNode, String forWhat) {

		Map<String, Object> env = new HashMap<>(envOld);

		if (forWhat.equals("opMode")) {

			if (dcpWrapper.currentOpModeNotSupported((short) environment.getFromEnvironment(env,
					(String) environment.getFromEnvironment(env, "variableName")))) {

				List<Object> xmlNodes = ifVNot.getAddTransitionOrForEachOrIf();

				for (Object xmlNode : xmlNodes) {

					handleXmlNode(xmlNode, env, startNode, "opMode");

				}
			}

		}

		if (forWhat.equals("transportProtocol")) {

			if (dcpWrapper.currentProtocolNotSupported((short) environment.getFromEnvironment(env,
					(String) environment.getFromEnvironment(env, "variableName")))) {

				List<Object> xmlNodes = ifVNot.getAddTransitionOrForEachOrIf();

				for (Object xmlNode : xmlNodes) {

					handleXmlNode(xmlNode, env, startNode, "transportProtocol");

				}
			}

		}

		// Do Nothing for aciState, slaveInput, slaveOutput,
		// SlaveParameter,SlaveTunableparameter,testStep, testSuccessor,
		// testTransition, intRange -> they are always valid

	}

	// Handle a xml If node
	private void handleIfItem(If ifItem, Map<String, Object> envOld, long startNode) {
		Map<String, Object> env = new HashMap<>(envOld);

		String condition = ifItem.getCondition();
		boolean conditionFulfilled = false;

		environment.prepareEngine(env);

		// Is condition fullfilled

		conditionFulfilled = (boolean) environment.eval(condition);

		if (conditionFulfilled) {

			List<Object> xmlNodes = ifItem.getAddTransitionOrForEachOrIf();

			for (Object xmlNode : xmlNodes) {

				handleXmlNode(xmlNode, env, startNode, "");

			}

		}

	}

	// Handle Update Xml Node
	private void handleUpdate(Update updateItem, Map<String, Object> envOld, long startNode) {

		Map<String, Object> env = new HashMap<>(envOld);

		String newVar = updateItem.getNewVariable();
		String oldVar = updateItem.getOldVariable();

		// Update an old transiton with a new transition

		Transition tOld = gson.fromJson((String) gson.toJson(
				environment.getFromEnvironment(env, (String) environment.getFromEnvironment(env, "variableName"))),
				Transition.class);

		environment.eval(oldVar + "=" + newVar + ";");

		Transition tNew = gson.fromJson((String) gson.toJson(
				environment.getFromEnvironment(env, (String) environment.getFromEnvironment(env, "variableName"))),
				Transition.class);

		for (int i = 0; i < templateProcedure.getTransition().size(); i++) {

			if (setHelper.transitionsEqual(tOld, templateProcedure.getTransition().get(i))) {
				templateProcedure.getTransition().set(i, tNew);

			}

		}

	}

	// Handle an add transition xml node
	private void handleAddTransition(AddTransition addTransitionObject, Map<String, Object> env, long startNode) {

		environment.eval("var step = " + startNode + ";");

		// Calculate the starting and ending point / node numer for the
		// transition
		int fromNode = TransitionCreator.getFromNode(addTransitionObject, environment, env, nextUnusedNodeNumber);
		int toNode = TransitionCreator.getToNode(addTransitionObject, environment, env, nextUnusedNodeNumber);

		Sending sendingObject = addTransitionObject.getSending();
		Receiving receivingObject = addTransitionObject.getReceiving();

		Transition trans = null;

		if (sendingObject != null) {

			Transition.Sending.ClockTime clockTime = null;

			// ClockTime for sending message
			ClockTime clockTimeInfo = sendingObject.getClockTime();

			if (clockTimeInfo != null) {

				clockTime = TransitionCreator.createClockTime(clockTimeInfo, environment, env);

			}

			// Check if a message entry is not null -> if true this message
			// should be used in the transition, so generate it according to the
			// information from the expansion node

			if (sendingObject.getCFGTimeRes() != null) {

				trans = TransitionCreator.createSendingCFGSetTimeRes(sendingObject.getCFGTimeRes(), clockTime,
						dcpWrapper, environment, env, fromNode, toNode);

			}

			if (sendingObject.getCFGSteps() != null) {

				trans = TransitionCreator.createSendingCFGSetSteps(sendingObject.getCFGSteps(), clockTime, environment,
						env, fromNode, toNode);

			}

			if (sendingObject.getCFGInput() != null) {

				trans = TransitionCreator.createSendingCFGConfigInput(sendingObject.getCFGInput(), clockTime,
						dcpWrapper, environment, env, fromNode, toNode);

			}

			if (sendingObject.getCFGOutput() != null) {

				trans = TransitionCreator.createSendingCFGConfigOutput(sendingObject.getCFGOutput(), clockTime,
						dcpWrapper, environment, env, fromNode, toNode);

			}

			if (sendingObject.getCFGSourceNetworkInformation() != null) {

				trans = TransitionCreator.createSendingCFGSetSourceNetworkInformation(
						sendingObject.getCFGSourceNetworkInformation(), clockTime, dcpWrapper, environment, env,
						fromNode, toNode);

			}

			if (sendingObject.getCFGSourceNetworkInformationBluetooth() != null) {

				trans = TransitionCreator.createSendingCFGSetSourceNetworkInformationBluetooth(
						sendingObject.getCFGSourceNetworkInformationBluetooth(), clockTime, dcpWrapper, environment,
						env, fromNode, toNode);

			}

			if (sendingObject.getCFGSourceNetworkInformationTCPIPv4() != null) {

				trans = TransitionCreator.createSendingCFGSetSourceNetworkInformationTCPIPv4(
						sendingObject.getCFGSourceNetworkInformationTCPIPv4(), clockTime, dcpWrapper, environment, env,
						fromNode, toNode);

			}

			if (sendingObject.getCFGSourceNetworkInformationUDPIPv4() != null) {

				trans = TransitionCreator.createSendingCFGSetSourceNetworkInformationUDP(
						sendingObject.getCFGSourceNetworkInformationUDPIPv4(), clockTime, dcpWrapper, environment, env,
						fromNode, toNode);

			}

			if (sendingObject.getCFGSourceNetworkInformationUSB() != null) {

				trans = TransitionCreator.createSendingCFGSetSourceNetworkInformationUSB(
						sendingObject.getCFGSourceNetworkInformationUSB(), clockTime, dcpWrapper, environment, env,
						fromNode, toNode);

			}

			if (sendingObject.getCFGTargetNetworkInformation() != null) {

				trans = TransitionCreator.createSendingCFGSetTargetNetworkInformation(
						sendingObject.getCFGTargetNetworkInformation(), clockTime, dcpWrapper, environment, env,
						fromNode, toNode);

			}

			if (sendingObject.getCFGTargetNetworkInformationBluetooth() != null) {

				trans = TransitionCreator.createSendingCFGSetTargetNetworkInformationBluetooth(
						sendingObject.getCFGTargetNetworkInformationBluetooth(), clockTime, dcpWrapper, environment,
						env, fromNode, toNode);

			}

			if (sendingObject.getCFGTargetNetworkInformationTCPIPv4() != null) {

				trans = TransitionCreator.createSendingCFGSetTargetNetworkInformationTCPIPv4(
						sendingObject.getCFGTargetNetworkInformationTCPIPv4(), clockTime, dcpWrapper, environment, env,
						fromNode, toNode);

			}

			if (sendingObject.getCFGTargetNetworkInformationUSB() != null) {

				trans = TransitionCreator.createSendingCFGSetTargetNetworkInformationUSB(
						sendingObject.getCFGTargetNetworkInformationUSB(), clockTime, dcpWrapper, environment, env,
						fromNode, toNode);

			}

			if (sendingObject.getCFGTargetNetworkInformationUDPIPv4() != null) {

				trans = TransitionCreator.createSendingCFGSetTargetNetworkInformationUDP(
						sendingObject.getCFGTargetNetworkInformationUDPIPv4(), clockTime, dcpWrapper, environment, env,
						fromNode, toNode);

			}

			if (sendingObject.getCFGClear() != null) {

				trans = TransitionCreator.createSendingCFGConfigClear(sendingObject.getCFGClear(), clockTime,
						environment, env, fromNode, toNode);

			}

			if (sendingObject.getCFGParameter() != null) {

				trans = TransitionCreator.createSendingCFGSetParameter(sendingObject.getCFGParameter(), clockTime,
						dcpWrapper, environment, env, fromNode, toNode);

			}

			if (sendingObject.getCFGTunableParameter() != null) {

				trans = TransitionCreator.createSendingCFGSetConfigTunableParameter(
						sendingObject.getCFGTunableParameter(), clockTime, dcpWrapper, environment, env, fromNode,
						toNode);

			}

			if (sendingObject.getCFGParamNetworkInformation() != null) {

				trans = TransitionCreator.createSendingCFGSetParamNetworkInformation(
						sendingObject.getCFGParamNetworkInformation(), clockTime, dcpWrapper, environment, env,
						fromNode, toNode);

			}

			if (sendingObject.getCFGParamNetworkInformationBluetooth() != null) {
				trans = TransitionCreator.createSendingCFGSetParamNetworkInformationBluetooth(
						sendingObject.getCFGParamNetworkInformationBluetooth(), clockTime, dcpWrapper, environment, env,
						fromNode, toNode);

			}

			if (sendingObject.getCFGParamNetworkInformationTCPIPv4() != null) {

				trans = TransitionCreator.createSendingCFGSetParamNetworkInformationTCPIPv4(
						sendingObject.getCFGParamNetworkInformationTCPIPv4(), clockTime, dcpWrapper, environment, env,
						fromNode, toNode);

			}

			if (sendingObject.getCFGParamNetworkInformationUSB() != null) {

				trans = TransitionCreator.createSendingCFGSetParamNetworkInformationUSB(
						sendingObject.getCFGParamNetworkInformationUSB(), clockTime, dcpWrapper, environment, env,
						fromNode, toNode);

			}

			if (sendingObject.getCFGParamNetworkInformationUDPIPv4() != null) {

				trans = TransitionCreator.createSendingCFGSetParamNetworkInformationUDP(
						sendingObject.getCFGParamNetworkInformationUDPIPv4(), clockTime, dcpWrapper, environment, env,
						fromNode, toNode);

			}

			if (sendingObject.getCFGLogging() != null) {

				trans = TransitionCreator.createSendingCFGSetLogging(sendingObject.getCFGLogging(), environment, env,
						fromNode, toNode);

			}

			if (sendingObject.getCFGScope() != null) {

				trans = TransitionCreator.createSendingCFGSetScope(sendingObject.getCFGScope(), clockTime, environment,
						env, fromNode, toNode);

			}
			/*
			 * if (sendingObject.getCFGSetLogClear() != null) {
			 * 
			 * trans = TransitionCreator.createSendingCFGSetLogClear(sendingObject.
			 * getCFGSetLogClear(), environment, env, fromNode, toNode);
			 * 
			 * }
			 */

			if (sendingObject.getSTCRegister() != null) {

				trans = TransitionCreator.createSendingSTCRegister(sendingObject.getSTCRegister(), clockTime,
						dcpWrapper, environment, env, fromNode, toNode);

			}

			if (sendingObject.getSTCPrepare() != null) {

				trans = TransitionCreator.createSendingSTCPrepare(sendingObject.getSTCPrepare(), clockTime, environment,
						env, fromNode, toNode);
			}

			if (sendingObject.getSTCUnregister() != null) {

				trans = TransitionCreator.createSendingSTCUnregister(sendingObject.getSTCUnregister(), environment, env,
						fromNode, toNode);

			}

			if (sendingObject.getSTCConfigure() != null) {

				trans = TransitionCreator.createSendingSTCConfigure(sendingObject.getSTCConfigure(), clockTime,
						environment, env, fromNode, toNode);

			}

			if (sendingObject.getSTCInitialize() != null) {

				trans = TransitionCreator.createSendingSTCInitialize(sendingObject.getSTCInitialize(), clockTime,
						environment, env, fromNode, toNode);

			}

			if (sendingObject.getSTCRun() != null) {

				trans = TransitionCreator.createSendingSTCRun(sendingObject.getSTCRun(), clockTime, environment, env,
						fromNode, toNode);

			}

			/*
			 * if (sendingObject.getSTCReinitialize() != null) {
			 * 
			 * trans = TransitionCreator.createSendingSTCReinitialize(sendingObject.
			 * getSTCReinitialize(), clockTime, environment, env, fromNode, toNode);
			 * 
			 * }
			 */

			if (sendingObject.getSTCDoStep() != null) {

				trans = TransitionCreator.createSendingSTCDoStep(sendingObject.getSTCDoStep(), clockTime, environment,
						env, fromNode, toNode);

			}

			if (sendingObject.getSTCSendOutputs() != null) {

				trans = TransitionCreator.createSendingSTCSendOutputs(sendingObject.getSTCSendOutputs(), clockTime,
						environment, env, fromNode, toNode);

			}

			if (sendingObject.getSTCStop() != null) {

				trans = TransitionCreator.createSendingSTCStop(sendingObject.getSTCStop(), environment, env, fromNode,
						toNode);

			}

			if (sendingObject.getSTCReset() != null) {

				trans = TransitionCreator.createSendingSTCReset(sendingObject.getSTCReset(), clockTime, environment,
						env, fromNode, toNode);

			}

			if (sendingObject.getINFState() != null) {

				trans = TransitionCreator.createSendingINFState(sendingObject.getINFState(), clockTime, environment,
						env, fromNode, toNode);

			}

			if (sendingObject.getINFError() != null) {

				trans = TransitionCreator.createSendingINFError(sendingObject.getINFError(), clockTime, environment,
						env, fromNode, toNode);

			}

			if (sendingObject.getINFLog() != null) {

				trans = TransitionCreator.createSendingINFLog(sendingObject.getINFLog(), clockTime, environment, env,
						fromNode, toNode);

			}

			if (sendingObject.getDATInputOutput() != null) {

				trans = TransitionCreator.createSendingDATInputOutput(sendingObject.getDATInputOutput(), clockTime,
						dcpWrapper, environment, env, fromNode, toNode);

			}

			if (sendingObject.getDATParameter() != null) {

				trans = TransitionCreator.createSendingDATParameter(sendingObject.getDATParameter(), clockTime,
						dcpWrapper, environment, env, fromNode, toNode);

			}

		}

		if (receivingObject != null) {

			if (receivingObject.getRSPAck() != null) {

				trans = TransitionCreator.createReceivingRSPAck(receivingObject.getRSPAck(), environment, env, fromNode,
						toNode);

			}

			if (receivingObject.getRSPErrorAck() != null) {

				trans = TransitionCreator.createReceivingRSPErrorAck(receivingObject.getRSPErrorAck(), environment, env,
						fromNode, toNode);

			}

			if (receivingObject.getRSPNack() != null) {

				trans = TransitionCreator.createReceivingRSPNack(receivingObject.getRSPNack(), environment, env,
						fromNode, toNode);

			}

			if (receivingObject.getRSPStateAck() != null) {

				trans = TransitionCreator.createReceivingRSPStateAck(receivingObject.getRSPStateAck(), environment, env,
						fromNode, toNode);

			}

			if (receivingObject.getNTFStateChanged() != null) {

				trans = TransitionCreator.createReceivingNTFStateChanged(receivingObject.getNTFStateChanged(),
						environment, env, fromNode, toNode);

			}

			if (receivingObject.getRSPLog() != null) {

				trans = TransitionCreator.createReceivingRSPLog(receivingObject.getRSPLog(), environment, env, fromNode,
						toNode);

			}

			if (receivingObject.getNTFLog() != null) {

				trans = TransitionCreator.createReceivingNTFLog(receivingObject.getNTFLog(), environment, env, fromNode,
						toNode);

			}

			if (receivingObject.getDATInputOutput() != null) {

				trans = TransitionCreator.createReceivingDATInputOutput(receivingObject.getDATInputOutput(), dcpWrapper,
						environment, env, fromNode, toNode);

			}

			if (receivingObject.getDATParameter() != null) {

				trans = TransitionCreator.createReceivingDATParameter(receivingObject.getDATParameter(), dcpWrapper,
						environment, env, fromNode, toNode);

			}

			if (receivingObject.getCopy() != null) {

				String s = (String) environment.getFromEnvironment(env,
						"JSON.stringify(" + receivingObject.getCopy().getPduVariable() + ");");
				trans = gson.fromJson(s, Transition.class);
				trans.setFrom(fromNode);
				trans.setTo(toNode);
			}
		}
		if (trans != null) {
			trans.setLog(addTransitionObject.isLog());
			newTransitions.add(trans);
			environment.updateEnvironmentTransitionSet(trans);
		}
	}

}
