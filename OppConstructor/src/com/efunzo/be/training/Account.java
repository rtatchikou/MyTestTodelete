package com.efunzo.be.training;

public class Account {
	
	private String number;
	private double balance;
	private String customerName;
	private String customereEmailAddress;
	private String cunstomerPhoneNumber;
	
	public Account() {
		
		this("45627", 20,"Raymond","ab@g.com" ,"647 999999999" );
		System.out.println("Empty constructor called");
		
		
	}
	

    public Account( String customerName, String customereEmailAddress, String cunstomerPhoneNumber) {
		
    	this("777777", 100, customerName, customereEmailAddress, cunstomerPhoneNumber);
    	System.out.println("Account constructor some parameters set to default value called");
	}


	public Account(String number, double balance, String customerName,String customereEmailAddress,String cunstomerPhoneNumber ) {
		
		System.out.println("Account constructor with parameters called");
		this.balance =balance;
		this.cunstomerPhoneNumber=cunstomerPhoneNumber;
		this.customereEmailAddress= customereEmailAddress;
		this.customerName =customerName;
		this.number = number;
	}
	
	
	public void deposit(double depositAmount) {
		
		this.balance += depositAmount;
		
		System.out.println("Deposit of "+ depositAmount +" made. New balance is "+ this.balance);
		
	}
	
	public void withdrawal(double withdrawalAmount) {
		
		if(this.balance - withdrawalAmount < 0) {
			
			System.out.println("Only "+ this.balance+ " available. Withdrawal not processed");
		}else {
			
			this.balance -= withdrawalAmount;
			
			System.out.println( "Withdrawal of "+ withdrawalAmount + "precessed, Remaining balace "+ this.balance );
		}
		
	}
	
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomereEmailAddress() {
		return customereEmailAddress;
	}
	public void setCustomereEmailAddress(String customereEmailAddress) {
		this.customereEmailAddress = customereEmailAddress;
	}
	public String getCunstomerPhoneNumber() {
		return cunstomerPhoneNumber;
	}
	public void setCunstomerPhoneNumber(String cunstomerPhoneNumber) {
		this.cunstomerPhoneNumber = cunstomerPhoneNumber;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", balance=" + balance + ", customerName=" + customerName
				+ ", customereEmailAddress=" + customereEmailAddress + ", cunstomerPhoneNumber=" + cunstomerPhoneNumber
				+ "]";
	}
	
	
	

}
