package wrappers;

import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import dcpDescription.DcpDimensionsType.Dimension;
import dcpDescription.DcpIPv4Type;
import dcpDescription.DcpSlaveDescription;
import dcpDescription.DcpVariable;
import util.DataTypeList;
import util.OpMode;
import util.TransportProtocolList;

/**
 * 
 * Wrapper class for easier access to attributes and properties of the loaded
 * DcpSlaves represented by the DcpDescription class
 * 
 * 
 *
 */

public class DcpWrapper {

	private DcpSlaveDescription dcpDesc;
	private int id;
	private Map<Integer, Integer> dataIdMap;
	private int dataIdCounter = 0;
	private String port;
	private String ip;

	/**
	 * Get the used Id of the Slave
	 * 
	 * @return id of Slave
	 */
	public int getId() {
		return id;
	}

	/**
	 * Set Slave id
	 * 
	 * @param Id
	 *            - ID that should be used for the Slave
	 */
	public void setId(int Id) {
		this.id = Id;
	}

	/**
	 * Constructor
	 * 
	 * @param dcpDesc
	 *            - Description Object of the loaded Slave Xml
	 * @param Id
	 *            - Id of the Slave
	 * 
	 * @param slavePort
	 *            - udp port of the slave given as program parameter
	 * 
	 * @param slaveIp
	 *            - udp ip of the slave given as program parameter
	 */

	public DcpWrapper(DcpSlaveDescription dcpDesc, int Id, String slavePort, String slaveIp) {

		this.dcpDesc = dcpDesc;
		this.id = Id;
		dataIdMap = new HashMap<>();
		ip = slaveIp;
		port = slavePort;

	}

	/**
	 * Returns the Slave uuid specified in the Slave Description
	 * 
	 * @return
	 */
	public String getUuid() {
		return dcpDesc.getUuid();

	}

	/**
	 * 
	 * Return if the Slave supports Hard-Real Time
	 * 
	 * @return true if Slave supports Hard-Real Time
	 */

	public boolean isHardRealTimeSupported() {
		return dcpDesc.getOpMode().getHardRealTime() != null;
	}

	/**
	 * Return if the Slave supports Soft-Real Time
	 * 
	 * @return true if the Slave supports Soft-Real Time
	 */
	public boolean isSoftRealTimeSupported() {
		return dcpDesc.getOpMode().getSoftRealTime() != null;
	}

	/**
	 * Return if the Slave supports Non-Real Time
	 * 
	 * @return true if the Slave supports Real-Time
	 */

	public boolean isNonRealTimeSupported() {
		return dcpDesc.getOpMode().getNonRealTime() != null;
	}

	/**
	 * Return if the Slave supports communication through usb
	 * 
	 * @return true if the Slave supports communication through usb
	 */

	public boolean isUsbSupported() {
		return (dcpDesc.getTransportProtocols().getUSB2() != null);
	}

	/**
	 * Get the Usb-Driver object of the Slave
	 * 
	 * @return Usb-Driver Object
	 */
	public DcpSlaveDescription.TransportProtocols.USB2 getUsbDriver() {
		return dcpDesc.getTransportProtocols().getUSB2();
	}

	/**
	 * Return if the Slave supports communication through udp
	 * 
	 * @return true if the Slave supports communication through udp
	 */
	public boolean isUdpSupported() {
		return (dcpDesc.getTransportProtocols().getUDPIPv4() != null);
	}

	/**
	 * Get the Udp-Driver Object of the Slave
	 * 
	 * @return Udp-Driver Object of the Slave
	 */
	public DcpSlaveDescription.TransportProtocols.UDPIPv4 getUdpDriver() {

		return dcpDesc.getTransportProtocols().getUDPIPv4();

	}

	/**
	 * Return the Udp-Driver-Control Object of the Slave
	 * 
	 * @return Udp-Driver-Control Object of the Slave
	 */

	public DcpIPv4Type.Control getUdpControl() {

		return dcpDesc.getTransportProtocols().getUDPIPv4().getControl();

	}

	/**
	 * 
	 * Get the Available Port of the Slaves Udp Driver
	 * 
	 * @return Available Udp Port
	 */

	public DcpSlaveDescription.TransportProtocols.UDPIPv4.DATInputOutput.AvailablePort getUdpDatInputOutputPort() {

		List<Object> portRangeOrPorts = null;

		try {

			portRangeOrPorts = dcpDesc.getTransportProtocols().getUDPIPv4().getDATInputOutput().getAvailablePortRangeOrAvailablePort();

		} catch (NullPointerException e) {

			return null;
		}

		for (Object o : portRangeOrPorts) {

			if (o instanceof DcpSlaveDescription.TransportProtocols.UDPIPv4.DATInputOutput.AvailablePort) {

				DcpSlaveDescription.TransportProtocols.UDPIPv4.DATInputOutput.AvailablePort port = (DcpSlaveDescription.TransportProtocols.UDPIPv4.DATInputOutput.AvailablePort) o;
				return port;
			}

		}
		return null;
	}

	/**
	 * Get the Available Port Range of the Slaves Udp Driver
	 * 
	 * @return Available Udp Port Range
	 */

	public DcpSlaveDescription.TransportProtocols.UDPIPv4.DATInputOutput.AvailablePortRange getUdpDatInputOutputPortRange() {

		List<Object> portRangeOrPorts = null;

		try {

			portRangeOrPorts = dcpDesc.getTransportProtocols().getUDPIPv4().getDATInputOutput().getAvailablePortRangeOrAvailablePort();

		} catch (NullPointerException e) {

			return null;
		}

		for (Object o : portRangeOrPorts) {

			if (o instanceof DcpSlaveDescription.TransportProtocols.UDPIPv4.DATInputOutput.AvailablePortRange) {

				DcpSlaveDescription.TransportProtocols.UDPIPv4.DATInputOutput.AvailablePortRange portRange = (DcpSlaveDescription.TransportProtocols.UDPIPv4.DATInputOutput.AvailablePortRange) o;
				return portRange;
			}

		}
		return null;

	}

	/**
	 * Get the Ip Adress for the Udp Input / Output values
	 * 
	 * @return Ip Adress String
	 */

	public String getUdpDatInputOutputIp() {

		return dcpDesc.getTransportProtocols().getUDPIPv4().getDATInputOutput().getHost();
	}

	/**
	 * Get the Availabe Udp Port Range for Parameter
	 * 
	 * @return Availabe Port Range
	 */
	public DcpSlaveDescription.TransportProtocols.UDPIPv4.DATParameter.AvailablePortRange getUdpParamPortRange() {

		List<Object> portRangeOrPorts = null;

		try {
			portRangeOrPorts = dcpDesc.getTransportProtocols().getUDPIPv4().getDATParameter().getAvailablePortRangeOrAvailablePort();

		} catch (NullPointerException e) {

			return null;

		}

		for (Object o : portRangeOrPorts) {

			if ((o instanceof DcpSlaveDescription.TransportProtocols.UDPIPv4.DATParameter.AvailablePortRange)) {

				DcpSlaveDescription.TransportProtocols.UDPIPv4.DATParameter.AvailablePortRange portRange = (DcpSlaveDescription.TransportProtocols.UDPIPv4.DATParameter.AvailablePortRange) o;
				return portRange;
			}

		}

		return null;
	}

	/**
	 * Get the Available Port for the Udp Parameters
	 * 
	 * @return Availabe Port
	 */

	public DcpSlaveDescription.TransportProtocols.UDPIPv4.DATParameter.AvailablePort getUdpParamPort() {

		List<Object> portRangeOrPorts = null;

		try {
			portRangeOrPorts = dcpDesc.getTransportProtocols().getUDPIPv4().getDATParameter().getAvailablePortRangeOrAvailablePort();

		} catch (NullPointerException e) {

			return null;

		}

		for (Object o : portRangeOrPorts) {

			if (o.getClass().getName().substring(o.getClass().getName().lastIndexOf("$") + 1).equals("AvailablePort")) {

				DcpSlaveDescription.TransportProtocols.UDPIPv4.DATParameter.AvailablePort port = (DcpSlaveDescription.TransportProtocols.UDPIPv4.DATParameter.AvailablePort) o;
				return port;
			}

		}
		return null;
	}

	/**
	 * Get Udp Ip Adress for the Parameters
	 * 
	 * @return Ip Adress as String
	 */
	public String getUdpParamIp() {

		String ip = null;

		try {

			ip = dcpDesc.getTransportProtocols().getUDPIPv4().getDATParameter().getHost();
		} catch (NullPointerException e) {

			return null;
		}

		return ip;
	}

