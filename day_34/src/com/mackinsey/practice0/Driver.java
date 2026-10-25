package com.mackinsey.practice0;

/**
 * 
 */
public class Driver {

	public static void main(String[] args) {
		//initialization of an array happens at compile time 
		
		int[] userId = new int[5];
		
		userId[0] = 1;//storing an element might take o(n)
		userId[1] = 2;
		userId[2] = 3;
		userId[3] = 5;
		userId[4] = 8;
		
		System.out.println(userId[0]);//we can access the element in o(1) time complexity
		System.out.println(userId[4]);
				
				
	}

}
