package com.efunzo.be.training;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Papa");
		System.out.println(args.length);
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		//System.out.println(args[3]);
		
		
		
		Person person = new Person();
		
		person.setFirstName(args[0]);
		person.setLastName(args[1]);
		person.setAge(Integer.parseInt(args[2]));
		
		System.out.println("First Name: " +person.getFirstName());
		System.out.println("Last Name: "+ person.getLastName()	);
		
		System.out.println(person);
		
		
	}
	
	
}