	/*
	 * TCP
	 */
	
	/**
	 * Return if the Slave supports communication through udp
	 * 
	 * @return true if the Slave supports communication through udp
	 */
	public boolean isTcpSupported() {
		return (dcpDesc.getTransportProtocols().getTCPIPv4() != null);
	}

	/**
	 * Get the Udp-Driver Object of the Slave
	 * 
	 * @return Udp-Driver Object of the Slave
	 */
	public DcpSlaveDescription.TransportProtocols.TCPIPv4 getTcpDriver() {

		return dcpDesc.getTransportProtocols().getTCPIPv4();

	}

	/**
	 * Return the Udp-Driver-Control Object of the Slave
	 * 
	 * @return Udp-Driver-Control Object of the Slave
	 */

	public DcpIPv4Type.Control getTcpControl() {

		return dcpDesc.getTransportProtocols().getTCPIPv4().getControl();

	}

	/**
	 * 
	 * Get the Available Port of the Slaves Udp Driver
	 * 
	 * @return Available Udp Port
	 */

	public DcpSlaveDescription.TransportProtocols.TCPIPv4.DATInputOutput.AvailablePort getTcpDatInputOutputPort() {

		List<Object> portRangeOrPorts = null;

		try {

			portRangeOrPorts = dcpDesc.getTransportProtocols().getTCPIPv4().getDATInputOutput().getAvailablePortRangeOrAvailablePort();

		} catch (NullPointerException e) {

			return null;
		}

		for (Object o : portRangeOrPorts) {

			if (o instanceof DcpSlaveDescription.TransportProtocols.TCPIPv4.DATInputOutput.AvailablePort) {

				DcpSlaveDescription.TransportProtocols.TCPIPv4.DATInputOutput.AvailablePort port = (DcpSlaveDescription.TransportProtocols.TCPIPv4.DATInputOutput.AvailablePort) o;
				return port;
			}

		}
		return null;
	}

	/**
	 * Get the Available Port Range of the Slaves Udp Driver
	 * 
	 * @return Available Udp Port Range
	 */

	public DcpSlaveDescription.TransportProtocols.TCPIPv4.DATInputOutput.AvailablePortRange getTcpDatInputOutputPortRange() {

		List<Object> portRangeOrPorts = null;

		try {

			portRangeOrPorts = dcpDesc.getTransportProtocols().getTCPIPv4().getDATInputOutput().getAvailablePortRangeOrAvailablePort();

		} catch (NullPointerException e) {

			return null;
		}

		for (Object o : portRangeOrPorts) {

			if (o instanceof DcpSlaveDescription.TransportProtocols.TCPIPv4.DATInputOutput.AvailablePortRange) {

				DcpSlaveDescription.TransportProtocols.TCPIPv4.DATInputOutput.AvailablePortRange portRange = (DcpSlaveDescription.TransportProtocols.TCPIPv4.DATInputOutput.AvailablePortRange) o;
				return portRange;
			}

		}
		return null;

	}

	/**
	 * Get the Ip Adress for the Udp Input / Output values
	 * 
	 * @return Ip Adress String
	 */

	public String getTcpDatInputOutputIp() {

		return dcpDesc.getTransportProtocols().getTCPIPv4().getDATInputOutput().getHost();
	}

	/**
	 * Get the Availabe Udp Port Range for Parameter
	 * 
	 * @return Availabe Port Range
	 */
	public DcpSlaveDescription.TransportProtocols.TCPIPv4.DATParameter.AvailablePortRange getTcpParamPortRange() {

		List<Object> portRangeOrPorts = null;

		try {
			portRangeOrPorts = dcpDesc.getTransportProtocols().getTCPIPv4().getDATParameter().getAvailablePortRangeOrAvailablePort();

		} catch (NullPointerException e) {

			return null;

		}

		for (Object o : portRangeOrPorts) {

			if ((o instanceof DcpSlaveDescription.TransportProtocols.TCPIPv4.DATParameter.AvailablePortRange)) {

				DcpSlaveDescription.TransportProtocols.TCPIPv4.DATParameter.AvailablePortRange portRange = (DcpSlaveDescription.TransportProtocols.TCPIPv4.DATParameter.AvailablePortRange) o;
				return portRange;
			}

		}

		return null;
	}

	/**
	 * Get the Available Port for the Udp Parameters
	 * 
	 * @return Availabe Port
	 */

	public DcpSlaveDescription.TransportProtocols.TCPIPv4.DATParameter.AvailablePort getTcpParamPort() {

		List<Object> portRangeOrPorts = null;

		try {
			portRangeOrPorts = dcpDesc.getTransportProtocols().getTCPIPv4().getDATParameter().getAvailablePortRangeOrAvailablePort();

		} catch (NullPointerException e) {

			return null;

		}

		for (Object o : portRangeOrPorts) {

			if (o.getClass().getName().substring(o.getClass().getName().lastIndexOf("$") + 1).equals("AvailablePort")) {

				DcpSlaveDescription.TransportProtocols.TCPIPv4.DATParameter.AvailablePort port = (DcpSlaveDescription.TransportProtocols.TCPIPv4.DATParameter.AvailablePort) o;
				return port;
			}

		}
		return null;
	}

	/**
	 * Get Udp Ip Adress for the Parameters
	 * 
	 * @return Ip Adress as String
	 */
	public String getTcpParamIp() {

		String ip = null;

		try {

			ip = dcpDesc.getTransportProtocols().getTCPIPv4().getDATParameter().getHost();
		} catch (NullPointerException e) {

			return null;
		}

		return ip;
	}

	
	
	/**
	 * Return if Bluetooth Commmunication is supported
	 * 
	 * @return true if bluetooth communication is supported
	 */
	public boolean isBluetoothSupported() {

		return (dcpDesc.getTransportProtocols().getBluetooth() != null);

	}

	/**
	 * Get the Bluetoot Driver Object of the Slave
	 * 
	 * @return Bluetooth Driver Object
	 */
	public DcpSlaveDescription.TransportProtocols.Bluetooth getBluetoothDriver() {

		return dcpDesc.getTransportProtocols().getBluetooth();

	}

	/**
	 * Return if communication through the can bus is supported
	 * 
	 * @return true if can-communication is supported
	 */
	public boolean isCanSupported() {

		return (dcpDesc.getTransportProtocols().getCAN() != null);

	}

	/**
	 * Get the Can Driver Object of the Slave
	 * 
	 * @return Can Driver Object of the Slave
	 */
	public DcpSlaveDescription.TransportProtocols.CAN getCanDriver() {

		return dcpDesc.getTransportProtocols().getCAN();
	}

	/**
	 * Get the Usb Driver DataPipe Object
	 * 
	 * @return Usd Driver DataPipe Object
	 */

	public dcpDescription.DcpSlaveDescription.TransportProtocols.USB2.DataPipe getUsbDataPipe() {

		dcpDescription.DcpSlaveDescription.TransportProtocols.USB2.DataPipe dataPipe = dcpDesc.getTransportProtocols().getUSB2().getDataPipe().get(0);

		return dataPipe;
	}

	/**
	 * Get List of all Slave Output Variables
	 * 
	 * @return List of Slave Output Variables
	 */
	public List<DcpVariable> getOutputs() {

		List<DcpVariable> vars = dcpDesc.getVariables().getVariable();
		List<DcpVariable> outputs = new LinkedList<>();

		for (DcpVariable var : vars) {

			if (var.getOutput() != null) {

				outputs.add(var);

			}

		}

		return outputs;
	}

	/**
	 * Get Slave Input Variables
	 * 
	 * @return List of Slave Input Variables
	 */
	public List<DcpVariable> getInputs() {

		List<DcpVariable> vars = dcpDesc.getVariables().getVariable();
		List<DcpVariable> inputs = new LinkedList<>();

		for (DcpVariable var : vars) {

			if (var.getInput() != null) {

				inputs.add(var);
			}

		}

		return inputs;

	}

	/**
	 * Get List of Slave Parameter Variables
	 * 
	 * @return List of Slave Parameter Variables
	 */
	public List<DcpVariable> getParameter() {

		List<DcpVariable> vars = dcpDesc.getVariables().getVariable();
		List<DcpVariable> parameters = new LinkedList<>();

		for (DcpVariable var : vars) {

			if (var.getParameter() != null) {

				parameters.add(var);
			}

		}

		return parameters;

	}

