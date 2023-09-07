/*
 * Created by: Jacob Roe
 * Created On: 11/7/2022
 * 
 * Modification Log
 * Date			Programmer		Description
 * 11/7/2022	Jacob Roe		Initial Implementation
 * 
 * Description: A class that stores an array of usable error messages
 */
package serendipity;

public class OrderMessages {
	public static String[] errorMessages() {
	
		//Create array for the error messages and set the strings
		String[] errorMessage = new String[7];
			errorMessage[0] = "The item number is not numeric";
			errorMessage[1] = "The item ordered is too low";
			errorMessage[2] = "The item ordered is too high";
			errorMessage[3] = "The quantity is not numeric";
			errorMessage[4] = "The quantity is too low";
			errorMessage[5] = "The quantity is too high";
			errorMessage[6] = "The item number is not a currently valid item";
			return errorMessage;
	}
}
