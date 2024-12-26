package com.tms.model;

public class Teacher {
	private int tid;
	private String tname;
	private int tsalary;
	private Subject subject;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int tid, String tname, int tsalary, Subject subject) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tsalary = tsalary;
		this.subject = subject;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public int getTsalary() {
		return tsalary;
	}

	public void setTsalary(int tsalary) {
		this.tsalary = tsalary;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "\nTeacher [tid=" + tid + ", tname=" + tname + ", tsalary=" + tsalary + ", subject=" + subject.getSname()
				+ "]\n";
	}

}
