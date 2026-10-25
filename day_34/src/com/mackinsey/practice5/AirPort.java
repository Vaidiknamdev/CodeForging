package com.mackinsey.practice5;

public class AirPort {
	String airportName;
	Flight[] flight;
	public AirPort(String airportName, Flight[] flight) {
		super();
		this.airportName = airportName;
		this.flight = flight;
	}
	public void displayAllFlights() {
		for(int i =0;i<flight.length;i++) {
			System.out.println(flight[i].flightNumber+" "+flight[i].airLine+" "+flight[i].destination+" "+flight[i].departureTime+" "+flight[i].status);
		}
	}
	
}
