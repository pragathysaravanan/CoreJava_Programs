package com.day7;

interface Inner4 {
	void display();
}

public class InnerClassExampleOne {
	// Non static inner class

	class Inner1 {
		void display() {
			System.out.println("Non-static Inner class");
		}
	}

	// Static inner class

	static class Inner2 {
		void display() {
			System.out.println("static Inner class");
		}

		// static method
		static void display1() {
			System.out.println("Static Inner class using static method");
		}
	}

	public static void main(String[] args) {
		InnerClassExampleOne obj = new InnerClassExampleOne(); // create the outer class instance
		Inner1 obj2 = obj.new Inner1(); // use the outer class instane to create an instance of the inner class
		obj2.display();
		System.out.println();
		Inner2 obj3 = new InnerClassExampleOne.Inner2();
		obj3.display();
		Inner2.display1(); // using static method
		System.out.println();

		// Local class

		class Inner3 {
			void display() {
				System.out.println("Local  inner class");
			}
		}
		Inner3 inner3 = new Inner3();
		inner3.display();
		System.out.println();

		Inner4 obj5 = new Inner4() {
			public void display() {
				System.out.println("Annonymous Inner class");
			}
		};
		obj5.display();
	}

}
