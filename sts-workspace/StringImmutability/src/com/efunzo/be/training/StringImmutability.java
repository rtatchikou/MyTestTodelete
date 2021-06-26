package com.efunzo.be.training;
public class StringImmutability {

	public static void main(String[] args) {
	
     String hello = "hello";
     String hi= hello +"world";
     System.out.println(hi);
     hi = hello;
     System.out.println(hi);
     
     hello = hello.toUpperCase();
     System.out.println(hello);
     
     String s1 = "1";
     String s2 = "2";
     s2= s1.concat(s2);
     s2.concat("3");
     
     System.out.println(s2);
     

	}

}
