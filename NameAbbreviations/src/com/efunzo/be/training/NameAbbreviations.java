package com.efunzo.be.training;

import java.util.Scanner;

public class NameAbbreviations {

public static void main(String[] args) {
		
		System.out.println("Input a name");
		Scanner scanner = new Scanner(System.in);
		String st= scanner.nextLine();
	
		
		while(!(st.equals("0"))) {
			
			String abbreviation="";
			
			String[]  name = st.split(" ");
			
			for (int i = 0; i < name.length-1; i++) {
				
				abbreviation += name[i].charAt(0)+". ".toUpperCase();
				
			}
			
			abbreviation +=name[name.length-1];
			
			
			System.out.println("The abbreviation of this name is: "+ abbreviation);
			
			
			System.out.println("Input a an other name");
			
			st= scanner.nextLine();
			
		}
		
		System.out.println("Thank you and good bye!!!");
		
	}
}
