package com.efunzo.be.training;

public class Main {

	public static void main(String[] args) {
		
		
		//Animal animal = new Animal("MyAnimal", 12) ;
		
		Animal animal2 = new Dog("Medor", 12) ;
		
		animal2.printDetails();
		animal2.eat();
		System.out.println(animal2.getAverageWeight());

		}

}
