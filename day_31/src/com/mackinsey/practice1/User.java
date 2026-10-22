package com.mackinsey.practice1;

public class User {
	private int userId;
	private String userName;
	private String userPhoneNumber;
	private String pickUpLocation;
	private String dropLocation;
	
	User(){
		
	}
	User(int userId,String userName,String userPhoneNumber,String pickUpLocation,String dropLocation){
		this(pickUpLocation,dropLocation);
		this.userId=userId;
		this.userName=userName;
		this.userPhoneNumber=userPhoneNumber;
	}
	User(String pickUpLocation,String dropLocation){
		this.pickUpLocation=pickUpLocation;
		this.dropLocation = dropLocation;
	}
	
	public int getUserId() {
		return this.userId;
	}
	public String getUserName()
	{
		return this.userName;
		
	}
	public String getPhoneNumber() {
		return this.userPhoneNumber;
	}
	public String getPickUpLocation() {
		return this.pickUpLocation;
	}
	public String getDropLocation() {
		return this.dropLocation;
	}
	
	///////
	
	public void setUserId(int userId){
		this.userId = userId;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public void setPhoneNumber(String userPhoneNumber) {
		 this.userPhoneNumber = userPhoneNumber;
	}
	public void setPickUpLocation(String pickUpLocation) {
		 this.pickUpLocation = pickUpLocation ;
	}
	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}
	
}
