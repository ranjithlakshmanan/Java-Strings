package com.kodnest.strings;

public class EqualProgram {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = new String("Java");
		String s3 = "Java";
		String s4 = s2;
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s4);
		System.out.println(s1.equals(s4));
	}

}
