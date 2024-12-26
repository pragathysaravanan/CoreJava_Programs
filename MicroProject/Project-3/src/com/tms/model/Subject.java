package com.tms.model;

public class Subject {
	private int sno;
	private String sname;

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(int sno, String sname) {
		super();
		this.sno = sno;
		this.sname = sname;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "\nSubject [sno=" + sno + ", sname=" + sname + "]\n";
	}

}
