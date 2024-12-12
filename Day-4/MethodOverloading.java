package com.day4;
//Method overloading
public class MethodOverloading {
	int myMethod(int a) {
		 System.out.println("The value of  A is " + a);
		 System.out.println();
		 return a;
	}
	void myMethod(int a, int b) {
		System.out.println("The sum is: " + (a+b));
		System.out.println("The Difference is: " + (a-b) );
		System.out.println("The Product is: " + a*b);	
		System.out.println();
		 
	}
	void myMethod(String firstName, String lastName) {
		System.out.println("The Name of the user is: "+ firstName +" " + lastName);
		System.out.println();
	}

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.myMethod(5);
		obj.myMethod(10, 5);
		obj.myMethod("Pragathy","Saravanan");
	}

}
