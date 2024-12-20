package com.day11;

@FunctionalInterface
interface MyInterface1{
	int calc(int a,int b); //public & default
}
/*
//Without lambdaExpression
class Addition implements MyInterface1{
	public int calc(int a, int b) {   //override abstract method
	return a + b;
	}
}

class Subtraction implements MyInterface1{
	public int calc(int a, int b) {  //override abstract method
	return a - b;
	}
}
*/
public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		MyInterface1 ref = (a, b) -> a + b;
		System.out.println("Addition: " + ref.calc(7, 5));
		System.out.println("Addition: " + ref.calc(40, 10));
		
		ref = (a, b) -> a - b;
		System.out.println("Sub: " + ref.calc(7, 5));
		System.out.println("Sub: " + ref.calc(40, 80));

	}

}
