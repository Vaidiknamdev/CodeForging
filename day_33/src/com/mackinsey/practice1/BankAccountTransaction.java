package com.mackinsey.practice1;

/**
 * BankAccount Transaction handler through if, else, else if condition 
 */
public class BankAccountTransaction {
	/**
	 * transaction method taking the 3 parameters and checking if withDrawal is possible or not 
	 */
	public void transaction(int balance,String accountStatus,int withDrawalAmount) {
		if(accountStatus.equalsIgnoreCase("Blocked")) {
			System.out.println("Transaction failed");
		}else if(withDrawalAmount<=0) {
			System.out.println("invvalid withd");
		}else if(withDrawalAmount>balance) {
			System.out.println("insufficient Balance");
		}else if(withDrawalAmount>5000) {
			System.out.println("daily withdrawal limit exceeds");
		}
		else {
			System.out.println("withdrawal successfully");
		}
			
	}
}
