package com.day3;

//inheritance
class Vehicle{
	void noOfengine() {
		System.out.println("I have Engine!");
	}
}

//subclass of Vehicle & parent class for bike
class TwoWheeler extends Vehicle{
	void noOfWheels() {
		System.out.println("I have  Two Wheels!");
	}
}
class Bike extends TwoWheeler{
	void brandName() {
		System.out.println("Brand Name: Bajaj");
		System.out.println("Bike Model: NS200");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
	Bike bike = new Bike();
	bike.noOfengine();
	bike.noOfWheels();
	bike.brandName();

	}

}
