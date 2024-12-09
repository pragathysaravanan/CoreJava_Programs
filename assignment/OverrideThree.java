package com.assignment;
//Write a Java program to create a class called Shape with a method called getArea().
//Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle
import java.util.Scanner;
class Shape{
	int length;
	int width;
	void getArea() {
		System.out.println("No area for Shape");
	}
}
class RectangleShape extends Shape{
	public RectangleShape(int length, int width) {
		this.length = length;
		this.width = width;
	}

	void getArea() {
		int area;
		area = length*width;
		System.out.println("Area of Rectangle: " + area);
	}
}
public class OverrideThree {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter the length of the rectangle: ");
		int length = sc.nextInt();
		System.out.print("Enter the width of the rectangle: ");
		int width = sc.nextInt();
		RectangleShape rectangle = new RectangleShape(length,width);
		rectangle.getArea();
	}

}
