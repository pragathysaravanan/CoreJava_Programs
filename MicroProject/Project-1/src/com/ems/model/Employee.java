package com.ems.model;

/**
 * @author Pragathy S
 * @version 1.0 It is Bean class For Employee used to wrap the data
 */
public class Employee {
	private int eid;
	private String ename;
	private double salary;

	/**
	 * default constructor
	 */
	public Employee() {
		super();
	}

	/**
	 * 
	 * @param eid
	 * @param ename
	 * @param salary Parameterized constructor
	 */
	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}

}
