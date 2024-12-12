package com.day4;

import java.util.Scanner;

final class Student{ // final class cannot be inherited
	final static void Exam() {   // Final method cannot be override
		final int a;   // Final variable can be changed
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Score for that Particular Subject: ");
		a = sc.nextInt();
		if(a >= 35) {
			System.out.println("Result of the Examination is Pass");
		}
		else {
			System.out.println("Result of the Examination is Pass");
		}
	}
} 
public class FinalKeyword {

	public static void main(String[] args) {
		Student student = new Student();
		student.Exam();

	}

}
