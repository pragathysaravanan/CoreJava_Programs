package com.ems.model;
/**
 * @author Pragathy S
 * @version 1.1 It is Bean class For Deparment used to wrap the data
 */
public class Department {
	private int dno;
	private String dname;

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int dno, String dname) {
		super();
		this.dno = dno;
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "\nDepartment [dno=" + dno + ", dname=" + dname + "]";
	}
}
