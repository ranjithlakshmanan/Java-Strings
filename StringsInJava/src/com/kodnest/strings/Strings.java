package com.kodnest.strings;

public class Strings {

	public static void main(String[] args) {
		
		String s1 = "Kodnest";
		System.out.println(s1);
		
		String s2 = new String("Kodnest");
		System.out.println(s2);
		
		char ch[] = {'a', 'b', 'c', 'd'};
		String s3 = new String(ch);
		System.out.println(s3);
	}

}
