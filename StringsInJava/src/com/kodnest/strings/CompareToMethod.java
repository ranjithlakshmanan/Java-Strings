package com.kodnest.strings;

public class CompareToMethod {

	public static void main(String[] args) {
		String s1 = "Apple";
		String s2 = "Apple";
		System.out.println(s1.compareTo(s2));
		
		String s3 = "Apple";
		String s4 = "apple";
		System.out.println(s3.compareToIgnoreCase(s4));
		
		String s5 = "Apple";
		String s6 = "Bpple";
		System.out.println(s5.compareTo(s6));
		
		String s7 = "Apple";
		String s8 = "Abple";
		System.out.println(s7.compareTo(s8));
		
		String s9 = "Apple";
		String s10 = "Bpple";
		System.out.println(s10.compareTo(s9));
		
		String s11 = "Apple";
		String s12 = "apple";
		System.out.println(s11.compareToIgnoreCase(s12));
	}

}
