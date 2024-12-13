package com.day5;
interface Interface{
	
	// by default it is public and abstarct method
	void myAbstractMethodOne();
	void myAbstractMethodTwo();
}

class MyNormalClass implements Interface{
	public void myAbstractMethodOne(){
		System.out.println("My abstract method 1");
	}
	public void myAbstractMethodTwo(){
		System.out.println("My abstarct method 2");
	}
	void display() {

	}
}
class Noraml extends MyNormalClass{
	void display() {
		System.out.println("Just a subclass");
	}
}
public class InterfaceExample  {

	public static void main(String[] args) {
		//reference for that Interface
		Interface inte;
		inte = new MyNormalClass();
		inte.myAbstractMethodOne();
		inte.myAbstractMethodTwo();
		MyNormalClass my = new Noraml();
		my.display();
	

	}

}
