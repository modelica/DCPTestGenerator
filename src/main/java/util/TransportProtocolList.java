package util;

import java.util.LinkedList;
import java.util.List;

/**
 * This class contains the different transport protocol ids specified by the
 * acosar standard
 * 
 *
 */
public class TransportProtocolList {

	public static final int UDP_IPV4 = 0;
	public static final int RFCOMM_BLUETOOTH = 1;
	public static final int CAN_BASED = 2;
	public static final int USB_2_0 = 3;
	public static final int TCP = 4;

	public static List<String> getAllTransportProtocols() {

		List<String> result = new LinkedList<>();
		result.add(Integer.toString(UDP_IPV4));
		result.add(Integer.toString(RFCOMM_BLUETOOTH));
		result.add(Integer.toString(CAN_BASED));
		result.add(Integer.toString(TCP));
		result.add(Integer.toString(USB_2_0));

		return result;
	}

}
