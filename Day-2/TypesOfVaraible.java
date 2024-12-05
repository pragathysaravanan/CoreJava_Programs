package com.day2;

public class TypesOfVaraible {
	int a = 10;//object variable
	static int b=20;//static variable
	
	public static void main(String[] args) {
		int c = 30;//local variable
		System.out.println("The value of C [local varaible]: " + c);
		TypesOfVaraible obj = new TypesOfVaraible();
		System.out.println("The value of A [object varaible]: " + obj.a);
		System.out.println("The value of C [Static varaible]: " + TypesOfVaraible.b);
	}

} 
