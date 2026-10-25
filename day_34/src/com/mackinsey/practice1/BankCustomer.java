package com.mackinsey.practice1;
/**
 * This class is responsible for to create and store the value of the customer 
 */
public class BankCustomer {
	String customerName;
	int balance;
	String phoneNumber;
	
	public BankCustomer(String customerName, int balance, String phoneNumber) {
		super();
		this.customerName = customerName;
		this.balance = balance;
		this.phoneNumber = phoneNumber;
	}
	public String name() {
		return this.customerName;
	}
	public int balance() {
		return this.balance;
	}
	
}
