package com.kodnest.strings;

public class ToggleFirstLetter {

	public static void main(String[] args) {
		String str = "java is fun";
		
		String res = func(str);

		System.out.println(res);

	}
	
	public static String func(String str) {
		String[] s = str.split(" ");
		String resu = "";
		String val = "";
		for (String string : s) {
			resu = (string.charAt(0)+"").toUpperCase()+string.substring(1)+" ";
			val += resu;
		}
		return val;
	}

}
