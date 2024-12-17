package com.day8;

public class StringImmutable {

	public static void main(String[] args) {
		String s =new String("Pragathy");
		s.concat(" Saravanan");
		System.out.println(s);
		
		//reassign
		String s1 = new String("Hello");
		s1 = s1.concat(" Saravanan");
		System.out.println(s1);
		

	}

}
