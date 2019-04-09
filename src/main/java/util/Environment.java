package util;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import com.google.gson.Gson;

import Loader.Loader;
import dcpTestProcedure.DcpTestProcedure;
import dcpTestProcedure.DcpTestProcedure.Transition;
import wrappers.DcpWrapper;

/**
 * This class is used to evaluate general boolean expressions from the loaded
 * expansion xml like "state != Alive" or transition.sending != undefined .
 * 
 * The conditions and attributes accesses are very similar to the javascript
 * notation, therefore the loaded dcp Description and the pathTemplate which
 * should be expanded, are parsed to an intern javascript engine.
 * 
 * All evaluations are realized as simple javascript variable comparisons or
 * evaluations, that are returned to the java code.
 * 
 * 
 * 
 * 
 *
 */
public class Environment {

	private ScriptEngine scriptEngine;
	private Gson gson;
	private List<Transition> generatedTransitionsSinceLastCall;

	/**
	 * Constructor for the Environment class
	 * 
	 * @param dcpWrapper
	 *            - the dcp Wrapper holding the loaded dcp Description
	 * @param templateProcedure
	 *            - the basic Path Template that should be expanded
	 * @param testerIp
	 *            - value that should be used for the tester Ip
	 * @param testerPort
	 *            - value that should be used for the tester port
	 */
	public Environment(DcpWrapper dcpWrapper, DcpTestProcedure templateProcedure, String testerIp, String testerPort, String slavePort, String slaveIp) {

		scriptEngine = new ScriptEngineManager().getEngineByName("JavaScript");
		gson = new Gson();
		generatedTransitionsSinceLastCall = new ArrayList<>();

		String acu = gson.toJson(dcpWrapper.getDcpDesc());

		String transitions = gson.toJson(templateProcedure);

		// Parse the dcp Description and basic Path Template to the javascript
		// engine;
		// Load the javascript helper functions defined in the .js files

		try {

			scriptEngine.eval("var slave = JSON.parse(' " + acu + "');");

			if (slaveIp != null && !slaveIp.trim().equals("")) {

				scriptEngine.eval("if(slave.transportProtocols.udpiPv4 == undefined){slave.transportProtocols.udpiPv4 = {};}");
				scriptEngine.eval("if(slave.transportProtocols.udpiPv4.control == undefined){slave.transportProtocols.udpiPv4.control = {};}");
				scriptEngine.eval("slave.transportProtocols.udpiPv4.control.host = '" + slaveIp + "';");
			}

			if (slavePort != null && !slavePort.trim().equals("")) {
				scriptEngine.eval("if(slave.transportProtocols.udpiPv4 == undefined){slave.transportProtocols.udpiPv4 = {};}");
				scriptEngine.eval("if(slave.transportProtocols.udpiPv4.control == undefined){slave.transportProtocols.udpiPv4.control = {};}");
				scriptEngine.eval("slave.transportProtocols.udpiPv4.control.port = '" + slavePort + "';");

			}
			
			if (slaveIp != null && !slaveIp.trim().equals("")) {

				scriptEngine.eval("if(slave.transportProtocols.tcpiPv4 == undefined){slave.transportProtocols.tcpiPv4 = {};}");
				scriptEngine.eval("if(slave.transportProtocols.tcpiPv4.control == undefined){slave.transportProtocols.tcpiPv4.control = {};}");
				scriptEngine.eval("slave.transportProtocols.tcpiPv4.control.host = '" + slaveIp + "';");
			}

			if (slavePort != null && !slavePort.trim().equals("")) {
				scriptEngine.eval("if(slave.transportProtocols.tcpiPv4 == undefined){slave.transportProtocols.tcpiPv4 = {};}");
				scriptEngine.eval("if(slave.transportProtocols.tcpiPv4.control == undefined){slave.transportProtocols.tcpiPv4.control = {};}");
				scriptEngine.eval("slave.transportProtocols.tcpiPv4.control.port = '" + slavePort + "';");

			}

			scriptEngine.eval("var t = JSON.parse('" + transitions + "');");
			scriptEngine.eval("var Tester = {};");
			scriptEngine.eval("var Tester = {};");
			scriptEngine.eval("var ACU = {};");
			scriptEngine.eval(new InputStreamReader(Loader.class.getClass().getResourceAsStream("/javascript/ip2int")));
			scriptEngine.eval("Tester.ip ='" + testerIp + "';");
			scriptEngine.eval("Tester.port = " + testerPort + ";");
			scriptEngine.eval("ACU.uuid = '" + dcpWrapper.getUuid() + "';");
			scriptEngine.eval(new InputStreamReader(Loader.class.getClass().getResourceAsStream("/javascript/Ids.js")));
			scriptEngine.eval(new InputStreamReader(Loader.class.getClass().getResourceAsStream("/javascript/resolve.js")));
			scriptEngine.eval(new InputStreamReader(Loader.class.getClass().getResourceAsStream("/javascript/breakpoint.js")));
			scriptEngine.eval(new InputStreamReader(Loader.class.getClass().getResourceAsStream("/javascript/minMaxDefined.js")));
			scriptEngine.eval(new InputStreamReader(Loader.class.getClass().getResourceAsStream("/javascript/getMin.js")));
			scriptEngine.eval(new InputStreamReader(Loader.class.getClass().getResourceAsStream("/javascript/getMax.js")));
			scriptEngine.eval(new InputStreamReader(Loader.class.getClass().getResourceAsStream("/javascript/determineState.js")));
			scriptEngine.eval(new InputStreamReader(Loader.class.getClass().getResourceAsStream("/javascript/parseTransitions.js")));
			scriptEngine.eval(new InputStreamReader(Loader.class.getClass().getResourceAsStream("/javascript/dataType.js")));
			scriptEngine.eval(new InputStreamReader(Loader.class.getClass().getResourceAsStream("/javascript/hasVariables.js")));

		} catch (ScriptException e) {

			System.out.println("Error occured while parsing javascript variables and functions");
			e.printStackTrace();
			System.exit(1);

		}

	}

