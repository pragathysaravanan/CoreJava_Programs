package com.day5;
//Abstarct class with constructor
abstract class VehicleOne {
	VehicleOne(){
		//this(5);
		System.out.println("Astarct class constructor");
	}
	VehicleOne(int a){
		this();
		System.out.println("Abstract class constructor with argument");
	}

	abstract void NoOfWheels();// no need to define here so go for abstract

	abstract void brand();// no need to define here so go for abstract

	void NoOfEngine() {
		System.out.println("I have one Engine");
	};
}

class CarOne extends VehicleOne {  //override the abstarct method then only we can define for that abstarct method

	CarOne(){
		super(8);
	}
	@Override
	void NoOfWheels() {
		System.out.println("I have 4 Wheels");
	}
	@Override
	void brand() {
		System.out.println("Brand of My car is TATA motors");
	}
}
/*
class Bike1 extends Vehicle1 {
	void NoOfWheels() {
		System.out.println("I have 2 Wheels");
	}

	void brand() {
		System.out.println("Brand of My bike is Yamaga");
	}
}
*/
public class AbstractclassThree {

	public static void main(String[] args) {
		VehicleOne vehicle;// creating refernce for that superclass
		vehicle = new CarOne(); // DMD
		System.out.println("Vehicle superclass\n");
		vehicle.NoOfEngine();
		System.out.println("\nCar subclass\n");
		vehicle.NoOfWheels();
		vehicle.brand();
		/*vehicle = new Bike();
		System.out.println("\nBike subclass\n");
		vehicle.NoOfWheels();
		vehicle.brand();*/

	}

}