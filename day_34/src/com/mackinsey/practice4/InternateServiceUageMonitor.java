package com.mackinsey.practice4;

public class InternateServiceUageMonitor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer(1,"vaidik",110);
		
		InternetPlan internetPlan = new InternetPlan("jio",100,999,customer);
		
		internetPlan.checkUsage();
		
		int result=internetPlan.calculateBill(customer.dataUsage-internetPlan.dataLimit);
		System.out.println(result);
	}

}
