package com.efunzo.be.training;

import java.util.Scanner;

public class Factoriel {

	public static void main(String[] args) {

		System.out.println("Please Enter a number greater than 0");

		Scanner scaner = new Scanner(System.in);

		long theFatorielOf = scaner.nextInt();

		while (theFatorielOf != 0) {

			long fact = 1;

			for (long i = theFatorielOf; i >= 1; i--) {

				fact *= i;

			}

			System.out.println("Factoriel of " + theFatorielOf + " is: " + fact);

			System.out.println("Please Enter another number greater than 0");

			theFatorielOf = scaner.nextInt();

		}

		System.out.println("Sorry done! O is not allowed!!!");
	}

}
