package com.day8;

public class stringMethod {

	public static void main(String[] args) {
		String s1 = new String("Pragathy");
		String s2 =" saravanan";
		System.out.println("Char at- returnd the char at this postion");
		System.out.println(s1.charAt(3)); 
		System.out.println("Used to concat 2 string");
		System.out.println(s1.concat(s2));
		System.out.println("Retirns true or false if it is equals means true");
		System.out.println(s1.equals(s2));
		System.out.println("Position of that first occurance char");
		System.out.println(s1.indexOf('a'));
		System.out.println("Position of that last occurance char");
		System.out.println(s1.lastIndexOf('a'));
		System.out.println("negative index if the char is not present in it");
		System.out.println(s1.indexOf('G'));
		System.out.println("return te length od tha char");
		System.out.println(s1.length());
		System.out.println("returns true is it starts with tha substring");
		System.out.println(s1.startsWith("Pr"));
		System.out.println(s1.endsWith("thy"));
		System.out.println(s1.replace('y', 'i'));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.substring(3,6));
		System.out.println(s2.substring(2));

	}

}
