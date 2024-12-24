package com.ems.view;

import java.util.Scanner;

import com.ems.model.Department;
import com.ems.model.Employee;

public class EmployeeView {

	static Scanner sc = new Scanner(System.in);
	static int eid, esalary, dno;
	static String ename, dname;

	/**
	 * 
	 * @return int It will display the Menu
	 */



	/**
	 * @return employee It is used for User-interaction Part
	 */
	public static Employee insertEmployeeView() {

		System.out.println("Enter Employee id, Name and Salary and dno ");
		eid = sc.nextInt();
		ename = sc.next();
		esalary = sc.nextInt();
		dno = sc.nextInt();
		
		Department department = new Department();
		department.setDno(dno);

		Employee employee = new Employee(eid,ename,esalary,department); // reading and convert it into model
																					// object
		return employee;

	}

	/**
	 * 
	 * @return int It is used for Deletion Part
	 */
	public static int deleteEmployeeView() {

		System.out.println("Enter Employee id: ");

		return sc.nextInt(); // single value no need to wrap

	}

	/**
	 * 
	 * @return employee It is used for Updation part
	 */
	public static Employee updateEmployeeView() { // User-interaction Part

		System.out.println("Enter Employee id, Name and Salary and dno to update employee");
		eid = sc.nextInt();
		ename = sc.next();
		esalary = sc.nextInt();
		dno = sc.nextInt();
		
		Department department = new Department();
		department.setDno(dno);

		Employee employee = new Employee(eid,ename,esalary,department); // reading and convert it into model
																					// object
		return employee;

	}

	/**
	 * 
	 * @return int It is used for find particular Id
	 */

	public static int findEmployeeView() { // Finding Part

		System.out.println("Enter Employee id: ");

		return sc.nextInt(); // single value no need to wrap

	}
}
