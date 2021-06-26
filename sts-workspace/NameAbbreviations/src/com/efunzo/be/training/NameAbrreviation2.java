package com.efunzo.be.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NameAbrreviation2 {
	
	private static Scanner scan;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Bonjour, quel est votre nom s'il vous plait ?");
		String nomComplet = sc.nextLine();
		
		String nom="";
		 
		char [] abr = new char[10];
		int j=-1;
		String firstName = new String() ;

		for (int i=0; i<nomComplet.length(); i++) {

		if (nomComplet.charAt(i)==' ') {
			nom += nomComplet.substring(i+1, i+2).toUpperCase();
		j++;
		abr[j]=nomComplet.charAt(i+1);
		}

		int k=0;
		do {
		firstName=""+nomComplet.charAt(k);
		k++;
		}while(nomComplet.charAt(k)!=' ');

		System.out.println("Bienvenue, "+firstName+"");
		}
		}

		}

	



