package com.day4;
class Gadgets{
	void charging() {
		System.out.println("You can Charge a Gadgets");
	}
}
class Mobile extends Gadgets{
	Sim sim = null;
	Mobile (Sim sim){
		this.sim=sim;
	}
	void mobileFunctionality() {
		System.out.println("You can charge Mobile Phone");
	}
	void mobileSimfunctionality() {
		System.out.println("Mobile can have sim");
		sim.insertSim();
	}
	
}
class Sim{
	void insertSim() {
		System.out.println("You can insert sim");
	}
}
public class HasARelationship {

	public static void main(String[] args) {
		Sim sim= new Sim();
		Mobile mobile = new Mobile(sim);
		mobile.charging();
		mobile.mobileFunctionality();
		mobile.mobileSimfunctionality();
		
		// TODO Auto-generated method stub

	}

}
