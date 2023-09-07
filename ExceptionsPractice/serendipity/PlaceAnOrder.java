/*
 * Created by: Jacob Roe
 * Created On: 11/7/2022
 * 
 * Modification Log
 * Date			Programmer		Description
 * 11/7/2022	Jacob Roe		Initial Implementation
 * 
 * Description: A program to prompt the user to place an order and display the appropriate message based off of the user input
 */
package serendipity;

import java.util.Scanner;

public class PlaceAnOrder {

	public static void main(String[] args) {
		// Establish variable
		int ItemNum;
		int Quantity;
		double Price = 0;
		
		//Create Scanner object
		Scanner keyboard = new Scanner(System.in);
		
		//Make Arrays to hold Item Numbers and Prices
		int[] itemNums = {111, 222, 333, 444};
		double[] prices = {0.09, 1.47, 2.43, 5.99};
		
		try {
			
			//Prompt for Item Number
			System.out.println("Please Enter Item Number: ");
			
			//If input was an int execute the following
			if (keyboard.hasNextInt()) {
				
				//Set variable with the inputed int
				ItemNum = keyboard.nextInt();
				
				//determine if the Item Number is valid
				if (ItemNum < 0) {
					
					throw new OrderException(OrderMessages.errorMessages()[1]);
				}
				if (ItemNum > 9999) {
					
					throw new OrderException(OrderMessages.errorMessages()[2]);
				}
			
					//Prompt for Quantity
					System.out.println("Please Enter Desired Quantity: ");
				
					//If input was an int execute the following
					if (keyboard.hasNextInt()) {
					
						//Capture keyboard input
						Quantity = keyboard.nextInt();
					
						//determine if the quantity is valid
						if (Quantity < 0) {
						
							throw new OrderException(OrderMessages.errorMessages()[4]);
						
						}
						if (Quantity > 12) {
						
							throw new OrderException(OrderMessages.errorMessages()[5]);
						
						}
				
						//set boolean variable
						boolean found = false;
						
						//For loop to check to see if 
						for(int i = 0; i < itemNums.length; i++) {
							
							if (itemNums[i] == ItemNum) {
								 
								found = true;
								 
								Price = prices[i] * Quantity;
							 
							}
						}
					if(!found)
						
						throw new OrderException(OrderMessages.errorMessages()[6]);
					
					System.out.println("Total Price: $" + Price);
						
				}
					
				else {
						
					throw new OrderException(OrderMessages.errorMessages()[3]);
					
				}
			
			}
			
			else {
				
				throw new OrderException(OrderMessages.errorMessages()[0]);
				
			}
			
		}
		
		catch(OrderException e){
			
			System.out.println(e.getMessage());
			
		}
		
	}
	
}


