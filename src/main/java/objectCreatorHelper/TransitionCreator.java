package objectCreatorHelper;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import dcpTestExtension.AddTransition;
import dcpTestExtension.AddTransition.Sending.CFGParamNetworkInformation;
import dcpTestExtension.AddTransition.Sending.CFGParamNetworkInformationBluetooth;
import dcpTestExtension.AddTransition.Sending.CFGParamNetworkInformationTCPIPv4;
import dcpTestExtension.AddTransition.Sending.CFGParamNetworkInformationUSB;
import dcpTestExtension.AddTransition.Sending.CFGScope;
import dcpTestExtension.AddTransition.Sending.CFGSourceNetworkInformation;
import dcpTestExtension.AddTransition.Sending.CFGSourceNetworkInformationBluetooth;
import dcpTestExtension.AddTransition.Sending.CFGSourceNetworkInformationTCPIPv4;
import dcpTestExtension.AddTransition.Sending.CFGSourceNetworkInformationUSB;
import dcpTestExtension.AddTransition.Sending.CFGTargetNetworkInformation;
import dcpTestExtension.AddTransition.Sending.CFGTargetNetworkInformationBluetooth;
import dcpTestExtension.AddTransition.Sending.CFGTargetNetworkInformationTCPIPv4;
import dcpTestExtension.AddTransition.Sending.CFGTargetNetworkInformationUSB;
import dcpTestExtension.AddTransition.Sending.STCPrepare;
import dcpTestExtension.ReceivingPayloadField;
import dcpTestExtension.SendingPayloadField;
import dcpTestProcedure.DcpTestProcedure;
import dcpTestProcedure.DcpTestProcedure.Transition;
import dcpTestProcedure.DcpTestProcedure.Transition.Sending.CFGTunableParameter;
import util.DataTypeList;
import util.Environment;
import util.LogLevelList;
import wrappers.DcpWrapper;

/**
 * 
 * This class is a helper class for creating Transition objects according to the
 * information that where specified in the specific addTransition entry in the
 * expansion xml
 * 
 * 
 *
 */

public class TransitionCreator {

	/**
	 * Create a ClockTime Object according to the information specified in the
	 * clockTime Information object from the expansion xml
	 * 
	 * @param cInfo       - ClockTime Object from the expansion xml file
	 * @param environment - the javascript engine Environment object
	 * @param env         - the map holding local variables and their value during
	 *                    the process of processing the xml node
	 * @return ClockTime Object created regards the passed Informations
	 */
	public static Transition.Sending.ClockTime createClockTime(AddTransition.Sending.ClockTime cInfo,
			Environment environment, Map<String, Object> env) {

		Transition.Sending.ClockTime clockTime = new Transition.Sending.ClockTime();

		if (cInfo.getDenominator() != null) {
			clockTime.setDenominator(cInfo.getDenominator());
		}

		if (cInfo.getDenominatorVariable() != null) {
			clockTime.setDenominator(
					((Integer) environment.getFromEnvironment(env, cInfo.getDenominatorVariable())).longValue());
		}

		if (cInfo.getNumerator() != null) {
			clockTime.setNumerator(cInfo.getNumerator());
		}

		if (cInfo.getNumeratorVariable() != null) {

			Object numeratorO = environment.getFromEnvironment(env, cInfo.getNumeratorVariable());

			if (numeratorO instanceof Double) {

				clockTime.setNumerator(((Double) numeratorO).longValue());

			}

			if (numeratorO instanceof Integer) {
				clockTime.setNumerator(((Integer) numeratorO).longValue());
			}
		}

		return clockTime;

	}

	/**
	 * Get the transition starting node for a transition that should be created
	 * 
	 * 
	 * @param addTransitionInfo  - The addTransition object representing the xml
	 *                           node from the expansion xml
	 * @param environment        - the javascript engine Environment
	 * @param env                - the Map holding the local variable Names and
	 *                           values used during the expansion process
	 * @param lastUsedNodeNumber - last node number that was used until here
	 * @return the node number the transition that should be created should start
	 *         from
	 */
	public static int getFromNode(AddTransition addTransitionInfo, Environment environment, Map<String, Object> env,
			long lastUsedNodeNumber) {

		int fromNode = 0;

		if (addTransitionInfo.getFrom() != null) {
			fromNode = addTransitionInfo.getFrom().intValue();
		}

		if (addTransitionInfo.getFromVariable() != null) {

			Object var = environment.getFromEnvironment(env, addTransitionInfo.getFromVariable());

			if (var instanceof Integer) {

				fromNode = ((Integer) var).intValue();

			} else {

				fromNode = (int) ((Long) var).intValue();

			}

		}

		if (addTransitionInfo.getFromOffset() != null) {
			fromNode = addTransitionInfo.getFromOffset().intValue();
			fromNode = (int) (lastUsedNodeNumber + fromNode);

		}

		if (addTransitionInfo.getFromOffsetVariable() != null) {

			Object fromNodeObject = environment.getFromEnvironment(env, addTransitionInfo.getFromOffsetVariable());

			if (fromNodeObject instanceof Integer) {

				fromNode = (int) (lastUsedNodeNumber + (int) ((Integer) (fromNodeObject)).intValue());

			} else {

				fromNode = (int) (lastUsedNodeNumber + (int) ((Long) (fromNodeObject)).intValue());

			}

		}

		return fromNode;

	}

	/**
	 * Get the end node number for a transition that should be created
	 * 
	 * 
	 * @param addTransitionInfo  - AddTransiton node from the expansion xml file
	 *                           specifying the new Transition that should be
	 *                           created
	 * @param environment        - the javascript engine used as Environment
	 * @param env                - the Map holding the local variables and their
	 *                           values used during the processing of the expansion
	 *                           nodes
	 * @param lastUsedNodeNumber - last node number that was used until here
	 * @return end node number for the transition that should be created next
	 */

	public static int getToNode(AddTransition addTransitionInfo, Environment environment, Map<String, Object> env,
			long lastUsedNodeNumber) {

		int toNode = 0;

		if (addTransitionInfo.getTo() != null) {

			toNode = addTransitionInfo.getTo().intValue();

		}

		if (addTransitionInfo.getToVariable() != null) {

			Object toNodeObject = environment.getFromEnvironment(env, addTransitionInfo.getToVariable());

			if (toNodeObject instanceof Long) {
				toNode = ((Long) toNodeObject).intValue();
			} else {

				toNode = (int) toNodeObject;
			}
		}

		if (addTransitionInfo.getToOffset() != null) {

			toNode = addTransitionInfo.getToOffset().intValue();
			toNode = (int) (lastUsedNodeNumber + toNode);
		}

		if (addTransitionInfo.getToOffsetVariable() != null) {

			Object toNodeObject = environment.getFromEnvironment(env, addTransitionInfo.getToOffsetVariable());

			if (toNodeObject instanceof Integer) {

				toNode = (int) (lastUsedNodeNumber + ((Integer) (toNodeObject)).intValue());
			} else {

				toNode = (int) (lastUsedNodeNumber + ((Long) (toNodeObject)).intValue());

			}

		}

		return toNode;
	}

	/**
	 * Create a Transition Object with a Sending CFG_Set_Time_Res Message according
	 * to the passed Informations
	 * 
	 * 
	 * @param cfgSetTimeResInfo - the AddTransition node from the expansion file
	 *                          specifying the values that should be used in the
	 *                          transition to be created
	 * @param clockTime         - the ClockTime Information Object that should be
	 *                          included in the sending transition to be created
	 * @param dcpWrapper        - the dcp slave description
	 * @param environment       - the javascript engine Environment
	 * @param env               - the map used to hold local variables and their
	 *                          values during the expanding process
	 * @param fromNode          - the starting node number of the transition
	 * @param toNode            - the ending node number to which the transition
	 *                          leads
	 * @return the Transition object with the Cfg_Set_Time_Res Message
	 */

