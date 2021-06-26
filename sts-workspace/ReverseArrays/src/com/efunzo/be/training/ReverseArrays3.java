package com.efunzo.be.training;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrays3 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		int[] numbers = new int[10];
		int[] reverseNumbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			
				System.out.println("Enter the number " + (i + 1) );
				numbers[i] = scan.nextInt();
			
		}
		
		
		for (int k = 0; k < 10; k++) {
			reverseNumbers[k] = numbers[9 - k];
		}
		System.out.println("Here is what you entered:-->"+ Arrays.toString(numbers));
		
		System.out.println("The reverse is :-->"+ Arrays.toString(reverseNumbers));
		
		
	}

}