	/**
	 * Get List if Slave Structural Parameter Variables
	 * 
	 * 
	 * @return List of Slave Strucutral Parameter Variables
	 */
	public List<DcpVariable> getStructuralParameter() {

		List<DcpVariable> vars = dcpDesc.getVariables().getVariable();
		List<DcpVariable> structuralParameter = new LinkedList<>();

		for (DcpVariable var : vars) {

			if (var.getStructuralParameter() != null) {

				structuralParameter.add(var);
			}

		}

		return structuralParameter;

	}

	/**
	 * Get the Maximum Value for a Slave Variable specified by a Value Reference
	 * (vr). If no explicit Maximum Value is specified by the Slave Description,
	 * this function returns the maximum allowed Value for the belonging data
	 * type
	 * 
	 * 
	 * @param vr
	 *            - value reference of the slave variable
	 * @return maximum possible value that can by used for the variable
	 * @throws Exception
	 *             - If no Variable could be found with the given vr
	 */

	public Object getMaxForVr(int vr) throws Exception {

		List<DcpVariable> vars = dcpDesc.getVariables().getVariable();

		for (DcpVariable v : vars) {

			if (v.getValueReference().intValue() == vr) {

				if (v.getInput() != null) {

					if (v.getInput().getFloat32() != null) {

						if (v.getInput().getFloat32().getMax() != null) {
							return v.getInput().getFloat32().getMax();
						} else {
							return Float.MAX_VALUE;
						}

					}
					if (v.getInput().getFloat64() != null) {

						if (v.getInput().getFloat64().getMax() != null) {
							return v.getInput().getFloat64().getMax();
						} else {
							return Double.MAX_VALUE;
						}

					}

					if (v.getInput().getInt16() != null) {

						if (v.getInput().getInt16().getMax() != null) {
							return v.getInput().getInt16().getMax();
						} else {
							return Short.MAX_VALUE;
						}

					}

					if (v.getInput().getInt32() != null) {

						if (v.getInput().getInt32().getMax() != null) {
							return v.getInput().getInt32().getMax();
						} else {
							return Integer.MAX_VALUE;
						}

					}

					if (v.getInput().getInt64() != null) {

						if (v.getInput().getInt64().getMax() != null) {
							return v.getInput().getInt64().getMax();
						} else {
							return Long.MAX_VALUE;
						}

					}
					if (v.getInput().getInt8() != null) {

						if (v.getInput().getInt8().getMax() != null) {
							return v.getInput().getInt8().getMax();
						} else {
							return Byte.MAX_VALUE;
						}

					}

					if (v.getInput().getString() != null) {

						if (v.getInput().getString().getMaxSize() != 0) {
							long maxSize = v.getInput().getString().getMaxSize();
							String s = "";
							for (int i = 0; i < maxSize; i++) {
								s += "a";
							}

							return s;
						}

						return "";

					}

					if (v.getInput().getUint16() != null) {

						if (v.getInput().getUint16().getMax() != null) {
							return v.getInput().getUint16().getMax();
						} else {
							// Max value of uint 16
							return 65535;
						}

					}

					if (v.getInput().getUint32() != null) {

						if (v.getInput().getUint32().getMax() != null) {
							return v.getInput().getUint32().getMax();
						} else {
							// Uint32 Max
							return 4294967295L;
						}

					}
					if (v.getInput().getUint64() != null) {

						if (v.getInput().getUint64().getMax() != null) {
							return v.getInput().getUint64().getMax();
						} else {
							// Uint64 Max
							BigInteger big = new BigInteger("18446744073709551615");
							return big;
						}

					}
					if (v.getInput().getUint8() != null) {

						if (v.getInput().getUint8().getMax() != null) {
							return v.getInput().getUint8().getMax();
						} else {
							// Uint8 max
							return 255;
						}

					}

				}

				if (v.getOutput() != null) {

					if (v.getOutput().getFloat32() != null) {

						if (v.getOutput().getFloat32().getMax() != null) {
							return v.getOutput().getFloat32().getMax();
						} else {
							return Float.MAX_VALUE;
						}

					}
					if (v.getOutput().getFloat64() != null) {

						if (v.getOutput().getFloat64().getMax() != null) {
							return v.getOutput().getFloat64().getMax();
						} else {
							return Double.MAX_VALUE;
						}

					}

					if (v.getOutput().getInt16() != null) {

						if (v.getOutput().getInt16().getMax() != null) {
							return v.getOutput().getInt16().getMax();
						} else {
							return Short.MAX_VALUE;
						}

					}

					if (v.getOutput().getInt32() != null) {

						if (v.getOutput().getInt32().getMax() != null) {
							return v.getOutput().getInt32().getMax();
						} else {
							return Integer.MAX_VALUE;
						}

					}

					if (v.getOutput().getInt64() != null) {

						if (v.getOutput().getInt64().getMax() != null) {
							return v.getOutput().getInt64().getMax();
						} else {
							return Long.MAX_VALUE;
						}

					}
					if (v.getOutput().getInt8() != null) {

						if (v.getOutput().getInt8().getMax() != null) {
							return v.getOutput().getInt8().getMax();
						} else {
							return Byte.MAX_VALUE;
						}

					}

					if (v.getOutput().getString() != null) {

						if (v.getOutput().getString().getMaxSize() != 0) {
							long maxSize = v.getOutput().getString().getMaxSize();
							String s = "";
							for (int i = 0; i < maxSize; i++) {
								s += "a";
							}

							return s;
						}

						return "";

					}

					if (v.getOutput().getUint16() != null) {

						if (v.getOutput().getUint16().getMax() != null) {
							return v.getOutput().getUint16().getMax();
						} else {
							// Max value of uint 16
							return 65535;
						}

					}

					if (v.getOutput().getUint32() != null) {

						if (v.getOutput().getUint32().getMax() != null) {
							return v.getOutput().getUint32().getMax();
						} else {
							// Uint32 Max
							return 4294967295L;
						}

					}
					if (v.getOutput().getUint64() != null) {

						if (v.getOutput().getUint64().getMax() != null) {
							return v.getOutput().getUint64().getMax();
						} else {
							// Uint64 Max
							BigInteger big = new BigInteger("18446744073709551615");
							return big;
						}

					}
					if (v.getOutput().getUint8() != null) {

						if (v.getOutput().getUint8().getMax() != null) {
							return v.getOutput().getUint8().getMax();
						} else {
							// Uint8 max
							return 255;
						}

					}

				}

				if (v.getParameter() != null) {

					if (v.getParameter().getFloat32() != null) {

						if (v.getParameter().getFloat32().getMax() != null) {
							return v.getParameter().getFloat32().getMax();
						} else {
							return Float.MAX_VALUE;
						}

					}
					if (v.getParameter().getFloat64() != null) {

						if (v.getParameter().getFloat64().getMax() != null) {
							return v.getParameter().getFloat64().getMax();
						} else {
							return Double.MAX_VALUE;
						}

					}

					if (v.getParameter().getInt16() != null) {

						if (v.getParameter().getInt16().getMax() != null) {
							return v.getParameter().getInt16().getMax();
						} else {
							return Short.MAX_VALUE;
						}

					}

					if (v.getParameter().getInt32() != null) {

						if (v.getParameter().getInt32().getMax() != null) {
							return v.getParameter().getInt32().getMax();
						} else {
							return Integer.MAX_VALUE;
						}

					}

					if (v.getParameter().getInt64() != null) {

						if (v.getParameter().getInt64().getMax() != null) {
							return v.getParameter().getInt64().getMax();
						} else {
							return Long.MAX_VALUE;
						}

					}
					if (v.getParameter().getInt8() != null) {

						if (v.getParameter().getInt8().getMax() != null) {
							return v.getParameter().getInt8().getMax();
						} else {
							return Byte.MAX_VALUE;
						}

					}

					if (v.getParameter().getString() != null) {

						if (v.getParameter().getString().getMaxSize() != 0) {
							long maxSize = v.getParameter().getString().getMaxSize();
							String s = "";
							for (int i = 0; i < maxSize; i++) {
								s += "a";
							}

							return s;
						}

						return "";

					}

					if (v.getParameter().getUint16() != null) {

						if (v.getParameter().getUint16().getMax() != null) {
							return v.getParameter().getUint16().getMax();
						} else {
							// Max value of uint 16
							return 65535;
						}

					}

					if (v.getParameter().getUint32() != null) {

						if (v.getParameter().getUint32().getMax() != null) {
							return v.getParameter().getUint32().getMax();
						} else {
							// Uint32 Max
							return 4294967295L;
						}

					}
					if (v.getParameter().getUint64() != null) {

						if (v.getParameter().getUint64().getMax() != null) {
							return v.getParameter().getUint64().getMax();
						} else {
							// Uint64 Max
							BigInteger big = new BigInteger("18446744073709551615");
							return big;
						}

					}
					if (v.getParameter().getUint8() != null) {

						if (v.getParameter().getUint8().getMax() != null) {
							return v.getParameter().getUint8().getMax();
						} else {
							// Uint8 max
							return 255;
						}

					}

				}

			}

		}

		return 12;

	}

