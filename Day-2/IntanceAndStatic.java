package com.day2;

public class IntanceAndStatic {
	int a = 10;//Instance variable
	static int b = 10;//static variable

	public static void main(String[] args) {
		System.out.println("\nObject variable\n");
		IntanceAndStatic obj1=new IntanceAndStatic();
		System.out.println("Object variable for obj1: " + obj1.a);
		IntanceAndStatic obj2=new IntanceAndStatic();
		System.out.println("Object variable for obj2: " +obj2.a);
		obj1.a = 20;
		System.out.println("\nAfter changing obj1.a value \n");
		System.out.println("Object variable for obj1: " +obj1.a);
		System.out.println("Object variable for obj1: " +obj2.a);
		
		//Static varaible
		System.out.println("\nStatic variable\n");
		System.out.println("Static variable for obj1: " + obj1.b);
		System.out.println("Static variable for obj2: " +obj2.b);
		obj1.b=30;
		System.out.println("\nAfter changing obj1.a value \n");
		System.out.println("Static variable for obj1: " + obj1.b);
		System.out.println("Static variable for obj2: " +obj2.b);
		
	}

}
