package com.ems.view;

import java.util.Scanner;

import com.ems.model.Department;
import com.ems.model.Employee;

public class DepartmentView {

	static Scanner sc = new Scanner(System.in);
	static int  dno;
	static String dname;

	



	/**
	 * @return employee It is used for User-interaction Part
	 */
	public static Department insertDepartmentView() {

		System.out.println("Enter Department number and Name ");
		dno = sc.nextInt();
		dname = sc.next();
		
		
		Department department = new Department(dno,dname);
		
		return department;

	}

	/**
	 * 
	 * @return int It is used for Deletion Part
	 */
	public static int deleteDepartmentView() {

		System.out.println("Enter Department id: ");

		return sc.nextInt(); // single value no need to wrap

	}

	/**
	 * 
	 * @return employee It is used for Updation part
	 */
	public static Department updateDepartmentView() { // User-interaction Part

		System.out.println("Enter Department number and Name to update department ");
		dno = sc.nextInt();
		dname = sc.next();
		
		
		Department department = new Department(dno,dname);
		
		return department;

	}

	/**
	 * 
	 * @return int It is used for find particular Id
	 */

	public static int findDepartmentView() { // Finding Part

		System.out.println("Enter Department number: ");

		return sc.nextInt(); // single value no need to wrap

	}
}
