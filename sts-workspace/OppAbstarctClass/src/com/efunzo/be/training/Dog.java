package com.efunzo.be.training;

public class Dog extends Animal{

	public Dog(String name, int age ) {
		super(name, age);
		
		System.out.println("Dog");
		
		
	}

     public void eat() {
		
		System.out.println("Dog can eat");
	}
	
	public void printDetails() {
		
		System.out.println("I am a Dog, may name is "+super.getName()+ " and my age is "+super.getAge());
	}
	
	public double getAverageWeight() {return 33;};
	
}
