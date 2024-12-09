package com.assignment;

// Write a Java program to create a class called "Rectangle" with width and height attributes.
//Calculate the area and perimeter of the rectangle.
import java.util.Scanner;

class Rectangle{
	int width;
	int height;
	
	
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	void perimeter() {
		int perimeter;
		perimeter = 2*(width+height);
		System.out.println("\nPerimeter of the Rectangle: " + perimeter);
	}
	void Area() {
		int area;
		area =width*height;
		System.out.println("\nArea of the Rectangle: " + area);
	}
}


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the width of the Rectangle: ");
		int width = sc.nextInt();
		System.out.print("Enter the height of the Rectangle: ");
		int height = sc.nextInt();
		Rectangle w = new Rectangle( width,height);
		w.perimeter();
		w.Area();
	}

}
