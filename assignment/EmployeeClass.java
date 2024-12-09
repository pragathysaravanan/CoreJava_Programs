package com.assignment;

import java.util.Scanner;

// Write a Java program to create a class called "Employee" with a name, job title, and salary attributes
//methods to calculate and update salary.
class Employee{
	String name;
	String role;
	float salary;
	Employee(String name, String role, float salary){
		this.name = name;
		this.role = role;
		this.salary = salary;
	}
	
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	void annualCalculation() {
		double annual = salary*12;
		System.out.println("Annual salary Calculation: " + annual);
		
	}
	void display() {
		System.out.println("Employee details:");
		System.out.println("Name: " + name + "\tRole: " + role + "\tSalary: " + salary);
		System.out.println();
	}
	
}

public class EmployeeClass {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Name of the Employee: ");
	String name = sc.next();
	System.out.print("Role of the Employee: ");
	String role = sc.next();
	System.out.print("Enter the salary of Employee: ");
	float salary = sc.nextFloat();
	Employee employee =new Employee(name, role, salary);
	employee.annualCalculation();
	employee.display();
	System.out.println("Enter the salary to be updated: ");
	Float updatedSalary = sc.nextFloat();
	employee.setSalary(updatedSalary);
	employee.display();
	
	}
}
