package com.efunzo.be.training;

public abstract class Animal {
	
	private int age;
	private String name;
	

	public Animal( String name, int age) {
		this.age = age;
		this.name = name;
		
		System.out.println("Animal");
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		
		System.out.println("Animal can eat");
	}
	
	public void printDetails() {
		
		System.out.println("name --> "+name+ " age --> "+age);
	}
	
	public double getAverageWeight() {return 10;};
	
	
	

}
