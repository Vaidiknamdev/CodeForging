package com.mackinsey.practice1;

public class UberApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UberRideFare uberRideFare = new UberRideFare();
		int resultFare=uberRideFare.rideFare("car", 35);
		System.out.println("Result fare of the car when the distance is 35km :"+resultFare);
		
		UberRideFare uberRideFare1 = new UberRideFare();
		int resultFare1=uberRideFare1.rideFare("auto", 100);
		System.out.println("Result fare of the auto when the distance is 100km:"+resultFare1);
		
		UberRideFare uberRideFare2 = new UberRideFare();
		int resultFare2=uberRideFare2.rideFare("bike", -1);
		System.out.println("Result fare of the bike when the distance is -1km :"+resultFare2);
	}

}
