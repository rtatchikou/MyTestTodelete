package com.efunzo.be.training;

import java.util.Arrays;

public class SearchingArrays {

	public static void main(String[] args) {
		
		int[] myInt = {6, 4,17, 3,9, 7,};
		
		Arrays.sort(myInt);
		
		System.out.println(Arrays.binarySearch(myInt, 9));

	}

}
