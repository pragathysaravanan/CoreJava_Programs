package com.day8;

public class StringExample1 {
	
	//ways to create String

	public static void main(String[] args) {
		String s1 = "Pragathy";  //noraml
		String s2 = new String("Hema");// manuallu
		char ch[] = { 'S', 'h', 'o', 'b', 'i' };
		String s3 = new String(ch);// by char

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