	/**
	 * The javascript state and variableName variables are updated to their
	 * current value, contained in passed env map
	 * 
	 * 
	 * @param env
	 *            - Map containing variable Names and their current Values
	 *            corresponding to the current position in the expansion xml
	 */

	public void prepareEngine(Map<String, Object> env) {

		if (env.get("state") != null) {
			try {
				scriptEngine.eval("var state = " + env.get("state") + ";");
			} catch (ScriptException e) {
				System.out.println("Error occured while evaluating state variable by javascript engine");
				e.printStackTrace();
				System.exit(1);
			}
		}

		if (env.get("variableName") != null && env.get(env.get("variableName")) != null) {
			try {
				scriptEngine.eval("var " + env.get("variableName") + " = " + env.get(env.get("variableName")));
			} catch (ScriptException e) {
				System.out.println("Error occured while evaluating " + env.get("variableName") + " by javascript engine ");
				e.printStackTrace();
				System.exit(1);
			}

		}

	}

	/**
	 * Evaluate a given Expression by the javascript engine
	 * 
	 * @param engineCommand
	 *            - the Expression to be evaluated by the javascript engine
	 * @return - Object that represents the evaluation result (Must be casted in
	 *         further progression for example to boolean or double)
	 */

	public Object eval(String engineCommand) {

		engineCommand = parseEngineCommandNotation(engineCommand);

		try {
			Object result = scriptEngine.eval(engineCommand);

			return result;
		} catch (ScriptException e) {

			System.err.println("Error : Engine could not execute command : " + engineCommand);

			e.printStackTrace();

			System.exit(1);
		}

		return null;
	}

	/**
	 * Get the value of a variable that is saved in the passed env map or is
	 * represented in the javascript Engine
	 * 
	 * @param env
	 *            - Map that holds local variables and their values used for
	 *            expression evaluation
	 * @param variableName
	 *            - the name of the variable the value should be returned
	 * @return - Object that represents the value of the variable
	 */
	public Object getFromEnvironment(Map<String, Object> env, String variableName) {

		if (env.containsKey(variableName)) {

			return env.get(variableName);
		}
		Object result = null;
		try {
			prepareEngine(env);

			// Before evaluating the javascript variable, update the transition
			// variable, which holds all transitions, by the previous generated
			// transitions
			for (Transition t : generatedTransitionsSinceLastCall) {

				String newTransition = gson.toJson(t);

				scriptEngine.eval("t.transition.push(JSON.parse('" + newTransition + "'));");

			}
			generatedTransitionsSinceLastCall.clear();
			
			result = eval(variableName + " ");
		} catch (ScriptException e) {
			System.out.println("Error occured while evaluating value of the variable " + variableName + " by the javascript engine");
			e.printStackTrace();
			System.exit(1);
		}

		return result;

	}

	/**
	 * Add a previous generated new Transition to the intern engine transition
	 * list. During the next evaluation request, the engine intern transition
	 * set will be updated by the transitions passed to this function.
	 * 
	 * @param trans
	 *            - New Transition that should be added to the intern engine
	 *            transition list
	 */
	public void updateEnvironmentTransitionSet(Transition trans) {

		generatedTransitionsSinceLastCall.add(trans);

	}

