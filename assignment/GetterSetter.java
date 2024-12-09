package com.assignment;

class Dog{
	private String dogName;
	private String dogBreed;
	
	Dog(String dogName, String dogBreed){
		this.dogName = dogName;
		this.dogBreed = dogBreed;
		
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public String getDogBreed() {
		return dogBreed;
	}

	public void setDogBreed(String dogBreed) {
		this.dogBreed = dogBreed;
	}
	void display() {
		{
			System.out.println("Name og the Dog: " + dogName);
			System.out.println("Breed of the Dog: " + dogBreed );
			
		}
	}
	
	
}

public class GetterSetter {

	public static void main(String[] args) {
		Dog dog1 = new Dog("Joki","German shephared");
		dog1.display();
		Dog dog2 = new Dog("Jet","German shephared");
		dog2.display();
		
		System.out.println("\nAfter Updateing the name and Breed using setter and getter method\n");
		dog1.setDogName("Joe");
		dog1.setDogBreed("Husky");
		dog1.display();
		dog2.setDogName("Zash");
		dog2.setDogBreed("Pug");
		dog2.display();

	}

}
