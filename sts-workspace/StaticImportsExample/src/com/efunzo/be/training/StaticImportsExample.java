package com.efunzo.be.training;

import java.util.Date;

import com.efunzo.be.training.myobject.Car;
import com.efunzo.be.training.utils.Utils;

import static java.lang.Math.*;



public class StaticImportsExample {
	
	private static String MY_NAME= "Raymond";

	public static void main(String[] args) {
		
		System.out.println(MY_NAME);
		
		Date date = new Date();
		
		double pi = PI;
		
		System.out.println(pi);
		
		double min = min(2, 3);
		System.out.println(min);
		
		
		System.out.println(Utils.ALL_POOL);
		
		Car car = new Car();
		
		car.setColor("Blue");
		car.setPrice(2000);
		
		System.out.println(car);

	}

}
