package com.efunzo.be.training;


public class ContinueStatement {
	
	public static void main(String[] args) {
		
		int[] myInt = {1,4,5,3,9,10,45};
		
		for (int i = 0; i < myInt.length; i++) {
			
			if(myInt[i] % 2 != 0) {
				
				continue;
			}else {
				
				//System.out.println(myInt[i]);
			}
		}
		
		
		int j = 0;

		while (j < myInt.length) {
			
			

			if (myInt[j] % 2 != 0) {
				
				j++;

				continue;
				
			} else {

				System.out.println(myInt[j]);
			}
	         
			j++;
			
		}
			
	
		
	}

}
