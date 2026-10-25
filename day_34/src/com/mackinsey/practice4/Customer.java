package com.mackinsey.practice4;

/**
 * Customer class is responsible to store the user specific data!
 */
public class Customer {
	int customerId;
	String customerName;
	int dataUsage;
	public Customer(int customerId, String customerName, int dataUsage) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.dataUsage = dataUsage;
	}
	public void customerDetail() {
		System.out.println(this.customerId+" "+this.customerName+" "+this.dataUsage);
	}
}