	/**
	 * Get the minimum allowed value for a variable specified by the given value
	 * reference (vr) . If no minimum was defined, return the minimum allowed
	 * for the data type.
	 * 
	 * 
	 * @param vr
	 *            - the value reference of the variable
	 * @return Minimum value allowed for the variable
	 * @throws Exception
	 *             - If no Variable with the given vr could be found
	 */
	public Object getMinForVr(int vr) throws Exception {

		List<DcpVariable> vars = dcpDesc.getVariables().getVariable();

		for (DcpVariable v : vars) {

			if (v.getValueReference().intValue() == vr) {

				if (v.getInput() != null) {

					if (v.getInput().getFloat32() != null) {

						if (v.getInput().getFloat32().getMin() != null) {
							return v.getInput().getFloat32().getMin();
						} else {
							return -1 * Float.MAX_VALUE;
						}

					}
					if (v.getInput().getFloat64() != null) {

						if (v.getInput().getFloat64().getMin() != null) {
							return v.getInput().getFloat64().getMin();
						} else {
							return -1 * Double.MAX_VALUE;
						}

					}

					if (v.getInput().getInt16() != null) {

						if (v.getInput().getInt16().getMin() != null) {
							return v.getInput().getInt16().getMin();
						} else {
							return Short.MIN_VALUE;
						}

					}

					if (v.getInput().getInt32() != null) {

						if (v.getInput().getInt32().getMin() != null) {
							return v.getInput().getInt32().getMin();
						} else {
							return Integer.MIN_VALUE;
						}

					}

					if (v.getInput().getInt64() != null) {

						if (v.getInput().getInt64().getMin() != null) {
							return v.getInput().getInt64().getMin();
						} else {
							return Long.MIN_VALUE;
						}

					}
					if (v.getInput().getInt8() != null) {

						if (v.getInput().getInt8().getMin() != null) {
							return v.getInput().getInt8().getMin();
						} else {
							return Byte.MIN_VALUE;
						}

					}

					if (v.getInput().getString() != null) {

						return "";

					}

					if (v.getInput().getUint16() != null) {

						if (v.getInput().getUint16().getMin() != null) {
							return v.getInput().getUint16().getMin();
						} else {
							return 0;
						}

					}

					if (v.getInput().getUint32() != null) {

						if (v.getInput().getUint32().getMin() != null) {
							return v.getInput().getUint32().getMin();
						} else {
							return 0;
						}

					}
					if (v.getInput().getUint64() != null) {

						if (v.getInput().getUint64().getMin() != null) {
							return v.getInput().getUint64().getMin();
						} else {
							return 0;
						}

					}
					if (v.getInput().getUint8() != null) {

						if (v.getInput().getUint8().getMin() != null) {
							return v.getInput().getUint8().getMin();
						} else {
							return 0;
						}

					}

				}

				if (v.getOutput() != null) {

					if (v.getOutput().getFloat32() != null) {

						if (v.getOutput().getFloat32().getMin() != null) {
							return v.getOutput().getFloat32().getMin();
						} else {
							return -1 * Float.MAX_VALUE;
						}

					}
					if (v.getOutput().getFloat64() != null) {

						if (v.getOutput().getFloat64().getMin() != null) {
							return v.getOutput().getFloat64().getMin();
						} else {
							return -1 * Double.MAX_VALUE;
						}

					}

					if (v.getOutput().getInt16() != null) {

						if (v.getOutput().getInt16().getMin() != null) {
							return v.getOutput().getInt16().getMin();
						} else {
							return Short.MIN_VALUE;
						}

					}

					if (v.getOutput().getInt32() != null) {

						if (v.getOutput().getInt32().getMin() != null) {
							return v.getOutput().getInt32().getMin();
						} else {
							return Integer.MIN_VALUE;
						}

					}

					if (v.getOutput().getInt64() != null) {

						if (v.getOutput().getInt64().getMin() != null) {
							return v.getOutput().getInt64().getMin();
						} else {
							return Long.MIN_VALUE;
						}

					}
					if (v.getOutput().getInt8() != null) {

						if (v.getOutput().getInt8().getMin() != null) {
							return v.getOutput().getInt8().getMin();
						} else {
							return Byte.MIN_VALUE;
						}

					}

					if (v.getOutput().getString() != null) {

						return "";

					}

					if (v.getOutput().getUint16() != null) {

						if (v.getOutput().getUint16().getMin() != null) {
							return v.getOutput().getUint16().getMin();
						} else {
							return 0;
						}

					}

					if (v.getOutput().getUint32() != null) {

						if (v.getOutput().getUint32().getMin() != null) {
							return v.getOutput().getUint32().getMin();
						} else {
							return 0;
						}

					}
					if (v.getOutput().getUint64() != null) {

						if (v.getOutput().getUint64().getMin() != null) {
							return v.getOutput().getUint64().getMin();
						} else {
							return 0;
						}

					}
					if (v.getOutput().getUint8() != null) {

						if (v.getOutput().getUint8().getMin() != null) {
							return v.getOutput().getUint8().getMin();
						} else {
							return 0;
						}

					}

				}

				if (v.getParameter() != null) {

					if (v.getParameter().getFloat32() != null) {

						if (v.getParameter().getFloat32().getMin() != null) {
							return v.getParameter().getFloat32().getMin();
						} else {
							return -1 * Float.MAX_VALUE;
						}

					}
					if (v.getParameter().getFloat64() != null) {

						if (v.getParameter().getFloat64().getMin() != null) {
							return v.getParameter().getFloat64().getMin();
						} else {
							return -1 * Double.MAX_VALUE;
						}

					}

					if (v.getParameter().getInt16() != null) {

						if (v.getParameter().getInt16().getMin() != null) {
							return v.getParameter().getInt16().getMin();
						} else {
							return Short.MIN_VALUE;
						}

					}

					if (v.getParameter().getInt32() != null) {

						if (v.getParameter().getInt32().getMin() != null) {
							return v.getParameter().getInt32().getMin();
						} else {
							return Integer.MIN_VALUE;
						}

					}

					if (v.getParameter().getInt64() != null) {

						if (v.getParameter().getInt64().getMin() != null) {
							return v.getParameter().getInt64().getMin();
						} else {
							return Long.MIN_VALUE;
						}

					}
					if (v.getParameter().getInt8() != null) {

						if (v.getParameter().getInt8().getMin() != null) {
							return v.getParameter().getInt8().getMin();
						} else {
							return Byte.MIN_VALUE;
						}

					}

					if (v.getParameter().getString() != null) {

						return "";

					}

					if (v.getParameter().getUint16() != null) {

						if (v.getParameter().getUint16().getMin() != null) {
							return v.getParameter().getUint16().getMin();
						} else {
							return 0;
						}

					}

					if (v.getParameter().getUint32() != null) {

						if (v.getParameter().getUint32().getMin() != null) {
							return v.getParameter().getUint32().getMin();
						} else {
							return 0;
						}

					}
					if (v.getParameter().getUint64() != null) {

						if (v.getParameter().getUint64().getMin() != null) {
							return v.getParameter().getUint64().getMin();
						} else {
							return 0;
						}

					}
					if (v.getParameter().getUint8() != null) {

						if (v.getParameter().getUint8().getMin() != null) {
							return v.getParameter().getUint8().getMin();
						} else {
							return 0;
						}

					}

				}

			}

		}

		throw new Exception("Could not find Variable with ValueReference : " + vr + " for determining Min Value");

	}

