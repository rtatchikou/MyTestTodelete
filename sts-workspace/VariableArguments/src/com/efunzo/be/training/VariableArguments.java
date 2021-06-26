package com.efunzo.be.training;

import java.util.Arrays;

public class VariableArguments {

	public static void main(String[] args) {
		
	 print("Java");
	 print("Java", "HTML", "CSS");

	}

	
	public static void print(String... nameBuilder) {
		
		System.out.println(Arrays.toString(nameBuilder));
	}
}
