package com.day2;

class Employee{
	int empId;
	String empName;
	double empSalary;

Employee(int empId, String empName, double empSalary){
	this.empId = empId;
	this.empName = empName;
	this.empSalary = empSalary;
}
	
	void display() {
		System.out.println("Employee Id : " + empId);
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee Salary : " + empSalary);
		System.out.println();
	}
}

public class ClassAndObject {

	public static void main(String[] args) {
		
		Employee details =new Employee(1,"Pragathy",25000);
		details.display();
		Employee details1 =new Employee(2,"Shobana",25000);
		details1.display();
		Employee details2 =new Employee(3,"Hema",25000);
		details2.display();
	}

}
