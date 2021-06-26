package com.efunzo.be.training;

public class StringMethods {

	public static void main(String[] args) {

		String s1 = "hello";

		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.concat(" world"));

		System.out.println(s1.length());

		System.out.println(s1.charAt(0));

		System.out.println("s1.indexOf('e')--> " + s1.indexOf('e'));
		System.out.println("s1.indexOf('l', 1)--> " + s1.indexOf('l', 1));
		System.out.println("s1.indexOf('l', 3)--> " + s1.indexOf('l', 3));
		System.out.println("s1.indexOf('l', 4)--> " + s1.indexOf('l', 4));

		System.out.println(s1.substring(2));

		System.out.println(s1.substring(1, 3));

		String s4 = "Bonjour! comment tu vas";

		System.out.println(s4.indexOf('n'));

		System.out.println(s4.indexOf('n', 7));

		String s7 = "java";
		String s8 = "Java";

		System.out.println(s7.equals(s8));// false
		System.out.println(s7.equalsIgnoreCase(s7));// true

		System.out.println(s7.startsWith("j"));// true
		System.out.println(s7.startsWith("o"));// false

		System.out.println(s8.startsWith("j".toUpperCase()));// true

		System.out.println(s8.contains("av"));// true
		System.out.println(s8.contains("ac"));// false

		System.out.println("Bonjour".replace('j', 's'));

		System.out.println("Bonjour les gars".replace("Bonjour", "Bonsoir"));

		String s10 = "Bonjour les gars";
		String s11 = s10.replace("Bonjour", "Bonsoir");
		System.out.println(s11);

		String s12 = "     Comment tu vas?   ";
		String s13 = s12.trim();
		System.out.println(s12);
		System.out.println(s12.length());
		System.out.println(s13);
		System.out.println(s13.length());

	}

}
