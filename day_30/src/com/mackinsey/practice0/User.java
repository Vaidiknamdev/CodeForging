package com.mackinsey.practice0;

public class User {
	String userName;
	String userId;
	String mobileNumber;
	
	User(String userName,String userId,String mobileNumber){
		this(userName,userId);
		System.out.println("constructor started");
		this.mobileNumber = mobileNumber;
		System.out.println();
	}
	User(){
		this("userName","user");
	}
	User(String userName,String userId){
		
		this.userId= userId;
		this.userName = userName;
		
	}
}
