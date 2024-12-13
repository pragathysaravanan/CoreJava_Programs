package com.day5;

//Implements multiple interface
interface InterfaceOne {
	// by default it is public and abstarct method
	void myAbstractMethodOne();
}

interface InterfaceTwo {
	void myAbstractMethodTwo();
}

class MyNormalClassOne implements InterfaceOne,InterfaceTwo {
	public void myAbstractMethodOne() {
		System.out.println("My abstract method 1");
	}

	public void myAbstractMethodTwo() {
		System.out.println("My abstarct method 2");
	}

	void display() {

	}
}

class NoramlOne extends MyNormalClassOne {
	void display() {
		System.out.println("Just a subclass");
	}
}

public class InterfaceExampleTwo {

	public static void main(String[] args) {
		// reference for that Interface
		
		/*   One way
		InterfaceOne inte;
		InterfaceTwo inte1;
		inte =new MyNormalClassOne();
		*/
		
		MyNormalClassOne myNormal =  new MyNormalClassOne();
		myNormal = new MyNormalClassOne();
		myNormal.myAbstractMethodOne();
		myNormal.myAbstractMethodTwo();
		MyNormalClassOne my = new NoramlOne();
		my.display();

	}

}
