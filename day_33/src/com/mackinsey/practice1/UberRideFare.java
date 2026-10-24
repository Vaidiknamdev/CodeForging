package com.mackinsey.practice1;
/**
 * this calss is responsible for to calculate fare price of the ride 
 */
public class UberRideFare {
	/**
	 * this method is actually calculating the fare price of the ride based on the Type of Ride
	 */
	public int rideFare(String rideType,int distance) {
		int amount = 0;//this is the local variable of this method the scope of this variable is inside this block only
		
		if(rideType.equalsIgnoreCase("AUTO")) {
			if(distance==0) {
				return amount;
			}
			if(distance>1&&distance<=5) {
				amount = amount + 60;
			}else if(distance>5 && distance<10) {
				amount = amount +90;
			}else{
				amount = distance * 5;
				return amount;
			}
		}else if(rideType.equalsIgnoreCase("CAR")) {
			if(distance>1 && distance<10) {
				amount = amount + 100;
			}else if(distance>10 && distance<100) {
				//calculated based on the kilometer reading
				amount = distance * 12;
			}else {
				amount = distance * 13;
				return amount;
			}
		}else if(rideType.equalsIgnoreCase("BIKE")) {
			if(distance<0) {
				return -1;
			}
			if(distance>1&&distance<10) {
				amount = amount + 35;
			}else if(distance>10 && distance<20) {
				amount = distance * 8;
			}else {
				amount = distance * 9;
			}
		}
		return amount;
	}
}
