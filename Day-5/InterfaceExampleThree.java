package com.day5;

//Interface to interface extends
interface Interface1 {
	// by default it is public and abstarct method
	void myAbstractMethodOne();
}

interface Interface2 extends Interface1 {
	void myAbstractMethodTwo();
}

class MyNormalClass1 implements Interface2 {
	public void myAbstractMethodOne() {
		System.out.println("My abstract method 1");
	}

	public void myAbstractMethodTwo() {
		System.out.println("My abstarct method 2");
	}

	void display() {

	}
}

class Noraml1 extends MyNormalClass1 {
	void display() {
		System.out.println("Just a subclass");
	}
}

public class InterfaceExampleThree {

	public static void main(String[] args) {
		// reference for that Interface
		
		/*   One way
		InterfaceOne inte;
		InterfaceTwo inte1;
		inte =new MyNormalClassOne();
		*/
		
		Interface2 myNormal =  new MyNormalClass1();
		//myNormal = new MyNormalClass1();
		myNormal.myAbstractMethodOne();
		myNormal.myAbstractMethodTwo();
		MyNormalClass1 my = new Noraml1();
		my.display();

	}

}