	/**
	 * Update the engine intern transition set by all the transitions ocurring
	 * in the basic Path template and previous generated new Transitions
	 * 
	 * @param templateProcedure
	 *            - The loaded basic Path Template
	 * @param newTransitions
	 *            - List with all previous generated new Transitions
	 */
	public void updateEnvironmentTransitionSet(DcpTestProcedure templateProcedure, List<Transition> newTransitions) {

		DcpTestProcedure tempProcedure = new DcpTestProcedure();

		tempProcedure.setTransportProtocols(templateProcedure.getTransportProtocols());
		tempProcedure.getTransition().addAll(templateProcedure.getTransition());
		tempProcedure.getTransition().addAll(newTransitions);

		String allTransitions = gson.toJson(tempProcedure);

		try {
			scriptEngine.eval("var t = JSON.parse('" + allTransitions + "');");
		} catch (ScriptException e) {
			System.out.println("Error occured while updating the javascript intern Transition list ");
			e.printStackTrace();
			System.exit(1);
		}

	}

	/**
	 * Change the notation of engine commands from the notation used in the
	 * Expansion xml to the internal notation used by the environment engine.
	 * (For Example : STC_register -> stcRegister)
	 * 
	 * @param engineCommand
	 *            - The Command / Expression that should be evaluated by the
	 *            engine
	 * @return - engine internal notation
	 */

