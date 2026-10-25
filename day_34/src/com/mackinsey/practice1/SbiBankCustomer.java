package com.mackinsey.practice1;
/** 
 * class stores the value 
 */
public class SbiBankCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankCustomer bankCustomer = new BankCustomer("vaidik",1000, "9847598375");
		BankCustomer bankCustomer1 = new BankCustomer("rahul",2000, "9847598375");
		BankCustomer bankCustomer2 = new BankCustomer("milan",3000, "984598375");
		BankCustomer bankCustomer3 = new BankCustomer("aditya",4000, "98475375");
		BankCustomer bankCustomer4 = new BankCustomer("aman",5000, "984759375");
		BankCustomer bankCustomer5 = new BankCustomer("naman",1000, "984798375");
		
		
		BankCustomer[] bankCustomerArr = new BankCustomer[6];
		
		bankCustomerArr[0] = bankCustomer;
		bankCustomerArr[1] = bankCustomer1;
		bankCustomerArr[2] = bankCustomer2;
		bankCustomerArr[3] = bankCustomer3;
		bankCustomerArr[4] = bankCustomer4;
		bankCustomerArr[5] = bankCustomer5;
		
		for(int i = 0 ;i<6;i++) {
			if(bankCustomerArr[i].balance<2000) {
				System.out.println(bankCustomerArr[i].name()+ " --- " + bankCustomerArr[i].balance());
			}
		}
		
	}

}
