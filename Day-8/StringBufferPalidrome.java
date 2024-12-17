package com.day8;

public class StringBufferPalidrome {

	public static void main(String[] args) {
		
		StringBuffer stringbuffer =new StringBuffer("Pragathy");
		if(stringbuffer.equals((stringbuffer.reverse()))) {
			System.out.println("Palidrome");
		}
		else {
			System.out.println("Not a palidromes");
		}
		
		String s1 = new  String("AmmA");
		String s2 = new StringBuffer(s1).reverse().toString();
		if(s1.equals(s2)) {
			System.out.println("Palidrome");
		}
		else {
			System.out.println("Not a Palidrome");
		}

	}

}
