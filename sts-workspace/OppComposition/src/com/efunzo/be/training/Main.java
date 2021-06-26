package com.efunzo.be.training;

public class Main {

	public static void main(String[] args) {
		
		Door door = new Door(false);
		Tire tire = new Tire(18);
		Engine engine = new Engine(4, false);
		
		Car car = new Car("toyota", door, engine, tire);
		
		System.out.println(car);
		
		car.getDoor().setOpen(true);
		
		System.out.println(car);
		
		car.getEngine().setStarted(true);
		
		System.out.println(car);
		
		
		Door otherDoor = new Door(false);
		Tire otherTire = new Tire(18);
		Engine otherEngine = new Engine(4, false);
		
		
		Car otherCar = new Car("Mazda", otherDoor, otherEngine, otherTire);
		
		System.out.println("otherCar"+ otherCar);
	}

}
