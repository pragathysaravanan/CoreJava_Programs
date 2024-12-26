package com.tms.view;

import java.util.Scanner;

import com.tms.model.Subject;

public class SubjectView {
	static Scanner sc = new Scanner(System.in);
	static int  sno;
	static String sname;

	



	/**
	 * @return subject It is used for User-interaction Part
	 */
	public static Subject insertSubjectView() {

		System.out.println("Enter Subject number and Name ");
		sno = sc.nextInt();
		sname = sc.next();
		
		Subject subject = new Subject(sno,sname);
		
		return subject;

	}

	/**
	 * 
	 * @return int It is used for Deletion Part
	 */
	public static int deleteSubjectView() {

		System.out.println("Enter Subject id: ");

		return sc.nextInt(); // single value no need to wrap

	}

	/**
	 * 
	 * @return subject It is used for Updation part
	 */
	public static Subject updateSubjectView() { // User-interaction Part

		System.out.println("Enter Subject number and Name to update Subject ");
		sno = sc.nextInt();
		sname = sc.next();
		
		
		Subject subject = new Subject(sno,sname);
		
		return subject;

	}

	/**
	 * 
	 * @return int It is used for find particular Id
	 */

	public static int findSubjectView() { // Finding Part

		System.out.println("Enter Subject number: ");

		return sc.nextInt(); // single value no need to wrap

	}
}
