package com.day6;

import java.util.Scanner;

class AgeException extends Exception{
	@Override
	public String toString() {
		return "Invalid age";
	}
}

public class UserDefinedException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		if(age >= 18) {
			System.out.println("Your are Eligible to vote");
		}
		else {
			try {
			throw new AgeException( );  //object creation
			}
			catch(AgeException e) {
				System.out.println(e);
			}
		}

	}

}
