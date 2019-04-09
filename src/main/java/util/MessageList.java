package util;

import java.util.LinkedList;
import java.util.List;

/**
 * This class holds all the different Message Types, names and corresponding
 * codes specified by the acosar standard.
 * 
 * 
 *
 */

public class MessageList {

	public static final String CFG_SET_TIME_RES = "CFG_set_time_res";
	public static final String CFG_SET_STEPS = "CFG_set_steps";
	public static final String CFG_CONFIG_INPUT = "CFG_config_input";
	public static final String CFG_CONFIG_OUTPUT = "CFG_config_output";
	public static final String CFG_CONFIG_CLEAR = "CFG_config_clear";
	public static final String CFG_SET_TARGET_NETWORK_INFORMATION = "CFG_set_target_network_information";
	public static final String CFG_SET_SOURCE_NETWORK_INFORMATION = "CFG_set_source_network_information";
	public static final String CFG_SET_PARAMETER = "CFG_set_parameter";
	public static final String CFG_SET_CONFIG_TUNABLE_PARAMETER = "CFG_set_config_tunable_parameter";
	public static final String CFG_SET_PARAM_NETWORK_INFORMATION = "CFG_set_param_network_information";
	public static final String CFG_SET_LOGGING = "CFG_set_logging";
	public static final String STC_REGISTER = "STC_register";
	public static final String STC_DEREGISTER = "STC_deregister";
	public static final String STC_CONFIGURE = "STC_configure";
	public static final String STC_INITIALIZE = "STC_initialize";
	public static final String STC_REINITIALIZE = "STC_reinitialize";
	public static final String STC_RUN = "STC_run";
	public static final String STC_DO_STEP = "STC_do_step";
	public static final String STC_SEND_OUTPUTS = "STC_send_outputs";
	public static final String STC_STOP = "STC_stop";
	public static final String STC_RESET = "STC_reset";
	public static final String RSP_ACK = "RSP_ack";
	public static final String RSP_NACK = "RSP_nack";
	public static final String RSP_STATE_ACK = "RSP_state_ack";
	public static final String RSP_ERROR_ACK = "RSP_error_ack";
	public static final String RSP_LOG_ACK = "RSP_log_ack";
	public static final String NTF_STATE_CHANGED = "NTF_state_changed";
	public static final String NTF_LOG = "NTF_log";
	public static final String INF_STATE = "INF_state";
	public static final String INF_ERROR = "INF_error";
	public static final String INF_LOG = "INF_log";
	public static final String SIG_CONFIGURED = "SIG_configured";
	public static final String SIG_INITIALIZED = "SIG_initialized";
	public static final String SIG_STEP_DONE = "SIG_step_done";
	public static final String SIG_SEND_COMPLETE = "SIG_send_complete";
	public static final String SIG_STOP = "SIG_stop";
	public static final String SIG_STOPPED = "SIG_stopped";
	public static final String DAT_INPUT_OUTPUT = "DAT_input_output";
	public static final String DAT_parameter = "DAT_parameter";

	public static final byte CFG_SET_TIME_RES_ID = 20;
	public static final byte CFG_SET_STEPS_ID = 21;
	public static final byte CFG_CONFIG_INPUT_ID = 22;
	public static final byte CFG_CONFIG_OUTPUT_ID = 23;
	public static final byte CFG_CONFIG_CLEAR_ID = 24;
	public static final byte CFG_SET_TARGET_NETWORK_INFORMATION_ID = 25;
	public static final byte CFG_SET_SOURCE_NETWORK_INFORMATION_ID = 26;
	public static final byte CFG_SET_PARAMETER_ID = 27;
	public static final byte CFG_SET_CONFIG_TUNABLE_PARAMETER_ID = 28;
	public static final byte CFG_SET_PARAM_NETWORK_INFORMATION_ID = 29;
	public static final byte CFG_SET_LOGGING_ID = 30;
	public static final byte STC_REGISTER_ID = 31;
	public static final byte STC_DEREGISTER_ID = 32;
	public static final byte STC_CONFIGURE_ID = 33;
	public static final byte STC_INITIALIZE_ID = 34;
	public static final byte STC_REINITIALIZE_ID = 35;
	public static final byte STC_RUN_ID = 36;
	public static final byte STC_DO_STEP_ID = 37;
	public static final byte STC_SEND_OUTPUTS_ID = 38;
	public static final byte STC_STOP_ID = 39;
	public static final byte STC_RESET_ID = 40;
	public static final byte RSP_ACK_ID = 41;
	public static final byte RSP_NACK_ID = 42;
	public static final byte RSP_STATE_ACK_ID = 43;
	public static final byte RSP_ERROR_ACK_ID = 44;
	public static final byte RSP_LOG_ACK_ID = 45;
	public static final byte NTF_STATE_CHANGED_ID = 46;
	public static final byte NTF_LOG_ID = 47;
	public static final byte INF_STATE_ID = 48;
	public static final byte INF_ERROR_ID = 49;
	public static final byte INF_LOG_ID = 50;
	public static final byte SIG_CONFIGURED_ID = 51;
	public static final byte SIG_INITIALIZED_ID = 52;
	public static final byte SIG_STEP_DONE_ID = 53;
	public static final byte SIG_SEND_COMPLETE_ID = 54;
	public static final byte SIG_STOP_ID = 55;
	public static final byte SIG_STOPPED_ID = 56;
	public static final byte DAT_INPUT_OUTPUT_ID = 57;
	public static final byte DAT_parameter_ID = 58;

	/**
	 * Get all Message names
	 * 
	 * @return List with all Message name
	 */
	public static List<String> getAllMessages() {

		List<String> list = new LinkedList<>();

		list.add(CFG_SET_TIME_RES);
		list.add(CFG_SET_STEPS);
		list.add(CFG_CONFIG_INPUT);
		list.add(CFG_CONFIG_OUTPUT);
		list.add(CFG_CONFIG_CLEAR);
		list.add(CFG_SET_TARGET_NETWORK_INFORMATION);
		list.add(CFG_SET_SOURCE_NETWORK_INFORMATION);
		list.add(CFG_SET_PARAMETER);
		list.add(CFG_SET_CONFIG_TUNABLE_PARAMETER);
		list.add(CFG_SET_PARAM_NETWORK_INFORMATION);
		list.add(CFG_SET_LOGGING);
		list.add(STC_REGISTER);
		list.add(STC_DEREGISTER);
		list.add(STC_CONFIGURE);
		list.add(STC_INITIALIZE);
		list.add(STC_REINITIALIZE);
		list.add(STC_RUN);
		list.add(STC_DO_STEP);
		list.add(STC_SEND_OUTPUTS);
		list.add(STC_STOP);
		list.add(STC_RESET);
		list.add(RSP_ACK);
		list.add(RSP_NACK);
		list.add(RSP_STATE_ACK);
		list.add(RSP_ERROR_ACK);
		list.add(RSP_LOG_ACK);
		list.add(NTF_STATE_CHANGED);
		list.add(NTF_LOG);
		list.add(INF_STATE);
		list.add(INF_ERROR);
		list.add(INF_LOG);
		list.add(SIG_CONFIGURED);
		list.add(SIG_INITIALIZED);
		list.add(SIG_STEP_DONE);
		list.add(SIG_SEND_COMPLETE);
		list.add(SIG_STOP);
		list.add(SIG_STOPPED);

		return list;

	}

}
