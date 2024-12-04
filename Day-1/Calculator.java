package com.calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		String msg = "";
		Scanner sc = new Scanner(System.in);
		do {

			System.out.print("Enter the value of First number: ");
			float a = sc.nextFloat();
			System.out.print("Enter the value of Second Number: ");
			float b = sc.nextFloat();

			System.out.println("Menu for operation");
			System.out.println("1.Addition \n2.Subtraction \n3.Division \n4.Multiplication \n5. Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Addition of two number: " + (a + b));
				break;
			case 2:
				System.out.println("subraction of two number: " + (a - b));
				break;
			case 3:
				System.out.println("Division of two number: " + (a / b));
				break;
			case 4:
				System.out.println("Multiplication of two number: " + (a * b));
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}

			System.out.println("Do you want to continue [Yes | No ]");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("Yes"));
		sc.close();
	}

}