	/**
	 * Return Data Type Code for the slave variable, specified by the given
	 * value reference
	 * 
	 * @param vr
	 *            - value reference of the variable
	 * @return Data Type Code for the specified variable (corresponding to the
	 *         acosar standard)
	 * @throws Exception
	 *             - If no variable with the given value reference can be found
	 */
	public short getDataTypeFromVr(int vr) throws Exception {

		List<DcpVariable> vars = dcpDesc.getVariables().getVariable();

		for (DcpVariable v : vars) {

			if (v.getValueReference().intValue() == vr) {

				if (v.getInput() != null) {

					if (v.getInput().getFloat32() != null) {
						return DataTypeList.float32;
					}
					if (v.getInput().getFloat64() != null) {
						return DataTypeList.float64;
					}
					if (v.getInput().getInt16() != null) {
						return DataTypeList.int16;
					}
					if (v.getInput().getInt32() != null) {
						return DataTypeList.int32;
					}
					if (v.getInput().getInt64() != null) {
						return DataTypeList.int64;
					}
					if (v.getInput().getInt8() != null) {
						return DataTypeList.int8;
					}
					if (v.getInput().getString() != null) {
						return DataTypeList.string;
					}
					if (v.getInput().getUint16() != null) {
						return DataTypeList.uint16;
					}
					if (v.getInput().getUint32() != null) {
						return DataTypeList.uint32;
					}
					if (v.getInput().getUint64() != null) {
						return DataTypeList.uint64;
					}
					if (v.getInput().getUint8() != null) {
						return DataTypeList.uint8;
					}

				}

				if (v.getOutput() != null) {

					if (v.getOutput().getFloat32() != null) {

						return DataTypeList.float32;

					}
					if (v.getOutput().getFloat64() != null) {
						return DataTypeList.float64;
					}
					if (v.getOutput().getInt16() != null) {
						return DataTypeList.int16;
					}
					if (v.getOutput().getInt32() != null) {

						return DataTypeList.int32;
					}
					if (v.getOutput().getInt64() != null) {
						return DataTypeList.int64;
					}
					if (v.getOutput().getInt8() != null) {
						return DataTypeList.int8;
					}
					if (v.getOutput().getString() != null) {
						return DataTypeList.string;
					}
					if (v.getOutput().getUint16() != null) {
						return DataTypeList.uint16;
					}
					if (v.getOutput().getUint32() != null) {
						return DataTypeList.uint32;
					}
					if (v.getOutput().getUint64() != null) {
						return DataTypeList.uint64;
					}
					if (v.getOutput().getUint8() != null) {
						return DataTypeList.uint8;
					}

				}

				if (v.getParameter() != null) {

					if (v.getParameter().getFloat32() != null) {
						return DataTypeList.float32;
					}
					if (v.getParameter().getFloat64() != null) {
						return DataTypeList.float64;
					}
					if (v.getParameter().getInt16() != null) {
						return DataTypeList.int16;
					}
					if (v.getParameter().getInt32() != null) {
						return DataTypeList.int32;
					}
					if (v.getParameter().getInt64() != null) {
						return DataTypeList.int64;
					}
					if (v.getParameter().getInt8() != null) {
						return DataTypeList.int8;
					}
					if (v.getParameter().getString() != null) {
						return DataTypeList.string;
					}
					if (v.getParameter().getUint16() != null) {
						return DataTypeList.uint16;
					}
					if (v.getParameter().getUint32() != null) {
						return DataTypeList.uint32;
					}
					if (v.getParameter().getUint64() != null) {
						return DataTypeList.uint64;
					}
					if (v.getParameter().getUint8() != null) {
						return DataTypeList.uint8;
					}

				}

			}

		}

		throw new Exception("Could not find Variable with ValueReference : " + vr);

	}

	/**
	 * Get list of tunable parameter variables of the slaves
	 * 
	 * 
	 * @return List of Tunable Parameter Variables of the Slave
	 */
	public List<DcpVariable> getTunableParameter() {

		List<DcpVariable> vars = dcpDesc.getVariables().getVariable();
		List<DcpVariable> tunableParams = new LinkedList<>();

		for (DcpVariable var : vars) {

			if (var.getParameter() != null && var.getVariability().equals("tunable")) {

				tunableParams.add(var);
			}

		}

		return tunableParams;

	}

	/**
	 * Get an invalid OpMode Code for the given slave
	 * 
	 * @return Invalid OpMode Code
	 */
	public short getInvalidOpMode() {

		if (!isNonRealTimeSupported()) {
			return OpMode.NRT;
		}

		if (!isSoftRealTimeSupported()) {
			return OpMode.SRT;
		}

		if (!isHardRealTimeSupported()) {
			return OpMode.HRT;
		}

		// No OpMode with value 3 exists
		return 3;
	}

	/**
	 * Get a random supported OpMode for the given slave
	 * 
	 * @return Code for a random supported OpMode
	 */
	public short getRandomOpMode() {

		if (isNonRealTimeSupported()) {
			return OpMode.NRT;
		}

		if (isSoftRealTimeSupported()) {
			return OpMode.SRT;
		}

		if (isHardRealTimeSupported()) {
			return OpMode.HRT;
		}

		return 0;

	}

	/**
	 * Get an invalid slave uuid as a String
	 * 
	 * @return invalid slave uuid
	 */
	public String getInvalidSlaveUuid() {

		String s = dcpDesc.getUuid();
		char[] charArray = s.toCharArray();

		if (charArray[charArray.length - 1] == 97) {

			charArray[charArray.length - 1] = 98;
		} else {
			charArray[charArray.length - 1] = 97;
		}

		return new String(charArray);
	}

	/**
	 * Get a random valid slave uuid (the slave uuid is returned)
	 * 
	 * @return the slave uuid
	 */
	public String getRandomSlaveUuid() {

		return dcpDesc.getUuid();
	}

	/**
	 * Return if the opMode specified by the given code is supported or not
	 * 
	 * @param opModeCode
	 *            - Code of the opMode Category that should be evaluated
	 * @return true if the opMode is supported by the slave
	 */
	public boolean currentOpModeNotSupported(short opModeCode) {

		if (opModeCode == OpMode.HRT) {
			if (!isHardRealTimeSupported()) {
				return true;
			} else {
				return false;
			}
		}

		if (opModeCode == OpMode.SRT) {
			if (!isSoftRealTimeSupported()) {
				return true;
			} else {
				return false;
			}
		}

		if (opModeCode == OpMode.NRT) {
			if (!isNonRealTimeSupported()) {
				return true;
			} else {
				return false;
			}
		}

		return false;

	}

	/**
	 * Get an invalid numerator value for the time resolution of the slave
	 * 
	 * @return invalid numerator for the time resolution
	 */
	public long getInvalidNumerator() {

		List<Object> resItems = dcpDesc.getTimeRes().getResolutionOrResolutionRange();
		List<Long> numeratorList = new LinkedList<>();
		for (Object o : resItems) {

			String objectClass = o.getClass().getName().substring(o.getClass().getName().lastIndexOf("$") + 1);

			switch (objectClass) {

			case "Resolution":

				DcpSlaveDescription.TimeRes.Resolution res = (DcpSlaveDescription.TimeRes.Resolution) o;
				numeratorList.add(res.getNumerator());
				break;

			case "ResolutionRange":

				DcpSlaveDescription.TimeRes.ResolutionRange resRange = (DcpSlaveDescription.TimeRes.ResolutionRange) o;

				for (long i = resRange.getNumeratorFrom(); i < resRange.getNumeratorTo(); i++) {

					numeratorList.add(i);

				}

				break;

			}
		}

		// Check all possible values; if value is not supported -> return
		for (long i = 0; i < Long.MAX_VALUE; i++) {
			if (!numeratorList.contains(i)) {
				return i;
			}
		}
		return 0;
	}

	/**
	 * Get an invalid Denominator value for the time resolution
	 * 
	 * 
	 * @return invalid denominator for time resolution
	 */
	public long getInvalidDenominator() {

		List<Object> resItems = dcpDesc.getTimeRes().getResolutionOrResolutionRange();
		List<Long> denominatorList = new LinkedList<>();
		for (Object o : resItems) {

			String objectClass = o.getClass().getName().substring(o.getClass().getName().lastIndexOf("$") + 1);

			switch (objectClass) {

			case "Resolution":

				DcpSlaveDescription.TimeRes.Resolution res = (DcpSlaveDescription.TimeRes.Resolution) o;
				denominatorList.add(res.getDenominator());
				break;

			case "ResolutionRange":

				DcpSlaveDescription.TimeRes.ResolutionRange resRange = (DcpSlaveDescription.TimeRes.ResolutionRange) o;
				denominatorList.add(resRange.getDenominator());

				break;

			}

		}

		// Check all possible values; if a value is not supported -> return
		for (long i = 0; i < Long.MAX_VALUE; i++) {
			if (!denominatorList.contains(i)) {
				return i;
			}

		}
		return 0;

	}

