package com.day2;

public class TypesOfMethod {
	void instanceMethod(){//instance method
		System.out.println("Instance Method");
	}
	static void staticMethod(){
		System.out.println("Static Method");
	}

	public static void main(String[] args) {
		TypesOfMethod obj = new TypesOfMethod();
		obj.instanceMethod();
		TypesOfMethod.staticMethod();

	}

}
