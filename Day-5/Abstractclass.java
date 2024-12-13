package com.day5;

//Abstract Class 
//can be acheivedthrough inheritance
abstract class MyAbstract {
	void method() { // normal method(or) concrete method
		System.out.println("Normal method or Concrete method");
	}

	abstract void abstractMethod(); // abstract method 1
	abstract void abstractMethodsTwo();
}
class NormalClass extends MyAbstract{
	
	 protected void abstractMethod() {
		System.out.println("Its is overriding the abstract method one");
		
	}
	public void abstractMethodsTwo() {
		 System.out.println("Its is overriding the abstract method Two");
	 }
}
public class Abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// here you can create reference for that abstract class;
		//Dynamic method dispatch -->
		MyAbstract obj ;
		obj = new NormalClass(); // possible bt object cannot be created for abstract class bcoz it is incompleted class
		obj.abstractMethod();
		obj.abstractMethodsTwo();
		obj.method();
	}

}
