package com.efunzo.be.training;

public class MethodChaining {

	public static void main(String[] args) {

		String s1 = "  bonjour les gars";
		
		String s2 = s1.replace("bonjour", "Bonsoir").replace("gars", "amis").toUpperCase().trim();
		int n3 = s1.replace("les", "mes").indexOf('m');
		
		System.out.println(s2);
		System.out.println(n3);

	}

}
