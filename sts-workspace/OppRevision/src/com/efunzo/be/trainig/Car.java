package com.efunzo.be.trainig;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Car {
	
	private String name;
	private int age;
	
	
	
	public Car(String name, int age) {
		
		this.name = name;
		this.age = age;
	}



	public Car() {
		
		this("No name", 0);
	
	}
	
	
	public Car(String name) {
		this(name, 10);
	
	}



	public String getName() {
		
		System.out.println("Car.getName() is called");	
		return name;
	}



	public int getAge() {
		System.out.println("Car.getAge() is called");	
		return age;
	}


    public static void main(String[] args) {
        
        List<String> a1= Arrays.asList("a", "c", "b");
        List<String> a2= Arrays.asList("A", "b", "c");
        
        Collections.sort(a1);
        Collections.sort(a2);
        
       System.out.println(a1.equals(a2));
    }

}
