package com.ems.main;

import java.util.Scanner;

import com.ems.model.Department;
import com.ems.model.Employee;
import com.ems.service.DepartmentService;
import com.ems.service.EmployeeService;
import com.ems.view.DepartmentView;
import com.ems.view.EmployeeView;

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
		System.out.println("6. Insert Department");
		System.out.println("7. Delete Department");
		System.out.println("8. Update Department");
		System.out.println("9. Find Department");
		System.out.println("10. Find All Department");
		System.out.println("11. Exit");

		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		return choice;

	}

	public static void main(String[] args) {
		EmployeeService employeeservice = new EmployeeService(); // Validation pattern
		String result = ""; // to avoid re declaration
		Employee employee;
		DepartmentService departmentservice = new DepartmentService();
		Department department;
		int id = 0;
		
		String msg = "";

		do {
			int choice = menu();

			switch (choice) {
			case 1:
				employee = EmployeeView.insertEmployeeView();
				result = employeeservice.insertEmployeeValidation(employee);
				System.out.println(result);
				break;
			case 2:
				id = EmployeeView.deleteEmployeeView();
				result = employeeservice.deleteEmployeeValidation(id);
				System.out.println(result);
				break;
			case 3:
				employee = EmployeeView.updateEmployeeView();
				result = employeeservice.updateEmployeeValidation(employee);
				System.out.println(result);
				break;
			case 4:
				id = EmployeeView.findEmployeeView();
				result = employeeservice.findEmployeeValidation(id);
				System.out.println(result);
				break;
			case 5:
				result = employeeservice.findAllEmployeeValidation();
				System.out.println(result);
				break;
			case 6:
				department = DepartmentView.insertDepartmentView();
				result = departmentservice.insertDepartmentValidation(department);
				System.out.println(result);
				break;
			case 7:
				id = DepartmentView.deleteDepartmentView();
				result = departmentservice.deleteDepartmentValidation(id);
				System.out.println(result);
				break;
			case 8:
				department = DepartmentView.updateDepartmentView();
				result = departmentservice.updateDepartmentValidation(department);
				System.out.println(result);
				break;
			case 9:
				id = DepartmentView.findDepartmentView();
				result = departmentservice.findDepartmentValidation(id);
				System.out.println(result);
				break;
			case 10:
				result = departmentservice.findAllDepartmentValidation();
				System.out.println(result);
				break;
			case 11:
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
