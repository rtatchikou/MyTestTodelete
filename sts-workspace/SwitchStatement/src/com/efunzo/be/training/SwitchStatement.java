package com.efunzo.be.training;

import java.util.Random;

public class SwitchStatement {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int dayOfWeek = random.nextInt(4);
		System.out.println("dayOfWeek ="+ dayOfWeek);
		
		switch(dayOfWeek) {
		
		case 0:
			System.out.println("MONDAY");
			break;
		case 1:
			System.out.println("TUESDAY");
			break;
		case 2:
			System.out.println("WEDNESDAY");
			break;
		case 3:
			System.out.println("THURSDAY");
			break;
		case 4:
			System.out.println("FRIDAY");
			break;
		default:
			System.out.println("WOW WEEK-END");
			break;
	
		}
		
		
		char myChar= 'e';
		
	    switch(myChar) {
	    
	    case 'a':
	    case 'e':
	    case 'i':
	    case '0':
	    case 'u':
	    case 'y':
	    	System.out.println("Vowel");
	      break;
	     default:
	    	 System.out.println("Consonant");
	    	
	    }
		
		
		
	}
	
	
	
}


