package com.efunzo.be.training;

import java.util.Arrays;

public class BreakStatement {
	
	public static void main(String[] args) {
		
		int[] myInt = new int[6];
		
		int[] myInt2 = new int[] {1,2,3,4};
		
		int[] myInt3 = {2, 4, 8, 5, 8 , 22};
		
		//System.out.println(Arrays.toString(myInt3));
		
		for (int i = 0; i < myInt3.length; i++) {
			
			if(myInt3[i] == 8) {
				
				System.out.println("found it ");
				break;
			} else {
			System.out.println(myInt3[i]);
			
			}
		}
		
		
		int j =0;
		
		while(true && j < myInt3.length) {
			
			if(myInt3[j]==8 ) {
				System.out.println("found it ");
				break;
			}
			
			System.out.println(myInt3[j]);
		
			j++;
		}
		
		
	stop:	for (int i = 0; i < myInt3.length; i++) {

			if (myInt3[i] == 8) {

				System.out.println("found it ");
				break stop;
			} else {
				System.out.println(myInt3[i]);

			}
		}
		
		
	}

}
