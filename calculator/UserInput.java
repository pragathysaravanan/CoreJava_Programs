package com.calculator;
import java.util.Scanner;
public class UserInput{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your Student id:");
	int id=sc.nextInt();
	System.out.print("Enter your Student name:");
	String name=sc.next();
	System.out.print("Enter your Student score:");
	float score=sc.nextFloat();
	System.out.println("Student id: " + id);
	System.out.println("Student Name: " + name);
	System.out.println("Student Score: " + score);
}
}

	
	
