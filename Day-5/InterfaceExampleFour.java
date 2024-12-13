package com.day5;

interface VehiclePlan{
	void NoOfEngine();
	void NoOfWheels();
	void brandName();
}
abstract class vehicles implements VehiclePlan{
	public void NoOfEngine() {
		System.out.println("I have one engine");
	}
}
class Scooty extends vehicles{
	public void NoOfWheels() {
		System.out.println("I have 2 wheels");
	}
	public void brandName() {
		System.out.println("Brand name: Yamaga");
		
	} 
}
public class InterfaceExampleFour {

	public static void main(String[] args) {
		VehiclePlan plan ;
		plan = new Scooty();
		plan.NoOfEngine();
		plan.NoOfWheels();
		plan.brandName();

	}

}
