package com.efonzo.be.training;

import java.util.Random;

public class IfElseStatement {
	
	public static void main(String[] args) {
		
		 int a = 23;
		 
		if(a>=23) {
			
			//System.out.println("I am in");
		}
		
        if(!(a>=23)) {
			
			//System.out.println("I am in Again");
		} else {
			//System.out.println("I am not in ");
		}
        
        int score = 84;
        String grade;
        
        
        if(score >=90) {
        	
        	grade="A";
        	
        } else if( score >= 80) {
        	
        	grade="B";
        } else if (score >= 70) {
        	grade ="C";
        } else {
        	
        	grade ="F";
        }
        
        
        
        System.out.println("Grade: "+ grade);
        
        String br = (grade.equals("A"))? "Bravo" :" Sorry";
        
        System.out.println("br: "+ br);
        
        Random rand = new Random();
        int c = rand.nextInt(26) + 'a';
        
        System.out.println("br: "+ c);
        System.out.println((char) c + ", " + c + ": ");
        
	}

}
