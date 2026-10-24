package com.mackinsey.practice1;

public class FlipKartApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlipKartShipping flipKartShipping = new FlipKartShipping();
		flipKartShipping.shipping(100, "premium", 5);
		
		FlipKartShipping flipKartShipping1 = new FlipKartShipping();
		flipKartShipping1.shipping(500, "regular", 4);
		FlipKartShipping flipKartShipping2 = new FlipKartShipping();
		flipKartShipping2.shipping(650, "regular", 10);
		FlipKartShipping flipKartShipping3 = new FlipKartShipping();
		flipKartShipping3.shipping(750, "regular", 50);
	}

}
