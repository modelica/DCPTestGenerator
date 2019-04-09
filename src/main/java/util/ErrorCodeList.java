package util;

/**
 * This class represents the error codes specified by the acosar standard
 * 
 * 
 *
 */

public class ErrorCodeList {

	public static int NONE = 0;
	public static int GENERIC = 1;
	public static int HEARTBEAT_MISSED = 2;
	public static int INCOMPLETE_CONFIG_GAP_INPUT_POS = 3;
	public static int UUID_DOES_NOT_MATCH = Integer.decode("0x24");
	public static int OP_MODE_NOT_SUPPORTED = Integer.decode("0x18");
	public static int MESSAGE_NOT_ALLOWED_IN_THIS_STATE = Integer.decode("0x2A");
	public static int STATE_TRANSITION_IN_PROGRESS = Integer.decode("0x2C");
	public static int UNSUPPORTED_MESSAGE = Integer.decode("0x2E");
	public static int INVALID_START_TIME = Integer.decode("0x1B");
	public static int TRANSPORT_PROTOCOL_NOT_SUPPORTED = Integer.decode("0x2D");
	public static int NETWORK_INFORMATION = Integer.decode("0x16");
	public static int FORBIDDEN_MODIFICATION = 10;
	public static int DATA_TYPE_DOES_NOT_MATCH = Integer.decode("0x0E");
	public static int INVALID_TIME_RESOLUTION = Integer.decode("0x21");
	public static int INVALID_LENGTH = Integer.decode("0x0F");
	public static int INCOMPLETE_CONFIGURATION = Integer.decode("0x0D");
	public static int VALUE_REFERENCE_UNKNOWN = Integer.decode("0x25");
	public static int INVALID_STEPS = Integer.decode("0x1E");
	public static int PROPERTY_VIOLATED = Integer.decode("0x2B");
	public static int VERSION_MISMATCH = 19;
	public static int STATE_DOES_NOT_MATCH = Integer.decode("0x1D");
	public static int INVALID_SEQUENCE_ID = 21;

}
