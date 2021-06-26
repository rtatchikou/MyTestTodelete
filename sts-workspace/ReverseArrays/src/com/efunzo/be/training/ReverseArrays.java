package com.efunzo.be.training;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrays {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		
		int[] a = new int[10];
		int[] b = new int[10];
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println("Enter an integer");
			
			a[i] =scanner.nextInt();
		}
		
		int j=0;
		
		for (int i = b.length-1; i >=0; i--) {
			b[j]=a[i];
			
			j++;
		}
		
		System.out.println("you have entered --> " + Arrays.toString(a));
		System.out.println("The reverse is --> " + Arrays.toString(b));

	}

}