	/**
	 * Get the data Id for a input variable specified by the given value
	 * reference
	 * 
	 * @param vr
	 *            - value reference for the variable
	 * @return data id for the variable
	 */
	public short getDataIdFromInputVr(int vr) {

		List<DcpVariable> vars = dcpDesc.getVariables().getVariable();

		for (DcpVariable v : vars) {

			if (v.getValueReference().intValue() == vr) {

				if (v.getInput() != null) {

					if (dataIdMap.containsKey(vr)) {
						return dataIdMap.get(vr).shortValue();
					} else {

						dataIdMap.put(vr, dataIdCounter);
						dataIdCounter++;
						return dataIdMap.get(vr).shortValue();

					}
				}
			}

		}
		return 0;

	}

	/**
	 * Get the dcpDescription as Object
	 * 
	 * @return dcpDescription
	 */
	public DcpSlaveDescription getDcpDesc() {

		return dcpDesc;

	}

	/**
	 * Return if the Communication Protocol specified by the given code is
	 * supported by this slave or not
	 * 
	 * @param proto
	 *            - protocol that should be evaluated
	 * @return true if the given protocol is supported
	 */
	public boolean currentProtocolNotSupported(short proto) {

		if (TransportProtocolList.CAN_BASED == proto) {

			if (dcpDesc.getTransportProtocols().getCAN() != null) {
				// Can supported
				return false;

			} else {
				// Can not supported
				return true;

			}

		}

		if (TransportProtocolList.TCP == proto) {

			if (dcpDesc.getTransportProtocols().getTCPIPv4() != null) {
				return false;

			} else {

				return true;
			}

		}

		if (TransportProtocolList.RFCOMM_BLUETOOTH == proto) {

			if (dcpDesc.getTransportProtocols().getBluetooth() != null) {
				// Bluetooth supported
				return false;

			} else {

				// Bluetooth not supported
				return true;

			}

		}

		if (TransportProtocolList.UDP_IPV4 == proto) {

			if (dcpDesc.getTransportProtocols().getUDPIPv4() != null) {
				// UDP supported
				return false;

			} else {
				// UDP not supported
				return true;

			}

		}

		if (TransportProtocolList.USB_2_0 == proto) {

			if (dcpDesc.getTransportProtocols().getUSB2() != null) {
				// USB supported
				return false;

			} else {
				// USb not supported
				return true;

			}

		}

		return false;
	}

	/**
	 * Get the Udp Ip Adress as a long number
	 * 
	 * @return udp ip adress as long number
	 */
	public long getUdpControlIp() {

		if (dcpDesc.getTransportProtocols() != null && dcpDesc.getTransportProtocols().getUDPIPv4() != null && dcpDesc.getTransportProtocols().getUDPIPv4().getControl() != null && dcpDesc.getTransportProtocols().getUDPIPv4().getControl().getHost() != null) {

			String ipString = dcpDesc.getTransportProtocols().getUDPIPv4().getControl().getHost();
			InetAddress address = null;
			try {
				address = InetAddress.getByName(ipString);
			} catch (UnknownHostException e) {
				System.err.println("Invalid Control host");
				System.exit(1);
			} 
			Long ip = Ip2Long(address.getHostAddress());
			return ip.longValue();
		}

		Long ipVal = Ip2Long(ip);
		return ipVal.longValue();
	}
	
	public long getUdpParameterIp() {

		if (dcpDesc.getTransportProtocols() != null && dcpDesc.getTransportProtocols().getUDPIPv4() != null && dcpDesc.getTransportProtocols().getUDPIPv4().getDATParameter() != null && dcpDesc.getTransportProtocols().getUDPIPv4().getDATParameter().getHost() != null) {

			String ipString = dcpDesc.getTransportProtocols().getUDPIPv4().getDATParameter().getHost();
			InetAddress address = null;
			try {
				address = InetAddress.getByName(ipString);
			} catch (UnknownHostException e) {
				System.err.println("Invalid Control host");
				System.exit(1);
			} 
			Long ip = Ip2Long(address.getHostAddress());
			return ip.longValue();
		}

		Long ipVal = Ip2Long(ip);
		return ipVal.longValue();
	}
	
	public long getUdpInputOutputIp() {

		if (dcpDesc.getTransportProtocols() != null && dcpDesc.getTransportProtocols().getUDPIPv4() != null && dcpDesc.getTransportProtocols().getUDPIPv4().getDATInputOutput() != null && dcpDesc.getTransportProtocols().getUDPIPv4().getDATInputOutput().getHost() != null) {

			String ipString = dcpDesc.getTransportProtocols().getUDPIPv4().getDATInputOutput().getHost();
			InetAddress address = null;
			try {
				address = InetAddress.getByName(ipString);
			} catch (UnknownHostException e) {
				System.err.println("Invalid Control host");
				System.exit(1);
			} 
			Long ip = Ip2Long(address.getHostAddress());
			return ip.longValue();
		}

		Long ipVal = Ip2Long(ip);
		return ipVal.longValue();
	}
	
	public long getTcpControlIp() {

		if (dcpDesc.getTransportProtocols() != null && dcpDesc.getTransportProtocols().getTCPIPv4() != null && dcpDesc.getTransportProtocols().getTCPIPv4().getControl() != null && dcpDesc.getTransportProtocols().getTCPIPv4().getControl().getHost() != null) {

			String ipString = dcpDesc.getTransportProtocols().getTCPIPv4().getControl().getHost();
			InetAddress address = null;
			try {
				address = InetAddress.getByName(ipString);
			} catch (UnknownHostException e) {
				System.err.println("Invalid Control host");
				System.exit(1);
			} 
			Long ip = Ip2Long(address.getHostAddress());
			return ip.longValue();
		}

		Long ipVal = Ip2Long(ip);
		return ipVal.longValue();
	}
	
	public long getTcpParameterIp() {

		if (dcpDesc.getTransportProtocols() != null && dcpDesc.getTransportProtocols().getTCPIPv4() != null && dcpDesc.getTransportProtocols().getTCPIPv4().getDATParameter() != null && dcpDesc.getTransportProtocols().getTCPIPv4().getDATParameter().getHost() != null) {

			String ipString = dcpDesc.getTransportProtocols().getTCPIPv4().getDATParameter().getHost();
			InetAddress address = null;
			try {
				address = InetAddress.getByName(ipString);
			} catch (UnknownHostException e) {
				System.err.println("Invalid Control host");
				System.exit(1);
			} 
			Long ip = Ip2Long(address.getHostAddress());
			return ip.longValue();
		}

		Long ipVal = Ip2Long(ip);
		return ipVal.longValue();
	}
	
	public long getTcpInputOutputIp() {

		if (dcpDesc.getTransportProtocols() != null && dcpDesc.getTransportProtocols().getTCPIPv4() != null && dcpDesc.getTransportProtocols().getTCPIPv4().getDATInputOutput() != null && dcpDesc.getTransportProtocols().getTCPIPv4().getDATInputOutput().getHost() != null) {

			String ipString = dcpDesc.getTransportProtocols().getTCPIPv4().getDATInputOutput().getHost();
			InetAddress address = null;
			try {
				address = InetAddress.getByName(ipString);
			} catch (UnknownHostException e) {
				System.err.println("Invalid Control host");
				System.exit(1);
			} 
			Long ip = Ip2Long(address.getHostAddress());
			return ip.longValue();
		}

		Long ipVal = Ip2Long(ip);
		return ipVal.longValue();
	}
	

	// Convert a String Ip into a long number
	private Long Ip2Long(String dottedIP) {

		String[] addrArray = dottedIP.split("\\.");
		long num = 0;
		for (int i = 0; i < addrArray.length; i++) {
			int power = 3 - i;
			num += ((Integer.parseInt(addrArray[i]) % 256) * Math.pow(256, power));
		}
		return num;
	}

	/**
	 * Get the Udp Port Number
	 * 
	 * @return udp port number
	 */
	public int getUdpControlPort() {

		if (dcpDesc.getTransportProtocols() != null && dcpDesc.getTransportProtocols().getUDPIPv4() != null && dcpDesc.getTransportProtocols().getUDPIPv4().getControl() != null && dcpDesc.getTransportProtocols().getUDPIPv4().getControl().getPort() != null) {

			return dcpDesc.getTransportProtocols().getUDPIPv4().getControl().getPort().intValue();
		} else {

			return Integer.parseInt(port);

		}

	}
	
