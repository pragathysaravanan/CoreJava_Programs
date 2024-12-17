package com.day8;

public class stringMethodsExample2 {

	public static void main(String[] args) {
		//convert string to char
		
		String s = "Pragathy";
		char ch[] = s.toCharArray();
		// for each
		
		System.out.println("Anoter way using For Each");
		for(char c : ch) {
			System.out.println(c);
		}
		System.out.println("Anoter way using For");
		//another way to travese 
		
		for(int i = 0 ;i <s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		//split() used to split the string as substrings 
		String name = "Hey  Pragathy welcome!!";
		String temp[] =name.split(" ");
		for(String s1 : temp) {
		System.out.println(s1);
		}
		
		//System.out.println(name.trim());

	}

}
