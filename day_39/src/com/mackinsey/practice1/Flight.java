package com.mackinsey.practice1;

public class Flight {
	private int flightNumber;
	private String destination;
	private int gateNumber;
	private int boardingStatus;

	public Flight(int flightNumber, String destination, int gateNumber, int boardingStatus) {
		super();
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.gateNumber = gateNumber;
		this.boardingStatus = boardingStatus;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getGateNumber() {
		return gateNumber;
	}

	public void setGateNumber(int gateNumber) {
		this.gateNumber = gateNumber;
	}

	public int getBoardingStatus() {
		return boardingStatus;
	}

	public void setBoardingStatus(int boardingStatus) {
		this.boardingStatus = boardingStatus;
	}

	public String displayFlightStatus() {
		switch (this.boardingStatus) {
		case 1:
			return "Not Started";
			
		case 2:
			return "please proceed to Gate" + this.gateNumber;
			
		case 3:
			return "Final Call please reach to the final gate Number F16 Flight is about to take off";
			
		case 4:
			return "Gate Closed";
			
		default:
			return "Flight take Off";
			
		}
	}

}
