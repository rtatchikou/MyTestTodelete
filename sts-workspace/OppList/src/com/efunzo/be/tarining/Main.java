package com.efunzo.be.tarining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	
	public static void main(String[] args) {
		
		int[] myInt = new int[] {1, 4, 6};
		
		System.out.println("Print myInt before "+ Arrays.toString(myInt));
		
		int[] myInt2 = new int[5];
		
		
		for (int i = 0; i < myInt.length; i++) {
			
			myInt2[i]=myInt[i];
		}
		myInt=myInt2;
		
		System.out.println("Print myInt after "+ Arrays.toString(myInt));
		
				
				
		List<Integer>  myList = new ArrayList<>();
		
		myList.add(1);
		myList.add(3);
		myList.add(4);
		
		for (Integer integer : myList) {
			
			System.out.println(integer);
			
		}
		
	}
}
