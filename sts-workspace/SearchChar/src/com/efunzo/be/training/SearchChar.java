package com.efunzo.be.training;

import java.util.Scanner;

public class SearchChar {
	
	public static void main(String[] args) {
		
		System.out.println("Input a string to check whether it contains 'e'");
		Scanner scanner = new Scanner(System.in);
		String st= scanner.nextLine();
	
		
		while(!(st.equals("0"))) {
			
			
			if(st.contains("e")) {
				
				System.out.println("It contains 'e'");
			} else {
				
				System.out.println("It does not contain 'e'");
				
			}
			
			System.out.println("Input a an other string to check whether it contains 'e'");
			
			st= scanner.nextLine();
			
		}
		
		System.out.println("Thank you and good bye!!!");
		
	}

}
