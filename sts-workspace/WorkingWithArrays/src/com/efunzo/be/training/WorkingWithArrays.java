package com.efunzo.be.training;

import java.util.Arrays;

public class WorkingWithArrays {

	public static void main(String[] args) {

		int[] one = new int[3];

		for (int s = 0; s < one.length; s++) {

			System.out.println(one[s]);
		}

		int[] two = new int[] { 1, 2, 3, 4 };

		for (int s = 0; s < two.length; s++) {

			System.out.println(two[s]);
		}
		
		int three[] = {1,2,3,4};
		
		for (int s = 0; s < three.length; s++) {

			System.out.println(three[s]);
		}
		
		
		System.out.println(two.equals(three));
		
		
		int[]  four = new int[4];
		
		four[0]=1;
		four[1]=2;
		four[2]=7;
		four[3]=11;
		//four[4]=14;
				
		for (int s = 0; s < four.length; s++) {

			System.out.println(four[s]);
		}
		
		for (int i : four) {
			System.out.println(i);
		}
		
		System.out.println(Arrays.toString(four));

	}

}
