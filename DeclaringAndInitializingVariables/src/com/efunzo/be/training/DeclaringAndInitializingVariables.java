package com.efunzo.be.training;

import java.util.Scanner;

public class DeclaringAndInitializingVariables {
	
	private String papa;
	private String mama = "Gene";
	static int  price= 500;
	static int tax = 23;
	
	static int  add(int a, int b) {
		return a+b;
	}
	
	
	
	public static void main(String[] args) {
		
	 Scanner scanner = new Scanner(System.in);
	 
	 int i = scanner.nextInt();
	 System.out.println(i);
		 
	   {
	   int tax= 15;
	   System.out.println(add(price, tax));
	   
		}
	
	   int tax= 10;
	
		System.out.println(add(price, tax));
		
	}
	
	

}
