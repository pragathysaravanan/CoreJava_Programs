package com.day3;

public class BeanClass {
	private int empId;
	private String empname;
	private double empSalary;

	public BeanClass(int empId, String empname, double empSalary) {//Constructor
		super();
		this.empId = empId;
		this.empname = empname;
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	void display() {
		System.out.println("Employee Name: " + empname);
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Salary: " + empSalary);
		System.out.println();
	}
	public static void main(String[] args) {
		BeanClass emp = new BeanClass(100,"Pragathy",1000);
		emp.display();
		System.out.println("After updating salary using Set Method\n");
		emp.setEmpSalary(1500);//setter method
		emp.display();
		

	}

}
