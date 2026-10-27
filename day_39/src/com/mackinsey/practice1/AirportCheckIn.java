package com.mackinsey.practice1;

public class AirportCheckIn {
	private Flight flight;
	private Passenger passenger;
	
	
	public AirportCheckIn(Flight flight, Passenger passenger) {
		super();
		this.flight = flight;
		this.passenger = passenger;
	}


	public String boardingProcess() {
		if(passenger.getCheckIn().equalsIgnoreCase("Completed")) {
			if(passenger.getPassportNumber()!="Invalid"){
				if(passenger.getBaggagePaid()>0) {
					System.out.println("Process check in");
					return "You can Board Now";
				}else {
					System.out.println("Boarding Denied");
				}
			}else {
				System.out.println("passportNumber Invalid");
			}
		}
		
		System.out.println();
		System.out.println("//////////flight information//////////");
		System.out.println();
		
		String flightCurrentStatus  = flight.displayFlightStatus();
		System.out.println("flightCurrentStatus"+flightCurrentStatus);
		int gateNumber = flight.getGateNumber();
		System.out.println("flightGateNumber"+gateNumber);
		String destination = flight.getDestination();
		System.out.println("flightDestiantion"+destination);
		
		
		return "Not checked IN";
	}
}
