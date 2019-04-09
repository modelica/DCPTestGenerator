package util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.google.gson.Gson;

import dcpDescription.DcpVariable;
import dcpTestProcedure.DcpTestProcedure;
import dcpTestProcedure.DcpTestProcedure.Transition;
import wrappers.DcpWrapper;

/**
 * This class is used as a Helper class for making it easier to iterate through
 * a specific Set of Items. It has special functions that return special
 * Item-Sets used during the path Expansion process. The specific Sets are
 * defined in the Expansion Xsd and contain either general Items like "dcpState"
 * (all States in a dcp Simulation) or dependent items like the current
 * variables used in the loaded dcp slave description.
 * 
 * 
 *
 */

public class SetHelper {

	private DcpWrapper dcpWrapper;
	private DcpTestProcedure templateProcedure;

	/**
	 * Class constructor
	 * 
	 * @param dcpWrapper
	 *            - Wrapper Object containing the dcp Description
	 * @param templateProcedure
	 *            - Loaded basic Path Template
	 * @param newTransitions
	 *            - All previous generated Transitions
	 */
	public SetHelper(DcpWrapper dcpWrapper, DcpTestProcedure templateProcedure, List<Transition> newTransitions) {
		this.dcpWrapper = dcpWrapper;
		this.templateProcedure = templateProcedure;

	}

	/**
	 * Get all Ids of used States, specifiecd in the acosar standard
	 * 
	 * @return - List of all Ids
	 */
	public List<Short> getAllDcpStates() {

		List<Short> states = new LinkedList<>();

		states.add((short) StateList.STATE_ALIVE_ID);
		states.add((short) StateList.STATE_CONFIGURATION_ID);
		states.add((short) StateList.STATE_PREPARING_ID);
		states.add((short) StateList.STATE_PREPARED_ID);
		states.add((short) StateList.STATE_CONFIGURING_ID);
		states.add((short) StateList.STATE_CONFIGURED_ID);
		states.add((short) StateList.STATE_INITIALIZING_ID);
		states.add((short) StateList.STATE_INITIALIZED_ID);
		states.add((short) StateList.STATE_SENDING_I_ID);
		states.add((short) StateList.STATE_SYNCHRONIZING_ID);
		states.add((short) StateList.STATE_SYNCHRONIZED_ID);
		states.add((short) StateList.STATE_RUNNING_ID);
		states.add((short) StateList.STATE_COMPUTING_ID);
		states.add((short) StateList.STATE_COMPUTED_ID);
		states.add((short) StateList.STATE_SENDING_D_ID);
		states.add((short) StateList.STATE_STOPPING_ID);
		states.add((short) StateList.STATE_STOPPED_ID);
		states.add((short) StateList.ERRORHANDLING_ID);
		states.add((short) StateList.ERRORRESOLVED_ID);

		return states;

	}

	/**
	 * Get all OpMode Codes specified by the acosar standard
	 * 
	 * @return - List of OpMode codes
	 */
	public List<Short> getAllDcpOpModes() {

		List<Short> opModes = new LinkedList<>();
		opModes.add(OpMode.HRT);
		opModes.add(OpMode.NRT);
		opModes.add(OpMode.SRT);

		return opModes;

	}

	/**
	 * Get all transport protocol codes used by the acosar standard
	 * 
	 * @return - List of Codes
	 */
	public List<Short> getAllDcpTransportProtocols() {

		List<Short> trans = new LinkedList<>();

		trans.add((short) TransportProtocolList.UDP_IPV4);
		trans.add((short) TransportProtocolList.RFCOMM_BLUETOOTH);
		trans.add((short) TransportProtocolList.CAN_BASED);
		trans.add((short) TransportProtocolList.TCP);
		trans.add((short) TransportProtocolList.USB_2_0);

		return trans;
	}

	/**
	 * Get all Output Variables of the loaded Dcp Description
	 * 
	 * @return List of Output variables
	 */
	public List<DcpVariable> getSlaveOutputs() {

		return dcpWrapper.getOutputs();

	}

