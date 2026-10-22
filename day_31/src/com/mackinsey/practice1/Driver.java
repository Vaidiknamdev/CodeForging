package com.mackinsey.practice1;

public class Driver {
	private int DriverId;
	private String DriverName;
	private String vehicleNumber;
	private String vehicleType;
	private boolean availableStatus;
	
	Driver(){
		
	}
	Driver(int DriverId,String DriverName,String vehicleNumber,String veichleType,boolean availableStatus){
		this(veichleType,availableStatus);
		this.DriverId=DriverId;
		this.DriverName=DriverName;
		this.vehicleNumber=vehicleNumber;
	}
	Driver(String vehicleType,boolean availableStatus){
		this.vehicleType=vehicleType;
		this.availableStatus = availableStatus;
	}
	
	public int getDriverId() {
		return this.DriverId;
	}
	public String getDriverName()
	{
		return this.DriverName;
		
	}
	public String getVehicleNumber() {
		return this.vehicleNumber;
	}
	public String getVeichleType() {
		return this.vehicleType;
	}
	public boolean getAvailableStatus() {
		return this.availableStatus;
	}
	
	
	
	///////
	
	public void setDriverId(int DriverId){
		this.DriverId = DriverId;
	}
	public void setDriverName(String DriverName)
	{
		this.DriverName = DriverName;
	}
	public void setVehicleNumber(String vehicleNumber) {
		 this.vehicleNumber = vehicleNumber;
	}
	public void setVehicleType(String vehicleType) {
		 this.vehicleType = vehicleType ;
	}
	public void setAvailableStatus(boolean availableStatus) {
		this.availableStatus = availableStatus;
	}
	
}
