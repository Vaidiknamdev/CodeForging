package com.mackinsey.practice4;

public class InternetPlan {
	String planName;
	int dataLimit;
	int basePrice;
	Customer customer;
	static int extraDataPrice = 20;

	public InternetPlan(String planName, int dataLimit, int basePrice, Customer customer) {
		super();
		this.planName = planName;
		this.dataLimit = dataLimit;
		this.basePrice = basePrice;
		this.customer = customer;
	}

	public void checkUsage() {
		if (this.customer.dataUsage < this.dataLimit) {
			System.out.println("You have some amount of data usage left");
		} else if (this.customer.dataUsage == this.dataLimit) {
			System.out.println("daily data usage limit exced");
		} else if (this.customer.dataUsage > this.dataLimit) {
			int billValue = this.calculateBill(this.customer.dataUsage - this.dataLimit);
			System.out.println("due bill to pay:" + billValue);
		}
	}

	public int calculateBill(int newDataValue) {
		int extraCharge = newDataValue * InternetPlan.extraDataPrice;
		return extraCharge;
	}

	public int totalMonthBill(int newDataValue) {
		int totalMonthBill = this.basePrice + this.calculateBill(newDataValue);
		return totalMonthBill;
	}

}
