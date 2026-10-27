package com.mackinsey.practice0;

public class DiscountCalculater {
	int maxDiscount = 2500;
	public void calculateDiscount(String type,int purchase){
		if(purchase>1000) {
			String type1 = type.toLowerCase();
			switch(type1) {
			case "gold":
				 int purchaseDiscount = (purchase*20)/100;
				 if(purchaseDiscount>maxDiscount) {
					 System.out.println(maxDiscount);
					 break;
				 }else {
					 System.out.println(purchaseDiscount);
					 break;
				 } 
		    case "sliver":
			 int purchaseDiscount2 = (purchase*10)/100;
			 if(purchaseDiscount2>maxDiscount) {
				 System.out.println(maxDiscount);
				 break;
			 }else {
				 System.out.println(purchaseDiscount2);
				 break;
			 }
		    case "regular":
		     int purchaseDiscount3 = (purchase*5)/100;
		     if(purchaseDiscount3>maxDiscount) {
				 System.out.println(maxDiscount);
				 break;
			 }else {
				 System.out.println(purchaseDiscount3);
				 break;
			 }
		    default:
		    	System.out.println("Not known");
		        break;
		}
		
	}else {
		System.out.println("purchase is less then 1000");
	}
}
}