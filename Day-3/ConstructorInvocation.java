package com.day3;
//single inheritance
class A {
	A(){
		this(2.2f);
		System.out.println("A");
	}
	A(float a){
		this(2);
		System.out.println("A1");
	}
	A(int ab){
		System.out.println("A2");
	}
}
class B extends A{
	B(){//Default constructor calling[super();]
		this("ab");
		System.out.println("B");
	}
	B(String b){
		super();
		System.out.println("B1");
	}
}
public class ConstructorInvocation{
	
	public static void main(String[] args) {
		B inc = new B();
	}

}
