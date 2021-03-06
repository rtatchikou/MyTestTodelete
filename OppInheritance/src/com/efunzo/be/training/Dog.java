package com.efunzo.be.training;

public class Dog extends Animal{

	private int eyes;
	private int legs;
	private String express;
	private int teeth;
	private int tail;
	
	public Dog(String name, int size, int wight,int eyes, int legs, String express, int teeth, int tail) {
		super(name, 1, 1, size, wight);
		this.eyes= eyes;
		this.legs= legs;
		this.express= express;
		this.teeth = teeth;
		this.tail = tail;
	
	}
	
	public void walk(int speed) {
		
		System.out.println("Dod.walk() at " + speed+" called");
	}
	
	public void run(int speed) {
		System.out.println("Dod.run() at " + speed+" called");
	}
	
	private void shew() {
		System.out.println( "Dod.shew() call");
	}
	
	@Override
	public void move(int speed) {
		System.out.println( "Dod.move() call");
		
		if(speed < 10) {
			
			walk(speed);
		} else {
			run(speed);
		}
		
		super.move(speed);
		
	}
	

	
	
	@Override
	public void eat() {
		System.out.println("Doc.eat()  called");
		shew();
		super.eat();
	}

	public int getEyes() {
		return eyes;
	}

	public void setEyes(int eyes) {
		this.eyes = eyes;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public String getExpress() {
		return express;
	}

	public void setExpress(String express) {
		this.express = express;
	}

	public int getTeeth() {
		return teeth;
	}

	public void setTeeth(int teeth) {
		this.teeth = teeth;
	}

	public int getTail() {
		return tail;
	}

	public void setTail(int tail) {
		this.tail = tail;
	}
	
	

	
}
