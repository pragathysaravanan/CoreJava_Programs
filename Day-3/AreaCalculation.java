package com.day3;
//Hierarchical Inheritance
class Shapes {
	int length;
	int breath;
	int side;
	int height;

//For rectangle
	public Shapes(int length, int breath) {
		super();
		this.length = length;
		this.breath = breath;
	}

//for square
	public Shapes(int side) {
		super();
		this.side = side;
	}

//for triangle
	public Shapes(int length, int breath, int height) {
		super();//Constructor calling
		
		this.length = length;
		this.breath = breath;
		this.height = height;
	}

	void area() {
		System.out.println("Cannot define Area for Shape");
	}

}

class Rectangle extends Shapes {

	public Rectangle(int length, int breath) {//Parameterized constructor
		super(length, breath);

	}

	void area() {
		int area = length * breath;
		System.out.println("Rectangle area is: " + area);
	}

}

class Square extends Shapes {

	public Square(int side) {
		super(side);
	}

	void area() {
		int area = side * side;
		System.out.println("Square area is: " + area);
	}

}

class Triangle extends Shapes {

	public Triangle(int length, int breath, int height) {
		super(length, breath, height);

	}

	void area() {
		int area = (length * breath * height) / 2;
		System.out.println("Traingle area is: " + area);
	}

}

public class AreaCalculation {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5, 6);
		rectangle.area();
		Square square = new Square(5);
		square.area();
		Triangle triangle = new Triangle(2, 2, 3);
		triangle.area();

	}

}
