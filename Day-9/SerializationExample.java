package com.day9;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	transient private int empId;
	private String empName;
	private float empSalary;
	
	//Constructor
	public Employee(int empId, String empName, float empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}
	
	
}
public class SerializationExample {
	//Serialization
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee obj = new Employee(100,"Prgathy", 1000);
		
		FileOutputStream fout = new FileOutputStream("D:\\Objectfile.txt"); //creating file for byte stream 
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		objout.writeObject(obj);
		
		fout.close();
		objout.close();
		System.out.println("File created successfully and Objecct saved into files");
		
		
		
		//Desrialization
		
		FileInputStream fin = new FileInputStream("D:\\Objectfile.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		
		Employee obj2 = (Employee) objin.readObject();
		
		
		System.out.println("Employee Id: " + obj2.getEmpId() );
		System.out.println("Employee Name: " + obj2.getEmpName() );
		System.out.println("Employee Salary: " + obj2.getEmpSalary() );
		
		objin.close();
		fin.close();
		

	}

}
