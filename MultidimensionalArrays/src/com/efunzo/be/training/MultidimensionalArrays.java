package com.efunzo.be.training;

public class MultidimensionalArrays {

	public static void main(String[] args) {
		
		//1 d array
		int[] myInt = new int[3];
		
		// 2 d array
		int[][] myInt2 = new int[3][4];
		
		//// 3 d array
		int[][][] myInt3= new int[3][4][2];

		
		int[] myInt_1 = {1,2,3};
		
		int[][] myInt2_2 = {{1,3, 4},{3,7,7}};// 2X3
		
		int[][][] myInt3_3 = {{{1,2},{3,5}}, {{1,2},{3,5}},} ;       //2, 2, 2
		
		/*
		 * 
		1111
		0111
		0011
		0001
		   
		   */
		
		int[][] myInt11 = new int[4][4];
		
		for (int i = 0; i < 4; i++) {
			
			for (int j = 0; j < 4; j++) {
				
				if(i<=j) {
					
					System.out.print(1);
				} else {
					System.out.print(0);
				}
			}
			System.out.println("");
			
		}
	}

}
