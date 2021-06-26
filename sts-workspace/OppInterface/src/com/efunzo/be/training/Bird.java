package com.efunzo.be.training;

public class Bird extends Animal implements CanFly{

	public Bird(String name, int age ) {
		super(name, age);
		
		System.out.println("Bird");
		
		
	}

     public void eat() {
		
		System.out.println("Bird can eat");
	}
	
	//public void printDetails() {
		
	//	System.out.println("I am a Bird, may name is "+super.getName()+ " and my age is "+super.getAge());
	//}
	
	public double getAverageWeight() {return 33;}

	
	public void fly() {
		
		System.out.println("This bird fly at default spped: "+ DEFAULT_SPEED);
		
	}
	
	@Override
	public void fly(int speed) {
		
		System.out.println("This bird fly at spped: "+ speed);
		
	}
	
}
