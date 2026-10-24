package com.mackinsey.practice1;

/**
 * This class is responsible for showing the customer that the delivery charges or shipping charges are applied or not 
 */
public class FlipKartShipping {
	/**
	 * This method is showing the shipping charges based on conditions
	 */
	public void shipping(int orderAmount,String customerType,int distance) {
		
		System.out.println(orderAmount);
		System.out.println(customerType);
		System.out.println(distance);

		if(customerType.equalsIgnoreCase("Premium")){
			System.out.println("Free Shipping");
		}else if(orderAmount>=500) {
			System.out.println("Free Shipping");
		}else if(orderAmount>=500 && distance>=10) {
			System.out.println("You have to pay 40 rupees shipping amount");
		}else {
			System.out.println("you have to pay 80 rupees shipping amount");
		}
	}
}
