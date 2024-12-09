package com.assignment;
// Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute.
//Calculate the area and circumference of the circle.

import java.util.Scanner;
class Circle{
	private double radius;
	Circle(double area){
		this.radius = area;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	void area() {
		double area;
		double pi =3.14;
		area = pi*(radius*radius);
		System.out.println("The area of the circle is: " + area);
	}
	void perimeter() {
		double perimeter;
		double pi =3.14;
		perimeter = 2*pi*radius;
		System.out.println("The perimeter of the circle is: " + perimeter);
	}
	
}

public class CircleConstructor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of the Circle: ");
		double radius = sc.nextInt();
		Circle circleobj = new Circle(radius);
		circleobj.area();
		circleobj.perimeter();
		System.out.println("\nAfter Updateing");
		circleobj.setRadius(4);	
		circleobj.area();
		circleobj.perimeter();

	}

}
