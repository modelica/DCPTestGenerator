package util;

import java.util.LinkedList;
import java.util.List;

/**
 * This class contains all the different states and their codes specified in the
 * acosar standard
 * 
 *
 */

public class StateList {

	public static final String STATE_ALIVE = "ALIVE";
	public static final String STATE_CONFIGURATION = "CONFIGURATION";
	public static final String STATE_PREPARING = "PREPARING";
	public static final String STATE_PREPARED = "PREPARED";
	public static final String STATE_CONFIGURING = "CONFIGURING";
	public static final String STATE_CONFIGURED = "CONFIGURED";
	public static final String STATE_INITIALIZING = "INITIALIZING";
	public static final String STATE_INITIALIZED = "INITIALIZED";
	public static final String STATE_SENDING_I = "SENDING_I";
	public static final String STATE_SYNCHRONIZING = "SYNCHRONIZING";
	public static final String STATE_SYNCHRONIZED = "SYNCHRONIZED";
	public static final String STATE_RUNNING = "RUNNING";
	public static final String STATE_COMPUTING = "COMPUTING";
	public static final String STATE_COMPUTED = "COMPUTED";
	public static final String STATE_SENDING_D = "SENDING_D";
	public static final String STATE_STOPPING = "STOPPING";
	public static final String STATE_STOPPED = "STOPPED";
	public static final String ERRORHANDLING = "ERRORHANDLING";
	public static final String ERRORRESOLVED = "ERRORRESOLVED";

	public static final byte STATE_ALIVE_ID = 0;
	public static final byte STATE_CONFIGURATION_ID = 1;
	public static final byte STATE_PREPARING_ID = 2;
	public static final byte STATE_PREPARED_ID = 3;
	public static final byte STATE_CONFIGURING_ID = 4;
	public static final byte STATE_CONFIGURED_ID = 5;
	public static final byte STATE_INITIALIZING_ID = 6;
	public static final byte STATE_INITIALIZED_ID = 7;
	public static final byte STATE_SENDING_I_ID = 8;
	public static final byte STATE_SYNCHRONIZING_ID = 9;
	public static final byte STATE_SYNCHRONIZED_ID = 10;
	public static final byte STATE_RUNNING_ID = 11;
	public static final byte STATE_COMPUTING_ID = 12;
	public static final byte STATE_COMPUTED_ID = 13;
	public static final byte STATE_SENDING_D_ID = 14;
	public static final byte STATE_STOPPING_ID = 15;
	public static final byte STATE_STOPPED_ID = 16;
	public static final byte ERRORHANDLING_ID = 17;
	public static final byte ERRORRESOLVED_ID = 18;

	public static List<String> getAllStates() {

		List<String> list = new LinkedList<>();

		list.add(STATE_ALIVE);
		list.add(STATE_CONFIGURATION);
		list.add(STATE_PREPARING);
		list.add(STATE_PREPARED);
		list.add(STATE_CONFIGURING);
		list.add(STATE_CONFIGURED);
		list.add(STATE_INITIALIZING);
		list.add(STATE_INITIALIZED);
		list.add(STATE_SENDING_I);
		list.add(STATE_SYNCHRONIZING);
		list.add(STATE_SYNCHRONIZED);
		list.add(STATE_RUNNING);
		list.add(STATE_COMPUTING);
		list.add(STATE_COMPUTED);
		list.add(STATE_SENDING_D);
		list.add(STATE_STOPPING);
		list.add(STATE_STOPPED);
		list.add(ERRORHANDLING);
		list.add(ERRORRESOLVED);

		return list;

	}

}
