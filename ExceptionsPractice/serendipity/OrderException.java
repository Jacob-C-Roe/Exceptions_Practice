/*
 * Created by: Jacob Roe
 * Created On: 11/7/2022
 * 
 * Modification Log
 * Date			Programmer		Description
 * 11/7/2022	Jacob Roe		Initial Implementation
 * 
 * Description: An exception class that accepts one of the messages from OrderMessages as its parameter
 */
package serendipity;

public class OrderException extends Exception
{
	public OrderException(String errorMessage) {
		super(errorMessage);
	}
	
}