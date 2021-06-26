package com.efunzo.be.training;

public class Main {

	public static void main(String[] args) {
		
		
		//Animal animal = new Animal("MyAnimal", 12) ;
		
		Dog dog = new Dog("Medor", 12) ;
		
		dog.printDetails();
		dog.eat();
		System.out.println(dog.getAverageWeight());
		dog.run(23);
		
		System.out.println("");
        Bird bird = new Bird("Fliyer", 12) ;
		
        bird.printDetails();
        bird.eat();
		System.out.println(bird.getAverageWeight());
		bird.fly(23);
		
		bird.fly();
		
		CanFly canFly = new Bird("Simg", 3);
	
		
		

		}

}
