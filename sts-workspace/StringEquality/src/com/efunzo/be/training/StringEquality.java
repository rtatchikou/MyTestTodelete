package com.efunzo.be.training;

public class StringEquality {
	
	public static void main(String[] args) {
		
		int i=2;
	
		System.out.println(i==2);
		
		String s1 = "John";
		String s2 = "John";
		String s3 = "Jo" + "hn";
		String s4 = new String("John");
		
	
		System.out.println( (s1==s2) + " s1==s2");
		System.out.println( (s2==s3) + " s2==s3");
		System.out.println( (s1==s3) + " s1==s3");
		System.out.println( (s1==s4)+ " s1==s4");
		System.out.println( (s3==s4) + " s3==s4");
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		
		System.out.println(s4.equals(s3) + "   s4.equals(s3)");
		
		
		int t = 3 * 5 + 3+7 - 4/2 ;
		int t2 = 3 * (5 + 3)+ 7 - 4/2;
		
		System.out.println(t);
		
		System.out.println(t2);
	}

}
