package com.efunzo.be.training;

public class Car extends Vehicul{

	private Door door;
	private Engine engine;
	private Tire tire;
	
	public Car(String name, Door door, Engine engine, Tire tire) {
		super(name);
		this.door = door;
		this.engine = engine;
		this.tire = tire;
	}

	public Door getDoor() {
		return door;
	}

	public void setDoor(Door door) {
		this.door = door;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Tire getTire() {
		return tire;
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}

	@Override
	public String toString() {
		return "Car [door=" + door + ", engine=" + engine + ", tire=" + tire + "]";
	}
	
	
	

	
}
