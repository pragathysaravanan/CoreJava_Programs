package com.assignment;
//Write a Java program to create a class called Animal with a method called makeSound()
//Create a subclass called Cat that overrides the makeSound() method to bark.
class Animal{
	void makeSound() {
		System.out.println("Animal Sound");
	}
}
class Cat extends Animal{
	void makeSound() {
		System.out.println("Cat making sound Meow...");
	}
}
public class Override {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.makeSound();

	}

}
 