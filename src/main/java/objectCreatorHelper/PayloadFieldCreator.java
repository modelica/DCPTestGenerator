package objectCreatorHelper;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dcpTestExtension.Condition;
import dcpTestExtension.ReceivingPayloadField;
import dcpTestExtension.SendingPayloadField;
import dcpTestProcedure.ReceivingPayloadField.Float32;
import dcpTestProcedure.ReceivingPayloadField.Float64;
import dcpTestProcedure.ReceivingPayloadField.Int16;
import dcpTestProcedure.ReceivingPayloadField.Int32;
import dcpTestProcedure.ReceivingPayloadField.Int64;
import dcpTestProcedure.ReceivingPayloadField.Int8;
import dcpTestProcedure.ReceivingPayloadField.Uint16;
import dcpTestProcedure.ReceivingPayloadField.Uint32;
import dcpTestProcedure.ReceivingPayloadField.Uint64;
import dcpTestProcedure.ReceivingPayloadField.Uint8;
import util.DataTypeList;
import util.Environment;
import wrappers.DcpWrapper;

/**
 * 
 * This class is used as a helper class for creating PayloadField Objects
 * 
 * 
 *
 */

public class PayloadFieldCreator {

	/**
	 * Create a Receiving Payload Field Object with the minimum and maximum
	 * valid value for receiving according to the information from the dcp slave
	 * description. If no minimum or maximum bound was specified for the
	 * variable, the minimum and maximum possible value for the data type is
	 * used.
	 * 
	 * 
	 * @param env
	 *            - Map that holds the local variables and their values used
	 *            during the expansion process
	 * @param anyItem
	 *            - the any xml node from the expansion xml file containing
	 *            information about the variable for which the payload field
	 *            should be created
	 * @param dcpWrapper-
	 *            the slave description object
	 * @param environment
	 *            - the javascript Environment
	 * @return receiving payload field objects with the specified boundaries for
	 *         the possible valid receiving value
	 */
	public static dcpTestProcedure.ReceivingPayloadField createAnyReceivingPayloadField(Map<String, Object> env, dcpTestExtension.Any anyItem, DcpWrapper dcpWrapper, Environment environment) {

		dcpTestProcedure.ReceivingPayloadField payloadField = new dcpTestProcedure.ReceivingPayloadField();

		if (anyItem.getValueReferenceVariable() == null && anyItem.getValueReference() == null) {

			System.out.println("Error : No ValueReference or ValueReferenceVariable specified for 'Any' ");
			System.exit(0);

		}

		int valueReference = 0;

		if (anyItem.getValueReferenceVariable() != null) {
			valueReference = (int) environment.getFromEnvironment(env, anyItem.getValueReferenceVariable());
		}

		if (anyItem.getValueReference() != null) {

			valueReference = anyItem.getValueReference().intValue();
		}

		try {
			short dataType = dcpWrapper.getDataTypeFromVr(valueReference);

			if (dataType == DataTypeList.float32) {
				Float32 f = new Float32();
				f.setMin((float) dcpWrapper.getMinForVr(valueReference));
				f.setMax((float) dcpWrapper.getMaxForVr(valueReference));
				payloadField.setFloat32(f);

			}

			if (dataType == DataTypeList.float64) {
				Float64 f = new Float64();
				f.setMin((double) dcpWrapper.getMinForVr(valueReference));
				f.setMax((double) dcpWrapper.getMaxForVr(valueReference));
				payloadField.setFloat64(f);

			}

			if (dataType == DataTypeList.int16) {
				Int16 i = new Int16();
				i.setMin((short) dcpWrapper.getMinForVr(valueReference));
				i.setMax((short) dcpWrapper.getMaxForVr(valueReference));
				payloadField.setInt16(i);
			}

			if (dataType == DataTypeList.int32) {
				Int32 i = new Int32();
				i.setMin((int) dcpWrapper.getMinForVr(valueReference));
				i.setMax((int) dcpWrapper.getMaxForVr(valueReference));
				payloadField.setInt32(i);
			}

			if (dataType == DataTypeList.int64) {
				Int64 i = new Int64();
				i.setMin((long) dcpWrapper.getMinForVr(valueReference));
				i.setMax((long) dcpWrapper.getMaxForVr(valueReference));
				payloadField.setInt64(i);

			}

			if (dataType == DataTypeList.int8) {
				Uint8 i = new Uint8();
				i.setMin((short) dcpWrapper.getMinForVr(valueReference));
				i.setMax((short) dcpWrapper.getMaxForVr(valueReference));
				payloadField.setUint8(i);

			}

			if (dataType == DataTypeList.uint16) {

				Uint16 i = new Uint16();
				i.setMin((int) dcpWrapper.getMinForVr(valueReference));
				i.setMax((int) dcpWrapper.getMaxForVr(valueReference));
				payloadField.setUint16(i);

			}

			if (dataType == DataTypeList.uint32) {
				Uint32 i = new Uint32();
				i.setMin((long) dcpWrapper.getMinForVr(valueReference));
				i.setMax((long) dcpWrapper.getMaxForVr(valueReference));
				payloadField.setUint32(i);

			}

			if (dataType == DataTypeList.uint64) {
				Uint64 i = new Uint64();
				i.setMin((BigInteger) dcpWrapper.getMinForVr(valueReference));
				i.setMax((BigInteger) dcpWrapper.getMaxForVr(valueReference));
				payloadField.setUint64(i);

			}

			if (dataType == DataTypeList.uint8) {
				Uint8 i = new Uint8();
				i.setMin((short) dcpWrapper.getMinForVr(valueReference));
				i.setMax((short) dcpWrapper.getMaxForVr(valueReference));
				payloadField.setUint8(i);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return payloadField;

	}

	/**
	 * Create a receiving payload field Object with a expected receiving value.
	 * 
	 * 
	 * 
	 * @param value
	 *            - the value object that contains information about the value,
	 *            that should be received
	 * @return the receiving payload field object with the specified receiving
	 *         value
	 */

	public static dcpTestProcedure.ReceivingPayloadField createValueReceivingPayloadField(ReceivingPayloadField.Value value) {

		dcpTestProcedure.ReceivingPayloadField payloadField = new dcpTestProcedure.ReceivingPayloadField();

		if (value.getFloat32() != null) {
			Float32 f = new Float32();

			f.getValue().addAll((value.getFloat32().getValue()));
			f.setDimensionSize((long) value.getFloat32().getValue().size());

			payloadField.setFloat32(f);
		}

		if (value.getFloat64() != null) {
			Float64 f = new Float64();
			f.getValue().addAll((value.getFloat64().getValue()));
			f.setDimensionSize((long) value.getFloat32().getValue().size());

			payloadField.setFloat64(f);

		}

		if (value.getInt16() != null) {
			Int16 i = new Int16();

			i.getValue().addAll((value.getInt16().getValue()));
			i.setDimensionSize((long) value.getInt16().getValue().size());

			payloadField.setInt16(i);
		}

		if (value.getInt32() != null) {
			Int32 i = new Int32();

			i.getValue().addAll((value.getInt32().getValue()));
			i.setDimensionSize((long) value.getInt32().getValue().size());

			payloadField.setInt32(i);
		}

		if (value.getInt64() != null) {
			Int64 i = new Int64();

			i.getValue().addAll((value.getInt64().getValue()));
			i.setDimensionSize((long) value.getInt64().getValue().size());

			payloadField.setInt64(i);

		}

		if (value.getInt8() != null) {
			Int8 i = new Int8();

			i.getValue().addAll((value.getInt8().getValue()));
			i.setDimensionSize((long) value.getInt8().getValue().size());

			payloadField.setInt8(i);

		}

		if (value.getUint16() != null) {

			Uint16 i = new Uint16();

			i.getValue().addAll((value.getUint16().getValue()));
			i.setDimensionSize((long) value.getUint16().getValue().size());

			payloadField.setUint16(i);

		}

		if (value.getUint32() != null) {
			Uint32 i = new Uint32();

			i.getValue().addAll((value.getUint32().getValue()));
			i.setDimensionSize((long) value.getUint32().getValue().size());

			payloadField.setUint32(i);

		}

		if (value.getUint64() != null) {
			Uint64 i = new Uint64();

			i.getValue().addAll((value.getUint64().getValue()));
			i.setDimensionSize((long) value.getUint64().getValue().size());

			payloadField.setUint64(i);

		}

		if (value.getUint8() != null) {
			Uint8 i = new Uint8();

			i.getValue().addAll((value.getUint8().getValue()));
			i.setDimensionSize((long) value.getUint8().getValue().size());

			payloadField.setUint8(i);

		}

		return payloadField;

	}

	/**
	 * Create a receiving payload field object that expects to receive values
	 * between a minimum and maximum value that is valid for the data type
	 * regarding the specified variable
	 * 
	 * 
	 * @param env
	 *            - Map that holds the local variables and their values used
	 *            during the expansion process
	 * @param betItem
	 *            - the between min max object that specifies the minimum and
	 *            maximum boundaries for the receiving value
	 * @param dcpWrapper-
	 *            the slave description object
	 * @param environment
	 *            - the javascript Environment
	 * @return receiving payload field object that expects a value between the
	 *         minimum and maximum value valid for the data type of the variable
	 */

	public static dcpTestProcedure.ReceivingPayloadField createBetweenMinMaxReceivingPayloadField(Map<String, Object> env, dcpTestExtension.BetweenMinMax betItem, DcpWrapper dcpWrapper, Environment environment) {

		dcpTestProcedure.ReceivingPayloadField payloadField = new dcpTestProcedure.ReceivingPayloadField();

		if (betItem.getValueReferenceVariable() == null && betItem.getValueReference() == null) {

			System.out.println("Error : No ValueReference or ValueReferenceVariable specified for 'BetweenMinMax' ");
			System.exit(0);

		}

		int valueReference = 0;

		if (betItem.getValueReferenceVariable() != null) {

			valueReference = (int) environment.getFromEnvironment(env, betItem.getValueReferenceVariable());
		}

		if (betItem.getValueReference() != null) {

			valueReference = betItem.getValueReference().intValue();
		}

		short dataType = 0;
		try {
			dataType = dcpWrapper.getDataTypeFromVr(valueReference);

			if (dataType == DataTypeList.float32) {
				Float32 f = new Float32();
				f.setMin((float) dcpWrapper.getMinForVr(valueReference));
				f.setMax((float) dcpWrapper.getMaxForVr(valueReference));
				payloadField.setFloat32(f);
			}

			if (dataType == DataTypeList.float64) {
				Float64 f = new Float64();
				f.setMin((double) dcpWrapper.getMinForVr(valueReference));
				f.setMax((double) dcpWrapper.getMaxForVr(valueReference));
				payloadField.setFloat64(f);

			}

			if (dataType == DataTypeList.int16) {
				Int16 i = new Int16();
				i.setMin((short) dcpWrapper.getMinForVr(valueReference));
				i.setMax((short) dcpWrapper.getMaxForVr(valueReference));
				payloadField.setInt16(i);
			}

			if (dataType == DataTypeList.int32) {
				Int32 i = new Int32();
				i.setMin((int) dcpWrapper.getMinForVr(valueReference));
				i.setMax((int) dcpWrapper.getMaxForVr(valueReference));
				payloadField.setInt32(i);
			}

			if (dataType == DataTypeList.int64) {
				Int64 i = new Int64();
				i.setMin((long) dcpWrapper.getMinForVr(valueReference));
				i.setMax((long) dcpWrapper.getMaxForVr(valueReference));
				payloadField.setInt64(i);

			}

			if (dataType == DataTypeList.int8) {
				Uint8 i = new Uint8();
				i.setMin((short) dcpWrapper.getMinForVr(valueReference));
				i.setMax((short) dcpWrapper.getMaxForVr(valueReference));
				payloadField.setUint8(i);

			}

			if (dataType == DataTypeList.uint16) {

				Uint16 i = new Uint16();
				i.setMin((int) dcpWrapper.getMinForVr(valueReference));
				i.setMax((int) dcpWrapper.getMaxForVr(valueReference));
				payloadField.setUint16(i);

			}

			if (dataType == DataTypeList.uint32) {
				Uint32 i = new Uint32();
				i.setMin((long) dcpWrapper.getMinForVr(valueReference));
				i.setMax((long) dcpWrapper.getMaxForVr(valueReference));
				payloadField.setUint32(i);

			}

			if (dataType == DataTypeList.uint64) {
				Uint64 i = new Uint64();
				i.setMin((BigInteger) dcpWrapper.getMinForVr(valueReference));
				i.setMax((BigInteger) dcpWrapper.getMaxForVr(valueReference));
				payloadField.setUint64(i);

			}

			if (dataType == DataTypeList.uint8) {
				Uint8 i = new Uint8();
				i.setMin((short) dcpWrapper.getMinForVr(valueReference));
				i.setMax((short) dcpWrapper.getMaxForVr(valueReference));
				payloadField.setUint8(i);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return payloadField;

	}

	/**
	 * Create a receiving payload field from a payload field condition object.
	 * The condition inside the payload condition object is evaluated and the
	 * child nodes are processed accordingly to the evaluation result
	 * 
	 * 
	 * @param env
	 *            - Map that holds the local variables and their values used
	 *            during the expansion process
	 * @param conditionItem
	 *            - the condition object that specifies the condition and the
	 *            child nodes that are used for creating the payload field
	 * @param dcpWrapper-
	 *            the slave description object
	 * @param environment
	 *            - the javascript Environment
	 * @return the receiving payload field object created according the
	 *         condition item
	 */
	public static dcpTestProcedure.ReceivingPayloadField createConditionReceivingPayloadField(Map<String, Object> env, Condition conditionItem, DcpWrapper dcpWrapper, Environment environment) {

		String condition = conditionItem.getCondition();
		boolean conditionFulfilled = false;

		environment.prepareEngine(env);

		conditionFulfilled = (boolean) environment.eval(condition);

		if (conditionFulfilled) {

			Condition.ConditionFullfilled conditionFullfilledItem = conditionItem.getConditionFullfilled();

			if (conditionFullfilledItem.getAny() != null) {

				return createAnyReceivingPayloadField(env, conditionFullfilledItem.getAny(), dcpWrapper, environment);

			}

			if (conditionFullfilledItem.getValue() != null) {

				dcpTestExtension.Condition.ConditionFullfilled.Value valueInfo = conditionFullfilledItem.getValue();

				ReceivingPayloadField.Value valueCopy = new ReceivingPayloadField.Value();

				if (valueInfo.getBinary() != null) {
					ReceivingPayloadField.Value.Binary binary = new ReceivingPayloadField.Value.Binary();
					binary.setValue(valueInfo.getBinary().getValue());
					valueCopy.setBinary(binary);

				}

				if (valueInfo.getFloat32() != null) {
					ReceivingPayloadField.Value.Float32 float32 = new ReceivingPayloadField.Value.Float32();

					float32.getValue().add(valueInfo.getFloat32().getValue());
					valueCopy.setFloat32(float32);

				}

				if (valueInfo.getFloat64() != null) {
					ReceivingPayloadField.Value.Float64 float64 = new ReceivingPayloadField.Value.Float64();

					float64.getValue().add(valueInfo.getFloat64().getValue());
					valueCopy.setFloat64(float64);

				}
				if (valueInfo.getInt16() != null) {
					ReceivingPayloadField.Value.Int16 int16 = new ReceivingPayloadField.Value.Int16();

					int16.getValue().add(valueInfo.getInt16().getValue());
					valueCopy.setInt16(int16);

				}

				if (valueInfo.getInt32() != null) {
					ReceivingPayloadField.Value.Int32 int32 = new ReceivingPayloadField.Value.Int32();

					int32.getValue().add(valueInfo.getInt32().getValue());
					valueCopy.setInt32(int32);

				}

				if (valueInfo.getInt64() != null) {
					ReceivingPayloadField.Value.Int64 int64 = new ReceivingPayloadField.Value.Int64();

					int64.getValue().add(valueInfo.getInt64().getValue());
					valueCopy.setInt64(int64);

				}

				if (valueInfo.getInt8() != null) {
					ReceivingPayloadField.Value.Int8 int8 = new ReceivingPayloadField.Value.Int8();

					int8.getValue().add(valueInfo.getInt8().getValue());
					valueCopy.setInt8(int8);

				}

				if (valueInfo.getString() != null) {
					ReceivingPayloadField.Value.String s = new ReceivingPayloadField.Value.String();
					s.setValue(valueInfo.getString().getValue());
					valueCopy.setString(s);

				}

				if (valueInfo.getUint16() != null) {
					ReceivingPayloadField.Value.Uint16 uint16 = new ReceivingPayloadField.Value.Uint16();

					uint16.getValue().add(valueInfo.getUint16().getValue());
					valueCopy.setUint16(uint16);

				}

				if (valueInfo.getUint32() != null) {
					ReceivingPayloadField.Value.Uint32 uint32 = new ReceivingPayloadField.Value.Uint32();

					uint32.getValue().add(valueInfo.getUint32().getValue());
					valueCopy.setUint32(uint32);

				}

				if (valueInfo.getUint64() != null) {
					ReceivingPayloadField.Value.Uint64 uint64 = new ReceivingPayloadField.Value.Uint64();

					uint64.getValue().add(valueInfo.getUint64().getValue());
					valueCopy.setUint64(uint64);

				}

				if (valueInfo.getUint8() != null) {
					ReceivingPayloadField.Value.Uint8 uint8 = new ReceivingPayloadField.Value.Uint8();

					uint8.getValue().add(valueInfo.getUint8().getValue());
					valueCopy.setUint8(uint8);

				}

				return createValueReceivingPayloadField(valueCopy);

			}

			if (conditionFullfilledItem.getCondition() != null) {

				Condition newConditionItem = conditionFullfilledItem.getCondition();

				return createConditionReceivingPayloadField(env, newConditionItem, dcpWrapper, environment);

			}

			if (conditionFullfilledItem.getBetweenMinMax() != null) {

				return createBetweenMinMaxReceivingPayloadField(env, conditionFullfilledItem.getBetweenMinMax(), dcpWrapper, environment);

			}

		} else {

			Condition.Else elseItem = conditionItem.getElse();

			if (elseItem.getAny() != null) {

				return createAnyReceivingPayloadField(env, elseItem.getAny(), dcpWrapper, environment);

			}

			if (elseItem.getValue() != null) {

				Condition.Else.Value valueInfo = elseItem.getValue();

				ReceivingPayloadField.Value valueCopy = new ReceivingPayloadField.Value();

				if (valueInfo.getBinary() != null) {
					ReceivingPayloadField.Value.Binary binary = new ReceivingPayloadField.Value.Binary();
					binary.setValue(valueInfo.getBinary().getValue());
					valueCopy.setBinary(binary);

				}

				if (valueInfo.getFloat32() != null) {
					ReceivingPayloadField.Value.Float32 float32 = new ReceivingPayloadField.Value.Float32();
					float32.getValue().add(valueInfo.getFloat32().getValue());

					valueCopy.setFloat32(float32);

				}

				if (valueInfo.getFloat64() != null) {
					ReceivingPayloadField.Value.Float64 float64 = new ReceivingPayloadField.Value.Float64();

					float64.getValue().add(valueInfo.getFloat64().getValue());
					valueCopy.setFloat64(float64);

				}
				if (valueInfo.getInt16() != null) {
					ReceivingPayloadField.Value.Int16 int16 = new ReceivingPayloadField.Value.Int16();

					int16.getValue().add(valueInfo.getInt16().getValue());
					valueCopy.setInt16(int16);

				}

				if (valueInfo.getInt32() != null) {
					ReceivingPayloadField.Value.Int32 int32 = new ReceivingPayloadField.Value.Int32();

					int32.getValue().add(valueInfo.getInt32().getValue());
					valueCopy.setInt32(int32);

				}

				if (valueInfo.getInt64() != null) {
					ReceivingPayloadField.Value.Int64 int64 = new ReceivingPayloadField.Value.Int64();

					int64.getValue().add(valueInfo.getInt64().getValue());
					valueCopy.setInt64(int64);

				}

				if (valueInfo.getInt8() != null) {
					ReceivingPayloadField.Value.Int8 int8 = new ReceivingPayloadField.Value.Int8();

					int8.getValue().add(valueInfo.getInt8().getValue());
					valueCopy.setInt8(int8);

				}

				if (valueInfo.getString() != null) {
					ReceivingPayloadField.Value.String s = new ReceivingPayloadField.Value.String();
					s.setValue(valueInfo.getString().getValue());
					valueCopy.setString(s);

				}

				if (valueInfo.getUint16() != null) {
					ReceivingPayloadField.Value.Uint16 uint16 = new ReceivingPayloadField.Value.Uint16();

					uint16.getValue().add(valueInfo.getUint16().getValue());
					valueCopy.setUint16(uint16);

				}

				if (valueInfo.getUint32() != null) {
					ReceivingPayloadField.Value.Uint32 uint32 = new ReceivingPayloadField.Value.Uint32();

					uint32.getValue().add(valueInfo.getUint32().getValue());
					valueCopy.setUint32(uint32);

				}

				if (valueInfo.getUint64() != null) {
					ReceivingPayloadField.Value.Uint64 uint64 = new ReceivingPayloadField.Value.Uint64();

					uint64.getValue().add(valueInfo.getUint64().getValue());
					valueCopy.setUint64(uint64);

				}

				if (valueInfo.getUint8() != null) {
					ReceivingPayloadField.Value.Uint8 uint8 = new ReceivingPayloadField.Value.Uint8();

					uint8.getValue().add(valueInfo.getUint8().getValue());
					valueCopy.setUint8(uint8);

				}

				return createValueReceivingPayloadField(valueCopy);

			}

			if (elseItem.getCondition() != null) {

				Condition newConditionItem = elseItem.getCondition();

				return createConditionReceivingPayloadField(env, newConditionItem, dcpWrapper, environment);

			}

			if (elseItem.getBetweenMinMax() != null) {

				return createBetweenMinMaxReceivingPayloadField(env, elseItem.getBetweenMinMax(), dcpWrapper, environment);

			}

		}

		return null;

	}

	/**
	 * Create a sending payload field that contains a random (at the moment
	 * always the minimum value) that is valid for the specified variable data
	 * type
	 * 
	 * 
	 * @param env
	 *            - Map that holds the local variables and their values used
	 *            during the expansion process
	 * @param randItem
	 *            - the random item that contains information about the variable
	 *            for which this payload field should be created
	 * @param pos
	 *            - the position inside the data unit to be send that the
	 *            sending value should have
	 * @param dcpWrapper-
	 *            the slave description object
	 * @param environment
	 *            - the javascript Environment
	 * @return the random sending payload field that was created according the
	 *         random item
	 */

	public static dcpTestProcedure.SendingPayloadField createRandomSendingPayloadField(Map<String, Object> env, dcpTestExtension.SendingPayloadField.Random randItem, int pos, DcpWrapper dcpWrapper, Environment environment) {

		dcpTestProcedure.SendingPayloadField payloadField = new dcpTestProcedure.SendingPayloadField();
		payloadField.setPos(pos);

		if (randItem.getValueReferenceVariable() == null && randItem.getValueReference() == null) {

			System.out.println("Error : No ValueReference or ValueReferenceVariable specified for 'Random'  ");
			System.exit(0);

		}

		int valueReference = 0;

		if (randItem.getValueReferenceVariable() != null) {

			valueReference = (int) environment.getFromEnvironment(env, randItem.getValueReferenceVariable());

		}

		if (randItem.getValueReference() != null) {

			valueReference = randItem.getValueReference().intValue();
		}

		int variablesForDimension = dcpWrapper.getDimensionOfVr(valueReference);

		short dataType;
		try {
			dataType = dcpWrapper.getDataTypeFromVr(valueReference);

			if (dataType == DataTypeList.float32) {
				dcpTestProcedure.SendingPayloadField.Float32 f = new dcpTestProcedure.SendingPayloadField.Float32();

				List<Float> valueList = new ArrayList<>();

				for (int i = 0; i < variablesForDimension; i++) {

					valueList.add((float) dcpWrapper.getMinForVr(valueReference));
				}

				f.getValue().addAll(valueList);

				payloadField.setFloat32(f);
			}

			if (dataType == DataTypeList.float64) {
				dcpTestProcedure.SendingPayloadField.Float64 f = new dcpTestProcedure.SendingPayloadField.Float64();

				List<Double> valueList = new ArrayList<>();

				for (int i = 0; i < variablesForDimension; i++) {

					valueList.add((double) dcpWrapper.getMinForVr(valueReference));
				}

				f.getValue().addAll(valueList);

				payloadField.setFloat64(f);

			}

			if (dataType == DataTypeList.int16) {
				dcpTestProcedure.SendingPayloadField.Int16 i = new dcpTestProcedure.SendingPayloadField.Int16();

				List<Short> valueList = new ArrayList<>();

				for (int x = 0; x < variablesForDimension; x++) {

					valueList.add((short) dcpWrapper.getMinForVr(valueReference));
				}

				i.getValue().addAll(valueList);

				payloadField.setInt16(i);
			}

			if (dataType == DataTypeList.int32) {
				dcpTestProcedure.SendingPayloadField.Int32 i = new dcpTestProcedure.SendingPayloadField.Int32();

				List<Integer> valueList = new ArrayList<>();

				for (int x = 0; x < variablesForDimension; x++) {

					valueList.add((int) dcpWrapper.getMinForVr(valueReference));
				}

				i.getValue().addAll(valueList);

				payloadField.setInt32(i);
			}

			if (dataType == DataTypeList.int64) {
				dcpTestProcedure.SendingPayloadField.Int64 i = new dcpTestProcedure.SendingPayloadField.Int64();

				List<Long> valueList = new ArrayList<>();

				for (int x = 0; x < variablesForDimension; x++) {

					valueList.add((long) dcpWrapper.getMinForVr(valueReference));
				}

				i.getValue().addAll(valueList);

				payloadField.setInt64(i);

			}

			if (dataType == DataTypeList.int8) {
				dcpTestProcedure.SendingPayloadField.Uint8 i = new dcpTestProcedure.SendingPayloadField.Uint8();

				List<Short> valueList = new ArrayList<>();

				for (int x = 0; x < variablesForDimension; x++) {

					valueList.add((short) dcpWrapper.getMinForVr(valueReference));
				}

				i.getValue().addAll(valueList);

				payloadField.setUint8(i);

			}

			if (dataType == DataTypeList.uint16) {

				dcpTestProcedure.SendingPayloadField.Uint16 i = new dcpTestProcedure.SendingPayloadField.Uint16();

				List<Integer> valueList = new ArrayList<>();

				for (int x = 0; x < variablesForDimension; x++) {

					valueList.add((int) dcpWrapper.getMinForVr(valueReference));
				}

				i.getValue().addAll(valueList);

				payloadField.setUint16(i);

			}

			if (dataType == DataTypeList.uint32) {
				dcpTestProcedure.SendingPayloadField.Uint32 i = new dcpTestProcedure.SendingPayloadField.Uint32();

				List<Long> valueList = new ArrayList<>();

				for (int x = 0; x < variablesForDimension; x++) {

					valueList.add((long) dcpWrapper.getMinForVr(valueReference));
				}

				i.getValue().addAll(valueList);

				payloadField.setUint32(i);

			}

			if (dataType == DataTypeList.uint64) {
				dcpTestProcedure.SendingPayloadField.Uint64 i = new dcpTestProcedure.SendingPayloadField.Uint64();

				List<BigInteger> valueList = new ArrayList<>();

				for (int x = 0; x < variablesForDimension; x++) {

					valueList.add((BigInteger) dcpWrapper.getMinForVr(valueReference));
				}

				i.getValue().addAll(valueList);

				payloadField.setUint64(i);

			}

			if (dataType == DataTypeList.uint8) {
				dcpTestProcedure.SendingPayloadField.Uint8 i = new dcpTestProcedure.SendingPayloadField.Uint8();

				List<Short> valueList = new ArrayList<>();

				for (int x = 0; x < variablesForDimension; x++) {

					valueList.add((short) dcpWrapper.getMinForVr(valueReference));
				}

				i.getValue().addAll(valueList);

				payloadField.setUint8(i);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return payloadField;

	}

	/**
	 * Create a default sending payload field. The payload field created will
	 * contain the minimum allowed value for the variable type the variable can
	 * have.
	 * 
	 * 
	 * @param env
	 *            - Map that holds the local variables and their values used
	 *            during the expansion process
	 * @param def
	 *            - the default item which contains information about the
	 *            variable the sending payload field should be created
	 * @param pos
	 *            - the position the created value should have inside the data
	 *            unit that will be send
	 * @param dcpWrapper-
	 *            the slave description object
	 * @param environment
	 *            - the javascript Environment
	 * @return the created sending payload field
	 */

	public static dcpTestProcedure.SendingPayloadField createDefaultSendingPayloadField(Map<String, Object> env, dcpTestExtension.SendingPayloadField.Default def, int pos, DcpWrapper dcpWrapper, Environment environment) {

		dcpTestProcedure.SendingPayloadField payloadField = new dcpTestProcedure.SendingPayloadField();
		payloadField.setPos(pos);

		if (def.getValueReferenceVariable() == null && def.getValueReference() == null) {

			System.out.println("Error : No ValueReference or ValueReferenceVariable specified for 'Default' ");
			System.exit(0);

		}

		int valueReference = 0;

		if (def.getValueReferenceVariable() != null) {
			valueReference = (int) environment.getFromEnvironment(env, def.getValueReferenceVariable());
		}

		if (def.getValueReference() != null) {
			valueReference = def.getValueReference().intValue();
		}

		int variablesForDimension = dcpWrapper.getDimensionOfVr(valueReference);

		short dataType;
		try {
			dataType = dcpWrapper.getDataTypeFromVr(valueReference);

			if (dataType == DataTypeList.float32) {
				dcpTestProcedure.SendingPayloadField.Float32 f = new dcpTestProcedure.SendingPayloadField.Float32();

				List<Float> valueList = new ArrayList<>();

				for (int x = 0; x < variablesForDimension; x++) {

					valueList.add((float) dcpWrapper.getMinForVr(valueReference));
				}

				f.getValue().addAll(valueList);

				payloadField.setFloat32(f);

			}

			if (dataType == DataTypeList.float64) {
				dcpTestProcedure.SendingPayloadField.Float64 f = new dcpTestProcedure.SendingPayloadField.Float64();

				List<Double> valueList = new ArrayList<>();

				for (int x = 0; x < variablesForDimension; x++) {

					valueList.add((double) dcpWrapper.getMinForVr(valueReference));
				}

				f.getValue().addAll(valueList);

				payloadField.setFloat64(f);

			}

			if (dataType == DataTypeList.int16) {
				dcpTestProcedure.SendingPayloadField.Int16 i = new dcpTestProcedure.SendingPayloadField.Int16();

				List<Short> valueList = new ArrayList<>();

				for (int x = 0; x < variablesForDimension; x++) {

					valueList.add((short) dcpWrapper.getMinForVr(valueReference));
				}

				i.getValue().addAll(valueList);

				payloadField.setInt16(i);

			}

			if (dataType == DataTypeList.int32) {
				dcpTestProcedure.SendingPayloadField.Int32 i = new dcpTestProcedure.SendingPayloadField.Int32();

				List<Integer> valueList = new ArrayList<>();

				for (int x = 0; x < variablesForDimension; x++) {

					valueList.add((int) dcpWrapper.getMinForVr(valueReference));
				}

				i.getValue().addAll(valueList);

				payloadField.setInt32(i);

			}

			if (dataType == DataTypeList.int64) {
				dcpTestProcedure.SendingPayloadField.Int64 i = new dcpTestProcedure.SendingPayloadField.Int64();

				List<Long> valueList = new ArrayList<>();

				for (int x = 0; x < variablesForDimension; x++) {

					valueList.add((long) dcpWrapper.getMinForVr(valueReference));
				}

				i.getValue().addAll(valueList);

				payloadField.setInt64(i);

			}

			if (dataType == DataTypeList.int8) {
				dcpTestProcedure.SendingPayloadField.Uint8 i = new dcpTestProcedure.SendingPayloadField.Uint8();

				Object min = dcpWrapper.getMinForVr(valueReference);

				if (min instanceof Byte) {

					List<Short> valueList = new ArrayList<>();

					for (int x = 0; x < variablesForDimension; x++) {

						valueList.add(((Byte) min).shortValue());
					}

					i.getValue().addAll(valueList);

				} else {

					List<Short> valueList = new ArrayList<>();

					for (int x = 0; x < variablesForDimension; x++) {

						valueList.add((short) dcpWrapper.getMinForVr(valueReference));
					}

					i.getValue().addAll(valueList);

				}
				payloadField.setUint8(i);

			}

			if (dataType == DataTypeList.uint16) {

				dcpTestProcedure.SendingPayloadField.Uint16 i = new dcpTestProcedure.SendingPayloadField.Uint16();

				List<Integer> valueList = new ArrayList<>();

				for (int x = 0; x < variablesForDimension; x++) {

					valueList.add((int) dcpWrapper.getMinForVr(valueReference));
				}

				i.getValue().addAll(valueList);

				payloadField.setUint16(i);

			}

			if (dataType == DataTypeList.uint32) {
				dcpTestProcedure.SendingPayloadField.Uint32 i = new dcpTestProcedure.SendingPayloadField.Uint32();

				List<Long> valueList = new ArrayList<>();

				for (int x = 0; x < variablesForDimension; x++) {

					valueList.add((long) dcpWrapper.getMinForVr(valueReference));
				}

				i.getValue().addAll(valueList);

				payloadField.setUint32(i);

			}

			if (dataType == DataTypeList.uint64) {
				dcpTestProcedure.SendingPayloadField.Uint64 i = new dcpTestProcedure.SendingPayloadField.Uint64();

				List<BigInteger> valueList = new ArrayList<>();

				for (int x = 0; x < variablesForDimension; x++) {

					valueList.add((BigInteger) dcpWrapper.getMinForVr(valueReference));
				}

				i.getValue().addAll(valueList);

				payloadField.setUint64(i);

			}

			if (dataType == DataTypeList.uint8) {
				dcpTestProcedure.SendingPayloadField.Uint8 i = new dcpTestProcedure.SendingPayloadField.Uint8();

				List<Short> valueList = new ArrayList<>();

				for (int x = 0; x < variablesForDimension; x++) {

					valueList.add((short) dcpWrapper.getMinForVr(valueReference));
				}

				i.getValue().addAll(valueList);

				payloadField.setUint8(i);

			}

		} catch (Exception e) {
			e.printStackTrace();

		}

		return payloadField;

	}

	/**
	 * Create a sending payload field with a specified value.
	 * 
	 * 
	 * @param value
	 *            - the value object containing information about the value to
	 *            be send by this payload field.
	 * @param pos
	 *            - the position inside the data unit that will be sent of the
	 *            value
	 * @return the created sending payload field
	 */

	public static dcpTestProcedure.SendingPayloadField createValueSendingPayloadField(SendingPayloadField.Value value, int pos) {

		dcpTestProcedure.SendingPayloadField payloadField = new dcpTestProcedure.SendingPayloadField();

		payloadField.setPos(pos);

		if (value.getFloat32() != null) {
			dcpTestProcedure.SendingPayloadField.Float32 f32 = new dcpTestProcedure.SendingPayloadField.Float32();
			f32.getValue().addAll(value.getFloat32().getValue());
			payloadField.setFloat32(f32);

		}
		if (value.getFloat64() != null) {
			dcpTestProcedure.SendingPayloadField.Float64 f64 = new dcpTestProcedure.SendingPayloadField.Float64();
			f64.getValue().addAll(value.getFloat64().getValue());
			payloadField.setFloat64(f64);

		}
		if (value.getInt16() != null) {
			dcpTestProcedure.SendingPayloadField.Int16 i16 = new dcpTestProcedure.SendingPayloadField.Int16();
			i16.getValue().addAll(value.getInt16().getValue());
			payloadField.setInt16(i16);

		}
		if (value.getInt32() != null) {
			dcpTestProcedure.SendingPayloadField.Int32 i32 = new dcpTestProcedure.SendingPayloadField.Int32();
			i32.getValue().addAll(value.getInt32().getValue());
			payloadField.setInt32(i32);

		}
		if (value.getInt64() != null) {
			dcpTestProcedure.SendingPayloadField.Int64 i64 = new dcpTestProcedure.SendingPayloadField.Int64();
			i64.getValue().addAll(value.getInt64().getValue());
			payloadField.setInt64(i64);

		}
		if (value.getInt8() != null) {

			dcpTestProcedure.SendingPayloadField.Int8 i8 = new dcpTestProcedure.SendingPayloadField.Int8();
			i8.getValue().addAll(value.getInt8().getValue());
			payloadField.setInt8(i8);

		}
		if (value.getString() != null) {

			dcpTestProcedure.SendingPayloadField.String s = new dcpTestProcedure.SendingPayloadField.String();
			s.setValue(value.getString().getValue());
			payloadField.setString(s);

		}
		if (value.getUint16() != null) {

			dcpTestProcedure.SendingPayloadField.Uint16 u16 = new dcpTestProcedure.SendingPayloadField.Uint16();
			u16.getValue().addAll(value.getUint16().getValue());
			payloadField.setUint16(u16);

		}
		if (value.getUint32() != null) {

			dcpTestProcedure.SendingPayloadField.Uint32 u32 = new dcpTestProcedure.SendingPayloadField.Uint32();
			u32.getValue().addAll(value.getUint32().getValue());
			payloadField.setUint32(u32);

		}
		if (value.getUint64() != null) {

			dcpTestProcedure.SendingPayloadField.Uint64 u64 = new dcpTestProcedure.SendingPayloadField.Uint64();
			u64.getValue().addAll(value.getUint64().getValue());
			payloadField.setUint64(u64);

		}
		if (value.getUint8() != null) {

			dcpTestProcedure.SendingPayloadField.Uint8 u8 = new dcpTestProcedure.SendingPayloadField.Uint8();
			u8.getValue().addAll(value.getUint8().getValue());
			payloadField.setUint8(u8);

		}

		return payloadField;

	}

	/**
	 * Create a sending payload field which contains an invalid value for an
	 * variable.
	 * 
	 * 
	 * @param env
	 * @param inv
	 *            - the invalid item containing information about the variable
	 *            this payload field should be created for
	 * @param pos
	 *            - the position the value should have inside the data unit to
	 *            be send
	 * @param dcpWrapper-
	 *            the slave description object
	 * @param environment
	 *            - the javascript Environment
	 * @return the created sending payload field
	 */

	public static dcpTestProcedure.SendingPayloadField createInvalidSendingPayloadField(Map<String, Object> env, dcpTestExtension.SendingPayloadField.Invalid inv, int pos, DcpWrapper dcpWrapper, Environment environment) {

		dcpTestProcedure.SendingPayloadField payloadField = new dcpTestProcedure.SendingPayloadField();
		payloadField.setPos(pos);

		if (inv.getValueReferenceVariable() == null && inv.getValueReference() == null) {

			System.out.println("Error : No ValueReference or ValueReferenceVariable specified for 'Invalid'");
			System.exit(0);

		}

		int valueReference = 0;

		if (inv.getValueReferenceVariable() != null) {

			valueReference = (int) environment.getFromEnvironment(env, inv.getValueReferenceVariable());

		}

		if (inv.getValueReference() != null) {

			valueReference = inv.getValueReference().intValue();
		}

		int variablesForDimension = dcpWrapper.getDimensionOfVr(valueReference);

		short dataType;
		try {
			dataType = dcpWrapper.getInvalidDataTypeFromVr(valueReference);

			if (dataType == DataTypeList.float32) {
				dcpTestProcedure.SendingPayloadField.Float32 f = new dcpTestProcedure.SendingPayloadField.Float32();

				List<Float> valueList = new ArrayList<>();

				for (int x = 0; x < variablesForDimension; x++) {

					valueList.add(((float) dcpWrapper.getMaxForVr(valueReference)) + 1);
				}

				f.getValue().addAll(valueList);

				payloadField.setFloat32(f);
			}

			if (dataType == DataTypeList.float64) {
				dcpTestProcedure.SendingPayloadField.Float64 f = new dcpTestProcedure.SendingPayloadField.Float64();

				List<Double> valueList = new ArrayList<>();

				for (int x = 0; x < variablesForDimension; x++) {

					valueList.add(((double) dcpWrapper.getMaxForVr(valueReference)) + 1);
				}

				f.getValue().addAll(valueList);

				payloadField.setFloat64(f);

			}

			if (dataType == DataTypeList.int16) {
				dcpTestProcedure.SendingPayloadField.Int16 i = new dcpTestProcedure.SendingPayloadField.Int16();

				List<Short> valueList = new ArrayList<>();

				for (int x = 0; x < variablesForDimension; x++) {

					valueList.add((short) ((double) dcpWrapper.getMaxForVr(valueReference) + 1));
				}

				i.getValue().addAll(valueList);

				payloadField.setInt16(i);
			}

			if (dataType == DataTypeList.int32) {
				dcpTestProcedure.SendingPayloadField.Int32 i = new dcpTestProcedure.SendingPayloadField.Int32();

				List<Integer> valueList = new ArrayList<>();

				for (int x = 0; x < variablesForDimension; x++) {

					valueList.add(((int) dcpWrapper.getMaxForVr(valueReference)) + 1);
				}

				i.getValue().addAll(valueList);

				payloadField.setInt32(i);
			}

			if (dataType == DataTypeList.int64) {
				dcpTestProcedure.SendingPayloadField.Int64 i = new dcpTestProcedure.SendingPayloadField.Int64();

				List<Long> valueList = new ArrayList<>();

				for (int x = 0; x < variablesForDimension; x++) {

					valueList.add(((long) dcpWrapper.getMaxForVr(valueReference)) + 1);
				}

				i.getValue().addAll(valueList);

				payloadField.setInt64(i);

			}

			if (dataType == DataTypeList.int8) {
				dcpTestProcedure.SendingPayloadField.Uint8 i = new dcpTestProcedure.SendingPayloadField.Uint8();

				List<Short> valueList = new ArrayList<>();

				for (int x = 0; x < variablesForDimension; x++) {

					valueList.add((short) ((short) dcpWrapper.getMaxForVr(valueReference) + 1));
				}

				i.getValue().addAll(valueList);

				payloadField.setUint8(i);

			}

			if (dataType == DataTypeList.uint16) {

				dcpTestProcedure.SendingPayloadField.Uint16 i = new dcpTestProcedure.SendingPayloadField.Uint16();

				List<Integer> valueList = new ArrayList<>();

				for (int x = 0; x < variablesForDimension; x++) {

					valueList.add(((int) dcpWrapper.getMaxForVr(valueReference) + 1));
				}

				i.getValue().addAll(valueList);

				payloadField.setUint16(i);

			}

			if (dataType == DataTypeList.uint32) {
				dcpTestProcedure.SendingPayloadField.Uint32 i = new dcpTestProcedure.SendingPayloadField.Uint32();

				List<Long> valueList = new ArrayList<>();

				for (int x = 0; x < variablesForDimension; x++) {

					valueList.add(((long) dcpWrapper.getMaxForVr(valueReference) + 1));
				}

				i.getValue().addAll(valueList);

				payloadField.setUint32(i);

			}

			if (dataType == DataTypeList.uint64) {
				dcpTestProcedure.SendingPayloadField.Uint64 i = new dcpTestProcedure.SendingPayloadField.Uint64();

				List<BigInteger> valueList = new ArrayList<>();

				for (int x = 0; x < variablesForDimension; x++) {

					valueList.add(new BigInteger(Long.toString((((int) dcpWrapper.getMaxForVr(valueReference)) + 1))));
				}

				i.getValue().addAll(valueList);

				payloadField.setUint64(i);

			}

			if (dataType == DataTypeList.uint8) {
				dcpTestProcedure.SendingPayloadField.Uint8 i = new dcpTestProcedure.SendingPayloadField.Uint8();

				List<Short> valueList = new ArrayList<>();

				for (int x = 0; x < variablesForDimension; x++) {

					valueList.add((short) ((short) dcpWrapper.getMaxForVr(valueReference) + 1));
				}

				i.getValue().addAll(valueList);

				payloadField.setUint8(i);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return payloadField;

	}

}