	public static Transition createSendingCFGSetTimeRes(AddTransition.Sending.CFGTimeRes cfgSetTimeResInfo,
			Transition.Sending.ClockTime clockTime, DcpWrapper dcpWrapper, Environment environment,
			Map<String, Object> env, long fromNode, long toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.CFGTimeRes timeRes = new Transition.Sending.CFGTimeRes();

		if (cfgSetTimeResInfo.getReceiver().getInvalid() != null) {

			timeRes.setReceiver((short) 0);

		}

		if (cfgSetTimeResInfo.getReceiver().getRandom() != null) {
			timeRes.setReceiver((short) 1);
		}

		if (cfgSetTimeResInfo.getReceiver().getValue() != null) {
			timeRes.setReceiver(cfgSetTimeResInfo.getReceiver().getValue().getValue());
		}

		if (cfgSetTimeResInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env,
					cfgSetTimeResInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {
				timeRes.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {
				timeRes.setReceiver(((Long) recO).shortValue());
			}

			if (recO instanceof Short) {
				timeRes.setReceiver(((Short) recO).shortValue());
			}

		}

		if (cfgSetTimeResInfo.getNumerator().getInvalid() != null) {

			timeRes.setNumerator(dcpWrapper.getInvalidNumerator());

		}

		if (cfgSetTimeResInfo.getNumerator().getRandom() != null) {

			timeRes.setNumerator(dcpWrapper.getRandomNumerator());
		}

		if (cfgSetTimeResInfo.getNumerator().getValue() != null) {

			timeRes.setNumerator(cfgSetTimeResInfo.getNumerator().getValue().getValue());
		}

		if (cfgSetTimeResInfo.getNumerator().getVariable() != null) {

			timeRes.setNumerator(((Double) environment.getFromEnvironment(env,
					cfgSetTimeResInfo.getNumerator().getVariable().getVariablenname())).longValue());
		}

		if (cfgSetTimeResInfo.getDenominator().getInvalid() != null) {

			timeRes.setDenominator(dcpWrapper.getInvalidDenominator());
		}

		if (cfgSetTimeResInfo.getDenominator().getRandom() != null) {

			timeRes.setDenominator(dcpWrapper.getRandomDenominator());
		}

		if (cfgSetTimeResInfo.getDenominator().getValue() != null) {

			timeRes.setDenominator(cfgSetTimeResInfo.getDenominator().getValue().getValue());
		}

		if (cfgSetTimeResInfo.getDenominator().getVariable() != null) {

			timeRes.setDenominator((long) environment.getFromEnvironment(env,
					cfgSetTimeResInfo.getDenominator().getVariable().getVariablenname()));

		}

		send.setCFGTimeRes(timeRes);

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);

		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Sending CFG_SET_STEPS Message according to
	 * the passed Informations
	 * 
	 * 
	 * @param stepsInfo   - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the CFG_SET_STEPS Message
	 */

	public static Transition createSendingCFGSetSteps(AddTransition.Sending.CFGSteps stepsInfo,
			Transition.Sending.ClockTime clockTime, Environment environment, Map<String, Object> env, long fromNode,
			long toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.CFGSteps steps = new Transition.Sending.CFGSteps();

		if (stepsInfo.getDataId().getInvalid() != null) {

			steps.setDataId(-1);
		}

		if (stepsInfo.getDataId().getRandom() != null) {

			steps.setDataId(0);
		}

		if (stepsInfo.getDataId().getValue() != null && stepsInfo.getDataId().getValue().getValue() != null) {

			steps.setDataId(stepsInfo.getDataId().getValue().getValue().intValue());

		}

		if (stepsInfo.getDataId().getVariable() != null) {

			Object dataIdO = environment.getFromEnvironment(env,
					stepsInfo.getDataId().getVariable().getVariablenname());

			if (dataIdO instanceof Integer) {
				steps.setDataId(((Integer) dataIdO).intValue());
			}

			if (dataIdO instanceof Long) {
				steps.setDataId(((Long) dataIdO).intValue());
			}

			if (dataIdO instanceof Short) {
				steps.setDataId(((Short) dataIdO).intValue());
			}

		}

		if (stepsInfo.getReceiver().getInvalid() != null) {

			steps.setReceiver((short) 0);

		}

		if (stepsInfo.getReceiver().getRandom() != null) {
			steps.setReceiver((short) 1);
		}

		if (stepsInfo.getReceiver().getValue() != null) {
			steps.setReceiver(stepsInfo.getReceiver().getValue().getValue());
		}

		if (stepsInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, stepsInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {
				steps.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {
				steps.setReceiver(((Long) recO).shortValue());
			}

			if (recO instanceof Short) {
				steps.setReceiver(((Short) recO).shortValue());
			}

		}

		if (stepsInfo.getSteps().getInvalid() != null) {

			steps.setSteps(-1);

		}

		if (stepsInfo.getSteps().getRandom() != null) {
			steps.setSteps(1);
		}

		if (stepsInfo.getSteps().getValue() != null) {

			steps.setSteps(stepsInfo.getSteps().getValue().getValue());
		}

		if (stepsInfo.getSteps().getVariable() != null) {

			Object stepsO = environment.getFromEnvironment(env, stepsInfo.getSteps().getVariable().getVariablenname());

			if (stepsO instanceof Integer) {
				steps.setSteps(((Integer) stepsO).longValue());
			}

			if (stepsO instanceof Long) {
				steps.setSteps(((Long) stepsO).longValue());
			}

			if (stepsO instanceof Short) {
				steps.setSteps(((Short) stepsO).longValue());
			}

		}

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}
		send.setCFGSteps(steps);
		trans.setSending(send);

		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Sending CFG_CONFIG_INPUT Message according
	 * to the passed Informations
	 * 
	 * 
	 * @param configInfo  - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param dcpWrapper  - the dcp slave description
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the CFG_CONFIG_INPUT Message
	 */

	public static Transition createSendingCFGConfigInput(AddTransition.Sending.CFGInput configInfo,
			Transition.Sending.ClockTime clockTime, DcpWrapper dcpWrapper, Environment environment,
			Map<String, Object> env, long fromNode, long toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.CFGInput configInput = new Transition.Sending.CFGInput();

		configInput.setReceiver(configInfo.getReceiver().getValue().getValue());

		int randValueReference = dcpWrapper.getRandomInputVr();

		if (configInfo.getTargetVr().getInvalid() != null) {

			// Set a random output vr as random input vr
			configInput.setTargetVr(BigInteger.valueOf(dcpWrapper.getRandomOutputVr()));
		}

		if (configInfo.getTargetVr().getRandom() != null) {

			configInput.setTargetVr(BigInteger.valueOf(dcpWrapper.getRandomInputVr()));

		}

		if (configInfo.getTargetVr().getValue() != null) {

			configInput.setTargetVr(BigInteger.valueOf(configInfo.getTargetVr().getValue().getValue()));
		}

		if (configInfo.getTargetVr().getVariable() != null) {

			Object targetVrO = environment.getFromEnvironment(env,
					configInfo.getTargetVr().getVariable().getVariablenname());

			if (targetVrO instanceof Integer) {

				configInput.setTargetVr(BigInteger.valueOf(((Integer) targetVrO).intValue()));
			}

			if (targetVrO instanceof Long) {
				configInput.setTargetVr(BigInteger.valueOf(((Long) targetVrO).intValue()));

			}

			if (targetVrO instanceof Short) {
				configInput.setTargetVr(BigInteger.valueOf(((Short) targetVrO).intValue()));

			}

		}

		if (configInfo.getDataId().getInvalid() != null) {

			configInput.setDataId(
					((Integer) environment.getFromEnvironment(env, "dataId(" + configInput.getTargetVr() + ");"))
							.shortValue() + 1);
		}

		if (configInfo.getDataId().getRandom() != null) {

			configInput.setDataId(((Integer) environment.getFromEnvironment(env, "dataId(" + randValueReference + ");"))
					.shortValue());

		}

		if (configInfo.getDataId().getValue() != null) {
			configInput.setDataId(configInfo.getDataId().getValue().getValue());
		}

		if (configInfo.getDataId().getVariable() != null) {

			Object dataIdO = environment.getFromEnvironment(env,
					configInfo.getDataId().getVariable().getVariablenname());

			if (dataIdO instanceof Integer) {

				configInput.setDataId(((Integer) dataIdO).intValue());
			}

			if (dataIdO instanceof Long) {
				configInput.setDataId(((Long) dataIdO).intValue());

			}

			if (dataIdO instanceof Short) {
				configInput.setDataId(((Short) dataIdO).intValue());

			}

		}

		if (configInfo.getPos().getInvalid() != null) {

			configInput.setPos(0);
		}

		if (configInfo.getPos().getRandom() != null) {

			configInput.setPos(0);

		}

		if (configInfo.getPos().getVariable() != null) {

			Object posO = environment.getFromEnvironment(env, configInfo.getPos().getVariable().getVariablenname());

			if (posO instanceof Integer) {

				configInput.setPos(((Integer) posO).intValue());
			}

			if (posO instanceof Long) {
				configInput.setPos(((Long) posO).intValue());

			}

			if (posO instanceof Short) {
				configInput.setPos(((Short) posO).intValue());

			}

		}

		if (configInfo.getPos().getValue() != null) {
			configInput.setPos(configInfo.getPos().getValue().getValue());
		}

		if (configInfo.getSourceDataType().getInvalid() != null) {

			try {
				configInput.setSourceDataType(dcpWrapper.getInvalidDataTypeFromVr(randValueReference));
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		if (configInfo.getSourceDataType().getRandom() != null) {

			try {
				configInput.setSourceDataType(dcpWrapper.getDataTypeFromVr(randValueReference));
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		if (configInfo.getSourceDataType().getValue() != null) {

			configInput.setSourceDataType(configInfo.getSourceDataType().getValue().getValue());

		}

		if (configInfo.getSourceDataType().getVariable() != null) {

			Object sourceO = environment.getFromEnvironment(env,
					configInfo.getSourceDataType().getVariable().getVariablenname());

			if (sourceO instanceof Integer) {

				configInput.setSourceDataType(((Integer) sourceO).shortValue());
			}

			if (sourceO instanceof Long) {
				configInput.setSourceDataType(((Long) sourceO).shortValue());

			}

			if (sourceO instanceof Short) {
				configInput.setSourceDataType(((Short) sourceO).shortValue());

			}

		}

		send.setCFGInput(configInput);

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Sending CFG_CONFIG_OUTPUT Message according
	 * to the passed Informations
	 * 
	 * 
	 * @param outInfo     - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param dcpWrapper  - the dcp slave description
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the CFG_CONFIG_OUTPUT Message
	 */

	public static Transition createSendingCFGConfigOutput(AddTransition.Sending.CFGOutput outInfo,
			Transition.Sending.ClockTime clockTime, DcpWrapper dcpWrapper, Environment environment,
			Map<String, Object> env, long fromNode, long toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.CFGOutput output = new Transition.Sending.CFGOutput();

		int randValueReference = dcpWrapper.getRandomOutputVr();

		if (outInfo.getReceiver().getInvalid() != null) {
			output.setReceiver((short) -1);
		}

		if (outInfo.getReceiver().getRandom() != null) {
			output.setReceiver((short) 1);
		}

		if (outInfo.getReceiver().getValue() != null) {
			output.setReceiver(outInfo.getReceiver().getValue().getValue());

		}

		if (outInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, outInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {

				output.setReceiver(((Integer) recO).shortValue());

			}

			if (recO instanceof Long) {

				output.setReceiver(((Long) recO).shortValue());

			}

			if (recO instanceof Short) {

				output.setReceiver(((Short) recO).shortValue());

			}

		}

		if (outInfo.getSourceVr().getInvalid() != null) {

			output.setSourceVr(BigInteger.valueOf(-1));
		}

		if (outInfo.getSourceVr().getRandom() != null) {
			output.setSourceVr(BigInteger.valueOf(dcpWrapper.getRandomOutputVr()));
		}

		if (outInfo.getSourceVr().getValue() != null) {
			output.setSourceVr(BigInteger.valueOf(outInfo.getSourceVr().getValue().getValue().intValue()));
		}

		if (outInfo.getSourceVr().getVariable() != null) {

			Object sourceO = environment.getFromEnvironment(env,
					outInfo.getSourceVr().getVariable().getVariablenname());

			if (sourceO instanceof Integer) {

				output.setSourceVr(BigInteger.valueOf(((Integer) sourceO).intValue()));

			}

			if (sourceO instanceof Long) {

				output.setSourceVr(BigInteger.valueOf(((Long) sourceO).intValue()));

			}

			if (sourceO instanceof Short) {

				output.setSourceVr(BigInteger.valueOf(((Short) sourceO).intValue()));

			}

		}

		if (outInfo.getDataId().getInvalid() != null) {

			output.setDataId(((Integer) environment.getFromEnvironment(env, "dataId(" + output.getSourceVr() + ");"))
					.shortValue() + 1);

		}

		if (outInfo.getDataId().getRandom() != null) {

			try {
				output.setDataId(
						((Integer) environment.getFromEnvironment(env, "dataId(" + output.getSourceVr() + ");"))
								.shortValue());
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		if (outInfo.getDataId().getValue() != null) {

			output.setDataId(outInfo.getDataId().getValue().getValue().intValue());
		}

		if (outInfo.getDataId().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env, outInfo.getDataId().getVariable().getVariablenname());

			if (dataO instanceof Integer) {

				output.setDataId(((Integer) dataO).intValue());

			}

			if (dataO instanceof Long) {

				output.setDataId(((Long) dataO).intValue());

			}

			if (dataO instanceof Short) {

				output.setDataId(((Short) dataO).intValue());

			}

		}

		if (outInfo.getPos().getInvalid() != null || outInfo.getPos().getRandom() != null) {

			output.setPos(0);
		}

		if (outInfo.getPos().getVariable() != null) {

			Object posO = environment.getFromEnvironment(env, outInfo.getPos().getVariable().getVariablenname());

			if (posO instanceof Integer) {

				output.setPos(((Integer) posO).intValue());
			}

			if (posO instanceof Long) {
				output.setPos(((Long) posO).intValue());

			}

			if (posO instanceof Short) {
				output.setPos(((Short) posO).intValue());

			}

		}

		if (outInfo.getPos().getValue() != null) {

			output.setPos(outInfo.getPos().getValue().getValue());
		}

		send.setCFGOutput(output);

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	public static Transition createSendingCFGSetSourceNetworkInformation(CFGSourceNetworkInformation sourceInfo,
			dcpTestProcedure.DcpTestProcedure.Transition.Sending.ClockTime clockTime, DcpWrapper dcpWrapper,
			Environment environment, Map<String, Object> env, int fromNode, int toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.CFGSourceNetworkInformation source = new Transition.Sending.CFGSourceNetworkInformation();

		if (sourceInfo.getReceiver().getInvalid() != null) {

			source.setReceiver((short) 0);

		}

		if (sourceInfo.getReceiver().getRandom() != null) {
			source.setReceiver((short) 1);
		}

		if (sourceInfo.getReceiver().getValue() != null) {

			source.setReceiver(sourceInfo.getReceiver().getValue().getValue());
		}

		if (sourceInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env,
					sourceInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {
				source.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {
				source.setReceiver(((Long) recO).shortValue());

			}

			if (recO instanceof Short) {

				source.setReceiver(((Short) recO).shortValue());

			}

		}

		if (sourceInfo.getDataId().getInvalid() != null) {

			source.setDataId(
					((Integer) environment.getFromEnvironment(env, "dataId(" + dcpWrapper.getRandomOutputVr() + ");"))
							.shortValue());
		}

		if (sourceInfo.getDataId().getRandom() != null) {

			source.setDataId(dcpWrapper.getRandomInputVr());
		}

		if (sourceInfo.getDataId().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env, sourceInfo.getDataId().getVariable().getVariablenname());

			if (dataO instanceof Integer) {
				source.setDataId(((Integer) dataO).intValue());
			}

			if (dataO instanceof Long) {
				source.setDataId(((Long) dataO).intValue());
			}

			if (dataO instanceof Short) {
				source.setDataId(((Short) dataO).intValue());

			}

		}

		if (sourceInfo.getDataId().getValue() != null) {
			source.setDataId(sourceInfo.getDataId().getValue().getValue());
		}

		if (sourceInfo.getTransportProtocol().getInvalid() != null) {

			source.setTransportProtocol((short) 9);

		}

		if (sourceInfo.getTransportProtocol().getRandom() != null) {
			source.setTransportProtocol((short) 0);
		}

		if (sourceInfo.getTransportProtocol().getVariable() != null) {

			Object protoO = environment.getFromEnvironment(env,
					sourceInfo.getTransportProtocol().getVariable().getVariablenname());

			if (protoO instanceof Integer) {

				source.setTransportProtocol(((Integer) protoO).shortValue());

			}

			if (protoO instanceof Long) {

				source.setTransportProtocol(((Long) protoO).shortValue());

			}

			if (protoO instanceof Short) {

				source.setTransportProtocol(((Short) protoO).shortValue());

			}

		}

		if (sourceInfo.getTransportProtocol().getValue() != null) {
			source.setTransportProtocol(sourceInfo.getTransportProtocol().getValue().getValue());
		}

		send.setCFGSourceNetworkInformation(source);

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	public static Transition createSendingCFGSetSourceNetworkInformationBluetooth(
			CFGSourceNetworkInformationBluetooth blueInfo,
			dcpTestProcedure.DcpTestProcedure.Transition.Sending.ClockTime clockTime, DcpWrapper dcpWrapper,
			Environment environment, Map<String, Object> env, int fromNode, int toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.CFGSourceNetworkInformationBluetooth blue = new Transition.Sending.CFGSourceNetworkInformationBluetooth();

		if (blueInfo.getBdAddr().getInvalid() != null) {
			blue.setBdAddr(new BigInteger("00:11:22:33:FF:EE"));
		}

		if (blueInfo.getBdAddr().getRandom() != null) {
			blue.setBdAddr(new BigInteger("00:11:22:33:FF:EE"));
		}

		if (blueInfo.getBdAddr().getValue() != null) {
			blue.setBdAddr(blueInfo.getBdAddr().getValue().getValue());
		}

		if (blueInfo.getBdAddr().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env, blueInfo.getDataId().getVariable().getVariablenname());

			if (dataO instanceof Integer) {
				blue.setBdAddr(new BigInteger(((Integer) dataO).toString()));
			}

			if (dataO instanceof Long) {
				blue.setBdAddr(new BigInteger(((Long) dataO).toString()));
			}

			if (dataO instanceof Short) {
				blue.setBdAddr(new BigInteger(((Short) dataO).toString()));

			}

			if (dataO instanceof String) {
				blue.setBdAddr(new BigInteger((String) dataO));

			}

			if (dataO instanceof BigInteger) {

				blue.setBdAddr((BigInteger) dataO);
			}

		}

		if (blueInfo.getDataId().getInvalid() != null) {

			blue.setDataId(
					((Integer) environment.getFromEnvironment(env, "dataId(" + dcpWrapper.getRandomOutputVr() + ");"))
							.shortValue());
		}

		if (blueInfo.getDataId().getRandom() != null) {

			blue.setDataId(dcpWrapper.getRandomInputVr());
		}

		if (blueInfo.getDataId().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env, blueInfo.getDataId().getVariable().getVariablenname());

			if (dataO instanceof Integer) {
				blue.setDataId(((Integer) dataO).intValue());
			}

			if (dataO instanceof Long) {
				blue.setDataId(((Long) dataO).intValue());
			}

			if (dataO instanceof Short) {
				blue.setDataId(((Short) dataO).intValue());

			}

		}

		if (blueInfo.getDataId().getValue() != null) {
			blue.setDataId(blueInfo.getDataId().getValue().getValue());
		}

		if (blueInfo.getPort().getInvalid() != null) {
			blue.setPort((short) 0);
		}

		if (blueInfo.getPort().getRandom() != null) {

			blue.setPort((short) 0);

		}

		if (blueInfo.getPort().getValue() != null) {

			blue.setPort(blueInfo.getPort().getValue().getValue());
		}

		if (blueInfo.getPort().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env, blueInfo.getPort().getVariable().getVariablenname());

			if (dataO instanceof Integer) {
				blue.setPort(((Integer) dataO).shortValue());
			}

			if (dataO instanceof Long) {
				blue.setPort(((Long) dataO).shortValue());
			}

			if (dataO instanceof Short) {
				blue.setPort(((Short) dataO));

			}

		}

		if (blueInfo.getReceiver().getInvalid() != null) {

			blue.setReceiver((short) 0);

		}

		if (blueInfo.getReceiver().getRandom() != null) {
			blue.setReceiver((short) 1);
		}

		if (blueInfo.getReceiver().getValue() != null) {

			blue.setReceiver(blueInfo.getReceiver().getValue().getValue());
		}

		if (blueInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, blueInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {
				blue.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {
				blue.setReceiver(((Long) recO).shortValue());

			}

			if (recO instanceof Short) {

				blue.setReceiver(((Short) recO).shortValue());

			}

		}

		if (blueInfo.getTransportProtocol().getInvalid() != null) {
			blue.setTransportProtocol((short) 0);
		}

		if (blueInfo.getTransportProtocol().getRandom() != null) {
			blue.setTransportProtocol((short) 0);
		}

		if (blueInfo.getTransportProtocol().getValue() != null) {
			blue.setTransportProtocol(blueInfo.getTransportProtocol().getValue().getValue());
		}

		if (blueInfo.getTransportProtocol().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env,
					blueInfo.getTransportProtocol().getVariable().getVariablenname());

			if (recO instanceof Integer) {
				blue.setTransportProtocol(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {
				blue.setTransportProtocol(((Long) recO).shortValue());

			}

			if (recO instanceof Short) {

				blue.setTransportProtocol(((Short) recO).shortValue());

			}

		}

		send.setCFGSourceNetworkInformationBluetooth(blue);

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;
	}

	public static Transition createSendingCFGSetSourceNetworkInformationTCPIPv4(
			CFGSourceNetworkInformationTCPIPv4 tcpInfo,
			dcpTestProcedure.DcpTestProcedure.Transition.Sending.ClockTime clockTime, DcpWrapper dcpWrapper,
			Environment environment, Map<String, Object> env, int fromNode, int toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.CFGSourceNetworkInformationTCPIPv4 tcp = new Transition.Sending.CFGSourceNetworkInformationTCPIPv4();

		if (tcpInfo.getDataId().getInvalid() != null) {

			tcp.setDataId(
					((Integer) environment.getFromEnvironment(env, "dataId(" + dcpWrapper.getRandomOutputVr() + ");"))
							.shortValue());
		}

		if (tcpInfo.getDataId().getRandom() != null) {

			tcp.setDataId(dcpWrapper.getRandomInputVr());
		}

		if (tcpInfo.getDataId().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env, tcpInfo.getDataId().getVariable().getVariablenname());

			if (dataO instanceof Integer) {
				tcp.setDataId(((Integer) dataO).intValue());
			}

			if (dataO instanceof Long) {
				tcp.setDataId(((Long) dataO).intValue());
			}

			if (dataO instanceof Short) {
				tcp.setDataId(((Short) dataO).intValue());

			}

		}

		if (tcpInfo.getDataId().getValue() != null) {
			tcp.setDataId(tcpInfo.getDataId().getValue().getValue());
		}

		if (tcpInfo.getIpAdress().getInvalid() != null) {

			tcp.setIpAddress(0);
		}

		if (tcpInfo.getIpAdress().getRandom() != null) {
			tcp.setIpAddress(0);
		}

		if (tcpInfo.getIpAdress().getValue() != null) {
			tcp.setIpAddress(tcpInfo.getIpAdress().getValue().getValue());

		}

		if (tcpInfo.getIpAdress().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, tcpInfo.getIpAdress().getVariable().getVariablenname());

			if (recO instanceof Integer) {
				tcp.setIpAddress(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {
				tcp.setIpAddress(((Long) recO).shortValue());

			}

			if (recO instanceof Short) {

				tcp.setIpAddress(((Short) recO).shortValue());

			}

		}

		if (tcpInfo.getPort().getInvalid() != null) {
			tcp.setPort((short) 0);
		}

		if (tcpInfo.getPort().getRandom() != null) {

			tcp.setPort(dcpWrapper.getTcpInputOutputPort());

		}

		if (tcpInfo.getPort().getValue() != null) {

			tcp.setPort(tcpInfo.getPort().getValue().getValue());
		}

		if (tcpInfo.getPort().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env, tcpInfo.getPort().getVariable().getVariablenname());

			if (dataO instanceof Integer) {
				tcp.setPort(((Integer) dataO).shortValue());
			}

			if (dataO instanceof Long) {
				tcp.setPort(((Long) dataO).shortValue());
			}

			if (dataO instanceof Short) {
				tcp.setPort(((Short) dataO));

			}

		}

		if (tcpInfo.getReceiver().getInvalid() != null) {

			tcp.setReceiver((short) 0);

		}

		if (tcpInfo.getReceiver().getRandom() != null) {
			tcp.setReceiver((short) 1);
		}

		if (tcpInfo.getReceiver().getValue() != null) {

			tcp.setReceiver(tcpInfo.getReceiver().getValue().getValue());
		}

		if (tcpInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, tcpInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {
				tcp.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {
				tcp.setReceiver(((Long) recO).shortValue());

			}

			if (recO instanceof Short) {

				tcp.setReceiver(((Short) recO).shortValue());

			}

		}

		if (tcpInfo.getTransportProtocol().getInvalid() != null) {
			tcp.setTransportProtocol((short) 0);
		}

		if (tcpInfo.getTransportProtocol().getRandom() != null) {
			tcp.setTransportProtocol((short) 0);
		}

		if (tcpInfo.getTransportProtocol().getValue() != null) {
			tcp.setTransportProtocol(tcpInfo.getTransportProtocol().getValue().getValue());
		}

		if (tcpInfo.getTransportProtocol().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env,
					tcpInfo.getTransportProtocol().getVariable().getVariablenname());

			if (recO instanceof Integer) {
				tcp.setTransportProtocol(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {
				tcp.setTransportProtocol(((Long) recO).shortValue());

			}

			if (recO instanceof Short) {

				tcp.setTransportProtocol(((Short) recO).shortValue());

			}

		}
		
		if (tcpInfo.getIpAdress().getValue() != null) {

			tcp.setIpAddress(tcpInfo.getIpAdress().getValue().getValue());

		}

		if (tcpInfo.getIpAdress().getVariable() != null) {

			Object ipO = environment.getFromEnvironment(env, tcpInfo.getIpAdress().getVariable().getVariablenname());

			if (ipO instanceof Double) {

				tcp.setIpAddress(((Double) ipO).intValue());

			}

			if (ipO instanceof Integer) {

				tcp.setIpAddress(((Integer) ipO).intValue());

			}

			if (ipO instanceof Long) {
				tcp.setIpAddress(((Long) ipO).intValue());

			}

			if (ipO instanceof Short) {
				tcp.setIpAddress(((Short) ipO).intValue());

			}

		}

		if (tcpInfo.getIpAdress().getRandom() != null) {

			tcp.setIpAddress(dcpWrapper.getTcpInputOutputIp());
		}

		if (tcpInfo.getPort().getVariable() != null) {

			Object portO = environment.getFromEnvironment(env, tcpInfo.getPort().getVariable().getVariablenname());

			if (portO instanceof Integer) {

				tcp.setPort(((Integer) portO).intValue());
			}

			if (portO instanceof Long) {

				tcp.setPort(((Long) portO).intValue());
			}

			if (portO instanceof Short) {

				tcp.setPort(((Short) portO).intValue());
			}

		}

		if (tcpInfo.getPort().getRandom() != null) {

			tcp.setPort(dcpWrapper.getTcpInputOutputPort());

		}

		if (tcpInfo.getPort().getInvalid() != null) {
			tcp.setPort(0);
		}

		if (tcpInfo.getPort().getValue() != null) {
			tcp.setPort(tcpInfo.getPort().getValue().getValue());
		}

		send.setCFGSourceNetworkInformationTCPIPv4(tcp);

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	public static Transition createSendingCFGSetSourceNetworkInformationUSB(CFGSourceNetworkInformationUSB usbInfo,
			dcpTestProcedure.DcpTestProcedure.Transition.Sending.ClockTime clockTime, DcpWrapper dcpWrapper,
			Environment environment, Map<String, Object> env, int fromNode, int toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.CFGSourceNetworkInformationUSB usb = new Transition.Sending.CFGSourceNetworkInformationUSB();

		if (usbInfo.getDataId().getInvalid() != null) {

			usb.setDataId(
					((Integer) environment.getFromEnvironment(env, "dataId(" + dcpWrapper.getRandomOutputVr() + ");"))
							.shortValue());
		}

		if (usbInfo.getDataId().getRandom() != null) {

			usb.setDataId(dcpWrapper.getRandomInputVr());
		}

		if (usbInfo.getDataId().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env, usbInfo.getDataId().getVariable().getVariablenname());

			if (dataO instanceof Integer) {
				usb.setDataId(((Integer) dataO).intValue());
			}

			if (dataO instanceof Long) {
				usb.setDataId(((Long) dataO).intValue());
			}

			if (dataO instanceof Short) {
				usb.setDataId(((Short) dataO).intValue());

			}

		}

		if (usbInfo.getDataId().getValue() != null) {
			usb.setDataId(usbInfo.getDataId().getValue().getValue());
		}

		usbInfo.getEndpointAddress();

		if (usbInfo.getEndpointAddress().getInvalid() != null) {
			usb.setEndpointAddress((short) 0);
		}

		if (usbInfo.getEndpointAddress().getRandom() != null) {
			usb.setEndpointAddress((short) 0);
		}

		if (usbInfo.getEndpointAddress().getValue() != null) {
			usb.setEndpointAddress(usbInfo.getEndpointAddress().getValue().getValue());
		}

		if (usbInfo.getEndpointAddress().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env,
					usbInfo.getEndpointAddress().getVariable().getVariablenname());

			if (dataO instanceof Integer) {
				usb.setEndpointAddress(((Integer) dataO).shortValue());
			}

			if (dataO instanceof Long) {
				usb.setEndpointAddress(((Long) dataO).shortValue());
			}

			if (dataO instanceof Short) {
				usb.setEndpointAddress(((Short) dataO).shortValue());

			}

		}

		if (usbInfo.getReceiver().getInvalid() != null) {

			usb.setReceiver((short) 0);

		}

		if (usbInfo.getReceiver().getRandom() != null) {
			usb.setReceiver((short) 1);
		}

		if (usbInfo.getReceiver().getValue() != null) {

			usb.setReceiver(usbInfo.getReceiver().getValue().getValue());
		}

		if (usbInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, usbInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {
				usb.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {
				usb.setReceiver(((Long) recO).shortValue());

			}

			if (recO instanceof Short) {

				usb.setReceiver(((Short) recO).shortValue());

			}

		}

		if (usbInfo.getTransportProtocol().getInvalid() != null) {
			usb.setTransportProtocol((short) 0);
		}

		if (usbInfo.getTransportProtocol().getRandom() != null) {
			usb.setTransportProtocol((short) 0);
		}

		if (usbInfo.getTransportProtocol().getValue() != null) {
			usb.setTransportProtocol(usbInfo.getTransportProtocol().getValue().getValue());
		}

		if (usbInfo.getTransportProtocol().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env,
					usbInfo.getTransportProtocol().getVariable().getVariablenname());

			if (recO instanceof Integer) {
				usb.setTransportProtocol(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {
				usb.setTransportProtocol(((Long) recO).shortValue());

			}

			if (recO instanceof Short) {

				usb.setTransportProtocol(((Short) recO).shortValue());

			}

		}

		send.setCFGSourceNetworkInformationUSB(usb);

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	public static Transition createSendingCFGSetTargetNetworkInformation(CFGTargetNetworkInformation targetInfo,
			dcpTestProcedure.DcpTestProcedure.Transition.Sending.ClockTime clockTime, DcpWrapper dcpWrapper,
			Environment environment, Map<String, Object> env, int fromNode, int toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.CFGTargetNetworkInformation target = new Transition.Sending.CFGTargetNetworkInformation();

		if (targetInfo.getReceiver().getInvalid() != null) {

			target.setReceiver((short) 0);

		}

		if (targetInfo.getReceiver().getRandom() != null) {
			target.setReceiver((short) 1);
		}

		if (targetInfo.getReceiver().getValue() != null) {

			target.setReceiver(targetInfo.getReceiver().getValue().getValue());
		}

		if (targetInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env,
					targetInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {
				target.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {
				target.setReceiver(((Long) recO).shortValue());

			}

			if (recO instanceof Short) {

				target.setReceiver(((Short) recO).shortValue());

			}

		}

		if (targetInfo.getDataId().getInvalid() != null) {

			target.setDataId(
					((Integer) environment.getFromEnvironment(env, "dataId(" + dcpWrapper.getRandomOutputVr() + ");"))
							.shortValue());
		}

		if (targetInfo.getDataId().getRandom() != null) {

			target.setDataId(dcpWrapper.getRandomInputVr());
		}

		if (targetInfo.getDataId().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env, targetInfo.getDataId().getVariable().getVariablenname());

			if (dataO instanceof Integer) {
				target.setDataId(((Integer) dataO).intValue());
			}

			if (dataO instanceof Long) {
				target.setDataId(((Long) dataO).intValue());
			}

			if (dataO instanceof Short) {
				target.setDataId(((Short) dataO).intValue());

			}

		}

		if (targetInfo.getDataId().getValue() != null) {
			target.setDataId(targetInfo.getDataId().getValue().getValue());
		}

		if (targetInfo.getTransportProtocol().getInvalid() != null) {

			target.setTransportProtocol((short) 9);

		}

		if (targetInfo.getTransportProtocol().getRandom() != null) {
			target.setTransportProtocol((short) 0);
		}

		if (targetInfo.getTransportProtocol().getVariable() != null) {

			Object protoO = environment.getFromEnvironment(env,
					targetInfo.getTransportProtocol().getVariable().getVariablenname());

			if (protoO instanceof Integer) {

				target.setTransportProtocol(((Integer) protoO).shortValue());

			}

			if (protoO instanceof Long) {

				target.setTransportProtocol(((Long) protoO).shortValue());

			}

			if (protoO instanceof Short) {

				target.setTransportProtocol(((Short) protoO).shortValue());

			}

		}

		if (targetInfo.getTransportProtocol().getValue() != null) {
			target.setTransportProtocol(targetInfo.getTransportProtocol().getValue().getValue());
		}

		send.setCFGTargetNetworkInformation(target);

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	public static Transition createSendingCFGSetTargetNetworkInformationBluetooth(
			CFGTargetNetworkInformationBluetooth blueInfo,
			dcpTestProcedure.DcpTestProcedure.Transition.Sending.ClockTime clockTime, DcpWrapper dcpWrapper,
			Environment environment, Map<String, Object> env, int fromNode, int toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.CFGTargetNetworkInformationBluetooth blue = new Transition.Sending.CFGTargetNetworkInformationBluetooth();

		if (blueInfo.getBdAddr().getInvalid() != null) {
			blue.setBdAddr(new BigInteger("00:11:22:33:FF:EE"));
		}

		if (blueInfo.getBdAddr().getRandom() != null) {
			blue.setBdAddr(new BigInteger("00:11:22:33:FF:EE"));
		}

		if (blueInfo.getBdAddr().getValue() != null) {
			blue.setBdAddr(blueInfo.getBdAddr().getValue().getValue());
		}

		if (blueInfo.getBdAddr().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env, blueInfo.getDataId().getVariable().getVariablenname());

			if (dataO instanceof Integer) {
				blue.setBdAddr(new BigInteger(((Integer) dataO).toString()));
			}

			if (dataO instanceof Long) {
				blue.setBdAddr(new BigInteger(((Long) dataO).toString()));
			}

			if (dataO instanceof Short) {
				blue.setBdAddr(new BigInteger(((Short) dataO).toString()));

			}

			if (dataO instanceof String) {
				blue.setBdAddr(new BigInteger((String) dataO));

			}

			if (dataO instanceof BigInteger) {

				blue.setBdAddr((BigInteger) dataO);
			}

		}

		if (blueInfo.getDataId().getInvalid() != null) {

			blue.setDataId(
					((Integer) environment.getFromEnvironment(env, "dataId(" + dcpWrapper.getRandomOutputVr() + ");"))
							.shortValue());
		}

		if (blueInfo.getDataId().getRandom() != null) {

			blue.setDataId(dcpWrapper.getRandomInputVr());
		}

		if (blueInfo.getDataId().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env, blueInfo.getDataId().getVariable().getVariablenname());

			if (dataO instanceof Integer) {
				blue.setDataId(((Integer) dataO).intValue());
			}

			if (dataO instanceof Long) {
				blue.setDataId(((Long) dataO).intValue());
			}

			if (dataO instanceof Short) {
				blue.setDataId(((Short) dataO).intValue());

			}

		}

		if (blueInfo.getDataId().getValue() != null) {
			blue.setDataId(blueInfo.getDataId().getValue().getValue());
		}

		if (blueInfo.getPort().getInvalid() != null) {
			blue.setPort((short) 0);
		}

		if (blueInfo.getPort().getRandom() != null) {

			blue.setPort((short) 0);

		}

		if (blueInfo.getPort().getValue() != null) {

			blue.setPort(blueInfo.getPort().getValue().getValue());
		}

		if (blueInfo.getPort().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env, blueInfo.getPort().getVariable().getVariablenname());

			if (dataO instanceof Integer) {
				blue.setPort(((Integer) dataO).shortValue());
			}

			if (dataO instanceof Long) {
				blue.setPort(((Long) dataO).shortValue());
			}

			if (dataO instanceof Short) {
				blue.setPort(((Short) dataO));

			}

		}

		if (blueInfo.getReceiver().getInvalid() != null) {

			blue.setReceiver((short) 0);

		}

		if (blueInfo.getReceiver().getRandom() != null) {
			blue.setReceiver((short) 1);
		}

		if (blueInfo.getReceiver().getValue() != null) {

			blue.setReceiver(blueInfo.getReceiver().getValue().getValue());
		}

		if (blueInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, blueInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {
				blue.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {
				blue.setReceiver(((Long) recO).shortValue());

			}

			if (recO instanceof Short) {

				blue.setReceiver(((Short) recO).shortValue());

			}

		}

		if (blueInfo.getTransportProtocol().getInvalid() != null) {
			blue.setTransportProtocol((short) 0);
		}

		if (blueInfo.getTransportProtocol().getRandom() != null) {
			blue.setTransportProtocol((short) 0);
		}

		if (blueInfo.getTransportProtocol().getValue() != null) {
			blue.setTransportProtocol(blueInfo.getTransportProtocol().getValue().getValue());
		}

		if (blueInfo.getTransportProtocol().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env,
					blueInfo.getTransportProtocol().getVariable().getVariablenname());

			if (recO instanceof Integer) {
				blue.setTransportProtocol(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {
				blue.setTransportProtocol(((Long) recO).shortValue());

			}

			if (recO instanceof Short) {

				blue.setTransportProtocol(((Short) recO).shortValue());

			}

		}

		send.setCFGTargetNetworkInformationBluetooth(blue);

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	public static Transition createSendingCFGSetTargetNetworkInformationTCPIPv4(
			CFGTargetNetworkInformationTCPIPv4 tcpInfo,
			dcpTestProcedure.DcpTestProcedure.Transition.Sending.ClockTime clockTime, DcpWrapper dcpWrapper,
			Environment environment, Map<String, Object> env, int fromNode, int toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.CFGTargetNetworkInformationTCPIPv4 tcp = new Transition.Sending.CFGTargetNetworkInformationTCPIPv4();

		if (tcpInfo.getDataId().getInvalid() != null) {

			tcp.setDataId(
					((Integer) environment.getFromEnvironment(env, "dataId(" + dcpWrapper.getRandomOutputVr() + ");"))
							.shortValue());
		}

		if (tcpInfo.getDataId().getRandom() != null) {

			tcp.setDataId(dcpWrapper.getRandomInputVr());
		}

		if (tcpInfo.getDataId().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env, tcpInfo.getDataId().getVariable().getVariablenname());

			if (dataO instanceof Integer) {
				tcp.setDataId(((Integer) dataO).intValue());
			}

			if (dataO instanceof Long) {
				tcp.setDataId(((Long) dataO).intValue());
			}

			if (dataO instanceof Short) {
				tcp.setDataId(((Short) dataO).intValue());

			}

		}

		if (tcpInfo.getDataId().getValue() != null) {
			tcp.setDataId(tcpInfo.getDataId().getValue().getValue());
		}

		if (tcpInfo.getIpAdress().getInvalid() != null) {

			tcp.setIpAddress(0);
		}

		if (tcpInfo.getIpAdress().getRandom() != null) {
			Object ipO = environment.getFromEnvironment(env, "Tester.ip");
			System.out.println((String) ipO);
			if (ipO instanceof String) {

				long ipV = ((Double) environment.eval("ip2int('" + ipO + "');")).longValue();
				tcp.setIpAddress(ipV);
			}
		}

		if (tcpInfo.getIpAdress().getValue() != null) {
			tcp.setIpAddress(tcpInfo.getIpAdress().getValue().getValue());

		}

		if (tcpInfo.getIpAdress().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, tcpInfo.getIpAdress().getVariable().getVariablenname());
			
			if (recO instanceof String) {

				long ip = ((Double) environment.eval("ip2int('" + recO + "');")).longValue();
				tcp.setIpAddress(ip);
			}


			if (recO instanceof Integer) {
				tcp.setIpAddress(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {
				tcp.setIpAddress(((Long) recO).shortValue());

			}

			if (recO instanceof Short) {

				tcp.setIpAddress(((Short) recO).shortValue());

			}

		}

		if (tcpInfo.getPort().getInvalid() != null) {
			tcp.setPort((short) 0);
		}

		if (tcpInfo.getPort().getRandom() != null) {
			Object ipO = environment.getFromEnvironment(env, "Tester.port");

			if (ipO instanceof String) {
				tcp.setPort(Short.valueOf((String) ipO));
			}

			

		}

		if (tcpInfo.getPort().getValue() != null) {

			tcp.setPort(tcpInfo.getPort().getValue().getValue());
		}

		if (tcpInfo.getPort().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env, tcpInfo.getPort().getVariable().getVariablenname());

			if (dataO instanceof Integer) {
				tcp.setPort(((Integer) dataO).shortValue());
			}

			if (dataO instanceof Long) {
				tcp.setPort(((Long) dataO).shortValue());
			}

			if (dataO instanceof Short) {
				tcp.setPort(((Short) dataO));

			}

		}

		if (tcpInfo.getReceiver().getInvalid() != null) {

			tcp.setReceiver((short) 0);

		}

		if (tcpInfo.getReceiver().getRandom() != null) {
			tcp.setReceiver((short) 1);
		}

		if (tcpInfo.getReceiver().getValue() != null) {

			tcp.setReceiver(tcpInfo.getReceiver().getValue().getValue());
		}

		if (tcpInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, tcpInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {
				tcp.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {
				tcp.setReceiver(((Long) recO).shortValue());

			}

			if (recO instanceof Short) {

				tcp.setReceiver(((Short) recO).shortValue());

			}

		}

		if (tcpInfo.getTransportProtocol().getInvalid() != null) {
			tcp.setTransportProtocol((short) 0);
		}

		if (tcpInfo.getTransportProtocol().getRandom() != null) {
			tcp.setTransportProtocol((short) 0);
		}

		if (tcpInfo.getTransportProtocol().getValue() != null) {
			tcp.setTransportProtocol(tcpInfo.getTransportProtocol().getValue().getValue());
		}

		if (tcpInfo.getTransportProtocol().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env,
					tcpInfo.getTransportProtocol().getVariable().getVariablenname());

			if (recO instanceof Integer) {
				tcp.setTransportProtocol(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {
				tcp.setTransportProtocol(((Long) recO).shortValue());

			}

			if (recO instanceof Short) {

				tcp.setTransportProtocol(((Short) recO).shortValue());

			}

		}

		send.setCFGTargetNetworkInformationTCPIPv4(tcp);

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	public static Transition createSendingCFGSetTargetNetworkInformationUSB(CFGTargetNetworkInformationUSB usbInfo,
			dcpTestProcedure.DcpTestProcedure.Transition.Sending.ClockTime clockTime, DcpWrapper dcpWrapper,
			Environment environment, Map<String, Object> env, int fromNode, int toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.CFGTargetNetworkInformationUSB usb = new Transition.Sending.CFGTargetNetworkInformationUSB();

		if (usbInfo.getDataId().getInvalid() != null) {

			usb.setDataId(
					((Integer) environment.getFromEnvironment(env, "dataId(" + dcpWrapper.getRandomOutputVr() + ");"))
							.shortValue());
		}

		if (usbInfo.getDataId().getRandom() != null) {

			usb.setDataId(dcpWrapper.getRandomInputVr());
		}

		if (usbInfo.getDataId().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env, usbInfo.getDataId().getVariable().getVariablenname());

			if (dataO instanceof Integer) {
				usb.setDataId(((Integer) dataO).intValue());
			}

			if (dataO instanceof Long) {
				usb.setDataId(((Long) dataO).intValue());
			}

			if (dataO instanceof Short) {
				usb.setDataId(((Short) dataO).intValue());

			}

		}

		if (usbInfo.getDataId().getValue() != null) {
			usb.setDataId(usbInfo.getDataId().getValue().getValue());
		}

		usbInfo.getEndpointAddress();

		if (usbInfo.getEndpointAddress().getInvalid() != null) {
			usb.setEndpointAddress((short) 0);
		}

		if (usbInfo.getEndpointAddress().getRandom() != null) {
			usb.setEndpointAddress((short) 0);
		}

		if (usbInfo.getEndpointAddress().getValue() != null) {
			usb.setEndpointAddress(usbInfo.getEndpointAddress().getValue().getValue());
		}

		if (usbInfo.getEndpointAddress().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env,
					usbInfo.getEndpointAddress().getVariable().getVariablenname());

			if (dataO instanceof Integer) {
				usb.setEndpointAddress(((Integer) dataO).shortValue());
			}

			if (dataO instanceof Long) {
				usb.setEndpointAddress(((Long) dataO).shortValue());
			}

			if (dataO instanceof Short) {
				usb.setEndpointAddress(((Short) dataO).shortValue());

			}

		}

		if (usbInfo.getReceiver().getInvalid() != null) {

			usb.setReceiver((short) 0);

		}

		if (usbInfo.getReceiver().getRandom() != null) {
			usb.setReceiver((short) 1);
		}

		if (usbInfo.getReceiver().getValue() != null) {

			usb.setReceiver(usbInfo.getReceiver().getValue().getValue());
		}

		if (usbInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, usbInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {
				usb.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {
				usb.setReceiver(((Long) recO).shortValue());

			}

			if (recO instanceof Short) {

				usb.setReceiver(((Short) recO).shortValue());

			}

		}

		if (usbInfo.getTransportProtocol().getInvalid() != null) {
			usb.setTransportProtocol((short) 0);
		}

		if (usbInfo.getTransportProtocol().getRandom() != null) {
			usb.setTransportProtocol((short) 0);
		}

		if (usbInfo.getTransportProtocol().getValue() != null) {
			usb.setTransportProtocol(usbInfo.getTransportProtocol().getValue().getValue());
		}

		if (usbInfo.getTransportProtocol().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env,
					usbInfo.getTransportProtocol().getVariable().getVariablenname());

			if (recO instanceof Integer) {
				usb.setTransportProtocol(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {
				usb.setTransportProtocol(((Long) recO).shortValue());

			}

			if (recO instanceof Short) {

				usb.setTransportProtocol(((Short) recO).shortValue());

			}

		}

		if (usbInfo.getSlaveUUID().getInvalid() != null) {

			usb.setSlaveUuid(dcpWrapper.getInvalidSlaveUuid());

		}

		if (usbInfo.getSlaveUUID().getRandom() != null) {
			usb.setSlaveUuid(dcpWrapper.getRandomSlaveUuid());

		}

		if (usbInfo.getSlaveUUID().getValue() != null) {

			usb.setSlaveUuid((usbInfo.getSlaveUUID().getValue().getValue()));

		}
		if (usbInfo.getSlaveUUID().getVariable() != null) {
			usb.setSlaveUuid((String) environment.getFromEnvironment(env,
					usbInfo.getSlaveUUID().getVariable().getVariablenname()));

		}

		send.setCFGTargetNetworkInformationUSB(usb);

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Sending CFG_SET_SOURCE_NETWORK_INFORMATION
	 * Message according to the passed Informations
	 * 
	 * 
	 * @param sourceInfo  - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param dcpWrapper  - the dcp slave description
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the CFG_SET_SOURCE_NETWORK_INFORMATION
	 *         Message
	 */

	public static Transition createSendingCFGSetSourceNetworkInformationUDP(
			AddTransition.Sending.CFGSourceNetworkInformationUDPIPv4 sourceInfo, Transition.Sending.ClockTime clockTime,
			DcpWrapper dcpWrapper, Environment environment, Map<String, Object> env, long fromNode, long toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.CFGSourceNetworkInformationUDPIPv4 udp = new Transition.Sending.CFGSourceNetworkInformationUDPIPv4();

		if (sourceInfo.getReceiver().getInvalid() != null) {

			udp.setReceiver((short) 0);

		}

		if (sourceInfo.getReceiver().getRandom() != null) {
			udp.setReceiver((short) 1);
		}

		if (sourceInfo.getReceiver().getValue() != null) {

			udp.setReceiver(sourceInfo.getReceiver().getValue().getValue());
		}

		if (sourceInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env,
					sourceInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {
				udp.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {
				udp.setReceiver(((Long) recO).shortValue());

			}

			if (recO instanceof Short) {

				udp.setReceiver(((Short) recO).shortValue());

			}

		}

		if (sourceInfo.getDataId().getInvalid() != null) {

			udp.setDataId(
					((Integer) environment.getFromEnvironment(env, "dataId(" + dcpWrapper.getRandomOutputVr() + ");"))
							.shortValue());
		}

		if (sourceInfo.getDataId().getRandom() != null) {

			udp.setDataId(dcpWrapper.getRandomInputVr());
		}

		if (sourceInfo.getDataId().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env, sourceInfo.getDataId().getVariable().getVariablenname());

			if (dataO instanceof Integer) {
				udp.setDataId(((Integer) dataO).intValue());
			}

			if (dataO instanceof Long) {
				udp.setDataId(((Long) dataO).intValue());
			}

			if (dataO instanceof Short) {
				udp.setDataId(((Short) dataO).intValue());

			}

		}

		if (sourceInfo.getDataId().getValue() != null) {
			udp.setDataId(sourceInfo.getDataId().getValue().getValue());
		}

		if (sourceInfo.getTransportProtocol().getInvalid() != null) {

			udp.setTransportProtocol((short) 9);

		}

		if (sourceInfo.getTransportProtocol().getRandom() != null) {
			udp.setTransportProtocol((short) 0);
		}

		if (sourceInfo.getTransportProtocol().getVariable() != null) {

			Object protoO = environment.getFromEnvironment(env,
					sourceInfo.getTransportProtocol().getVariable().getVariablenname());

			if (protoO instanceof Integer) {

				udp.setTransportProtocol(((Integer) protoO).shortValue());

			}

			if (protoO instanceof Long) {

				udp.setTransportProtocol(((Long) protoO).shortValue());

			}

			if (protoO instanceof Short) {

				udp.setTransportProtocol(((Short) protoO).shortValue());

			}

		}

		if (sourceInfo.getTransportProtocol().getValue() != null) {
			udp.setTransportProtocol(sourceInfo.getTransportProtocol().getValue().getValue());
		}

		if (sourceInfo.getIpAdress().getInvalid() != null) {

			udp.setIpAddress(0);

		}

		if (sourceInfo.getIpAdress().getValue() != null) {

			udp.setIpAddress(sourceInfo.getIpAdress().getValue().getValue());

		}

		if (sourceInfo.getIpAdress().getVariable() != null) {

			Object ipO = environment.getFromEnvironment(env, sourceInfo.getIpAdress().getVariable().getVariablenname());

			if (ipO instanceof Double) {

				udp.setIpAddress(((Double) ipO).intValue());

			}

			if (ipO instanceof Integer) {

				udp.setIpAddress(((Integer) ipO).intValue());

			}

			if (ipO instanceof Long) {
				udp.setIpAddress(((Long) ipO).intValue());

			}

			if (ipO instanceof Short) {
				udp.setIpAddress(((Short) ipO).intValue());

			}

		}

		if (sourceInfo.getIpAdress().getRandom() != null) {

			udp.setIpAddress(dcpWrapper.getUdpInputOutputIp());
		}

		if (sourceInfo.getPort().getVariable() != null) {

			Object portO = environment.getFromEnvironment(env, sourceInfo.getPort().getVariable().getVariablenname());

			if (portO instanceof Integer) {

				udp.setPort(((Integer) portO).intValue());
			}

			if (portO instanceof Long) {

				udp.setPort(((Long) portO).intValue());
			}

			if (portO instanceof Short) {

				udp.setPort(((Short) portO).intValue());
			}

		}

		if (sourceInfo.getPort().getRandom() != null) {

			udp.setPort(dcpWrapper.getUdpInputOutputPort());

		}

		if (sourceInfo.getPort().getInvalid() != null) {
			udp.setPort(0);
		}

		if (sourceInfo.getPort().getValue() != null) {
			udp.setPort(sourceInfo.getPort().getValue().getValue());
		}

		send.setCFGSourceNetworkInformationUDPIPv4(udp);

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Sending
	 * CFG_SET_TARGET_NETWORK_INFORMATION_UDP Message according to the passed
	 * Informations
	 * 
	 * 
	 * @param udpInfo     - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param dcpWrapper  - the dcp slave description
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the CFG_SET_TARGET_NETWORK_INFORMATION_UDP
	 *         Message
	 */

	public static Transition createSendingCFGSetTargetNetworkInformationUDP(
			AddTransition.Sending.CFGTargetNetworkInformationUDPIPv4 udpInfo, Transition.Sending.ClockTime clockTime,
			DcpWrapper dcpWrapper, Environment environment, Map<String, Object> env, long fromNode, long toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();

		Transition.Sending.CFGTargetNetworkInformationUDPIPv4 udp = new Transition.Sending.CFGTargetNetworkInformationUDPIPv4();

		if (udpInfo.getReceiver().getInvalid() != null) {
			udp.setReceiver((short) 0);
		}

		if (udpInfo.getReceiver().getRandom() != null) {
			udp.setReceiver((short) 1);
		}

		if (udpInfo.getReceiver().getValue() != null) {

			udp.setReceiver(udpInfo.getReceiver().getValue().getValue());

		}

		if (udpInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, udpInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {

				udp.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {

				udp.setReceiver(((Long) recO).shortValue());
			}

			if (recO instanceof Short) {

				udp.setReceiver(((Short) recO).shortValue());
			}

		}

		if (udpInfo.getDataId().getInvalid() != null) {
			udp.setDataId(
					((Integer) environment.getFromEnvironment(env, "dataId(" + dcpWrapper.getRandomInputVr() + ");"))
							.shortValue());
		}

		if (udpInfo.getDataId().getRandom() != null) {
			udp.setDataId(
					((Integer) environment.getFromEnvironment(env, "dataId(" + dcpWrapper.getRandomOutputVr() + ");"))
							.shortValue());
		}

		if (udpInfo.getDataId().getValue() != null) {
			udp.setDataId(udpInfo.getDataId().getValue().getValue());
		}

		if (udpInfo.getDataId().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env, udpInfo.getDataId().getVariable().getVariablenname());

			if (dataO instanceof Integer) {

				udp.setDataId(((Integer) dataO).shortValue());
			}

			if (dataO instanceof Long) {

				udp.setDataId(((Long) dataO).shortValue());
			}

			if (dataO instanceof Short) {

				udp.setDataId(((Short) dataO).shortValue());
			}

		}

		if (udpInfo.getTransportProtocol().getInvalid() != null) {

			udp.setTransportProtocol((short) 9);

		}

		if (udpInfo.getTransportProtocol().getRandom() != null) {
			udp.setTransportProtocol((short) 0);
		}

		if (udpInfo.getTransportProtocol().getValue() != null) {
			udp.setTransportProtocol(udpInfo.getTransportProtocol().getValue().getValue());
		}

		if (udpInfo.getTransportProtocol().getVariable() != null) {

			Object protoO = environment.getFromEnvironment(env,
					udpInfo.getTransportProtocol().getVariable().getVariablenname());

			if (protoO instanceof Integer) {

				udp.setTransportProtocol(((Integer) protoO).shortValue());
			}

			if (protoO instanceof Long) {

				udp.setTransportProtocol(((Long) protoO).shortValue());
			}

			if (protoO instanceof Short) {

				udp.setTransportProtocol(((Short) protoO).shortValue());
			}

		}

		if (udpInfo.getIpAdress().getValue() != null) {

			udp.setIpAddress(udpInfo.getIpAdress().getValue().getValue());

		}

		if (udpInfo.getIpAdress().getVariable() != null) {

			Object ipO = environment.getFromEnvironment(env, udpInfo.getIpAdress().getVariable().getVariablenname());

			if (ipO instanceof String) {

				long ip = ((Double) environment.eval("ip2int('" + ipO + "');")).longValue();
				udp.setIpAddress(ip);
			}

			if (ipO instanceof Integer) {

				udp.setIpAddress(((Integer) ipO).longValue());
			}

			if (ipO instanceof Long) {

				udp.setIpAddress(((Long) ipO).longValue());
			}

			if (ipO instanceof Short) {

				udp.setIpAddress(((Short) ipO).longValue());
			}

		}

		if (udpInfo.getIpAdress().getRandom() != null) {

			Object ipO = environment.getFromEnvironment(env, "Tester.ip");

			if (ipO instanceof String) {

				long ip = ((Double) environment.eval("ip2int('" + ipO + "');")).longValue();
				udp.setIpAddress(ip);
			}

		}

		if (udpInfo.getIpAdress().getInvalid() != null) {

			long ip = 0;

			udp.setIpAddress(ip);
		}

		if (udpInfo.getPort().getValue() != null) {

			udp.setPort(udpInfo.getPort().getValue().getValue().intValue());
		}

		if (udpInfo.getPort().getVariable() != null) {

			Object portO = environment.getFromEnvironment(env, udpInfo.getPort().getVariable().getVariablenname());

			if (portO instanceof Integer) {

				udp.setPort(((Integer) portO).shortValue());
			}

			if (portO instanceof Long) {

				udp.setPort(((Long) portO).shortValue());
			}

			if (portO instanceof Short) {

				udp.setPort(((Short) portO).shortValue());
			}

		}

		if (udpInfo.getPort().getRandom() != null) {
			udp.setPort((int) environment.getFromEnvironment(env, "Tester.port"));
		}

		if (udpInfo.getPort().getInvalid() != null) {

			int port = (int) environment.getFromEnvironment(env, "Tester.port") - 1;

			if (port > 0L) {
				port = port - 1;
			} else {
				port = port + 1;
			}

			udp.setPort(port);

		}

		send.setCFGTargetNetworkInformationUDPIPv4(udp);

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);

		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Sending CFG_CONFIG_CLEAR Message according
	 * to the passed Informations
	 * 
	 * 
	 * @param clearInfo   - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param dcpWrapper  - the dcp slave description
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the CFG_CONFIG_CLEAR Message
	 */

	public static Transition createSendingCFGConfigClear(AddTransition.Sending.CFGClear clearInfo,
			Transition.Sending.ClockTime clockTime, Environment environment, Map<String, Object> env, long fromNode,
			long toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.CFGClear clear = new Transition.Sending.CFGClear();

		if (clearInfo.getReceiver().getInvalid() != null) {

			clear.setReceiver((short) 0);

		}

		if (clearInfo.getReceiver().getRandom() != null) {
			clear.setReceiver((short) 1);
		}

		if (clearInfo.getReceiver().getValue() != null) {

			clear.setReceiver(clearInfo.getReceiver().getValue().getValue());
		}

		if (clearInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, clearInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {

				clear.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {

				clear.setReceiver(((Long) recO).shortValue());
			}

			if (recO instanceof Short) {

				clear.setReceiver(((Short) recO).shortValue());
			}

		}

		send.setCFGClear(clear);

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);

		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Sending CFG_SET_PARAMETER Message according
	 * to the passed Informations
	 * 
	 * 
	 * @param paramInfo   - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param dcpWrapper  - the dcp slave description
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the CFG_SET_PARAMETER Message
	 */

	public static Transition createSendingCFGSetParameter(AddTransition.Sending.CFGParameter paramInfo,
			Transition.Sending.ClockTime clockTime, DcpWrapper dcpWrapper, Environment environment,
			Map<String, Object> env, long fromNode, long toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.CFGParameter param = new Transition.Sending.CFGParameter();

		if (paramInfo.getReceiver().getInvalid() != null) {

			param.setReceiver((short) 0);

		}

		if (paramInfo.getReceiver().getRandom() != null) {
			param.setReceiver((short) 1);
		}

		if (paramInfo.getReceiver().getValue() != null) {

			param.setReceiver(paramInfo.getReceiver().getValue().getValue());

		}

		if (paramInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, paramInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {

				param.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {

				param.setReceiver(((Long) recO).shortValue());
			}

			if (recO instanceof Short) {

				param.setReceiver(((Short) recO).shortValue());
			}

		}

		int targetVr = 0;

		if (paramInfo.getTargetVr().getInvalid() != null) {
			param.setTargetVr(dcpWrapper.getInvalidParamVr());
			targetVr = dcpWrapper.getInvalidParamVr();
		}

		if (paramInfo.getTargetVr().getRandom() != null) {
			param.setTargetVr(dcpWrapper.getRandomParamVr());
			targetVr = dcpWrapper.getRandomParamVr();
		}

		if (paramInfo.getTargetVr().getValue() != null) {

			param.setTargetVr(paramInfo.getTargetVr().getValue().getValue());
			targetVr = paramInfo.getTargetVr().getValue().getValue();

		}

		if (paramInfo.getTargetVr().getVariable() != null) {

			Object targetVrO = environment.getFromEnvironment(env,
					paramInfo.getTargetVr().getVariable().getVariablenname());

			if (targetVrO instanceof Integer) {

				param.setReceiver(((Integer) targetVrO).shortValue());
				targetVr = ((Integer) targetVrO).shortValue();
			}

			if (targetVrO instanceof Long) {

				param.setReceiver(((Long) targetVrO).shortValue());
				targetVr = ((Long) targetVrO).shortValue();
			}

			if (targetVrO instanceof Short) {

				param.setReceiver(((Short) targetVrO).shortValue());
				targetVr = ((Short) targetVrO).shortValue();
			}

		}

		if (paramInfo.getSourceDataType().getInvalid() != null) {

			try {
				param.setSourceDataType(dcpWrapper.getInvalidDataTypeFromVr(targetVr));
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		if (paramInfo.getSourceDataType().getRandom() != null) {

			try {
				param.setSourceDataType(dcpWrapper.getDataTypeFromVr(targetVr));
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		if (paramInfo.getSourceDataType().getValue() != null) {

			param.setSourceDataType(paramInfo.getSourceDataType().getValue().getValue());

		}

		if (paramInfo.getSourceDataType().getVariable() != null) {

			Object sourceDataO = environment.getFromEnvironment(env,
					paramInfo.getSourceDataType().getVariable().getVariablenname());

			if (sourceDataO instanceof Integer) {

				param.setSourceDataType(((Integer) sourceDataO).shortValue());

			}

			if (sourceDataO instanceof Long) {

				param.setSourceDataType(((Long) sourceDataO).shortValue());

			}

			if (sourceDataO instanceof Short) {

				param.setSourceDataType(((Short) sourceDataO).shortValue());

			}

		}

		int dim = dcpWrapper.getDimensionOfVr(targetVr);
		DcpTestProcedure.Transition.Sending.CFGParameter.Payload payload = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload();

		if (paramInfo.getPayload().getInvalid() != null) {

			short dataType = 0;
			try {
				dataType = dcpWrapper.getInvalidDataTypeFromVr(targetVr);
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			if (dataType == DataTypeList.float32) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float32 f = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float32();

				try {
					for (int i = 0; i < dim; i++) {
						f.getValue().add((float) dcpWrapper.getMaxForVr(targetVr) + 1);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

				payload.setFloat32(f);
			}

			if (dataType == DataTypeList.float64) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float64 f = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float64();
				try {
					for (int i = 0; i < dim; i++) {
						f.getValue().add((double) dcpWrapper.getMaxForVr(targetVr) + 1);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				payload.setFloat64(f);

			}

			if (dataType == DataTypeList.int16) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int16 f = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int16();

				try {
					for (int i = 0; i < dim; i++) {
						f.getValue().add((short) (((short) dcpWrapper.getMaxForVr(targetVr) + 1)));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				payload.setInt16(f);
			}

			if (dataType == DataTypeList.int32) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int32 f = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int32();
				try {
					for (int i = 0; i < dim; i++) {
						f.getValue().add((int) dcpWrapper.getMaxForVr(targetVr) + 1);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				payload.setInt32(f);
			}

			if (dataType == DataTypeList.int64) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int64 f = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int64();
				try {
					for (int i = 0; i < dim; i++) {
						f.getValue().add((long) dcpWrapper.getMaxForVr(targetVr) + 1);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				payload.setInt64(f);

			}

			if (dataType == DataTypeList.int8) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint8 f = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint8();
				try {
					for (int i = 0; i < dim; i++) {
						f.getValue().add((short) ((short) dcpWrapper.getMaxForVr(targetVr) + 1));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				payload.setUint8(f);

			}

			if (dataType == DataTypeList.uint16) {

				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint16 f = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint16();
				try {
					for (int i = 0; i < dim; i++) {
						f.getValue().add((int) dcpWrapper.getMaxForVr(targetVr) + 1);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				payload.setUint16(f);

			}

			if (dataType == DataTypeList.uint32) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint32 f = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint32();
				try {
					for (int i = 0; i < dim; i++) {
						f.getValue().add((long) dcpWrapper.getMaxForVr(targetVr) + 1);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				payload.setUint32(f);

			}

			if (dataType == DataTypeList.uint64) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint64 f = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint64();
				try {
					for (int i = 0; i < dim; i++) {
						f.getValue().add(((BigInteger) dcpWrapper.getMaxForVr(targetVr)).add(new BigInteger("1")));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				payload.setUint64(f);

			}

			if (dataType == DataTypeList.uint8) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint8 f = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint8();
				try {
					for (int i = 0; i < dim; i++) {
						Object val = dcpWrapper.getMaxForVr(targetVr);
						if (val instanceof Integer) {
							f.getValue().add((short) (((Integer) dcpWrapper.getMaxForVr(targetVr)).shortValue() + 1));
						} else if (val instanceof Short) {
							f.getValue().add((short) (((Short) dcpWrapper.getMaxForVr(targetVr)).shortValue() + 1));
						}
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
				payload.setUint8(f);

			}

		}

		if (paramInfo.getPayload().getRandom() != null) {

			short dataType = 0;
			try {
				dataType = dcpWrapper.getDataTypeFromVr(dcpWrapper.getRandomParamVr());
			} catch (Exception e1) {
				e1.printStackTrace();
			}

			if (dataType == DataTypeList.float32) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float32 f = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float32();

				try {
					for (int i = 0; i < dim; i++) {
						f.getValue().add(((Integer) dcpWrapper.getMaxForVr(targetVr)).floatValue());
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

				payload.setFloat32(f);
			}

			if (dataType == DataTypeList.float64) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float64 f = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float64();
				try {
					for (int i = 0; i < dim; i++) {
						f.getValue().add((double) dcpWrapper.getMaxForVr(targetVr));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				payload.setFloat64(f);

			}

			if (dataType == DataTypeList.int16) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int16 f = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int16();

				try {
					for (int i = 0; i < dim; i++) {
						f.getValue().add((short) (((short) dcpWrapper.getMaxForVr(targetVr))));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				payload.setInt16(f);
			}

			if (dataType == DataTypeList.int32) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int32 f = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int32();
				try {
					for (int i = 0; i < dim; i++) {
						f.getValue().add((int) dcpWrapper.getMaxForVr(targetVr));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				payload.setInt32(f);
			}

			if (dataType == DataTypeList.int64) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int64 f = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int64();
				try {
					for (int i = 0; i < dim; i++) {
						f.getValue().add((long) dcpWrapper.getMaxForVr(targetVr));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				payload.setInt64(f);

			}

			if (dataType == DataTypeList.int8) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint8 f = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint8();
				try {
					for (int i = 0; i < dim; i++) {
						f.getValue().add((short) ((short) dcpWrapper.getMaxForVr(targetVr)));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				payload.setUint8(f);

			}

			if (dataType == DataTypeList.uint16) {

				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint16 f = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint16();
				try {
					for (int i = 0; i < dim; i++) {
						f.getValue().add((int) dcpWrapper.getMaxForVr(targetVr));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				payload.setUint16(f);

			}

			if (dataType == DataTypeList.uint32) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint32 f = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint32();
				try {
					for (int i = 0; i < dim; i++) {
						f.getValue().add((long) dcpWrapper.getMaxForVr(targetVr));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				payload.setUint32(f);

			}

			if (dataType == DataTypeList.uint64) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint64 f = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint64();
				try {
					for (int i = 0; i < dim; i++) {
						f.getValue().add(((BigInteger) dcpWrapper.getMaxForVr(targetVr)));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				payload.setUint64(f);

			}

			if (dataType == DataTypeList.uint8) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint8 f = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint8();
				try {
					for (int i = 0; i < dim; i++) {
						f.getValue().add((short) ((short) dcpWrapper.getMaxForVr(targetVr)));
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				payload.setUint8(f);

			}

		}

		if (paramInfo.getPayload().getValue() != null) {

			if (paramInfo.getPayload().getValue().getBinary() != null) {

				AddTransition.Sending.CFGParameter.Payload.Value.Binary binaryInfo = paramInfo.getPayload().getValue()
						.getBinary();
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Binary binary = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Binary();
				binary.setValue(binaryInfo.getValue());
				payload.setBinary(binary);

			}
			if (paramInfo.getPayload().getValue().getFloat32() != null) {

				AddTransition.Sending.CFGParameter.Payload.Value.Float32 float32Info = paramInfo.getPayload().getValue()
						.getFloat32();
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float32 float32 = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float32();
				float32.getValue().addAll(float32Info.getValue());
				payload.setFloat32(float32);

			}
			if (paramInfo.getPayload().getValue().getFloat64() != null) {

				AddTransition.Sending.CFGParameter.Payload.Value.Float64 float64Info = paramInfo.getPayload().getValue()
						.getFloat64();
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float64 float64 = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float64();
				float64.getValue().addAll(float64Info.getValue());
				payload.setFloat64(float64);

			}

			if (paramInfo.getPayload().getValue().getInt16() != null) {

				AddTransition.Sending.CFGParameter.Payload.Value.Int16 int16Info = paramInfo.getPayload().getValue()
						.getInt16();
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int16 int16 = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int16();
				int16.getValue().addAll(int16Info.getValue());
				payload.setInt16(int16);

			}
			if (paramInfo.getPayload().getValue().getInt32() != null) {

				AddTransition.Sending.CFGParameter.Payload.Value.Int32 int32Info = paramInfo.getPayload().getValue()
						.getInt32();
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int32 int32 = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int32();
				int32.getValue().addAll(int32Info.getValue());
				payload.setInt32(int32);

			}
			if (paramInfo.getPayload().getValue().getInt64() != null) {

				AddTransition.Sending.CFGParameter.Payload.Value.Int64 int64Info = paramInfo.getPayload().getValue()
						.getInt64();
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int64 int64 = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int64();
				int64.getValue().addAll(int64Info.getValue());
				payload.setInt64(int64);

			}
			if (paramInfo.getPayload().getValue().getInt8() != null) {

				AddTransition.Sending.CFGParameter.Payload.Value.Int8 int8Info = paramInfo.getPayload().getValue()
						.getInt8();
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int8 int8 = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload()
						.getInt8();
				int8.getValue().addAll(int8Info.getValue());
				payload.setInt8(int8);

			}
			if (paramInfo.getPayload().getValue().getString() != null) {

				AddTransition.Sending.CFGParameter.Payload.Value.String sInfo = paramInfo.getPayload().getValue()
						.getString();
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.String s = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.String();
				s.setValue(sInfo.getValue());
				payload.setString(s);

			}
			if (paramInfo.getPayload().getValue().getUint16() != null) {

				AddTransition.Sending.CFGParameter.Payload.Value.Uint16 int16Info = paramInfo.getPayload().getValue()
						.getUint16();
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint16 uint16 = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint16();
				uint16.getValue().addAll(int16Info.getValue());
				payload.setUint16(uint16);

			}
			if (paramInfo.getPayload().getValue().getUint32() != null) {

				AddTransition.Sending.CFGParameter.Payload.Value.Uint32 uint32Info = paramInfo.getPayload().getValue()
						.getUint32();
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint32 uint32 = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint32();
				uint32.getValue().addAll(uint32Info.getValue());
				payload.setUint32(uint32);

			}
			if (paramInfo.getPayload().getValue().getUint64() != null) {

				AddTransition.Sending.CFGParameter.Payload.Value.Uint64 uint64Info = paramInfo.getPayload().getValue()
						.getUint64();
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint64 uint64 = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint64();
				uint64.getValue().addAll(uint64Info.getValue());
				payload.setUint64(uint64);

			}
			if (paramInfo.getPayload().getValue().getUint8() != null) {

				AddTransition.Sending.CFGParameter.Payload.Value.Uint8 uint8Info = paramInfo.getPayload().getValue()
						.getUint8();
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint8 uint8 = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint8();
				uint8.getValue().addAll(uint8Info.getValue());
				payload.setUint8(uint8);

			}

		}

		if (paramInfo.getPayload().getVariable() != null) {

			Object payloadO = environment.getFromEnvironment(env,
					paramInfo.getPayload().getVariable().getVariablenname());

			short dataTypeForParameter = 0;

			try {
				dataTypeForParameter = dcpWrapper.getDataTypeFromVr(param.getTargetVr());
			} catch (Exception e) {
				e.printStackTrace();
			}

			if (dataTypeForParameter == DataTypeList.float32) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float32 float32 = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float32();
				float32.getValue().add((float) payloadO);
				payload.setFloat32(float32);
			}
			if (dataTypeForParameter == DataTypeList.float64) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float64 float64 = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Float64();
				float64.getValue().add((double) payloadO);
				payload.setFloat64(float64);

			}
			if (dataTypeForParameter == DataTypeList.int16) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int16 int16 = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int16();
				int16.getValue().add((short) payloadO);
				payload.setInt16(int16);

			}
			if (dataTypeForParameter == DataTypeList.int32) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int32 int32 = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int32();
				int32.getValue().add((int) payloadO);
				payload.setInt32(int32);
			}
			if (dataTypeForParameter == DataTypeList.int64) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int64 int64 = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int64();
				int64.getValue().add((long) payloadO);
				payload.setInt64(int64);
			}
			if (dataTypeForParameter == DataTypeList.int8) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Int8 int8 = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload()
						.getInt8();
				int8.getValue().add((byte) payloadO);
				payload.setInt8(int8);

			}
			if (dataTypeForParameter == DataTypeList.string) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.String s = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.String();
				s.setValue((String) payloadO);
				payload.setString(s);
			}
			if (dataTypeForParameter == DataTypeList.uint16) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint16 uint16 = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint16();
				uint16.getValue().add((int) payloadO);
				payload.setUint16(uint16);
			}
			if (dataTypeForParameter == DataTypeList.uint32) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint32 uint32 = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint32();
				uint32.getValue().add((long) payloadO);
				payload.setUint32(uint32);

			}
			if (dataTypeForParameter == DataTypeList.uint64) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint64 uint64 = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint64();
				uint64.getValue().add(new BigInteger((String) payloadO));
				payload.setUint64(uint64);

			}
			if (dataTypeForParameter == DataTypeList.uint8) {
				DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint8 uint8 = new DcpTestProcedure.Transition.Sending.CFGParameter.Payload.Uint8();
				uint8.getValue().add((short) payloadO);
				payload.setUint8(uint8);
			}

		}

		param.setPayload(payload);

		send.setCFGParameter(param);

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Sending CFG_SET_CONFIG_TUNABLE_PARAMETER
	 * Message according to the passed Informations
	 * 
	 * 
	 * @param cfgparamInfo - the AddTransition node from the expansion file
	 *                     specifying the values that should be used in the
	 *                     transition to be created
	 * @param clockTime    - the ClockTime Information Object that should be
	 *                     included in the sending transition to be created
	 * @param dcpWrapper   - the dcp slave description
	 * @param environment  - the javascript engine Environment
	 * @param env          - the map used to hold local variables and their values
	 *                     during the expanding process
	 * @param fromNode     - the starting node number of the transition
	 * @param toNode       - the ending node number to which the transition leads
	 * @return the Transition object with the CFG_SET_CONFIG_TUNABLE_PARAMETER
	 *         Message
	 */

	public static Transition createSendingCFGSetConfigTunableParameter(
			AddTransition.Sending.CFGTunableParameter cfgparamInfo, Transition.Sending.ClockTime clockTime,
			DcpWrapper dcpWrapper, Environment environment, Map<String, Object> env, long fromNode, long toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		CFGTunableParameter param = new CFGTunableParameter();
		param.setReceiver(cfgparamInfo.getReceiver().getValue().getValue());

		int randValueReference = dcpWrapper.getRandomTunableParamVr();

		int invalidValueReference = dcpWrapper.getInvalidParamVr();

		if (cfgparamInfo.getParamId().getInvalid() != null) {
			param.setParamId(-1);
		}

		if (cfgparamInfo.getParamId().getRandom() != null) {
			param.setParamId(0);
		}

		if (cfgparamInfo.getParamId().getValue() != null) {
			param.setParamId(cfgparamInfo.getParamId().getValue().getValue());
		}

		if (cfgparamInfo.getParamId().getVariable() != null) {

			Object paramO = environment.getFromEnvironment(env,
					cfgparamInfo.getParamId().getVariable().getVariablenname());

			if (paramO instanceof Integer) {

				param.setParamId(((Integer) paramO).shortValue());
			}

			if (paramO instanceof Long) {

				param.setParamId(((Long) paramO).shortValue());
			}

			if (paramO instanceof Short) {

				param.setParamId(((Short) paramO).shortValue());
			}

		}

		if (cfgparamInfo.getPos().getInvalid() != null || cfgparamInfo.getPos().getRandom() != null) {

			param.setPos(0);
		}

		if (cfgparamInfo.getPos().getValue() != null) {

			param.setPos(cfgparamInfo.getPos().getValue().getValue());

		}

		if (cfgparamInfo.getPos().getVariable() != null) {

			Object posO = environment.getFromEnvironment(env, cfgparamInfo.getPos().getVariable().getVariablenname());

			if (posO instanceof Integer) {

				param.setPos(((Integer) posO).shortValue());
			}

			if (posO instanceof Long) {

				param.setPos(((Long) posO).shortValue());
			}

			if (posO instanceof Short) {

				param.setPos(((Short) posO).shortValue());
			}

		}

		if (cfgparamInfo.getTargetVr().getInvalid() != null) {

			param.setTargetVr(invalidValueReference);

		}

		if (cfgparamInfo.getTargetVr().getRandom() != null) {

			param.setTargetVr(dcpWrapper.getRandomTunableParamVr());
		}

		if (cfgparamInfo.getTargetVr().getValue() != null) {

			param.setTargetVr(cfgparamInfo.getTargetVr().getValue().getValue().intValue());

		}

		if (cfgparamInfo.getTargetVr().getVariable() != null) {

			Object vrO = environment.getFromEnvironment(env,
					cfgparamInfo.getTargetVr().getVariable().getVariablenname());

			if (vrO instanceof Integer) {

				param.setTargetVr(((Integer) vrO).shortValue());
			}

			if (vrO instanceof Long) {

				param.setTargetVr(((Long) vrO).shortValue());
			}

			if (vrO instanceof Short) {

				param.setTargetVr(((Short) vrO).shortValue());
			}

		}

		if (cfgparamInfo.getSourceDataType().getRandom() != null) {

			try {
				param.setSourceDataType(dcpWrapper.getDataTypeFromVr(randValueReference));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		if (cfgparamInfo.getSourceDataType().getValue() != null) {

			param.setSourceDataType(cfgparamInfo.getSourceDataType().getValue().getValue());
		}

		if (cfgparamInfo.getSourceDataType().getInvalid() != null) {

			try {
				param.setSourceDataType(dcpWrapper.getInvalidDataTypeFromVr(param.getTargetVr()));
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		if (cfgparamInfo.getSourceDataType().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env,
					cfgparamInfo.getSourceDataType().getVariable().getVariablenname());

			if (dataO instanceof Integer) {

				param.setSourceDataType(((Integer) dataO).shortValue());
			}

			if (dataO instanceof Long) {

				param.setSourceDataType(((Long) dataO).shortValue());
			}

			if (dataO instanceof Short) {

				param.setSourceDataType(((Short) dataO).shortValue());
			}

		}

		send.setCFGTunableParameter(param);

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	public static Transition createSendingCFGSetParamNetworkInformation(CFGParamNetworkInformation paramInfo,
			dcpTestProcedure.DcpTestProcedure.Transition.Sending.ClockTime clockTime, DcpWrapper dcpWrapper,
			Environment environment, Map<String, Object> env, int fromNode, int toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.CFGParamNetworkInformation param = new Transition.Sending.CFGParamNetworkInformation();

		if (paramInfo.getReceiver().getInvalid() != null) {

			param.setReceiver((short) 0);

		}

		if (paramInfo.getReceiver().getRandom() != null) {

			param.setReceiver((short) 1);

		}

		if (paramInfo.getReceiver().getValue() != null) {

			param.setReceiver(paramInfo.getReceiver().getValue().getValue());

		}

		if (paramInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, paramInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {

				param.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {

				param.setReceiver(((Long) recO).shortValue());
			}

			if (recO instanceof Short) {

				param.setReceiver(((Short) recO).shortValue());
			}

		}

		if (paramInfo.getParamId().getInvalid() != null) {

			param.setParamId(-1);
		}

		if (paramInfo.getParamId().getRandom() != null) {
			param.setParamId(1);
		}

		if (paramInfo.getParamId().getValue() != null) {
			param.setParamId(paramInfo.getParamId().getValue().getValue());
		}

		if (paramInfo.getParamId().getVariable() != null) {

			Object paramO = environment.getFromEnvironment(env,
					paramInfo.getParamId().getVariable().getVariablenname());

			if (paramO instanceof Integer) {

				param.setParamId(((Integer) paramO).shortValue());
			}

			if (paramO instanceof Long) {

				param.setParamId(((Long) paramO).shortValue());
			}

			if (paramO instanceof Short) {

				param.setParamId(((Short) paramO).shortValue());
			}

		}

		if (paramInfo.getTransportProtocol().getInvalid() != null) {
			param.setTransportProtocol((short) 9);
		}
		if (paramInfo.getTransportProtocol().getRandom() != null) {

			param.setTransportProtocol((short) 0);

		}

		if (paramInfo.getTransportProtocol().getVariable() != null) {

			Object protoO = environment.getFromEnvironment(env,
					paramInfo.getTransportProtocol().getVariable().getVariablenname());

			if (protoO instanceof Integer) {

				param.setTransportProtocol(((Integer) protoO).shortValue());
			}

			if (protoO instanceof Long) {

				param.setTransportProtocol(((Long) protoO).shortValue());
			}

			if (protoO instanceof Short) {

				param.setTransportProtocol(((Short) protoO).shortValue());
			}

		}

		if (paramInfo.getTransportProtocol().getValue() != null) {
			param.setTransportProtocol(paramInfo.getTransportProtocol().getValue().getValue());
		}

		send.setCFGParamNetworkInformation(param);

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	public static Transition createSendingCFGSetParamNetworkInformationBluetooth(
			CFGParamNetworkInformationBluetooth blueInfo,
			dcpTestProcedure.DcpTestProcedure.Transition.Sending.ClockTime clockTime, DcpWrapper dcpWrapper,
			Environment environment, Map<String, Object> env, int fromNode, int toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.CFGParamNetworkInformationBluetooth blue = new Transition.Sending.CFGParamNetworkInformationBluetooth();

		if (blueInfo.getBdAddr().getInvalid() != null) {
			blue.setBdAddr(new BigInteger("00:11:22:33:FF:EE"));
		}

		if (blueInfo.getBdAddr().getRandom() != null) {
			blue.setBdAddr(new BigInteger("00:11:22:33:FF:EE"));
		}

		if (blueInfo.getBdAddr().getValue() != null) {
			blue.setBdAddr(blueInfo.getBdAddr().getValue().getValue());
		}

		if (blueInfo.getBdAddr().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env, blueInfo.getDataId().getVariable().getVariablenname());

			if (dataO instanceof Integer) {
				blue.setBdAddr(new BigInteger(((Integer) dataO).toString()));
			}

			if (dataO instanceof Long) {
				blue.setBdAddr(new BigInteger(((Long) dataO).toString()));
			}

			if (dataO instanceof Short) {
				blue.setBdAddr(new BigInteger(((Short) dataO).toString()));

			}

			if (dataO instanceof String) {
				blue.setBdAddr(new BigInteger((String) dataO));

			}

			if (dataO instanceof BigInteger) {

				blue.setBdAddr((BigInteger) dataO);
			}

		}

		if (blueInfo.getDataId().getInvalid() != null) {

			blue.setDataId(
					((Integer) environment.getFromEnvironment(env, "dataId(" + dcpWrapper.getRandomOutputVr() + ");"))
							.shortValue());
		}

		if (blueInfo.getDataId().getRandom() != null) {

			blue.setDataId(dcpWrapper.getRandomInputVr());
		}

		if (blueInfo.getDataId().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env, blueInfo.getDataId().getVariable().getVariablenname());

			if (dataO instanceof Integer) {
				blue.setDataId(((Integer) dataO).intValue());
			}

			if (dataO instanceof Long) {
				blue.setDataId(((Long) dataO).intValue());
			}

			if (dataO instanceof Short) {
				blue.setDataId(((Short) dataO).intValue());

			}

		}

		if (blueInfo.getDataId().getValue() != null) {
			blue.setDataId(blueInfo.getDataId().getValue().getValue());
		}

		if (blueInfo.getPort().getInvalid() != null) {
			blue.setPort((short) 0);
		}

		if (blueInfo.getPort().getRandom() != null) {

			blue.setPort((short) 0);

		}

		if (blueInfo.getPort().getValue() != null) {

			blue.setPort(blueInfo.getPort().getValue().getValue());
		}

		if (blueInfo.getPort().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env, blueInfo.getPort().getVariable().getVariablenname());

			if (dataO instanceof Integer) {
				blue.setPort(((Integer) dataO).shortValue());
			}

			if (dataO instanceof Long) {
				blue.setPort(((Long) dataO).shortValue());
			}

			if (dataO instanceof Short) {
				blue.setPort(((Short) dataO));

			}

		}

		if (blueInfo.getReceiver().getInvalid() != null) {

			blue.setReceiver((short) 0);

		}

		if (blueInfo.getReceiver().getRandom() != null) {
			blue.setReceiver((short) 1);
		}

		if (blueInfo.getReceiver().getValue() != null) {

			blue.setReceiver(blueInfo.getReceiver().getValue().getValue());
		}

		if (blueInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, blueInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {
				blue.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {
				blue.setReceiver(((Long) recO).shortValue());

			}

			if (recO instanceof Short) {

				blue.setReceiver(((Short) recO).shortValue());

			}

		}

		if (blueInfo.getTransportProtocol().getInvalid() != null) {
			blue.setTransportProtocol((short) 0);
		}

		if (blueInfo.getTransportProtocol().getRandom() != null) {
			blue.setTransportProtocol((short) 0);
		}

		if (blueInfo.getTransportProtocol().getValue() != null) {
			blue.setTransportProtocol(blueInfo.getTransportProtocol().getValue().getValue());
		}

		if (blueInfo.getTransportProtocol().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env,
					blueInfo.getTransportProtocol().getVariable().getVariablenname());

			if (recO instanceof Integer) {
				blue.setTransportProtocol(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {
				blue.setTransportProtocol(((Long) recO).shortValue());

			}

			if (recO instanceof Short) {

				blue.setTransportProtocol(((Short) recO).shortValue());

			}

		}

		send.setCFGParamNetworkInformationBluetooth(blue);

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	public static Transition createSendingCFGSetParamNetworkInformationTCPIPv4(
			CFGParamNetworkInformationTCPIPv4 tcpInfo,
			dcpTestProcedure.DcpTestProcedure.Transition.Sending.ClockTime clockTime, DcpWrapper dcpWrapper,
			Environment environment, Map<String, Object> env, int fromNode, int toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.CFGParamNetworkInformationTCPIPv4 tcp = new Transition.Sending.CFGParamNetworkInformationTCPIPv4();

		if (tcpInfo.getParamId().getInvalid() != null) {

			tcp.setParamId(-1);
		}

		if (tcpInfo.getParamId().getRandom() != null) {
			tcp.setParamId(1);
		}

		if (tcpInfo.getParamId().getValue() != null) {
			tcp.setParamId(tcpInfo.getParamId().getValue().getValue());
		}

		if (tcpInfo.getParamId().getVariable() != null) {

			Object paramO = environment.getFromEnvironment(env, tcpInfo.getParamId().getVariable().getVariablenname());

			if (paramO instanceof Integer) {

				tcp.setParamId(((Integer) paramO).shortValue());
			}

			if (paramO instanceof Long) {

				tcp.setParamId(((Long) paramO).shortValue());
			}

			if (paramO instanceof Short) {

				tcp.setParamId(((Short) paramO).shortValue());
			}

		}

		if (tcpInfo.getIpAdress().getInvalid() != null) {

			tcp.setIpAddress(0);
		}

		if (tcpInfo.getIpAdress().getRandom() != null) {
			tcp.setIpAddress(0);
		}

		if (tcpInfo.getIpAdress().getValue() != null) {
			tcp.setIpAddress(tcpInfo.getIpAdress().getValue().getValue());

		}

		if (tcpInfo.getIpAdress().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, tcpInfo.getIpAdress().getVariable().getVariablenname());

			if (recO instanceof Integer) {
				tcp.setIpAddress(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {
				tcp.setIpAddress(((Long) recO).shortValue());

			}

			if (recO instanceof Short) {

				tcp.setIpAddress(((Short) recO).shortValue());

			}

		}

		if (tcpInfo.getPort().getInvalid() != null) {
			tcp.setPort((short) 0);
		}

		if (tcpInfo.getPort().getRandom() != null) {

			tcp.setPort((short) 0);

		}

		if (tcpInfo.getPort().getValue() != null) {

			tcp.setPort(tcpInfo.getPort().getValue().getValue());
		}

		if (tcpInfo.getPort().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env, tcpInfo.getPort().getVariable().getVariablenname());

			if (dataO instanceof Integer) {
				tcp.setPort(((Integer) dataO).shortValue());
			}

			if (dataO instanceof Long) {
				tcp.setPort(((Long) dataO).shortValue());
			}

			if (dataO instanceof Short) {
				tcp.setPort(((Short) dataO));

			}

		}

		if (tcpInfo.getReceiver().getInvalid() != null) {

			tcp.setReceiver((short) 0);

		}

		if (tcpInfo.getReceiver().getRandom() != null) {
			tcp.setReceiver((short) 1);
		}

		if (tcpInfo.getReceiver().getValue() != null) {

			tcp.setReceiver(tcpInfo.getReceiver().getValue().getValue());
		}

		if (tcpInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, tcpInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {
				tcp.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {
				tcp.setReceiver(((Long) recO).shortValue());

			}

			if (recO instanceof Short) {

				tcp.setReceiver(((Short) recO).shortValue());

			}

		}

		if (tcpInfo.getTransportProtocol().getInvalid() != null) {
			tcp.setTransportProtocol((short) 0);
		}

		if (tcpInfo.getTransportProtocol().getRandom() != null) {
			tcp.setTransportProtocol((short) 0);
		}

		if (tcpInfo.getTransportProtocol().getValue() != null) {
			tcp.setTransportProtocol(tcpInfo.getTransportProtocol().getValue().getValue());
		}

		if (tcpInfo.getTransportProtocol().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env,
					tcpInfo.getTransportProtocol().getVariable().getVariablenname());

			if (recO instanceof Integer) {
				tcp.setTransportProtocol(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {
				tcp.setTransportProtocol(((Long) recO).shortValue());

			}

			if (recO instanceof Short) {

				tcp.setTransportProtocol(((Short) recO).shortValue());

			}

		}
		
		if (tcpInfo.getIpAdress().getInvalid() != null) {

			tcp.setIpAddress(0);

		}

		if (tcpInfo.getIpAdress().getValue() != null) {

			tcp.setIpAddress(tcpInfo.getIpAdress().getValue().getValue());

		}

		if (tcpInfo.getIpAdress().getVariable() != null) {

			Object ipO = environment.getFromEnvironment(env, tcpInfo.getIpAdress().getVariable().getVariablenname());

			if (ipO instanceof Double) {

				tcp.setIpAddress(((Double) ipO).intValue());

			}

			if (ipO instanceof Integer) {

				tcp.setIpAddress(((Integer) ipO).intValue());

			}

			if (ipO instanceof Long) {
				tcp.setIpAddress(((Long) ipO).intValue());

			}

			if (ipO instanceof Short) {
				tcp.setIpAddress(((Short) ipO).intValue());

			}

		}

		if (tcpInfo.getIpAdress().getRandom() != null) {

			tcp.setIpAddress(dcpWrapper.getTcpParameterIp());
		}

		if (tcpInfo.getPort().getVariable() != null) {

			Object portO = environment.getFromEnvironment(env, tcpInfo.getPort().getVariable().getVariablenname());

			if (portO instanceof Integer) {

				tcp.setPort(((Integer) portO).intValue());
			}

			if (portO instanceof Long) {

				tcp.setPort(((Long) portO).intValue());
			}

			if (portO instanceof Short) {

				tcp.setPort(((Short) portO).intValue());
			}

		}

		if (tcpInfo.getPort().getRandom() != null) {

			tcp.setPort(dcpWrapper.getTcpParameterPort());

		}

		if (tcpInfo.getPort().getInvalid() != null) {
			tcp.setPort(0);
		}

		if (tcpInfo.getPort().getValue() != null) {
			tcp.setPort(tcpInfo.getPort().getValue().getValue());
		}

		send.setCFGParamNetworkInformationTCPIPv4(tcp);

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	public static Transition createSendingCFGSetParamNetworkInformationUSB(CFGParamNetworkInformationUSB usbInfo,
			dcpTestProcedure.DcpTestProcedure.Transition.Sending.ClockTime clockTime, DcpWrapper dcpWrapper,
			Environment environment, Map<String, Object> env, int fromNode, int toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.CFGParamNetworkInformationUSB usb = new Transition.Sending.CFGParamNetworkInformationUSB();

		if (usbInfo.getDataId().getInvalid() != null) {

			usb.setDataId(
					((Integer) environment.getFromEnvironment(env, "dataId(" + dcpWrapper.getRandomOutputVr() + ");"))
							.shortValue());
		}

		if (usbInfo.getDataId().getRandom() != null) {

			usb.setDataId(dcpWrapper.getRandomInputVr());
		}

		if (usbInfo.getDataId().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env, usbInfo.getDataId().getVariable().getVariablenname());

			if (dataO instanceof Integer) {
				usb.setDataId(((Integer) dataO).intValue());
			}

			if (dataO instanceof Long) {
				usb.setDataId(((Long) dataO).intValue());
			}

			if (dataO instanceof Short) {
				usb.setDataId(((Short) dataO).intValue());

			}

		}

		if (usbInfo.getDataId().getValue() != null) {
			usb.setDataId(usbInfo.getDataId().getValue().getValue());
		}

		usbInfo.getEndpointAddress();

		if (usbInfo.getEndpointAddress().getInvalid() != null) {
			usb.setEndpointAddress((short) 0);
		}

		if (usbInfo.getEndpointAddress().getRandom() != null) {
			usb.setEndpointAddress((short) 0);
		}

		if (usbInfo.getEndpointAddress().getValue() != null) {
			usb.setEndpointAddress(usbInfo.getEndpointAddress().getValue().getValue());
		}

		if (usbInfo.getEndpointAddress().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env,
					usbInfo.getEndpointAddress().getVariable().getVariablenname());

			if (dataO instanceof Integer) {
				usb.setEndpointAddress(((Integer) dataO).shortValue());
			}

			if (dataO instanceof Long) {
				usb.setEndpointAddress(((Long) dataO).shortValue());
			}

			if (dataO instanceof Short) {
				usb.setEndpointAddress(((Short) dataO).shortValue());

			}

		}

		if (usbInfo.getReceiver().getInvalid() != null) {

			usb.setReceiver((short) 0);

		}

		if (usbInfo.getReceiver().getRandom() != null) {
			usb.setReceiver((short) 1);
		}

		if (usbInfo.getReceiver().getValue() != null) {

			usb.setReceiver(usbInfo.getReceiver().getValue().getValue());
		}

		if (usbInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, usbInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {
				usb.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {
				usb.setReceiver(((Long) recO).shortValue());

			}

			if (recO instanceof Short) {

				usb.setReceiver(((Short) recO).shortValue());

			}

		}

		if (usbInfo.getTransportProtocol().getInvalid() != null) {
			usb.setTransportProtocol((short) 0);
		}

		if (usbInfo.getTransportProtocol().getRandom() != null) {
			usb.setTransportProtocol((short) 0);
		}

		if (usbInfo.getTransportProtocol().getValue() != null) {
			usb.setTransportProtocol(usbInfo.getTransportProtocol().getValue().getValue());
		}

		if (usbInfo.getTransportProtocol().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env,
					usbInfo.getTransportProtocol().getVariable().getVariablenname());

			if (recO instanceof Integer) {
				usb.setTransportProtocol(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {
				usb.setTransportProtocol(((Long) recO).shortValue());

			}

			if (recO instanceof Short) {

				usb.setTransportProtocol(((Short) recO).shortValue());

			}

		}

		send.setCFGParamNetworkInformationUSB(usb);

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Sending
	 * CFG_SET_PARAM_NETWORK_INFORMATION_UDP Message according to the passed
	 * Informations
	 * 
	 * 
	 * @param udpInfo     - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param dcpWrapper  - the dcp slave description
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the CFG_SET_PARAM_NETWORK_INFORMATION_UDP
	 *         Message
	 */

	public static Transition createSendingCFGSetParamNetworkInformationUDP(
			AddTransition.Sending.CFGParamNetworkInformationUDPIPv4 udpInfo, Transition.Sending.ClockTime clockTime,
			DcpWrapper dcpWrapper, Environment environment, Map<String, Object> env, long fromNode, long toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.CFGParamNetworkInformationUDPIPv4 udp = new Transition.Sending.CFGParamNetworkInformationUDPIPv4();

		if (udpInfo.getReceiver().getInvalid() != null) {

			udp.setReceiver((short) 0);

		}

		if (udpInfo.getReceiver().getRandom() != null) {

			udp.setReceiver((short) 1);

		}

		if (udpInfo.getReceiver().getValue() != null) {

			udp.setReceiver(udpInfo.getReceiver().getValue().getValue());

		}

		if (udpInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, udpInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {

				udp.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {

				udp.setReceiver(((Long) recO).shortValue());
			}

			if (recO instanceof Short) {

				udp.setReceiver(((Short) recO).shortValue());
			}

		}

		if (udpInfo.getParamId().getInvalid() != null) {

			udp.setParamId(-1);
		}

		if (udpInfo.getParamId().getRandom() != null) {
			udp.setParamId(1);
		}

		if (udpInfo.getParamId().getValue() != null) {
			udp.setParamId(udpInfo.getParamId().getValue().getValue());
		}

		if (udpInfo.getParamId().getVariable() != null) {

			Object paramO = environment.getFromEnvironment(env, udpInfo.getParamId().getVariable().getVariablenname());

			if (paramO instanceof Integer) {

				udp.setParamId(((Integer) paramO).shortValue());
			}

			if (paramO instanceof Long) {

				udp.setParamId(((Long) paramO).shortValue());
			}

			if (paramO instanceof Short) {

				udp.setParamId(((Short) paramO).shortValue());
			}

		}

		if (udpInfo.getTransportProtocol().getInvalid() != null) {
			udp.setTransportProtocol((short) 9);
		}
		if (udpInfo.getTransportProtocol().getRandom() != null) {

			udp.setTransportProtocol((short) 0);

		}

		if (udpInfo.getTransportProtocol().getVariable() != null) {

			Object protoO = environment.getFromEnvironment(env,
					udpInfo.getTransportProtocol().getVariable().getVariablenname());

			if (protoO instanceof Integer) {

				udp.setTransportProtocol(((Integer) protoO).shortValue());
			}

			if (protoO instanceof Long) {

				udp.setTransportProtocol(((Long) protoO).shortValue());
			}

			if (protoO instanceof Short) {

				udp.setTransportProtocol(((Short) protoO).shortValue());
			}

		}

		if (udpInfo.getTransportProtocol().getValue() != null) {
			udp.setTransportProtocol(udpInfo.getTransportProtocol().getValue().getValue());
		}

		if (udpInfo.getIpAdress().getInvalid() != null) {

			udp.setIpAddress(0);
		}

		if (udpInfo.getIpAdress().getValue() != null) {

			udp.setIpAddress(udpInfo.getIpAdress().getValue().getValue());

		}

		if (udpInfo.getIpAdress().getVariable() != null) {

			Object ipO = environment.getFromEnvironment(env, udpInfo.getIpAdress().getVariable().getVariablenname());

			if (ipO instanceof Integer) {

				udp.setIpAddress(((Integer) ipO).shortValue());
			}

			if (ipO instanceof Long) {

				udp.setIpAddress(((Long) ipO).shortValue());
			}

			if (ipO instanceof Short) {

				udp.setIpAddress(((Short) ipO).shortValue());
			}

		}

		if (udpInfo.getIpAdress().getRandom() != null) {

			udp.setIpAddress(dcpWrapper.getUdpParameterIp());

		}

		if (udpInfo.getPort().getInvalid() != null) {

			udp.setPort(0);
		}

		if (udpInfo.getPort().getValue() != null) {

			udp.setPort(udpInfo.getPort().getValue().getValue());

		}

		if (udpInfo.getPort().getVariable() != null) {

			Object portO = environment.getFromEnvironment(env, udpInfo.getPort().getVariable().getVariablenname());

			if (portO instanceof Integer) {

				udp.setPort(((Integer) portO).shortValue());
			}

			if (portO instanceof Long) {

				udp.setPort(((Long) portO).shortValue());
			}

			if (portO instanceof Short) {

				udp.setPort(((Short) portO).shortValue());
			}

		}

		if (udpInfo.getPort().getRandom() != null) {

			udp.setPort(dcpWrapper.getUdpParameterPort());
		}

		//

		send.setCFGParamNetworkInformationUDPIPv4(udp);

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Sending CFG_SET_LOGGING Message according
	 * to the passed Informations
	 * 
	 * 
	 * @param logInfo     - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the CFG_SET_LOGGING Message
	 */

	public static Transition createSendingCFGSetLogging(AddTransition.Sending.CFGLogging logInfo,
			Environment environment, Map<String, Object> env, long fromNode, long toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.CFGLogging log = new Transition.Sending.CFGLogging();

		if (logInfo.getLogCategory().getInvalid() != null) {

			// LogCategory cannot be invalid 0-255 log valid categories numbers
			// for byte
			log.setLogCategory((short) 0);

		}

		if (logInfo.getLogCategory().getRandom() != null) {
			log.setLogCategory((short) 0);
		}

		if (logInfo.getLogCategory().getValue() != null) {

			log.setLogCategory(logInfo.getLogCategory().getValue().getValue());

		}

		if (logInfo.getLogCategory().getVariable() != null) {

			Object cO = environment.getFromEnvironment(env, logInfo.getLogCategory().getVariable().getVariablenname());

			if (cO instanceof Integer) {

				log.setLogCategory(((Integer) cO).shortValue());
			}

			if (cO instanceof Long) {

				log.setLogCategory(((Long) cO).shortValue());
			}

			if (cO instanceof Short) {

				log.setLogCategory(((Short) cO).shortValue());
			}

		}

		if (logInfo.getLogLevel().getInvalid() != null) {

			log.setLogLevel(LogLevelList.Unused);

		}

		if (logInfo.getLogLevel().getRandom() != null) {

			log.setLogLevel((short) 0);

		}

		if (logInfo.getLogLevel().getValue() != null) {

			log.setLogLevel(logInfo.getLogLevel().getValue().getValue());
		}

		if (logInfo.getLogLevel().getVariable() != null) {

			Object levelO = environment.getFromEnvironment(env, logInfo.getLogLevel().getVariable().getVariablenname());

			if (levelO instanceof Integer) {

				log.setLogLevel(((Integer) levelO).shortValue());
			}

			if (levelO instanceof Long) {

				log.setLogLevel(((Long) levelO).shortValue());
			}

			if (levelO instanceof Short) {

				log.setLogLevel(((Short) levelO).shortValue());
			}

		}

		if (logInfo.getLogMode().getInvalid() != null) {

			log.setLogMode((short) 0);
		}

		if (logInfo.getLogMode().getRandom() != null) {

			log.setLogMode((short) 0);

		}

		if (logInfo.getLogMode().getValue() != null) {

			log.setLogMode(logInfo.getLogMode().getValue().getValue());

		}

		if (logInfo.getLogMode().getVariable() != null) {

			Object modeO = environment.getFromEnvironment(env, logInfo.getLogMode().getVariable().getVariablenname());

			if (modeO instanceof Integer) {

				log.setLogMode(((Integer) modeO).shortValue());
			}

			if (modeO instanceof Long) {

				log.setLogMode(((Long) modeO).shortValue());
			}

			if (modeO instanceof Short) {

				log.setLogMode(((Short) modeO).shortValue());
			}

		}

		if (logInfo.getReceiver().getInvalid() != null) {

			log.setReceiver((short) 0);

		}

		if (logInfo.getReceiver().getRandom() != null) {

			log.setReceiver((short) 1);

		}

		if (logInfo.getReceiver().getValue() != null) {

			log.setReceiver(logInfo.getReceiver().getValue().getValue());

		}

		if (logInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, logInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {

				log.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {

				log.setReceiver(((Long) recO).shortValue());
			}

			if (recO instanceof Short) {

				log.setReceiver(((Short) recO).shortValue());
			}

		}

		send.setCFGLogging(log);
		trans.setSending(send);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Sending CFG_SET_LOG_CLEAR Message according
	 * to the passed Informations
	 * 
	 * 
	 * @param cInfo       - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param dcpWrapper  - the dcp slave description
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the CFG_SET_LOG_CLEAR Message
	 */
	/*
	 * public static Transition
	 * createSendingCFGSetLogClear(AddTransition.Sending.CFGLogClear cInfo,
	 * Environment environment, Map<String, Object> env, long fromNode, long toNode)
	 * {
	 * 
	 * Transition trans = new Transition(); Transition.Sending send = new
	 * Transition.Sending(); Transition.Sending.CFGLogClear clear = new
	 * Transition.Sending.CFGLogClear();
	 * 
	 * if (cInfo.getReceiver().getInvalid() != null) {
	 * 
	 * clear.setReceiver((short) 0); }
	 * 
	 * if (cInfo.getReceiver().getRandom() != null) {
	 * 
	 * clear.setReceiver((short) 1);
	 * 
	 * }
	 * 
	 * if (cInfo.getReceiver().getValue() != null) {
	 * 
	 * clear.setReceiver(cInfo.getReceiver().getValue().getValue());
	 * 
	 * }
	 * 
	 * if (cInfo.getReceiver().getVariable() != null) {
	 * 
	 * Object recO = environment.getFromEnvironment(env,
	 * cInfo.getReceiver().getVariable().getVariablenname());
	 * 
	 * if (recO instanceof Integer) {
	 * 
	 * clear.setReceiver(((Integer) recO).shortValue()); }
	 * 
	 * if (recO instanceof Long) {
	 * 
	 * clear.setReceiver(((Long) recO).shortValue()); }
	 * 
	 * if (recO instanceof Short) {
	 * 
	 * clear.setReceiver(((Short) recO).shortValue()); }
	 * 
	 * }
	 * 
	 * send.setCFGSetLogClear(clear); trans.setSending(send);
	 * 
	 * trans.setFrom(fromNode); trans.setTo(toNode);
	 * 
	 * return trans;
	 * 
	 * }
	 */

	/**
	 * Create a Transition Object with a Sending STC_REGISTER Message according to
	 * the passed Informations
	 * 
	 * 
	 * @param registerInfo - the AddTransition node from the expansion file
	 *                     specifying the values that should be used in the
	 *                     transition to be created
	 * @param clockTime    - the ClockTime Information Object that should be
	 *                     included in the sending transition to be created
	 * @param dcpWrapper   - the dcp slave description
	 * @param environment  - the javascript engine Environment
	 * @param env          - the map used to hold local variables and their values
	 *                     during the expanding process
	 * @param fromNode     - the starting node number of the transition
	 * @param toNode       - the ending node number to which the transition leads
	 * @return the Transition object with the STC_REGISTER Message
	 */

	public static Transition createSendingSTCRegister(AddTransition.Sending.STCRegister registerInfo,
			Transition.Sending.ClockTime clockTime, DcpWrapper dcpWrapper, Environment environment,
			Map<String, Object> env, long fromNode, long toNode) {

		Transition trans = new Transition();

		Transition.Sending sending = new Transition.Sending();

		Transition.Sending.STCRegister register = new Transition.Sending.STCRegister();

		if (registerInfo.getOpMode().getInvalid() != null) {
			register.setOpMode(dcpWrapper.getInvalidOpMode());
		}

		if (registerInfo.getOpMode().getRandom() != null) {
			register.setOpMode(dcpWrapper.getRandomOpMode());
		}

		if (registerInfo.getOpMode().getValue() != null) {
			register.setOpMode(registerInfo.getOpMode().getValue().getValue());
		}

		if (registerInfo.getOpMode().getVariable() != null) {

			Object opO = environment.getFromEnvironment(env, registerInfo.getOpMode().getVariable().getVariablenname());

			if (opO instanceof Integer) {

				register.setOpMode(((Integer) opO).shortValue());
			}

			if (opO instanceof Long) {

				register.setOpMode(((Long) opO).shortValue());
			}

			if (opO instanceof Short) {

				register.setOpMode(((Short) opO).shortValue());
			}

		}

		if (registerInfo.getReceiver().getInvalid() != null) {

			register.setReceiver((short) 0);
		}

		if (registerInfo.getReceiver().getRandom() != null) {

			register.setReceiver((short) 1);
		}

		if (registerInfo.getReceiver().getValue() != null) {
			register.setReceiver(registerInfo.getReceiver().getValue().getValue());
		}

		if (registerInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env,
					registerInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {

				register.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {

				register.setReceiver(((Long) recO).shortValue());
			}

			if (recO instanceof Short) {

				register.setReceiver(((Short) recO).shortValue());
			}

		}

		if (registerInfo.getSlaveUUID().getInvalid() != null) {

			register.setSlaveUuid(dcpWrapper.getInvalidSlaveUuid());

		}

		if (registerInfo.getSlaveUUID().getRandom() != null) {
			register.setSlaveUuid(dcpWrapper.getRandomSlaveUuid());

		}

		if (registerInfo.getSlaveUUID().getValue() != null) {

			register.setSlaveUuid((registerInfo.getSlaveUUID().getValue().getValue()));

		}
		if (registerInfo.getSlaveUUID().getVariable() != null) {
			register.setSlaveUuid((String) environment.getFromEnvironment(env,
					registerInfo.getSlaveUUID().getVariable().getVariablenname()));

		}

		if (registerInfo.getStateId().getInvalid() != null) {

			register.setStateId((short) 99);
		}

		if (registerInfo.getStateId().getRandom() != null) {

			register.setStateId((short) 0);
		}

		if (registerInfo.getStateId().getValue() != null) {
			register.setStateId(registerInfo.getStateId().getValue().getValue());
		}

		if (registerInfo.getStateId().getVariable() != null) {

			Object stateO = environment.getFromEnvironment(env,
					registerInfo.getStateId().getVariable().getVariablenname());

			if (stateO instanceof Integer) {

				register.setStateId(((Integer) stateO).shortValue());
			}

			if (stateO instanceof Long) {

				register.setStateId(((Long) stateO).shortValue());
			}

			if (stateO instanceof Short) {

				register.setStateId(((Short) stateO).shortValue());
			}

		}

		if (registerInfo.getMinorVersion() != null) {

			if (registerInfo.getMinorVersion().getValue() != null) {
				register.setMinorVersion(registerInfo.getMinorVersion().getValue().getValue());

			}

			if (registerInfo.getMinorVersion().getRandom() != null) {
				register.setMinorVersion(dcpWrapper.getMinorVersion());

			}

			if (registerInfo.getMinorVersion().getInvalid() != null) {

				register.setMinorVersion((short) (dcpWrapper.getMinorVersion() + 1));

			}

			if (registerInfo.getMinorVersion().getVariable() != null) {

				Object minorO = environment.getFromEnvironment(env,
						registerInfo.getMinorVersion().getVariable().getVariablenname());

				if (minorO instanceof Integer) {

					register.setMinorVersion(((Integer) minorO).shortValue());
				}

				if (minorO instanceof Long) {

					register.setMinorVersion(((Long) minorO).shortValue());
				}

				if (minorO instanceof Short) {

					register.setMinorVersion(((Short) minorO).shortValue());
				}

			}

		}

		if (registerInfo.getMajorVersion() != null) {

			if (registerInfo.getMajorVersion().getValue() != null) {

				register.setMajorVersion(registerInfo.getMajorVersion().getValue().getValue());

			}

			if (registerInfo.getMajorVersion().getRandom() != null) {

				register.setMajorVersion(dcpWrapper.getMajorVersion());

			}

			if (registerInfo.getMajorVersion().getInvalid() != null) {

				register.setMajorVersion((short) (dcpWrapper.getMajorVersion() + 1));

			}

			if (registerInfo.getMajorVersion().getVariable() != null) {

				Object majorO = environment.getFromEnvironment(env,
						registerInfo.getMajorVersion().getVariable().getVariablenname());

				if (majorO instanceof Integer) {

					register.setMajorVersion(((Integer) majorO).shortValue());
				}

				if (majorO instanceof Long) {

					register.setMajorVersion(((Long) majorO).shortValue());
				}

				if (majorO instanceof Short) {

					register.setMajorVersion(((Short) majorO).shortValue());
				}

			}

		}

		sending.setSTCRegister(register);

		if (clockTime != null) {
			sending.setClockTime(clockTime);
		}

		trans.setSending(sending);

		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	public static Transition createSendingSTCPrepare(STCPrepare prepareInfo, Transition.Sending.ClockTime clockTime,
			Environment environment, Map<String, Object> env, int fromNode, int toNode) {

		Transition trans = new Transition();

		Transition.Sending sending = new Transition.Sending();

		Transition.Sending.STCPrepare prepare = new Transition.Sending.STCPrepare();

		if (prepareInfo.getReceiver() != null) {

			if (prepareInfo.getReceiver().getInvalid() != null) {

				prepare.setReceiver((short) 0);

			}

			if (prepareInfo.getReceiver().getRandom() != null) {
				prepare.setReceiver((short) 1);

			}

			if (prepareInfo.getReceiver().getValue() != null) {

				prepare.setReceiver(prepareInfo.getReceiver().getValue().getValue());

			}

			if (prepareInfo.getReceiver().getVariable() != null) {

				Object recO = environment.getFromEnvironment(env,
						prepareInfo.getReceiver().getVariable().getVariablenname());

				if (recO instanceof Integer) {

					prepare.setReceiver(((Integer) recO).shortValue());
				}

				if (recO instanceof Long) {

					prepare.setReceiver(((Long) recO).shortValue());
				}

				if (recO instanceof Short) {

					prepare.setReceiver(((Short) recO).shortValue());
				}

			}

		}

		if (prepareInfo.getStateId() != null) {

			if (prepareInfo.getStateId().getInvalid() != null) {

				prepare.setStateId((short) 99);
			}

			if (prepareInfo.getStateId().getRandom() != null) {
				prepare.setStateId((short) 1);
			}

			if (prepareInfo.getStateId().getValue() != null) {

				prepare.setStateId(prepareInfo.getStateId().getValue().getValue());

			}

			if (prepareInfo.getStateId().getVariable() != null) {

				Object stateO = environment.getFromEnvironment(env,
						prepareInfo.getStateId().getVariable().getVariablenname());

				if (stateO instanceof Integer) {

					prepare.setStateId(((Integer) stateO).shortValue());
				}

				if (stateO instanceof Long) {

					prepare.setStateId(((Long) stateO).shortValue());
				}

				if (stateO instanceof Short) {

					prepare.setStateId(((Short) stateO).shortValue());
				}

			}

		}

		sending.setSTCPrepare(prepare);

		if (clockTime != null) {
			sending.setClockTime(clockTime);
		}

		trans.setSending(sending);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;
	}

	/**
	 * Create a Transition Object with a Sending STC_UNREGISTER Message according to
	 * the passed Informations
	 * 
	 * 
	 * @param unregInfo   - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the STC_UNREGISTER Message
	 */

	public static Transition createSendingSTCUnregister(AddTransition.Sending.STCUnregister unregInfo,
			Environment environment, Map<String, Object> env, long fromNode, long toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.STCDeregister dereg = new Transition.Sending.STCDeregister();

		if (unregInfo.getReceiver().getInvalid() != null) {

			dereg.setReceiver((short) 0);

		}

		if (unregInfo.getReceiver().getRandom() != null) {

			dereg.setReceiver((short) 1);

		}

		if (unregInfo.getReceiver().getValue() != null) {

			dereg.setReceiver(unregInfo.getReceiver().getValue().getValue());

		}

		if (unregInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, unregInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {

				dereg.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {

				dereg.setReceiver(((Long) recO).shortValue());
			}

			if (recO instanceof Short) {

				dereg.setReceiver(((Short) recO).shortValue());
			}

		}

		if (unregInfo.getStateId().getInvalid() != null) {

			dereg.setStateId((short) 99);

		}

		if (unregInfo.getStateId().getRandom() != null) {
			dereg.setStateId((short) 1);
		}

		if (unregInfo.getStateId().getValue() != null) {

			dereg.setStateId(unregInfo.getStateId().getValue().getValue());

		}

		if (unregInfo.getStateId().getVariable() != null) {

			Object stateO = environment.getFromEnvironment(env,
					unregInfo.getStateId().getVariable().getVariablenname());

			if (stateO instanceof Integer) {

				dereg.setStateId(((Integer) stateO).shortValue());
			}

			if (stateO instanceof Long) {

				dereg.setStateId(((Long) stateO).shortValue());
			}

			if (stateO instanceof Short) {

				dereg.setStateId(((Short) stateO).shortValue());
			}

		}

		send.setSTCDeregister(dereg);
		trans.setSending(send);

		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Sending STC_CONFIGURE Message according to
	 * the passed Informations
	 * 
	 * 
	 * @param stcConfigureInfo - the AddTransition node from the expansion file
	 *                         specifying the values that should be used in the
	 *                         transition to be created
	 * @param clockTime        - the ClockTime Information Object that should be
	 *                         included in the sending transition to be created
	 * @param dcpWrapper       - the dcp slave description
	 * @param environment      - the javascript engine Environment
	 * @param env              - the map used to hold local variables and their
	 *                         values during the expanding process
	 * @param fromNode         - the starting node number of the transition
	 * @param toNode           - the ending node number to which the transition
	 *                         leads
	 * @return the Transition object with the STC_CONFIGURE Message
	 */

	public static Transition createSendingSTCConfigure(AddTransition.Sending.STCConfigure stcConfigureInfo,
			Transition.Sending.ClockTime clockTime, Environment environment, Map<String, Object> env, long fromNode,
			long toNode) {

		Transition trans = new Transition();

		Transition.Sending send = new Transition.Sending();

		Transition.Sending.STCConfigure config = new Transition.Sending.STCConfigure();

		if (stcConfigureInfo.getReceiver().getInvalid() != null) {

			config.setReceiver((short) 0);

		}

		if (stcConfigureInfo.getReceiver().getRandom() != null) {

			config.setReceiver((short) 1);

		}

		if (stcConfigureInfo.getReceiver().getValue() != null) {

			config.setReceiver(stcConfigureInfo.getReceiver().getValue().getValue());
		}

		if (stcConfigureInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env,
					stcConfigureInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {

				config.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {

				config.setReceiver(((Long) recO).shortValue());
			}

			if (recO instanceof Short) {

				config.setReceiver(((Short) recO).shortValue());
			}

		}

		if (stcConfigureInfo.getStateId().getInvalid() != null) {

			config.setStateId((short) 99);

		}

		if (stcConfigureInfo.getStateId().getRandom() != null) {

			config.setStateId((short) 0);
		}

		if (stcConfigureInfo.getStateId().getValue() != null) {

			config.setStateId(stcConfigureInfo.getStateId().getValue().getValue());

		}

		if (stcConfigureInfo.getStateId().getVariable() != null) {

			Object stateO = environment.getFromEnvironment(env,
					stcConfigureInfo.getStateId().getVariable().getVariablenname());

			if (stateO instanceof Integer) {

				config.setStateId(((Integer) stateO).shortValue());
			}

			if (stateO instanceof Long) {

				config.setStateId(((Long) stateO).shortValue());
			}

			if (stateO instanceof Short) {

				config.setStateId(((Short) stateO).shortValue());
			}

		}

		send.setSTCConfigure(config);

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Sending STC_INITIALIZE Message according to
	 * the passed Informations
	 * 
	 * 
	 * @param iniInfo     - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param dcpWrapper  - the dcp slave description
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the STC_INITIALIZE Message
	 */

	public static Transition createSendingSTCInitialize(AddTransition.Sending.STCInitialize iniInfo,
			Transition.Sending.ClockTime clockTime, Environment environment, Map<String, Object> env, long fromNode,
			long toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.STCInitialize ini = new Transition.Sending.STCInitialize();

		if (iniInfo.getReceiver().getInvalid() != null) {

			ini.setReceiver((short) 0);

		}

		if (iniInfo.getReceiver().getRandom() != null) {
			ini.setReceiver((short) 1);
		}

		if (iniInfo.getReceiver().getValue() != null) {

			ini.setReceiver(iniInfo.getReceiver().getValue().getValue());
		}

		if (iniInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, iniInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {

				ini.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {

				ini.setReceiver(((Long) recO).shortValue());
			}

			if (recO instanceof Short) {

				ini.setReceiver(((Short) recO).shortValue());
			}

		}

		if (iniInfo.getStateId().getInvalid() != null) {
			ini.setStateId((short) 99);
		}
		if (iniInfo.getStateId().getRandom() != null) {

			ini.setStateId((short) 0);

		}

		if (iniInfo.getStateId().getValue() != null) {
			ini.setStateId(iniInfo.getStateId().getValue().getValue());
		}

		if (iniInfo.getStateId().getVariable() != null) {

			Object stateO = environment.getFromEnvironment(env, iniInfo.getStateId().getVariable().getVariablenname());

			if (stateO instanceof Integer) {

				ini.setStateId(((Integer) stateO).shortValue());
			}

			if (stateO instanceof Long) {

				ini.setStateId(((Long) stateO).shortValue());
			}

			if (stateO instanceof Short) {

				ini.setStateId(((Short) stateO).shortValue());
			}

		}

		send.setSTCInitialize(ini);

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Sending STC_RUN Message according to the
	 * passed Informations
	 * 
	 * 
	 * @param runInfo     - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param dcpWrapper  - the dcp slave description
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the STC_RUN Message
	 */

	public static Transition createSendingSTCRun(AddTransition.Sending.STCRun runInfo,
			Transition.Sending.ClockTime clockTime, Environment environment, Map<String, Object> env, long fromNode,
			long toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.STCRun run = new Transition.Sending.STCRun();

		if (runInfo.getReceiver().getInvalid() != null) {
			run.setReceiver((short) 0);
		}

		if (runInfo.getReceiver().getRandom() != null) {

			run.setReceiver((short) 1);

		}

		if (runInfo.getReceiver().getValue() != null) {

			run.setReceiver(runInfo.getReceiver().getValue().getValue());

		}

		if (runInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, runInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {

				run.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {

				run.setReceiver(((Long) recO).shortValue());
			}

			if (recO instanceof Short) {

				run.setReceiver(((Short) recO).shortValue());
			}

		}

		if (runInfo.getStartTime().getInvalid() != null) {

			run.setStartTime(1L);

		}

		if (runInfo.getStartTime().getRandom() != null) {
			run.setStartTime(0L);
		}

		if (runInfo.getStartTime().getValue() != null) {

			run.setStartTime(runInfo.getStartTime().getValue().getValue());

		}

		if (runInfo.getStartTime().getVariable() != null) {

			Object startO = environment.getFromEnvironment(env,
					runInfo.getStartTime().getVariable().getVariablenname());

			if (startO instanceof Integer) {

				run.setStartTime(((Integer) startO).longValue());
			}

			if (startO instanceof Long) {

				run.setStartTime(((Long) startO).longValue());
			}

			if (startO instanceof Short) {

				run.setStartTime(((Short) startO).longValue());
			}

		}

		if (runInfo.getStateId().getInvalid() != null) {

			run.setStateId((short) 99);

		}

		if (runInfo.getStateId().getRandom() != null) {
			run.setStateId((short) 0);
		}

		if (runInfo.getStateId().getValue() != null) {

			run.setStateId(runInfo.getStateId().getValue().getValue());

		}

		if (runInfo.getStateId().getVariable() != null) {

			Object stateO = environment.getFromEnvironment(env, runInfo.getStateId().getVariable().getVariablenname());

			if (stateO instanceof Integer) {

				run.setStateId(((Integer) stateO).shortValue());
			}

			if (stateO instanceof Long) {

				run.setStateId(((Long) stateO).shortValue());
			}

			if (stateO instanceof Short) {

				run.setStateId(((Short) stateO).shortValue());
			}

		}

		send.setSTCRun(run);

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);

		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Sending STC_REINITIALIZE Message according
	 * to the passed Informations
	 * 
	 * 
	 * @param reInfo      - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param dcpWrapper  - the dcp slave description
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the STC_REINITIALIZE Message
	 */
	/*
	 * public static Transition
	 * createSendingSTCReinitialize(AddTransition.Sending.STCReinitialize reInfo,
	 * Transition.Sending.ClockTime clockTime, Environment environment, Map<String,
	 * Object> env, long fromNode, long toNode) {
	 * 
	 * Transition trans = new Transition(); Transition.Sending send = new
	 * Transition.Sending(); Transition.Sending.STCReinitialize re = new
	 * Transition.Sending.STCReinitialize();
	 * 
	 * if (reInfo.getReceiver().getInvalid() != null) { re.setReceiver((short) 0); }
	 * 
	 * if (reInfo.getReceiver().getRandom() != null) {
	 * 
	 * re.setReceiver((short) 1);
	 * 
	 * }
	 * 
	 * if (reInfo.getReceiver().getValue() != null) {
	 * 
	 * re.setReceiver(reInfo.getReceiver().getValue().getValue());
	 * 
	 * }
	 * 
	 * if (reInfo.getReceiver().getVariable() != null) {
	 * 
	 * Object recO = environment.getFromEnvironment(env,
	 * reInfo.getReceiver().getVariable().getVariablenname());
	 * 
	 * if (recO instanceof Integer) {
	 * 
	 * re.setReceiver(((Integer) recO).shortValue()); }
	 * 
	 * if (recO instanceof Long) {
	 * 
	 * re.setReceiver(((Long) recO).shortValue()); }
	 * 
	 * if (recO instanceof Short) {
	 * 
	 * re.setReceiver(((Short) recO).shortValue()); }
	 * 
	 * }
	 * 
	 * if (reInfo.getStateId().getInvalid() != null) {
	 * 
	 * re.setStateId((short) 99); }
	 * 
	 * if (reInfo.getStateId().getRandom() != null) { re.setStateId((short) 0); }
	 * 
	 * if (reInfo.getStateId().getValue() != null) {
	 * 
	 * re.setStateId(reInfo.getStateId().getValue().getValue());
	 * 
	 * }
	 * 
	 * if (reInfo.getStateId().getVariable() != null) {
	 * 
	 * Object stateO = environment.getFromEnvironment(env,
	 * reInfo.getStateId().getVariable().getVariablenname());
	 * 
	 * if (stateO instanceof Integer) {
	 * 
	 * re.setStateId(((Integer) stateO).shortValue()); }
	 * 
	 * if (stateO instanceof Long) {
	 * 
	 * re.setStateId(((Long) stateO).shortValue()); }
	 * 
	 * if (stateO instanceof Short) {
	 * 
	 * re.setStateId(((Short) stateO).shortValue()); }
	 * 
	 * }
	 * 
	 * send.setSTCReinitialize(re);
	 * 
	 * if (clockTime != null) { send.setClockTime(clockTime); }
	 * 
	 * trans.setSending(send); trans.setFrom(fromNode); trans.setTo(toNode);
	 * 
	 * return trans;
	 * 
	 * }
	 */

	/**
	 * Create a Transition Object with a Sending STC_DO_STEP Message according to
	 * the passed Informations
	 * 
	 * 
	 * @param stepInfo    - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param dcpWrapper  - the dcp slave description
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the STC_DO_STEP Message
	 */

	public static Transition createSendingSTCDoStep(AddTransition.Sending.STCDoStep stepInfo,
			Transition.Sending.ClockTime clockTime, Environment environment, Map<String, Object> env, long fromNode,
			long toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.STCDoStep step = new Transition.Sending.STCDoStep();

		if (stepInfo.getReceiver().getInvalid() != null) {

			step.setReceiver((short) 0);

		}

		if (stepInfo.getReceiver().getRandom() != null) {
			step.setReceiver((short) 1);
		}

		if (stepInfo.getReceiver().getValue() != null) {

			step.setReceiver(stepInfo.getReceiver().getValue().getValue());

		}

		if (stepInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, stepInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {

				step.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {

				step.setReceiver(((Long) recO).shortValue());
			}

			if (recO instanceof Short) {

				step.setReceiver(((Short) recO).shortValue());
			}

		}

		if (stepInfo.getStateId().getInvalid() != null) {

			step.setStateId((short) 99);

		}

		if (stepInfo.getStateId().getRandom() != null) {
			step.setStateId((short) 0);
		}

		if (stepInfo.getStateId().getValue() != null) {

			step.setStateId(stepInfo.getStateId().getValue().getValue());
		}

		if (stepInfo.getStateId().getVariable() != null) {

			Object stateO = environment.getFromEnvironment(env, stepInfo.getStateId().getVariable().getVariablenname());

			if (stateO instanceof Integer) {

				step.setStateId(((Integer) stateO).shortValue());
			}

			if (stateO instanceof Long) {

				step.setStateId(((Long) stateO).shortValue());
			}

			if (stateO instanceof Short) {

				step.setStateId(((Short) stateO).shortValue());
			}

		}

		if (stepInfo.getSteps().getInvalid() != null) {

			step.setSteps(0);
		}

		if (stepInfo.getSteps().getRandom() != null) {

			step.setSteps(1L);
		}

		if (stepInfo.getSteps().getValue() != null) {

			step.setSteps(stepInfo.getSteps().getValue().getValue());
		}

		if (stepInfo.getSteps().getVariable() != null) {

			Object stepO = environment.getFromEnvironment(env, stepInfo.getSteps().getVariable().getVariablenname());

			if (stepO instanceof Integer) {

				step.setSteps(((Integer) stepO).shortValue());
			}

			if (stepO instanceof Long) {

				step.setSteps(((Long) stepO).shortValue());
			}

			if (stepO instanceof Short) {

				step.setSteps(((Short) stepO).shortValue());
			}

		}

		send.setSTCDoStep(step);

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}
		trans.setSending(send);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Sending STC_SEND_OUTPUTS Message according
	 * to the passed Informations
	 * 
	 * 
	 * @param outInfo     - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param dcpWrapper  - the dcp slave description
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the STC_SEND_OUTPUTS Message
	 */

	public static Transition createSendingSTCSendOutputs(AddTransition.Sending.STCSendOutputs outInfo,
			Transition.Sending.ClockTime clockTime, Environment environment, Map<String, Object> env, long fromNode,
			long toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.STCSendOutputs out = new Transition.Sending.STCSendOutputs();

		if (outInfo.getReceiver().getInvalid() != null) {

			out.setReceiver((short) 0);
		}

		if (outInfo.getReceiver().getRandom() != null) {

			out.setReceiver((short) 1);
		}

		if (outInfo.getReceiver().getValue() != null) {

			out.setReceiver(outInfo.getReceiver().getValue().getValue());

		}

		if (outInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, outInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {

				out.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {

				out.setReceiver(((Long) recO).shortValue());
			}

			if (recO instanceof Short) {

				out.setReceiver(((Short) recO).shortValue());
			}

		}

		if (outInfo.getStateId().getInvalid() != null) {

			out.setStateId((short) 99);
		}

		if (outInfo.getStateId().getRandom() != null) {

			out.setStateId((short) 0);
		}

		if (outInfo.getStateId().getValue() != null) {

			out.setStateId(outInfo.getStateId().getValue().getValue());
		}

		if (outInfo.getStateId().getVariable() != null) {

			Object stateO = environment.getFromEnvironment(env, outInfo.getStateId().getVariable().getVariablenname());

			if (stateO instanceof Integer) {

				out.setStateId(((Integer) stateO).shortValue());
			}

			if (stateO instanceof Long) {

				out.setStateId(((Long) stateO).shortValue());
			}

			if (stateO instanceof Short) {

				out.setStateId(((Short) stateO).shortValue());
			}

		}

		send.setSTCSendOutputs(out);
		if (clockTime != null) {
			send.setClockTime(clockTime);
		}
		trans.setSending(send);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Sending STC_STOP Message according to the
	 * passed Informations
	 * 
	 * 
	 * @param stopInfo    - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the STC_STOP Message
	 */

	public static Transition createSendingSTCStop(AddTransition.Sending.STCStop stopInfo, Environment environment,
			Map<String, Object> env, long fromNode, long toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.STCStop stop = new Transition.Sending.STCStop();

		if (stopInfo.getReceiver().getInvalid() != null) {

			stop.setReceiver((short) 0);
		}

		if (stopInfo.getReceiver().getRandom() != null) {
			stop.setReceiver((short) 1);
		}

		if (stopInfo.getReceiver().getValue() != null) {

			stop.setReceiver(stopInfo.getReceiver().getValue().getValue());
		}

		if (stopInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, stopInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {

				stop.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {

				stop.setReceiver(((Long) recO).shortValue());
			}

			if (recO instanceof Short) {

				stop.setReceiver(((Short) recO).shortValue());
			}

		}

		if (stopInfo.getStateId().getInvalid() != null) {
			stop.setStateId((short) 99);
		}

		if (stopInfo.getStateId().getRandom() != null) {
			stop.setStateId((short) 0);

		}

		if (stopInfo.getStateId().getValue() != null) {
			stop.setStateId(stopInfo.getStateId().getValue().getValue());

		}

		if (stopInfo.getStateId().getVariable() != null) {

			Object stateO = environment.getFromEnvironment(env, stopInfo.getStateId().getVariable().getVariablenname());

			if (stateO instanceof Integer) {

				stop.setStateId(((Integer) stateO).shortValue());
			}

			if (stateO instanceof Long) {

				stop.setStateId(((Long) stateO).shortValue());
			}

			if (stateO instanceof Short) {

				stop.setStateId(((Short) stateO).shortValue());
			}

		}

		send.setSTCStop(stop);
		trans.setSending(send);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Sending STC_RESET Message according to the
	 * passed Informations
	 * 
	 * 
	 * @param resetInfo   - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the STC_RESET Message
	 */

	public static Transition createSendingSTCReset(AddTransition.Sending.STCReset resetInfo,
			Transition.Sending.ClockTime clockTime, Environment environment, Map<String, Object> env, long fromNode,
			long toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.STCReset reset = new Transition.Sending.STCReset();

		if (resetInfo.getReceiver().getInvalid() != null) {

			reset.setReceiver((short) 0);
		}

		if (resetInfo.getReceiver().getRandom() != null) {
			reset.setReceiver((short) 1);
		}

		if (resetInfo.getReceiver().getValue() != null) {
			reset.setReceiver(resetInfo.getReceiver().getValue().getValue());

		}

		if (resetInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, resetInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {

				reset.setStateId(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {

				reset.setStateId(((Long) recO).shortValue());
			}

			if (recO instanceof Short) {

				reset.setStateId(((Short) recO).shortValue());
			}

		}

		if (resetInfo.getStateId().getInvalid() != null) {

			reset.setStateId((short) 99);

		}

		if (resetInfo.getStateId().getRandom() != null) {

			reset.setStateId((short) 0);

		}

		if (resetInfo.getStateId().getValue() != null) {

			reset.setStateId(resetInfo.getStateId().getValue().getValue());

		}

		if (resetInfo.getStateId().getVariable() != null) {

			Object stateO = environment.getFromEnvironment(env,
					resetInfo.getStateId().getVariable().getVariablenname());

			if (stateO instanceof Integer) {

				reset.setStateId(((Integer) stateO).shortValue());
			}

			if (stateO instanceof Long) {

				reset.setStateId(((Long) stateO).shortValue());
			}

			if (stateO instanceof Short) {

				reset.setStateId(((Short) stateO).shortValue());
			}

		}

		send.setSTCReset(reset);

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Sending INF_STATE Message according to the
	 * passed Informations
	 * 
	 * 
	 * @param infInfo     - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the INF_STATE Message
	 */

	public static Transition createSendingINFState(AddTransition.Sending.INFState infInfo,
			Transition.Sending.ClockTime clockTime, Environment environment, Map<String, Object> env, long fromNode,
			long toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.INFState inf = new Transition.Sending.INFState();

		if (infInfo.getReceiver().getInvalid() != null) {

			inf.setReceiver((short) 0);
		}

		if (infInfo.getReceiver().getRandom() != null) {
			inf.setReceiver((short) 1);
		}

		if (infInfo.getReceiver().getValue() != null) {
			inf.setReceiver(infInfo.getReceiver().getValue().getValue());
		}

		if (infInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, infInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {

				inf.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {

				inf.setReceiver(((Long) recO).shortValue());
			}

			if (recO instanceof Short) {

				inf.setReceiver(((Short) recO).shortValue());
			}

		}

		send.setINFState(inf);
		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Sending INF_ERROR Message according to the
	 * passed Informations
	 * 
	 * 
	 * @param infInfo     - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the INF_ERROR Message
	 */

	public static Transition createSendingINFError(AddTransition.Sending.INFError infInfo,
			Transition.Sending.ClockTime clockTime, Environment environment, Map<String, Object> env, long fromNode,
			long toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.INFError inf = new Transition.Sending.INFError();

		if (infInfo.getReceiver().getInvalid() != null) {

			inf.setReceiver((short) 0);

		}

		if (infInfo.getReceiver().getRandom() != null) {
			inf.setReceiver((short) 1);
		}

		if (infInfo.getReceiver().getValue() != null) {

			inf.setReceiver(infInfo.getReceiver().getValue().getValue());

		}

		if (infInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env, infInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {

				inf.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {

				inf.setReceiver(((Long) recO).shortValue());
			}

			if (recO instanceof Short) {

				inf.setReceiver(((Short) recO).shortValue());
			}

		}

		send.setINFError(inf);

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);

		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Sending INF_LOG Message according to the
	 * passed Informations
	 * 
	 * 
	 * @param infInfo     - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param dcpWrapper  - the dcp slave description
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the INF_LOG Message
	 */

	public static Transition createSendingINFLog(AddTransition.Sending.INFLog infInfo,
			Transition.Sending.ClockTime clockTime, Environment environment, Map<String, Object> env, long fromNode,
			long toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.INFLog inf = new Transition.Sending.INFLog();

		if (infInfo.getLogCategory().getInvalid() != null) {
			inf.setLogCategory((short) 0);
		}

		if (infInfo.getLogCategory().getRandom() != null) {
			inf.setLogCategory((short) 1);
		}

		if (infInfo.getLogCategory().getValue() != null) {
			inf.setLogCategory(infInfo.getLogCategory().getValue().getValue());
		}

		if (infInfo.getLogCategory().getVariable() != null) {

			Object logO = environment.getFromEnvironment(env,
					infInfo.getLogCategory().getVariable().getVariablenname());

			if (logO instanceof Integer) {

				inf.setLogCategory(((Integer) logO).shortValue());
			}

			if (logO instanceof Long) {

				inf.setLogCategory(((Long) logO).shortValue());
			}

			if (logO instanceof Short) {

				inf.setLogCategory(((Short) logO).shortValue());
			}

		}

		if (infInfo.getLogMaxNum().getInvalid() != null) {

			inf.setLogMaxNum((short) 0);

		}

		if (infInfo.getLogMaxNum().getRandom() != null) {

			inf.setLogMaxNum((short) 0);

		}

		if (infInfo.getLogMaxNum().getValue() != null) {

			inf.setLogMaxNum(infInfo.getLogMaxNum().getValue().getValue());

		}

		if (infInfo.getLogMaxNum().getVariable() != null) {

			Object logO = environment.getFromEnvironment(env, infInfo.getLogMaxNum().getVariable().getVariablenname());

			if (logO instanceof Integer) {

				inf.setLogMaxNum(((Integer) logO).shortValue());
			}

			if (logO instanceof Long) {

				inf.setLogMaxNum(((Long) logO).shortValue());
			}

			if (logO instanceof Short) {

				inf.setLogMaxNum(((Short) logO).shortValue());
			}

		}

		if (infInfo.getReceiver().getInvalid() != null) {

			inf.setReceiver((short) 0);

		}

		if (infInfo.getReceiver().getRandom() != null) {
			inf.setReceiver((short) 1);
		}

		if (infInfo.getReceiver().getValue() != null) {

			inf.setReceiver(infInfo.getReceiver().getValue().getValue());
		}

		if (infInfo.getReceiver().getVariable() != null) {

			Object logO = environment.getFromEnvironment(env, infInfo.getReceiver().getVariable().getVariablenname());

			if (logO instanceof Integer) {

				inf.setReceiver(((Integer) logO).shortValue());
			}

			if (logO instanceof Long) {

				inf.setReceiver(((Long) logO).shortValue());
			}

			if (logO instanceof Short) {

				inf.setReceiver(((Short) logO).shortValue());
			}

		}

		send.setINFLog(inf);
		if (clockTime != null) {
			send.setClockTime(clockTime);
		}
		trans.setSending(send);

		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Sending DAT_INPUT_OUTPUT Message according
	 * to the passed Informations
	 * 
	 * 
	 * @param outInfo     - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param dcpWrapper  - the dcp slave description
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the DAT_INPUT_OUTPUT Message
	 */

	public static Transition createSendingDATInputOutput(AddTransition.Sending.DATInputOutput outInfo,
			Transition.Sending.ClockTime clockTime, DcpWrapper dcpWrapper, Environment environment,
			Map<String, Object> env, long fromNode, long toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.DATInputOutput out = new Transition.Sending.DATInputOutput();

		List<dcpTestProcedure.SendingPayloadField> newSendingPayloadFieldsList = new LinkedList<>();

		if (outInfo.getDataId().getInvalid() != null) {
			out.setDataId(0);
		}

		if (outInfo.getDataId().getRandom() != null) {
			out.setDataId(1);
		}

		if (outInfo.getDataId().getValue() != null) {

			out.setDataId(outInfo.getDataId().getValue().getValue());
		}

		if (outInfo.getDataId().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env, outInfo.getDataId().getVariable().getVariablenname());

			if (dataO instanceof Integer) {

				out.setDataId(((Integer) dataO).shortValue());
			}

			if (dataO instanceof Long) {

				out.setDataId(((Long) dataO).shortValue());
			}

			if (dataO instanceof Short) {

				out.setDataId(((Short) dataO).shortValue());
			}

		}

		if (outInfo.getSendingPayloadField() != null) {

			List<SendingPayloadField> payloadFields = outInfo.getSendingPayloadField();

			for (SendingPayloadField payloadField : payloadFields) {

				int pos = payloadField.getPos();

				if (payloadField.getRandom() != null) {

					dcpTestProcedure.SendingPayloadField payload = PayloadFieldCreator.createRandomSendingPayloadField(
							env, payloadField.getRandom(), pos, dcpWrapper, environment);
					newSendingPayloadFieldsList.add(payload);

				}

				if (payloadField.getDefault() != null) {

					dcpTestProcedure.SendingPayloadField payload = PayloadFieldCreator.createDefaultSendingPayloadField(
							env, payloadField.getDefault(), pos, dcpWrapper, environment);
					newSendingPayloadFieldsList.add(payload);

				}

				if (payloadField.getInvalid() != null) {

					dcpTestProcedure.SendingPayloadField payload = PayloadFieldCreator.createInvalidSendingPayloadField(
							env, payloadField.getInvalid(), pos, dcpWrapper, environment);
					newSendingPayloadFieldsList.add(payload);

				}

				if (payloadField.getValue() != null) {

					dcpTestProcedure.SendingPayloadField payload = PayloadFieldCreator
							.createValueSendingPayloadField(payloadField.getValue(), pos);

					newSendingPayloadFieldsList.add(payload);

				}

			}

		}

		out.getSendingPayloadField().addAll(newSendingPayloadFieldsList);
		send.setDATInputOutput(out);
		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);

		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Sending DAT_PARAMETER Message according to
	 * the passed Informations
	 * 
	 * 
	 * @param paramInfo   - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param dcpWrapper  - the dcp slave description
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the DAT_PARAMETER Message
	 */

	public static Transition createSendingDATParameter(AddTransition.Sending.DATParameter paramInfo,
			Transition.Sending.ClockTime clockTime, DcpWrapper dcpWrapper, Environment environment,
			Map<String, Object> env, long fromNode, long toNode) {

		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.DATParameter param = new Transition.Sending.DATParameter();

		if (paramInfo.getParamId().getInvalid() != null) {

			param.setParamId(0);

		}

		if (paramInfo.getParamId().getRandom() != null) {

			param.setParamId(0);

		}

		if (paramInfo.getParamId().getValue() != null) {

			param.setParamId((paramInfo.getParamId().getValue().getValue()));
		}

		if (paramInfo.getParamId().getVariable() != null) {

			Object paramO = environment.getFromEnvironment(env,
					paramInfo.getParamId().getVariable().getVariablenname());

			if (paramO instanceof Integer) {

				param.setParamId(((Integer) paramO).shortValue());
			}

			if (paramO instanceof Long) {

				param.setParamId(((Long) paramO).shortValue());
			}

			if (paramO instanceof Short) {

				param.setParamId(((Short) paramO).shortValue());
			}

		}

		List<SendingPayloadField> sendingPayloadFieldList = paramInfo.getSendingPayloadField();
		List<dcpTestProcedure.SendingPayloadField> newSendingPayloadFieldsList = new LinkedList<>();

		for (SendingPayloadField payloadField : sendingPayloadFieldList) {

			int pos = payloadField.getPos();

			if (payloadField.getRandom() != null) {

				dcpTestProcedure.SendingPayloadField payload = PayloadFieldCreator.createRandomSendingPayloadField(env,
						payloadField.getRandom(), pos, dcpWrapper, environment);
				newSendingPayloadFieldsList.add(payload);
				if (payload == null) {
					System.err.println("payload null 1");
					System.exit(0);
				}
			}

			if (payloadField.getDefault() != null) {

				dcpTestProcedure.SendingPayloadField payload = PayloadFieldCreator.createDefaultSendingPayloadField(env,
						payloadField.getDefault(), pos, dcpWrapper, environment);
				newSendingPayloadFieldsList.add(payload);

			}

			if (payloadField.getInvalid() != null) {

				dcpTestProcedure.SendingPayloadField payload = PayloadFieldCreator.createInvalidSendingPayloadField(env,
						payloadField.getInvalid(), pos, dcpWrapper, environment);
				newSendingPayloadFieldsList.add(payload);

			}

			if (payloadField.getValue() != null) {

				dcpTestProcedure.SendingPayloadField payload = PayloadFieldCreator
						.createValueSendingPayloadField(payloadField.getValue(), pos);

				newSendingPayloadFieldsList.add(payload);

			}

		}

		param.getSendingPayloadField().addAll(newSendingPayloadFieldsList);
		send.setDATParameter(param);
		if (clockTime != null) {
			send.setClockTime(clockTime);
		}

		trans.setSending(send);

		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Receiving RSP_ACK Message according to the
	 * passed Informations
	 * 
	 * 
	 * @param ackInfo     - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the RSP_ACK Message
	 */

	public static Transition createReceivingRSPAck(AddTransition.Receiving.RSPAck ackInfo, Environment environment,
			Map<String, Object> env, long fromNode, long toNode) {

		Transition trans = new Transition();
		Transition.Receiving rec = new Transition.Receiving();
		Transition.Receiving.RSPAck ack = new Transition.Receiving.RSPAck();

		if (ackInfo.getSender().getAny() != null) {

			ack.setSender((short) 0);
		}

		if (ackInfo.getSender().getValue() != null) {
			ack.setSender(ackInfo.getSender().getValue().getValue());
		}

		if (ackInfo.getSender().getVariable() != null) {

			Object senderO = environment.getFromEnvironment(env, ackInfo.getSender().getVariable().getVariablenname());

			if (senderO instanceof Integer) {

				ack.setSender(((Integer) senderO).shortValue());
			}

			if (senderO instanceof Long) {

				ack.setSender(((Long) senderO).shortValue());
			}

			if (senderO instanceof Short) {

				ack.setSender(((Short) senderO).shortValue());
			}

		}

		rec.setRSPAck(ack);
		trans.setReceiving(rec);

		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Receiving RSP_ERROR_ACK Message according
	 * to the passed Informations
	 * 
	 * 
	 * @param eInfo       - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the RSP_ERROR_ACK Message
	 */

	public static Transition createReceivingRSPErrorAck(AddTransition.Receiving.RSPErrorAck eInfo,
			Environment environment, Map<String, Object> env, long fromNode, long toNode) {

		Transition trans = new Transition();
		Transition.Receiving rec = new Transition.Receiving();
		Transition.Receiving.RSPErrorAck ack = new Transition.Receiving.RSPErrorAck();

		if (eInfo.getErrorCode().getAny() != null) {

			ack.setErrorCode(0);
		}

		if (eInfo.getErrorCode().getValue() != null) {

			ack.setErrorCode(eInfo.getErrorCode().getValue().getValue());
		}

		if (eInfo.getErrorCode().getVariable() != null) {

			Object errorO = environment.getFromEnvironment(env, eInfo.getErrorCode().getVariable().getVariablenname());

			if (errorO instanceof Integer) {

				ack.setErrorCode(((Integer) errorO).shortValue());
			}

			if (errorO instanceof Long) {

				ack.setErrorCode(((Long) errorO).shortValue());
			}

			if (errorO instanceof Short) {

				ack.setErrorCode(((Short) errorO).shortValue());
			}

		}

		if (eInfo.getSender().getAny() != null) {

			ack.setSender((short) 0);
		}

		if (eInfo.getSender().getValue() != null) {

			ack.setSender(eInfo.getSender().getValue().getValue());
		}

		if (eInfo.getSender().getVariable() != null) {

			Object senderO = environment.getFromEnvironment(env, eInfo.getSender().getVariable().getVariablenname());

			if (senderO instanceof Integer) {

				ack.setSender(((Integer) senderO).shortValue());
			}

			if (senderO instanceof Long) {

				ack.setSender(((Long) senderO).shortValue());
			}

			if (senderO instanceof Short) {

				ack.setSender(((Short) senderO).shortValue());
			}

		}

		rec.setRSPErrorAck(ack);

		trans.setReceiving(rec);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Receiving RSP_NACK Message according to the
	 * passed Informations
	 * 
	 * 
	 * @param rInfo       - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the RSP_NACK Message
	 */

	public static Transition createReceivingRSPNack(AddTransition.Receiving.RSPNack rInfo, Environment environment,
			Map<String, Object> env, long fromNode, long toNode) {

		Transition trans = new Transition();
		Transition.Receiving rec = new Transition.Receiving();
		Transition.Receiving.RSPNack nack = new Transition.Receiving.RSPNack();

		if (rInfo.getErrorCode().getAny() != null) {

			nack.setErrorCode(0);

		}

		if (rInfo.getErrorCode().getValue() != null) {
			nack.setErrorCode(rInfo.getErrorCode().getValue().getValue());
		}

		if (rInfo.getErrorCode().getVariable() != null) {

			Object errO = environment.getFromEnvironment(env, rInfo.getErrorCode().getVariable().getVariablenname());

			if (errO instanceof Integer) {

				nack.setErrorCode(((Integer) errO).shortValue());
			}

			if (errO instanceof Long) {

				nack.setErrorCode(((Long) errO).shortValue());
			}

			if (errO instanceof Short) {

				nack.setErrorCode(((Short) errO).shortValue());
			}

		}

		if (rInfo.getSender().getAny() != null) {
			nack.setSender((short) 0);
		}

		if (rInfo.getSender().getValue() != null) {
			nack.setSender(rInfo.getSender().getValue().getValue());

		}

		if (rInfo.getSender().getVariable() != null) {

			Object senderO = environment.getFromEnvironment(env, rInfo.getSender().getVariable().getVariablenname());

			if (senderO instanceof Integer) {

				nack.setSender(((Integer) senderO).shortValue());
			}

			if (senderO instanceof Long) {

				nack.setSender(((Long) senderO).shortValue());
			}

			if (senderO instanceof Short) {

				nack.setSender(((Short) senderO).shortValue());
			}

		}

		if (rInfo.getExpPduSeqId() != null) {

			if (rInfo.getExpPduSeqId().getAny() != null) {

				nack.setExpPduSeqId(0);

			}

			if (rInfo.getExpPduSeqId().getValue() != null) {

				nack.setExpPduSeqId(rInfo.getExpPduSeqId().getValue().getValue());

			}

			if (rInfo.getExpPduSeqId().getVariable() != null) {

				Object seqId = environment.getFromEnvironment(env,
						rInfo.getExpPduSeqId().getVariable().getVariablenname());

				if (seqId instanceof Integer) {

					nack.setSender(((Integer) seqId).shortValue());
				}

				if (seqId instanceof Long) {

					nack.setSender(((Long) seqId).shortValue());
				}

				if (seqId instanceof Short) {

					nack.setSender(((Short) seqId).shortValue());
				}

			}

		}

		rec.setRSPNack(nack);
		trans.setReceiving(rec);

		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Receiving RSP_STATE_ACK Message according
	 * to the passed Informations
	 * 
	 * 
	 * @param rspInfo     - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the RSP_STATE_ACK Message
	 */

	public static Transition createReceivingRSPStateAck(AddTransition.Receiving.RSPStateAck rspInfo,
			Environment environment, Map<String, Object> env, long fromNode, long toNode) {

		Transition trans = new Transition();
		Transition.Receiving rec = new Transition.Receiving();
		Transition.Receiving.RSPStateAck rsp = new Transition.Receiving.RSPStateAck();

		if (rspInfo.getSender().getAny() != null) {

			rsp.setSender((short) 0);

		}

		if (rspInfo.getSender().getValue() != null) {
			rsp.setSender(rspInfo.getSender().getValue().getValue());
		}

		if (rspInfo.getSender().getVariable() != null) {

			Object senderO = environment.getFromEnvironment(env, rspInfo.getSender().getVariable().getVariablenname());

			if (senderO instanceof Integer) {

				rsp.setSender(((Integer) senderO).shortValue());
			}

			if (senderO instanceof Long) {

				rsp.setSender(((Long) senderO).shortValue());
			}

			if (senderO instanceof Short) {

				rsp.setSender(((Short) senderO).shortValue());
			}

		}

		if (rspInfo.getStateId().getAny() != null) {

			rsp.setStateId((short) 0);
		}

		if (rspInfo.getStateId().getValue() != null) {

			rsp.setStateId(rspInfo.getStateId().getValue().getValue());
		}

		if (rspInfo.getStateId().getVariable() != null) {

			Object stateO = environment.getFromEnvironment(env, rspInfo.getStateId().getVariable().getVariablenname());

			if (stateO instanceof Integer) {

				rsp.setStateId(((Integer) stateO).shortValue());
			}

			if (stateO instanceof Long) {

				rsp.setStateId(((Long) stateO).shortValue());
			}

			if (stateO instanceof Short) {

				rsp.setStateId(((Short) stateO).shortValue());
			}

		}

		rec.setRSPStateAck(rsp);
		trans.setReceiving(rec);

		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Receiving NTF_STATE_CHANGED Message
	 * according to the passed Informations
	 * 
	 * 
	 * @param stateInfo   - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the NTF_STATE_CHANGED Message
	 */

	public static Transition createReceivingNTFStateChanged(AddTransition.Receiving.NTFStateChanged stateInfo,
			Environment environment, Map<String, Object> env, long fromNode, long toNode) {

		Transition trans = new Transition();
		Transition.Receiving rec = new Transition.Receiving();
		Transition.Receiving.NTFStateChanged state = new Transition.Receiving.NTFStateChanged();

		if (stateInfo.getSender().getAny() != null) {
			state.setSender((short) 0);
		}

		if (stateInfo.getSender().getValue() != null) {

			state.setSender(stateInfo.getSender().getValue().getValue());
		}

		if (stateInfo.getSender().getVariable() != null) {

			Object senderO = environment.getFromEnvironment(env,
					stateInfo.getSender().getVariable().getVariablenname());

			if (senderO instanceof Integer) {

				state.setSender(((Integer) senderO).shortValue());
			}

			if (senderO instanceof Long) {

				state.setSender(((Long) senderO).shortValue());
			}

			if (senderO instanceof Short) {

				state.setSender(((Short) senderO).shortValue());
			}

		}

		if (stateInfo.getStateId().getAny() != null) {
			state.setStateId((short) 0);
		}

		if (stateInfo.getStateId().getValue() != null) {
			state.setStateId(stateInfo.getStateId().getValue().getValue());
		}

		if (stateInfo.getStateId().getVariable() != null) {

			Object stateO = environment.getFromEnvironment(env,
					stateInfo.getStateId().getVariable().getVariablenname());

			if (stateO instanceof Integer) {

				state.setStateId(((Integer) stateO).shortValue());
			}

			if (stateO instanceof Long) {

				state.setStateId(((Long) stateO).shortValue());
			}

			if (stateO instanceof Short) {

				state.setStateId(((Short) stateO).shortValue());
			}

		}

		rec.setNTFStateChanged(state);
		trans.setReceiving(rec);

		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Receiving RSP_LOG Message according to the
	 * passed Informations
	 * 
	 * 
	 * @param logInfo     - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the RSP_LOG Message
	 */

	public static Transition createReceivingRSPLog(AddTransition.Receiving.RSPLog logInfo, Environment environment,
			Map<String, Object> env, long fromNode, long toNode) {

		Transition trans = new Transition();
		Transition.Receiving rec = new Transition.Receiving();
		Transition.Receiving.RSPLogAck log = new Transition.Receiving.RSPLogAck();

		if (logInfo.getSender().getAny() != null) {
			log.setSender((short) 0);
		}

		if (logInfo.getSender().getValue() != null) {

			log.setSender(logInfo.getSender().getValue().getValue());

		}

		if (logInfo.getSender().getVariable() != null) {

			Object senderO = environment.getFromEnvironment(env, logInfo.getSender().getVariable().getVariablenname());

			if (senderO instanceof Integer) {

				log.setSender(((Integer) senderO).shortValue());
			}

			if (senderO instanceof Long) {

				log.setSender(((Long) senderO).shortValue());
			}

			if (senderO instanceof Short) {

				log.setSender(((Short) senderO).shortValue());
			}

		}

		rec.setRSPLogAck(log);

		trans.setReceiving(rec);

		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Receiving NTF_LOG Message according to the
	 * passed Informations
	 * 
	 * 
	 * @param logInfo     - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param dcpWrapper  - the dcp slave description
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the NTF_LOG Message
	 */

	public static Transition createReceivingNTFLog(AddTransition.Receiving.NTFLog logInfo, Environment environment,
			Map<String, Object> env, long fromNode, long toNode) {

		Transition trans = new Transition();
		Transition.Receiving rec = new Transition.Receiving();
		Transition.Receiving.NTFLog log = new Transition.Receiving.NTFLog();

		if (logInfo.getSender().getAny() != null) {

			log.setSender((short) 0);

		}

		if (logInfo.getSender().getValue() != null) {
			log.setSender(logInfo.getSender().getValue().getValue());
		}

		if (logInfo.getSender().getVariable() != null) {

			Object senderO = environment.getFromEnvironment(env, logInfo.getSender().getVariable().getVariablenname());

			if (senderO instanceof Integer) {

				log.setSender(((Integer) senderO).shortValue());
			}

			if (senderO instanceof Long) {

				log.setSender(((Long) senderO).shortValue());
			}

			if (senderO instanceof Short) {

				log.setSender(((Short) senderO).shortValue());
			}

		}

		logInfo.getPayload();

		rec.setNTFLog(log);
		trans.setReceiving(rec);

		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Receiving DAT_INPUT_OUTPUT Message
	 * according to the passed Informations
	 * 
	 * 
	 * @param datInfo     - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param dcpWrapper  - the dcp slave description
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the DAT_INPUT_OUTPUT Message
	 */

	public static Transition createReceivingDATInputOutput(AddTransition.Receiving.DATInputOutput datInfo,
			DcpWrapper dcpWrapper, Environment environment, Map<String, Object> env, long fromNode, long toNode) {

		Transition trans = new Transition();
		Transition.Receiving rec = new Transition.Receiving();
		Transition.Receiving.DATInputOutput dat = new Transition.Receiving.DATInputOutput();

		if (datInfo.getDataId().getAny() != null) {
			dat.setDataId(0);

		}

		if (datInfo.getDataId().getValue() != null) {
			dat.setDataId(datInfo.getDataId().getValue().getValue());
		}

		if (datInfo.getDataId().getVariable() != null) {

			Object dataO = environment.getFromEnvironment(env, datInfo.getDataId().getVariable().getVariablenname());

			if (dataO instanceof Integer) {

				dat.setDataId(((Integer) dataO).shortValue());
			}

			if (dataO instanceof Long) {

				dat.setDataId(((Long) dataO).shortValue());
			}

			if (dataO instanceof Short) {

				dat.setDataId(((Short) dataO).shortValue());
			}

		}

		if (datInfo.getReceivingPayloadField() != null) {

			List<ReceivingPayloadField> payLoadFields = datInfo.getReceivingPayloadField();
			List<dcpTestProcedure.ReceivingPayloadField> newReceivingPayloadFields = new ArrayList<>();

			for (ReceivingPayloadField payLoadField : payLoadFields) {

				dcpTestProcedure.ReceivingPayloadField payload = null;

				if (payLoadField.getAny() != null) {

					payload = PayloadFieldCreator.createAnyReceivingPayloadField(env, payLoadField.getAny(), dcpWrapper,
							environment);

				}

				if (payLoadField.getValue() != null) {

					payload = PayloadFieldCreator.createValueReceivingPayloadField(payLoadField.getValue());

				}

				if (payLoadField.getBetweenMinMax() != null) {

					payload = PayloadFieldCreator.createBetweenMinMaxReceivingPayloadField(env,
							payLoadField.getBetweenMinMax(), dcpWrapper, environment);

				}

				if (payLoadField.getCondition() != null) {

					payload = PayloadFieldCreator.createConditionReceivingPayloadField(env, payLoadField.getCondition(),
							dcpWrapper, environment);

				}

				newReceivingPayloadFields.add(payload);

			}

			for (dcpTestProcedure.ReceivingPayloadField p : newReceivingPayloadFields) {

				dat.getReceivingPayloadField().add(p);

			}

		}

		rec.setDATInputOutput(dat);
		trans.setReceiving(rec);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;

	}

	/**
	 * Create a Transition Object with a Receiving DAT_PARAMETER Message according
	 * to the passed Informations
	 * 
	 * 
	 * @param datInfo     - the AddTransition node from the expansion file
	 *                    specifying the values that should be used in the
	 *                    transition to be created
	 * @param clockTime   - the ClockTime Information Object that should be included
	 *                    in the sending transition to be created
	 * @param dcpWrapper  - the dcp slave description
	 * @param environment - the javascript engine Environment
	 * @param env         - the map used to hold local variables and their values
	 *                    during the expanding process
	 * @param fromNode    - the starting node number of the transition
	 * @param toNode      - the ending node number to which the transition leads
	 * @return the Transition object with the DAT_PARAMETER Message
	 */

	public static Transition createReceivingDATParameter(AddTransition.Receiving.DATParameter datInfo,
			DcpWrapper dcpWrapper, Environment environment, Map<String, Object> env, long fromNode, long toNode) {

		Transition trans = new Transition();
		Transition.Receiving rec = new Transition.Receiving();
		Transition.Receiving.DATParameter dat = new Transition.Receiving.DATParameter();

		if (datInfo.getParamId().getAny() != null) {
			dat.setParamId(0);
		}

		if (datInfo.getParamId().getValue() != null) {
			dat.setParamId(datInfo.getParamId().getValue().getValue());
		}

		if (datInfo.getParamId().getVariable() != null) {

			Object paramO = environment.getFromEnvironment(env, datInfo.getParamId().getVariable().getVariablenname());

			if (paramO instanceof Integer) {

				dat.setParamId(((Integer) paramO).shortValue());
			}

			if (paramO instanceof Long) {

				dat.setParamId(((Long) paramO).shortValue());
			}

			if (paramO instanceof Short) {

				dat.setParamId(((Short) paramO).shortValue());
			}

		}

		List<ReceivingPayloadField> payLoadFields = datInfo.getReceivingPayloadField();
		List<dcpTestProcedure.ReceivingPayloadField> newReceivingPayloadFields = new ArrayList<>();

		for (ReceivingPayloadField payLoadField : payLoadFields) {

			dcpTestProcedure.ReceivingPayloadField payload = null;

			if (payLoadField.getAny() != null) {

				payload = PayloadFieldCreator.createAnyReceivingPayloadField(env, payLoadField.getAny(), dcpWrapper,
						environment);

			}

			if (payLoadField.getValue() != null) {

				payload = PayloadFieldCreator.createValueReceivingPayloadField(payLoadField.getValue());

			}

			if (payLoadField.getBetweenMinMax() != null) {

				payload = PayloadFieldCreator.createBetweenMinMaxReceivingPayloadField(env,
						payLoadField.getBetweenMinMax(), dcpWrapper, environment);

			}

			if (payLoadField.getCondition() != null) {

				payload = PayloadFieldCreator.createConditionReceivingPayloadField(env, payLoadField.getCondition(),
						dcpWrapper, environment);

			}

			newReceivingPayloadFields.add(payload);

		}

		dat.getReceivingPayloadField().addAll(newReceivingPayloadFields);

		rec.setDATParameter(dat);
		trans.setReceiving(rec);
		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;
	}

	public static Transition createSendingCFGSetScope(CFGScope cfgSetScopeInfo, Transition.Sending.ClockTime clockTime,
			Environment environment, Map<String, Object> env, int fromNode, int toNode) {
		Transition trans = new Transition();
		Transition.Sending send = new Transition.Sending();
		Transition.Sending.CFGScope setScope = new Transition.Sending.CFGScope();

		if (cfgSetScopeInfo.getDataId().getInvalid() != null) {

			setScope.setDataId(-1);
		}

		if (cfgSetScopeInfo.getDataId().getRandom() != null) {

			setScope.setDataId(0);
		}

		if (cfgSetScopeInfo.getDataId().getValue() != null
				&& cfgSetScopeInfo.getDataId().getValue().getValue() != null) {

			setScope.setDataId(cfgSetScopeInfo.getDataId().getValue().getValue().intValue());

		}

		if (cfgSetScopeInfo.getDataId().getVariable() != null) {

			Object dataIdO = environment.getFromEnvironment(env,
					cfgSetScopeInfo.getDataId().getVariable().getVariablenname());

			if (dataIdO instanceof Integer) {
				setScope.setDataId(((Integer) dataIdO).intValue());
			}

			if (dataIdO instanceof Long) {
				setScope.setDataId(((Long) dataIdO).intValue());
			}

			if (dataIdO instanceof Short) {
				setScope.setDataId(((Short) dataIdO).intValue());
			}

		}

		if (cfgSetScopeInfo.getReceiver().getInvalid() != null) {

			setScope.setReceiver((short) 0);

		}

		if (cfgSetScopeInfo.getReceiver().getRandom() != null) {
			setScope.setReceiver((short) 1);
		}

		if (cfgSetScopeInfo.getReceiver().getValue() != null) {
			setScope.setReceiver(cfgSetScopeInfo.getReceiver().getValue().getValue());
		}

		if (cfgSetScopeInfo.getReceiver().getVariable() != null) {

			Object recO = environment.getFromEnvironment(env,
					cfgSetScopeInfo.getReceiver().getVariable().getVariablenname());

			if (recO instanceof Integer) {
				setScope.setReceiver(((Integer) recO).shortValue());
			}

			if (recO instanceof Long) {
				setScope.setReceiver(((Long) recO).shortValue());
			}

			if (recO instanceof Short) {
				setScope.setReceiver(((Short) recO).shortValue());
			}

		}

		if (cfgSetScopeInfo.getScope().getInvalid() != null) {

			setScope.setScope((short) 8);

		}

		if (cfgSetScopeInfo.getScope().getRandom() != null) {
			setScope.setScope((short) 0);
		}

		if (cfgSetScopeInfo.getScope().getValue() != null) {

			setScope.setScope(cfgSetScopeInfo.getScope().getValue().getValue());
		}

		if (cfgSetScopeInfo.getScope().getVariable() != null) {

			Object stepsO = environment.getFromEnvironment(env,
					cfgSetScopeInfo.getScope().getVariable().getVariablenname());

			if (stepsO instanceof Integer) {
				setScope.setScope(((Integer) stepsO).shortValue());
			}

			if (stepsO instanceof Long) {
				setScope.setScope(((Long) stepsO).shortValue());
			}

			if (stepsO instanceof Short) {
				setScope.setScope(((Short) stepsO).shortValue());
			}

		}

		if (clockTime != null) {
			send.setClockTime(clockTime);
		}
		send.setCFGScope(setScope);
		trans.setSending(send);

		trans.setFrom(fromNode);
		trans.setTo(toNode);

		return trans;
	}

}
