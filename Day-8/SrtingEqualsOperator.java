package com.day8;

public class SrtingEqualsOperator {

	public static void main(String[] args) {
		String s1 = new String("Pragathy");
		String s2 = new String("Pragathy");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println("Hashcode");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode() == s2.hashCode());
		String s3 =new String("ja");
		System.out.println(s3.hashCode());
		
		String name1 = "Pragathy";
		String name2 = "Pragathy";
		System.out.println(name1 == name2);  // return true 
		System.out.println(name1.equals(name2)); // return true
		System.out.println("\nIdentity HashCode\n");
		System.out.println(System.identityHashCode(s1)); //store in stack
		System.out.println(System.identityHashCode(s2)); //store in stack
		System.out.println(System.identityHashCode(name1)); //store in stringPool
		System.out.println(System.identityHashCode(name2)); //store in Stringpool
	}

}
