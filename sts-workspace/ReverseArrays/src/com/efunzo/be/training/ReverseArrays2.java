package com.efunzo.be.training;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrays2 {

	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer le taille du tableau: ");
		int n = sc.nextInt();

		int tab[] = new int[n];

		
		for (int i = 0; i < n; i++)
		{
			
			if(i==0) {
				System.out.println("Entrer la premiere valeur du tableau: ");
			}else {
				System.out.println("Entrer la prochaine valeur du tableau: ");
			}
			tab[i] = sc.nextInt();
			
		}
		
		
		int reverse[] = new int[n];
		
		
		for (int i = 0; i < n; i++)
		{
			reverse[i] = tab[n-i-1];
		}	
		
		
		System.out.println("You imput --->"+ Arrays.toString(tab));
		System.out.println("The reverse is --->"+ Arrays.toString(reverse));
				
	}

}