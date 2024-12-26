package com.tms.view;

import java.util.Scanner;

import com.tms.model.Subject;
import com.tms.model.Teacher;

public class TeacherView {
	static Scanner sc = new Scanner(System.in);
	static int tid, tsalary, sno;
	static String tname, sname;

	public static void printResult(String result) {
		System.out.println(result);
	}

	public static void printInvalid() {
		System.out.println("Invalid Choice");

	}

	/**
	 * 
	 * @return int It will display the Menu
	 */
	public static int printMenu() {
		System.out.println("1. Insert Teacher");
		System.out.println("2. Delete Teacher");
		System.out.println("3. Update Teacher");
		System.out.println("4. Find Teacher");
		System.out.println("5. Find all Teacher");
		System.out.println("6. Insert Subject");
		System.out.println("7. Delete Subject");
		System.out.println("8. Update Subject");
		System.out.println("9. Find Subject");
		System.out.println("10. Find All Subject");
		System.out.println("11. Exit");

		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		return choice;

	}

	public static String wantToContinue() {
		String msg = "";
		System.out.println("Do you want to continue[Yes| No]: ");
		msg = sc.next();
		return msg;
	}

	public static Teacher insertTeacherView() {

		System.out.println("Enter Teacher id, Name and Salary and Sno ");
		tid = sc.nextInt();
		tname = sc.next();
		tsalary = sc.nextInt();
		sno = sc.nextInt();

		Subject subject = new Subject();
		subject.setSno(sno);

		Teacher teacher = new Teacher(tid, tname, tsalary, subject); // reading and convert it into model
																		// object
		return teacher;

	}

	/**
	 * 
	 * @return int It is used for Deletion Part
	 */
	public static int deleteTeacherView() {

		System.out.println("Enter Teacher id: ");

		return sc.nextInt(); // single value no need to wrap

	}

	/**
	 * 
	 * @return teacher It is used for Updation part
	 */
	public static Teacher updateTeacherView() { // User-interaction Part

		System.out.println("Enter Teacher id, Name and Salary and Sno to update Teacher");
		tid = sc.nextInt();
		tname = sc.next();
		tsalary = sc.nextInt();
		sno = sc.nextInt();

		Subject subject = new Subject();
		subject.setSno(sno);

		Teacher teacher = new Teacher(tid, tname, tsalary, subject); // reading and convert it into model
																		// object
		return teacher;

	}

	/**
	 * 
	 * @return int It is used for find particular Id
	 */

	public static int findTeacherView() { // Finding Part

		System.out.println("Enter Teacher id: ");

		return sc.nextInt(); // single value no need to wrap

	}
}
