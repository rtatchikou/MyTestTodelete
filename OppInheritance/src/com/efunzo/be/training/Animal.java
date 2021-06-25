package com.efunzo.be.training;

public class Animal {
	
	private String name;
	private int brain;
	private int body;
	private int size;
	private int wight;
	
	
	//public Animal() {

	//}
	
	public Animal(String name, int brain, int body, int size, int wight) {
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.wight = wight;
	}
	
	public void eat() {
		
		System.out.println("Animal.eat()  called");
	}
	
    public void move(int speed) {
		
		System.out.println("Animal.move() at " + speed+" called");
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getBrain() {
		return brain;
	}


	public void setBrain(int brain) {
		this.brain = brain;
	}


	public int getBody() {
		return body;
	}


	public void setBody(int body) {
		this.body = body;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public int getWight() {
		return wight;
	}


	public void setWight(int wight) {
		this.wight = wight;
	}
	
	
	
	
	
	
	
	
	

}
