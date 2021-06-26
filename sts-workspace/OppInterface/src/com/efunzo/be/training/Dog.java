package com.efunzo.be.training;

public class Dog extends Animal implements CanRun{

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
	
	public double getAverageWeight() {return 33;}

	@Override
	public void run(int speed) {
		
		System.out.println("This Dog run at spped+ "+ speed);
		
	};
	
}