	public int getUdpParameterPort() {

		if (dcpDesc.getTransportProtocols() != null && dcpDesc.getTransportProtocols().getUDPIPv4() != null && dcpDesc.getTransportProtocols().getUDPIPv4().getDATParameter() != null) {
			
			if(!dcpDesc.getTransportProtocols().getUDPIPv4().getDATParameter().getAvailablePortRangeOrAvailablePort().isEmpty()) {
				Object o = dcpDesc.getTransportProtocols().getUDPIPv4().getDATParameter().getAvailablePortRangeOrAvailablePort().get(0);
				if(o instanceof DcpIPv4Type.DATParameter.AvailablePortRange) {
					DcpIPv4Type.DATParameter.AvailablePortRange r = (DcpIPv4Type.DATParameter.AvailablePortRange) o;
					return r.getFrom();
				} else if(o instanceof DcpIPv4Type.DATParameter.AvailablePort) {
					DcpIPv4Type.DATParameter.AvailablePort p = (DcpIPv4Type.DATParameter.AvailablePort) o;
					return p.getPort();
				}
			}
		} 
		return Integer.parseInt(port);
	}
	
	public int getUdpInputOutputPort() {

		if (dcpDesc.getTransportProtocols() != null && dcpDesc.getTransportProtocols().getUDPIPv4() != null && dcpDesc.getTransportProtocols().getUDPIPv4().getDATInputOutput() != null) {
			
			if(!dcpDesc.getTransportProtocols().getUDPIPv4().getDATInputOutput().getAvailablePortRangeOrAvailablePort().isEmpty()) {
				Object o = dcpDesc.getTransportProtocols().getUDPIPv4().getDATInputOutput().getAvailablePortRangeOrAvailablePort().get(0);
				if(o instanceof DcpIPv4Type.DATInputOutput.AvailablePortRange) {
					DcpIPv4Type.DATInputOutput.AvailablePortRange r = (DcpIPv4Type.DATInputOutput.AvailablePortRange) o;
					return r.getFrom();
				} else if(o instanceof DcpIPv4Type.DATInputOutput.AvailablePort) {
					DcpIPv4Type.DATInputOutput.AvailablePort p = (DcpIPv4Type.DATInputOutput.AvailablePort) o;
					return p.getPort();
				}
			}
		} 
		return Integer.parseInt(port);
	}
	
	public int getTcpControlPort() {

		if (dcpDesc.getTransportProtocols() != null && dcpDesc.getTransportProtocols().getTCPIPv4() != null && dcpDesc.getTransportProtocols().getTCPIPv4().getControl() != null && dcpDesc.getTransportProtocols().getTCPIPv4().getControl().getPort() != null) {

			return dcpDesc.getTransportProtocols().getTCPIPv4().getControl().getPort().intValue();
		} else {

			return Integer.parseInt(port);

		}

	}
	
	public int getTcpParameterPort() {

		if (dcpDesc.getTransportProtocols() != null && dcpDesc.getTransportProtocols().getTCPIPv4() != null && dcpDesc.getTransportProtocols().getTCPIPv4().getDATParameter() != null) {
			
			if(!dcpDesc.getTransportProtocols().getTCPIPv4().getDATParameter().getAvailablePortRangeOrAvailablePort().isEmpty()) {
				Object o = dcpDesc.getTransportProtocols().getTCPIPv4().getDATParameter().getAvailablePortRangeOrAvailablePort().get(0);
				if(o instanceof DcpIPv4Type.DATParameter.AvailablePortRange) {
					DcpIPv4Type.DATParameter.AvailablePortRange r = (DcpIPv4Type.DATParameter.AvailablePortRange) o;
					return r.getFrom();
				} else if(o instanceof DcpIPv4Type.DATParameter.AvailablePort) {
					DcpIPv4Type.DATParameter.AvailablePort p = (DcpIPv4Type.DATParameter.AvailablePort) o;
					return p.getPort();
				}
			}
		} 
		return Integer.parseInt(port);
	}
	
	public int getTcpInputOutputPort() {

		if (dcpDesc.getTransportProtocols() != null && dcpDesc.getTransportProtocols().getTCPIPv4() != null && dcpDesc.getTransportProtocols().getTCPIPv4().getDATInputOutput() != null) {
			
			if(!dcpDesc.getTransportProtocols().getTCPIPv4().getDATInputOutput().getAvailablePortRangeOrAvailablePort().isEmpty()) {
				Object o = dcpDesc.getTransportProtocols().getTCPIPv4().getDATInputOutput().getAvailablePortRangeOrAvailablePort().get(0);
				if(o instanceof DcpIPv4Type.DATInputOutput.AvailablePortRange) {
					DcpIPv4Type.DATInputOutput.AvailablePortRange r = (DcpIPv4Type.DATInputOutput.AvailablePortRange) o;
					return r.getFrom();
				} else if(o instanceof DcpIPv4Type.DATInputOutput.AvailablePort) {
					DcpIPv4Type.DATInputOutput.AvailablePort p = (DcpIPv4Type.DATInputOutput.AvailablePort) o;
					return p.getPort();
				}
			}
		} 
		return Integer.parseInt(port);
	}

	/**
	 * Get the slave minor version
	 * 
	 * @return slave minor version
	 */
	public short getMinorVersion() {

		return dcpDesc.getDcpMinorVersion();
	}

	/**
	 * Get the slave major version
	 * 
	 * @return slave major version
	 */
	public short getMajorVersion() {

		return dcpDesc.getDcpMajorVersion();
	}

	/**
	 * Get an invalid data type code for a variable specified by the value
	 * reference
	 * 
	 * @param vr
	 *            - value reference of the variable
	 * @return data code for an invalid data type
	 * 
	 */
	public short getInvalidDataTypeFromVr(int vr) {
		List<DcpVariable> vars = dcpDesc.getVariables().getVariable();

		for (DcpVariable v : vars) {

			if (v.getValueReference().intValue() == vr) {

				if (v.getInput() != null) {

					if (v.getInput().getFloat32() != null) {
						return DataTypeList.float64;
					}
					if (v.getInput().getFloat64() != null) {
						return DataTypeList.uint64;
					}
					if (v.getInput().getInt16() != null) {
						return DataTypeList.int32;
					}
					if (v.getInput().getInt32() != null) {
						return DataTypeList.int64;
					}
					if (v.getInput().getInt64() != null) {
						return DataTypeList.uint64;
					}
					if (v.getInput().getInt8() != null) {
						return DataTypeList.int16;
					}
					if (v.getInput().getString() != null) {
						return DataTypeList.uint8;
					}
					if (v.getInput().getUint16() != null) {
						return DataTypeList.uint32;
					}
					if (v.getInput().getUint32() != null) {
						return DataTypeList.uint64;
					}
					if (v.getInput().getUint64() != null) {
						return DataTypeList.float64;
					}
					if (v.getInput().getUint8() != null) {
						return DataTypeList.uint16;
					}

				}

				if (v.getOutput() != null) {

					if (v.getOutput().getFloat32() != null) {
						return DataTypeList.float64;
					}
					if (v.getOutput().getFloat64() != null) {
						return DataTypeList.uint64;
					}
					if (v.getOutput().getInt16() != null) {
						return DataTypeList.int32;
					}
					if (v.getOutput().getInt32() != null) {
						return DataTypeList.int64;
					}
					if (v.getOutput().getInt64() != null) {
						return DataTypeList.uint64;
					}
					if (v.getOutput().getInt8() != null) {
						return DataTypeList.int16;
					}
					if (v.getOutput().getString() != null) {
						return DataTypeList.uint8;
					}
					if (v.getOutput().getUint16() != null) {
						return DataTypeList.uint32;
					}
					if (v.getOutput().getUint32() != null) {
						return DataTypeList.uint64;
					}
					if (v.getOutput().getUint64() != null) {
						return DataTypeList.float64;
					}
					if (v.getOutput().getUint8() != null) {
						return DataTypeList.uint16;
					}

				}

				if (v.getParameter() != null) {

					if (v.getParameter().getFloat32() != null) {
						return DataTypeList.float64;
					}
					if (v.getParameter().getFloat64() != null) {
						return DataTypeList.uint64;
					}
					if (v.getParameter().getInt16() != null) {
						return DataTypeList.int32;
					}
					if (v.getParameter().getInt32() != null) {
						return DataTypeList.int64;
					}
					if (v.getParameter().getInt64() != null) {
						return DataTypeList.uint64;
					}
					if (v.getParameter().getInt8() != null) {
						return DataTypeList.int16;
					}
					if (v.getParameter().getString() != null) {
						return DataTypeList.uint8;
					}
					if (v.getParameter().getUint16() != null) {
						return DataTypeList.uint32;
					}
					if (v.getParameter().getUint32() != null) {
						return DataTypeList.uint64;
					}
					if (v.getParameter().getUint64() != null) {
						return DataTypeList.float64;
					}
					if (v.getParameter().getUint8() != null) {
						return DataTypeList.uint16;
					}
				}

			}

		}

		return 0;

	}

