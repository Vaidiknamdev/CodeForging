package com.mackinsey.practice1;

public class Ride {
	private int rideId;
	private User user;
	private Driver driver;
	private int distance;
	private final int bikeFare=100;
	private final int carFare=300;
	private final int autoFare=150;
	private String rideStatus;

	Ride() {

	}

	Ride(int rideId, User user, Driver driver, int distance,String rideStatus) {
		this(user, driver);
		this.rideId = rideId;
		this.distance = distance;
		this.rideStatus = rideStatus;
	}

	Ride(User user, Driver driver) {
		this.user = user;// stroingg the reference of the object not creating the new object
		this.driver = driver;// stroingg the reference of the objecct not creating the new object
	}

	public int getRideId() {
		return this.rideId;
	}

	public int getDistance() {
		return this.distance;

	}

	public String getStatus() {
		return this.rideStatus;
	}

	///////

	public void setRideId(int rideId) {
		this.rideId = rideId;
	}

	public void setdistance(int distance) {
		this.distance = distance;
	}

//	public void setFare(int fare) {
//		this.fare = fare;
//	}
	public void setRideStatus(String rideStatus) {
		this.rideStatus = rideStatus;
	}
    ///////////
	
	public boolean checkAvailability() {
		if(this.driver.getAvailableStatus()) {
			return true;
		}
		return false;
	}
	public String startRide() {
		String startLocation = user.getPickUpLocation();
		return startLocation;
	}

	public String completeRide() {
		String endLocation = user.getDropLocation();
		return endLocation;
	}

	public int calculateFareAmount() {
		int fareAmount = this.calculateFare();
		return fareAmount;
	}

	private int calculateFare() {
		int fareAmount = 0;
		if(this.driver.getVeichleType().equalsIgnoreCase("CAR")) {
		    fareAmount += this.distance * this.carFare;
			return fareAmount;
		}else if(this.driver.getVeichleType().equalsIgnoreCase("BIKE")) {
			fareAmount += this.distance * this.bikeFare;
			return fareAmount;
		}else if(this.driver.getVeichleType().equalsIgnoreCase("AUTO")){
			fareAmount += this.distance * this.autoFare;
		}else {
			return -1;
		}
		return fareAmount;
	}
//	 && this.driver.getAvailableStatus().equalsIgnoreCase("Available")

	public void bookRide() {
		if(this.checkAvailability()) {
		int fareMount =this.calculateFareAmount();
		this.rideStatus = "RideBooked";
		System.out.println(fareMount);
		System.out.println("Successfully Booked the Ride");
		}else {
			System.out.println("rider is not available");
		}
	}
}