	/**
	 * Get all slave input variables used in the dcp description
	 * 
	 * @return List of Slave Input Variables
	 */
	public List<DcpVariable> getSlaveInputs() {

		return dcpWrapper.getInputs();

	}

	/**
	 * Get all parameter variables used in the dcp description
	 * 
	 * @return List of Slave Parameter Variables
	 */

	public List<DcpVariable> getSlaveParameters() {

		return dcpWrapper.getParameter();

	}

	/**
	 * Get a List of all slave tunable parameters specified in the dcp
	 * Description
	 * 
	 * @return List of slave tunable parameters
	 */

	public List<DcpVariable> getSlaveTunableParameters() {

		return dcpWrapper.getStructuralParameter();

	}

	/**
	 * Get an integer List, contaning integers in the range from the passed min
	 * to the passed max value
	 * 
	 * @param min
	 *            - smalles int that should be in the list
	 * @param max
	 *            - upper bound for the greates int (includes the max value)
	 * @return List with integers from min to max
	 */
	public List<Integer> getIntegerRange(int min, int max) {

		List<Integer> intResult = new ArrayList<>();

		for (int i = min; i <= max; i++) {

			intResult.add(i);

		}

		return intResult;
	}

	/**
	 * Get a List with all Transitions are in the basic Path Template or where
	 * generated before by the program
	 * 
	 * @param previousGeneratedTransitions
	 *            - List of transitions that where generated until here by the
	 *            program
	 * @return List of all Transitions
	 */
	public List<Transition> getAllTestTransitions(List<Transition> previousGeneratedTransitions) {

		List<Transition> tList = new LinkedList<>();

		for (Transition trans : templateProcedure.getTransition()) {

			tList.add(trans);

		}

		for (Transition t : previousGeneratedTransitions) {
			tList.add(t);
		}

		return tList;
	}

	/**
	 * Get all test steps (transitions node numbers) from all existing
	 * transitions
	 * 
	 * @param previousGeneratedTransitions
	 *            - New transitions that where generated by the program
	 * @return List with all used node numbers
	 */
	public List<Long> getAllTestSteps(List<Transition> previousGeneratedTransitions) {

		Set<Long> set = new HashSet<>();

		for (Transition trans : templateProcedure.getTransition()) {

			set.add(trans.getFrom());
			set.add(trans.getTo());

		}

		for (Transition trans : previousGeneratedTransitions) {
			set.add(trans.getFrom());
			set.add(trans.getTo());
		}

		List<Long> list = new ArrayList<>(set);
		return list;

	}

	/**
	 * Get all Transitions that start from a given node number without the
	 * sending inf_state transitions
	 * 
	 * @param step
	 *            - the node number from which the transitions should start
	 * @param previousGeneratedTransitions
	 *            - previous generated Transitions by the program
	 * @return List with
	 */
	public List<Transition> getAllTestSuccessor(Object step, List<Transition> previousGeneratedTransitions) {

		long fromStep = 0;

		if (step instanceof Integer) {
			fromStep = ((Integer) step).intValue();
		} else {
			fromStep = (long) step;
		}

		List<Transition> tList = new ArrayList<>();

		for (Transition trans : templateProcedure.getTransition()) {

			// Every following Transition but no INf_
			if (trans.getFrom() == fromStep && (trans.getSending() == null || trans.getSending().getINFState() == null)) {

				tList.add(trans);
			}

		}

		for (Transition trans : previousGeneratedTransitions) {

			if (trans.getFrom() == fromStep && (trans.getSending() == null || trans.getSending().getINFState() == null)) {

				tList.add(trans);
			}

		}

		return tList;

	}

	/**
	 * Return if two tansition objects have exact same content (attention :
	 * different sequence of same objects is treated as different
	 * 
	 * @param t1
	 *            - First transition
	 * @param t2
	 *            - Second transition
	 * @return true, if the passed transitions are the same
	 */
	public boolean transitionsEqual(Transition t1, Transition t2) {

		Gson g = new Gson();

		if (g.toJson(t1).equals(g.toJson(t2))) {

			return true;
		} else {

			return false;
		}

	}

}