	/**
	 * Get a random but valid number for the time resolution numerator
	 * 
	 * 
	 * @return random and valid numerator value
	 */

	public long getRandomNumerator() {

		List<Object> resItems = dcpDesc.getTimeRes().getResolutionOrResolutionRange();
		List<Long> numeratorList = new LinkedList<>();
		for (Object o : resItems) {

			String objectClass = o.getClass().getName().substring(o.getClass().getName().lastIndexOf("$") + 1);

			switch (objectClass) {

			case "Resolution":

				DcpSlaveDescription.TimeRes.Resolution res = (DcpSlaveDescription.TimeRes.Resolution) o;
				numeratorList.add(res.getNumerator());
				break;

			case "ResolutionRange":

				DcpSlaveDescription.TimeRes.ResolutionRange resRange = (DcpSlaveDescription.TimeRes.ResolutionRange) o;

				for (long i = resRange.getNumeratorFrom(); i < resRange.getNumeratorTo(); i++) {

					numeratorList.add(i);

				}

				break;

			}
		}

		if (numeratorList.size() != 0) {

			// return numeratorList.get((new
			// Random()).nextInt(numeratorList.size()));
			Collections.sort(numeratorList);
			return numeratorList.get(0);
		} else {
			return 0;
		}

	}

	/**
	 * Get random and valid value for time resolution denominator
	 * 
	 * @return random and valid denominator value
	 */
	public long getRandomDenominator() {
		List<Object> resItems = dcpDesc.getTimeRes().getResolutionOrResolutionRange();
		List<Long> denominatorList = new LinkedList<>();
		for (Object o : resItems) {

			String objectClass = o.getClass().getName().substring(o.getClass().getName().lastIndexOf("$") + 1);

			switch (objectClass) {

			case "Resolution":

				DcpSlaveDescription.TimeRes.Resolution res = (DcpSlaveDescription.TimeRes.Resolution) o;
				denominatorList.add(res.getDenominator());
				break;

			case "ResolutionRange":

				DcpSlaveDescription.TimeRes.ResolutionRange resRange = (DcpSlaveDescription.TimeRes.ResolutionRange) o;
				denominatorList.add(resRange.getDenominator());

				break;

			}

		}

		if (denominatorList.size() != 0) {

			return denominatorList.get((new Random()).nextInt(denominatorList.size()));

		} else {
			return 0;
		}
	}

	/**
	 * Get an value reference for an non existing parameter
	 * 
	 * @return value reference of non existing parameter
	 */

	public int getInvalidParamVr() {

		List<DcpVariable> vars = dcpDesc.getVariables().getVariable();
		List<Integer> currentUsedParamVrs = new LinkedList<>();

		for (DcpVariable v : vars) {

			if (v.getParameter() != null) {

				currentUsedParamVrs.add(v.getValueReference().intValue());

			}

		}

		for (int i = 0; i < Integer.MAX_VALUE; i++) {

			if (!currentUsedParamVrs.contains(i)) {

				return i;
			}

		}

		return 0;

	}

	/**
	 * Get a random but valid parameter value reference
	 * 
	 * @return A random but valid parameter value reference
	 */
	public int getRandomParamVr() {

		List<DcpVariable> vars = dcpDesc.getVariables().getVariable();
		for (DcpVariable v : vars) {

			if (v.getParameter() != null) {

				return v.getValueReference().intValue();

			}

		}

		return 0;

	}

	public int getRandomTunableParamVr() {

		List<DcpVariable> vars = dcpDesc.getVariables().getVariable();
		for (DcpVariable v : vars) {

			if (v.getParameter() != null && v.getVariability().equals("tunable")) {

				return v.getValueReference().intValue();

			}

		}

		return 0;

	}

	public byte[] getRandomPayload(int targetVr) {

		List<DcpVariable> vars = dcpDesc.getVariables().getVariable();

		for (DcpVariable v : vars) {

			if (v.getValueReference().intValue() == targetVr) {

				if (v.getParameter() != null) {

					try {

						BigInteger i;

						Object min = getMinForVr(targetVr);

						if (min instanceof Float) {
							i = new BigInteger(((Float) min).longValue() + "");
							return i.toByteArray();
						}

						if (min instanceof Double) {
							i = new BigInteger(((Double) min).longValue() + "");
							return i.toByteArray();
						}

						if (min instanceof Short) {
							i = new BigInteger(((Short) min).longValue() + "");
							return i.toByteArray();
						}

						if (min instanceof Integer) {
							i = new BigInteger(((Integer) min).longValue() + "");
							return i.toByteArray();
						}

						if (min instanceof Long) {
							i = new BigInteger(((Long) min).longValue() + "");
							return i.toByteArray();
						}

						if (min instanceof Byte) {
							i = new BigInteger(((Byte) min).longValue() + "");
							return i.toByteArray();
						}

						if (min instanceof BigInteger) {
							i = new BigInteger(((BigInteger) min).longValue() + "");
							return i.toByteArray();
						}

					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			}

		}

		return new byte[1];
	}

	public int getRandomInputVr() {

		List<DcpVariable> vars = dcpDesc.getVariables().getVariable();
		for (DcpVariable v : vars) {

			if (v.getInput() != null) {

				return v.getValueReference().intValue();

			}

		}

		return 0;
	}

	public int getRandomOutputVr() {

		List<DcpVariable> vars = dcpDesc.getVariables().getVariable();
		for (DcpVariable v : vars) {

			if (v.getOutput() != null) {

				return v.getValueReference().intValue();

			}

		}

		return 0;
	}

	public int getDimensionOfVr(int targetVr) {

		List<DcpVariable> vars = dcpDesc.getVariables().getVariable();

		for (DcpVariable v : vars) {

			if (v.getValueReference().intValue() == targetVr) {

				if (v.getInput() != null) {

					int numberOfVariablesForDimensions = 0;

					if (v.getInput().getDimensions() != null) {

						for (Dimension dim : v.getInput().getDimensions().getDimension()) {

							if (dim.getConstant() != null) {

								if (numberOfVariablesForDimensions == 0) {

									numberOfVariablesForDimensions = dim.getConstant().intValue();

								} else {

									numberOfVariablesForDimensions = numberOfVariablesForDimensions * dim.getConstant().intValue();
								}

							}

						}

					}

					if (numberOfVariablesForDimensions == 0) {
						return 1;
					} else {
						System.out.println("Dimensions : " + numberOfVariablesForDimensions);
						return numberOfVariablesForDimensions;
					}

				}

				if (v.getOutput() != null) {

					int numberOfVariablesForDimensions = 0;

					if (v.getOutput().getDimensions() != null) {

						for (Dimension dim : v.getOutput().getDimensions().getDimension()) {

							if (dim.getConstant() != null) {

								if (numberOfVariablesForDimensions == 0) {

									numberOfVariablesForDimensions = dim.getConstant().intValue();
									System.out.println("Setting new : " + dim.getConstant().intValue());

								} else {
									System.out.println("Setting Multiplying");

									numberOfVariablesForDimensions = numberOfVariablesForDimensions * dim.getConstant().intValue();

									System.out.println("Setting Multiplying Result " + numberOfVariablesForDimensions);

								}

							}

						}

					}

					if (numberOfVariablesForDimensions == 0) {
						return 1;
					} else {
						System.out.println("Output Dimensions : " + numberOfVariablesForDimensions);

						return numberOfVariablesForDimensions;
					}

				}

				if (v.getParameter() != null) {

					int numberOfVariablesForDimensions = 0;

					if (v.getParameter().getDimensions() != null) {

						for (Dimension dim : v.getParameter().getDimensions().getDimension()) {

							if (dim.getConstant() != null) {

								if (numberOfVariablesForDimensions == 0) {

									numberOfVariablesForDimensions = dim.getConstant().intValue();

								} else {

									numberOfVariablesForDimensions = numberOfVariablesForDimensions * dim.getConstant().intValue();
								}

							}

						}

					}

					if (numberOfVariablesForDimensions == 0) {
						return 1;
					} else {
						System.out.println("Dimensions : " + numberOfVariablesForDimensions);

						return numberOfVariablesForDimensions;
					}

				}

			}

		}

		return 1;

	}

}
