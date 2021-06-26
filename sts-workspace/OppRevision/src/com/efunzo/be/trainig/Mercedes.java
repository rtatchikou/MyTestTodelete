package com.efunzo.be.trainig;

public class Mercedes extends Car{
	
	private int cylender;

	public Mercedes(String name, int age, int cylender) {
		super(name, age);
		this.cylender = cylender;
	}
	

	public Mercedes() {
		super("No name", 0);
		this.cylender = cylender;
	}

	public int getCylender() {
		System.out.println("Mercede.getName() is called");	
		return cylender;
	}

	/*
     public String getName() {
		
		System.out.println("Mercedes.getName() is called");	
		return super.getName();
	}



	public int getAge() {
		System.out.println("Mercedes.getAge() is called");	
	    return super.getAge();
	}*/
	

}
