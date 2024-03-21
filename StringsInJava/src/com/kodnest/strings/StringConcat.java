package com.kodnest.strings;

public class StringConcat {

	public static void main(String[] args) {
		String s1 = "Java ";
		String s2 = "Program";
		
		String s3 = s1 + s2;
		String s4 = s1.concat(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1 == s2);
	

	}

}
