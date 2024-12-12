package com.day4;
class Vehicle{//Parent class
	int a=19;
	void drive() {
		System.out.println("You Can drive the vehicle");
	}
	 void engine() {
		System.out.println("I have one Engine");
}

}
class Car extends Vehicle{ 
	int a=20;
	//inherit the property from parent class
	void drive() {
		System.out.println("Reparing the car");
	}
}
public class MethodOverride {

	public static void main(String[] args) {
		Car car =new Car();
		car.drive();
		car.engine();
		System.out.println(car.a);// superclass reference 
		

	}

}

