package com.day11;
@FunctionalInterface
interface myInterface{
	void run();
	static void walk() {
		System.out.println("you are walking");
	}
	default void play() {
		System.out.println("Playing");
	}
}
public class InterfaceExample implements myInterface {
	public void run() {
		System.out.println("You are running");
	}
	public static void main(String[] args) {
		InterfaceExample obj = new InterfaceExample();
		obj.run();
		obj.play();
		myInterface.walk();
		

	}

}
