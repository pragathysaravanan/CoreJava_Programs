package com.assignment;

 class Person {
	String personName;
	int personAge;
	
	Person(String personName, int personAge){
		this.personName = personName;
		this.personAge = personAge;
}
	void display() {
		System.out.println("Name of the Person: " + personName);
		System.out.println("Age of the person: " + personAge);
		System.out.println();
	}
}
public class Constructor {
	
	public static void main(String[] args) {
		Person person1 =  new Person("Pragathy",21);
		Person person2 =  new Person("Joe",22);
		person1.display();
		person2.display();

	}

}
