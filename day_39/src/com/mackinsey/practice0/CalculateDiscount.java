package com.mackinsey.practice0;

public class CalculateDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String type = args[0];
		int purchaseValue = Integer.parseInt(args[1]);
		DiscountCalculater discountCalculater = new DiscountCalculater();
		discountCalculater.calculateDiscount(type,purchaseValue);
	}

}
