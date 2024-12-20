package com.ems.main;

import java.util.Scanner;

import com.ems.model.Employee;
import com.ems.service.EmployeeService;

public class EMSApp {
	/**
	 * @author Pragathy S
	 * @version 1.0
	 */

	static Scanner sc = new Scanner(System.in);

	/**
	 * 
	 * @return int It will display the Menu
	 */

	public static int menu() {
		System.out.println("1. Insert Employee");
		System.out.println("2. Delete Employee");
		System.out.println("3. Update Employee");
		System.out.println("4. Find Employee");
		System.out.println("5. Find all Employee");
		System.out.println("6. Exit");

		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		return choice;

	}

	/**
	 * @return employee It is used for User-interaction Part
	 */
	public static Employee insertView() {

		System.out.println("Enter Employee id, Name and Salary");

		Employee employee = new Employee(sc.nextInt(), sc.next(), sc.nextDouble()); // reading and convert it into model
																					// object
		return employee;

	}

	/**
	 * 
	 * @return int It is used for Deletion Part
	 */
	public static int deleteView() {

		System.out.println("Enter Employee id: ");

		return sc.nextInt(); // single value no need to wrap

	}

	/**
	 * 
	 * @return employee It is used for Updation part
	 */
	public static Employee updateView() { // User-interaction Part

		System.out.println("Enter Employee id, Name and Salary");

		Employee employee = new Employee(sc.nextInt(), sc.next(), sc.nextDouble()); // reading and convert it into
																					// model/Bean
																					// object
		return employee;

	}

	/**
	 * 
	 * @return int It is used for find particular Id
	 */

	public static int findView() { // Finding Part

		System.out.println("Enter Employee id: ");

		return sc.nextInt(); // single value no need to wrap

	}

	public static void main(String[] args) {
		EmployeeService employeeservice = new EmployeeService(); // Validation pattern
		String result = ""; // to avoid re declaration
		Employee employee;
		int id;
		String msg = "";

		do {
			int choice = menu();

			switch (choice) {
			case 1:
				employee = insertView();
				result = employeeservice.insertValidation(employee);
				System.out.println(result);
				break;
			case 2:
				id = deleteView();
				result = employeeservice.deleteValidation(id);
				System.out.println(result);
				break;
			case 3:
				employee = updateView();
				result = employeeservice.updateValidation(employee);
				System.out.println(result);
				break;
			case 4:
				id = findView();
				result = employeeservice.findValidation(id);
				System.out.println(result);
				break;
			case 5:
				result = employeeservice.findAllValidation();
				System.out.println(result);
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Do you want to continue[Yes| No]: ");
			msg = sc.next();
		} while (msg.equalsIgnoreCase("Yes"));

	}

}
