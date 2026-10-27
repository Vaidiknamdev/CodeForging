package com.mackinsey.practice1;

public class Passenger {
	private int passengerId;
	private String name;
	private int age;
	private String passportNumber;
	private int baggageWeight;
	private int baggagePaid;
	private String checkIn;
	private String travelClass;
	
	public Passenger(int passengerId, String name, int age, String passportNumber, int baggageWeight, String travelClass,int baggagePaid,String checkIn) {
		super();
		this.passengerId = passengerId;
		this.name = name;
		this.age = age;
		this.passportNumber = passportNumber;
		this.baggageWeight = baggageWeight;
		this.travelClass = travelClass;
		this.baggagePaid = baggagePaid;
		this.checkIn = checkIn;
	}

	public int getBaggagePaid() {
		return baggagePaid;
	}

	public void setBaggagePaid(int baggagePaid) {
		this.baggagePaid = baggagePaid;
	}

	public String getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public int getBaggageWeight() {
		return baggageWeight;
	}

	public void setBaggageWeight(int baggageWeight) {
		this.baggageWeight = baggageWeight;
	}

	public String getTravelClass() {
		return travelClass;
	}

	public void setTravelClass(String travelClass) {
		this.travelClass = travelClass;
	}
	
	public void displayPassenger() {
		System.out.println("ID :" + this.getPassengerId());
		System.out.println("Name :" +this.getName());
		System.out.println("Travel Class :"+this.getTravelClass());
		System.out.println("Baggage :"+this.getBaggageWeight());	
	}
	
	public void checkBaggage() {
		if(this.baggageWeight<0) {
			System.out.println("NotValidInput baggageWeight");
			return;
		}
		switch(this.travelClass.toLowerCase()) {
		case "economy":
			if(this.baggageWeight>23) {
				int allowed = 23;
				System.out.println("Allowed :"+allowed);
				int extraWeight = this.baggageWeight - 23;
				System.out.println("Extra: " + extraWeight);
				int extraCharge = extraWeight * 20;
				System.out.println("extraCharge: "+extraCharge);
				break;
			}else {
				System.out.println("No additional charge");
				break;
			}
		case "premiumEconomy":
			if(this.baggageWeight>30) {
				int allowed = 30;
				System.out.println("Allowed :"+allowed);
				int extraWeight = this.baggageWeight - 30;
				System.out.println("Extra: " + extraWeight);
				int extraCharge = extraWeight * 20;
				System.out.println("extraCharge: "+extraCharge);
				break;
			}else {
				System.out.println("No additional charge");
				break;
			}
		case "business":
			if(this.baggageWeight>40) {
				int allowed = 40;
				System.out.println("Allowed :"+allowed);
				int extraWeight = this.baggageWeight - 40;
				System.out.println("Extra: " + extraWeight);
				int extraCharge = extraWeight * 20;
				System.out.println("extraCharge: "+extraCharge);
				break;
			}else {
				System.out.println("No additional charge");
				break;
			}
		case "firstClass":
			if(this.baggageWeight>50) {
				int allowed = 50;
				System.out.println("Allowed :"+allowed);
				int extraWeight = this.baggageWeight - 50;
				System.out.println("Extra: " + extraWeight);
				int extraCharge = extraWeight * 20;
				System.out.println("extraCharge: "+extraCharge);
				break;
			}else {
				System.out.println("No additional charge");
				break;
			}
		 default:
			System.out.println("Not a valid Class");
			break;
		}
		
	}
	
	
}
