
package com.efunzo.be.training;

import java.sql.Date;

import com.efunzo.be.training.extend.Car;

public class PackageAndImports {
	
	public static void main(String[] args) {
		
		String name;
		
		Date date = new Date(0);
		java.util.Date date2 = new java.util.Date();
		
		System.out.println(date);
		System.out.println(date2);
		
		Car car = new Car("Bleu", "Toyota");
		com.efunzo.be.training.second.Car car2 = new com.efunzo.be.training.second.Car(500, "Honda");
		
		System.out.println(car);
		System.out.println(car2);
		
	
	}
}
