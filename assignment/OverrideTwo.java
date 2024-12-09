package com.assignment;

//Write a Java program to create a class called Vehicle with a method called drive().
//Create a subclass called Car that overrides the drive() method to print "Repairing a car".
class Vehicle{
	void drive() {
		System.out.println(" You Can drive the vehicle");
	}
}
class Car extends Vehicle{
	void drive() {
		System.out.println(" Reparing theh car");
	}
}
public class OverrideTwo {

	public static void main(String[] args) {
		Car car = new Car();
		car.drive();
	}

}
