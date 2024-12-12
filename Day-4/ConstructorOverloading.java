package com.day4;

public class ConstructorOverloading {

	 ConstructorOverloading(int a) {  //constructor 1
		 this(10,5); //parameterized constructor calling for constructor 2
		 System.out.println("The value of  A is " + a);
		 System.out.println();
		 
	}
	 ConstructorOverloading(int a, int b) {//constructor 2
		 this("Pragathy","Saravanan");//parameterized constructor calling
		System.out.println("The sum is: " + (a+b));
		System.out.println("The Difference is: " + (a-b) );
		System.out.println("The Product is: " + a*b);	
		System.out.println();
		 
	}
	ConstructorOverloading(String firstName, String lastName) {   //constructor 3
		System.out.println("The Name of the user is: "+ firstName +" " + lastName);
		System.out.println();
	}

	public static void main(String[] args) {
		ConstructorOverloading obj = new ConstructorOverloading(5);
		//ConstructorOverloading obj1 = new ConstructorOverloading(5,10);
		//ConstructorOverloading obj2 = new ConstructorOverloading("Pragathy", "Saravanan");
		
	}

}
