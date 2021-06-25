package com.efunzo.be.trainig;

public class Car {
	
	private String name;
	private int age;
	
	
	
	public Car(String name, int age) {
		
		this.name = name;
		this.age = age;
	}



	public Car() {
		
		this("No name", 0);
	
	}
	
	
	public Car(String name) {
		this(name, 10);
	
	}



	public String getName() {
		
		System.out.println("Car.getName() is called");	
		return name;
	}



	public int getAge() {
		System.out.println("Car.getAge() is called");	
		return age;
	}

	

}