	private String parseEngineCommandNotation(String engineCommand) {

		// Commands that start with "var" are declarations so skip them
		if (engineCommand.trim().startsWith("var")) {

			return engineCommand;

		}

		// Expand all condition calls for "undefined" for a child element with
		// additional undefined calls for all parent elements
		// Example : transition.Sending.STC_register != undefined --> transition
		// != undefined && transition.Sending != undefined &&
		// transition.Sending.STC_register != undefined
		if (engineCommand.contains("!=") && engineCommand.contains("undefined")) {

			String firstPart = engineCommand.split("!=")[0];

			while (firstPart.contains(".")) {

				firstPart = firstPart.substring(0, firstPart.lastIndexOf("."));

				engineCommand = firstPart + " != undefined && " + engineCommand;

			}

		}

		// Split engine commands by dot and whitespace , normalize each token
		// (remove "_" and to lower case) and parse each token into the
		// corresponding notation

		String[] engineCommandDotElements = engineCommand.split("\\.");

		String newEngineCommand = "";

		for (String dotElement : engineCommandDotElements) {

			String[] elements = dotElement.split("((?<=\\()|(?=\\())|((?<=\\))|(?=\\)))|\\s+");

			for (int i = 0; i < elements.length; i++) {

				String elementBaseForm = elements[i].toLowerCase().replace("_", "");

				switch (elementBaseForm) {

				case "sending":
					elements[i] = "sending";
					break;

				case "clocktime":
					elements[i] = "clockTime";
					break;

				case "cfgsettimeres":
					elements[i] = "cfgSetTimeRes";
					break;

				case "receiver":
					elements[i] = "receiver";
					break;

				case "dataid":
					elements[i] = "dataId";
					break;

				case "steps":
					elements[i] = "steps";
					break;

				case "cfgconfiginput":
					elements[i] = "cfgConfigInput";
					break;

				case "pos":
					elements[i] = "pos";
					break;

				case "targetvr":
					elements[i] = "targetVr";
					break;

				case "numerator":
					elements[i] = "numerator";
					break;

				case "denominator":
					elements[i] = "denominator";
					break;

				case "sourcedatatype":
					elements[i] = "sourceDataType";
					break;

				case "cfgconfigoutput":
					elements[i] = "cfgConfigOutput";
					break;

				case "sourcevr":
					elements[i] = "sourceVr";
					break;

				case "cfgsetsourcenetworkinformationudp":
					elements[i] = "cfgSetSourceNetworkInformationUDP";
					break;

				case "transportprotocol":
					elements[i] = "transportProtocol";
					break;

				case "sourceipadress":
					elements[i] = "ipAddress";
					break;

				case "sourceport":
					elements[i] = "port";
					break;

				case "cfgsettargetnetworkinformationudp":
					elements[i] = "cfgSetTargetNetworkInformationUDP";
					break;

				case "targetipadress":
					elements[i] = "ipAddress";
					break;

				case "targetport":
					elements[i] = "port";
					break;

				case "cfgconfigclear":
					elements[i] = "cfgConfigClear";
					break;

				case "cfgsetparameter":
					elements[i] = "cfgSetParameter";
					break;

				case "payload":
					elements[i] = "payload";
					break;

				case "cfgconfigtunableparameter":
					elements[i] = "cfgConfigTunableParameter";
					break;

				case "cfgsetconfigtunableparameter":
					elements[i] = "cfgConfigTunableParameter";
					break;

				case "paramid":
					elements[i] = "paramId";
					break;

				case "cfgsetparamnetworkinformationudp":
					elements[i] = "cfgSetParamNetworkInformationUDP";
					break;

				case "cfgsetlogging":
					elements[i] = "cfgSetLogging";
					break;

				case "logcategory":
					elements[i] = "logCategory";
					break;

				case "loglevel":
					elements[i] = "logLevel";
					break;

				case "logmode":
					elements[i] = "logMode";
					break;

				case "cfgsetlogclear":
					elements[i] = "cfgSetLogClear";
					break;

				case "cfgsetsteps":
					elements[i] = "cfgSetSteps";
					break;

				case "stcregister":
					elements[i] = "stcRegister";
					break;

				case "stateid":
					elements[i] = "stateId";
					break;

				case "slaveuuid":
					elements[i] = "slaveUuid0020";
					break;

				case "opmode":
					elements[i] = "opMode";
					break;

				case "ntfstatechanged":
					elements[i] = "ntfStateChanged";
					break;

				case "stcconfigure":
					elements[i] = "stcConfigure";
					break;

				case "stcreset":
					elements[i] = "stcReset";
					break;

				case "stcinitialize":
					elements[i] = "stcInitialize";
					break;

				case "stcreinitialize":
					elements[i] = "stcReinitialize";
					break;

				case "stcstop":
					elements[i] = "stcStop";
					break;

				case "stcrun":
					elements[i] = "stcRun";
					break;

				case "starttime":
					elements[i] = "startTime";
					break;

				case "stcderegister":
					elements[i] = "stcDeregister";
					break;

				case "stcunregister":
					elements[i] = "stcDeregister";
					break;

				case "stcdostep":
					elements[i] = "stcDoStep";
					break;

				case "stcsendoutputs":
					elements[i] = "stcSendOutputs";
					break;

				case "infstate":
					elements[i] = "infState";
					break;

				case "inferror":
					elements[i] = "infError";
					break;

				case "inflog":
					elements[i] = "infLog";
					break;

				case "logmaxnum":
					elements[i] = "logMaxNum";
					break;

				case "datinputoutput":
					elements[i] = "datInputOutput";
					break;

				case "datparameter":
					elements[i] = "datParameter";
					break;

				case "receiving":
					elements[i] = "receiving";
					break;

				case "rspack":
					elements[i] = "rspAck";
					break;

				case "sender":
					elements[i] = "sender";
					break;

				case "rsperrorack":
					elements[i] = "rspErrorAck";
					break;

				case "errorcode":
					elements[i] = "errorCode";
					break;

				case "rspnack":
					elements[i] = "rspNack";
					break;

				case "rspstateack":
					elements[i] = "rspStateAck";
					break;

				case "rspLog":
					elements[i] = "rspLog";
					break;

				case "ntflog":
					elements[i] = "ntfLog";
					break;

				case "slave":

					elements[i] = "slave";
					break;

				case "dcpminorversion":
					elements[i] = "dcpMinorVersion";
					break;

				case "dcpmajorversion":
					elements[i] = "dcpMajorVersion";
					break;

				case "minorversion":
					elements[i] = "minorVersion";
					break;

				case "majorversion":
					elements[i] = "majorVersion";
					break;

				case "acu":
					elements[i] = "ACU";
					break;

				case "uuid":
					elements[i] = "uuid";
					break;

				case "drivers":
					elements[i] = "drivers";
					break;

				case "udp":
					elements[i] = "udp";
					break;

				case "control":
					elements[i] = "control";
					break;

				case "host":
					elements[i] = "host";
					break;

				case "port":
					elements[i] = "port";
					break;

				case "heartbeat":
					elements[i] = "heartbeat";
					break;

				case "maximumperiodicinterval":
					elements[i] = "maximumPeriodicInterval";
					break;

				default:

					break;

				}

			}

			// Build back new Command from parsed Tokens

			String newDotElement = "";

			for (String newElement : elements) {

				newDotElement += newElement + " ";

			}

			newDotElement = newDotElement.trim();

			newEngineCommand += newDotElement + ".";

		}

		// Remove last unnecessary dot
		newEngineCommand = newEngineCommand.substring(0, newEngineCommand.length() - 1);

		return newEngineCommand;
	}

}
