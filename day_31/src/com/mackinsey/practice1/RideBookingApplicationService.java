package com.mackinsey.practice1;

public class RideBookingApplicationService extends Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Driver driver = new Driver(101, "rahul", "Mp 12 4200","bike",true);
           
//           Driver driver1 = new Driver("Auto", false);
//           
//           Driver driver2 = new Driver();
//           
//           Driver driver3 = new Driver(102,"trivedi","Mp 09 2046","CAR",false);
           /////////
           User user = new User(201, "vaidik", "7999325647", "BTM Bangalore ", "HSR Layout");
           
//           User user1 = new User();
//           
//           System.out.println("stop here");
//           
//           User user2 = new User("Indore", "Bangalore");
//           
//           User user3 = new User(202,"Namdev","9893952636","Pune","Bangalore");
           ///////
           Ride ride = new Ride(301, user, driver, 2, "pending");
           
//           Ride ride1 = new Ride(302,user1,driver1,3,"pending");
//           
//           Ride ride2 = new Ride(303,user2,driver,4,"pending");
//           
//           Ride ride3 = new Ride(304,user3,driver1,5,"pending");
           
           ride.bookRide();
//           System.out.println();
//           ride1.bookRide();
//           System.out.println();
//           ride2.bookRide();
//           System.out.println();
//           ride3.bookRide();
//           System.out.println();
           
//           System.out.println(driver.getDriverName());
//           System.out.println(driver1.getDriverName());
//           System.out.println(driver2.getDriverName());
//           System.out.println(driver3.getDriverName());
           
	}
	
}
