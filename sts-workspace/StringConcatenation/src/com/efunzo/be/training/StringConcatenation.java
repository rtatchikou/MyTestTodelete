package com.efunzo.be.training;

public class StringConcatenation {

	public static void main(String[] args) {
		
		String text = "hello";
		String anotherText = new String("hello");
		
		System.out.println(2+3); // 5 
		System.out.println("a"+"b"); //ab
		System.out.println(1+2 +"b"); //3b
		System.out.println("b"+ 1+2);//b12
		System.out.println(8/4 + "b"+ 1+2);//2b12
		
		String str = "";
		for (int i = 0; i < 10; i++) {
			str += i+"";
			//str =str +i;
		}
		
		System.out.println(str);
		
		String hello1 =new String("hello");
		String world= "world";
		
		System.out.println(hello1 +" "+world);
		
		
		

	}

}
