package com.efunzo.be.trainig;

public class Main {

	public static void main(String[] args) {
	/*	
      Car car = new Car("Toyota", 7);
      
      System.out.println("My car name is ---> " + car.getName());
      
      System.out.println("My car age is --->" + car.getAge()+"\n");
      */
      
      Car mercedes = new Mercedes("mercede blue", 9, 4);
      
      System.out.println("My car name is ---> " + mercedes.getName());
      
      System.out.println("My car age is --->" + mercedes.getAge()+"\n");
      
      
      /*
      Car honda = new Honda();
      
      System.out.println("My car name is ---> " + honda.getName());
      
      System.out.println("My car age is --->" + honda.getAge());
     */
      
      	
      Car car = new Car("Toyota");
      
      System.out.println("My car name is ---> " + car.getName());
      
      System.out.println("My car age is --->" + car.getAge()+"\n");
      
	}

}
