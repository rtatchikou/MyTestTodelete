package com.efunzo.be.training;

public class Main {

	public static void main(String[] args) {
		
		//Account raymondAccount = new Account();
				//("45627", 20,"Raymond","ab@g.com" ,"647 999999999" );
		
		
		Account raymondAccount = new Account("Raymond","ab@g.com" ,"647 999999999");
		
		//raymondAccount.setBalance(20);
		
		//raymondAccount.setNumber("45627");
		
		//raymondAccount.setCunstomerPhoneNumber("647 999999999");
		
		//raymondAccount.setCustomereEmailAddress("ab@g.com");
		
		//raymondAccount.setCustomerName("Raymond");
		
		
		
		raymondAccount.withdrawal(30.5);
		
		raymondAccount.deposit(100.8);
	    
		raymondAccount.withdrawal(30.5);
		
		
		System.out.println(raymondAccount);
	}

}
