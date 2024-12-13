package com.day5;

abstract class Vehicle {

	abstract void NoOfWheels();// no need to define here so go for abstract

	abstract void brand();// no need to define here so go for abstract

	void NoOfEngine() {
		System.out.println("I have one Engine");
	};
}

class Car extends Vehicle {  //override the abstarct method then only we can define for that abstarct method
	void NoOfWheels() {
		System.out.println("I have 4 Wheels");
	}

	void brand() {
		System.out.println("Brand of My car is TATA motors");
	}
}

class Bike extends Vehicle {
	void NoOfWheels() {
		System.out.println("I have 2 Wheels");
	}

	void brand() {
		System.out.println("Brand of My bike is Yamaga");
	}
}

public class AbstractclassTwo {

	public static void main(String[] args) {
		Vehicle vehicle;// creating refernce for that superclass
		vehicle = new Car(); // DMD
		System.out.println("Vehicle superclass\n");
		vehicle.NoOfEngine();
		System.out.println("\nCar subclass\n");
		vehicle.NoOfWheels();
		vehicle.brand();
		vehicle = new Bike();
		System.out.println("\nBike subclass\n");
		vehicle.NoOfWheels();
		vehicle.brand();

	}

}
