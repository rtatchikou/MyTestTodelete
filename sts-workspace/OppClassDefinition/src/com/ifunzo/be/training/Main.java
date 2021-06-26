package com.ifunzo.be.training;

public class Main {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		Car voiture = new Car();
		
		car.engine= "##A";
		//car.setModel("Honda");
		//car.setModel("Toyota");
		car.setModel("Mercedes");
		
		voiture.setModel("Mercedes");
		
		
	System.out.println("My car model is: "+ car.getModel());
	System.out.println("My car model is: "+ voiture.getModel());
		
		
	}

}
