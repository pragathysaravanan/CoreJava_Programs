package com.ems.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.ems.model.Department;
import com.ems.model.Employee;
import com.ems.util.DBUtil;

/**
 * @author Pragathy S
 * @version 1.0 It is performing all the CRUD operations on List DB
 */



public class EmployeeRepo {
	/**
	 * 
	 * @param employee
	 * @return boolean It is performing opertaion create employee on DB
	 */
	DepartmentRepo departmentRepo = new DepartmentRepo(); ;
	
	public boolean doInsertEmployee(Employee employee) {
		boolean flag = false;
try {
		Connection con = DBUtil.getDBConnection();
		String sql = "insert into pragathy_employee values(?, ?, ?, ? )";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, employee.getEid());
		ps.setString(2, employee.getEname());
		ps.setInt(3, employee.getEid());
		ps.setInt(4, employee.getDepartment().getDno());
		
		int n = ps.executeUpdate();
		
		if (n == 1 ) {
			flag = true;
		}
	}catch(SQLException  e) {
		System.out.println("Insert query not executed");
		}
return flag;
	}

	/**
	 * 
	 * @param employee
	 * @return boolean It is performing operation delete employee on  DB
	 */
	public boolean doDeleteEmployee(int id) {
		
		boolean flag = false;
		try {
				Connection con = DBUtil.getDBConnection();
				String sql = "delete pragathy_employee where eid =?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, id);
				
				
				int n = ps.executeUpdate();
				
				if (n == 1 ) {
					flag = true;
				}
			}catch(SQLException  e) {
				System.out.println("Delete query not executed");
				}
		return flag;
	}

	/**
	 * 
	 * @param employee
	 * @return boolean Its is performing operation updation on List DB
	 */

	public boolean doUpdateEmployee(Employee employee) {
		boolean flag = false;
		try {
				Connection con = DBUtil.getDBConnection();
				String sql = "update pragathy_employee set ename = ?, esalary = ?, dno = ? where eid = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				
				ps.setString(1, employee.getEname());
				ps.setInt(2, employee.getEid());
				ps.setInt(3, employee.getDepartment().getDno());
				ps.setInt(4, employee.getEid());
				
				int n = ps.executeUpdate();
				
				if (n == 1 ) {
					flag = true;
				}
			}catch(SQLException  e) {
				System.out.println("Update query not executed");
				}
		return flag;	

	}

	/**
	 * 
	 * @param id
	 * @return employee It is Performing to find Particular id on List DB
	 */

	public Employee doFindEmployee(int id) {
		Employee employee = null;
		int deptNo;
		
try {
	 Connection con = DBUtil.getDBConnection();
	 
	 String sql = "select * from pragathy_employee where eid = ? ";
	 PreparedStatement ps = con.prepareStatement(sql);
	 ps.setInt(1, id);
	 
	 ResultSet rs = ps.executeQuery();
	 if(rs.next()) {
		 employee = new Employee();
			employee.setEid(rs.getInt("eid"));
			employee.setEname(rs.getString("ename"));
			employee.setEsalary(rs.getInt("esalary"));
			
			deptNo = rs.getInt("dno");
			Department department = departmentRepo.doFindDepartment(deptNo);
			employee.setDepartment(department);
		 
	 }
}catch(SQLException e) {
	System.out.println("Find query not executed");
}
	return employee;	
	}

	/**
	 * 
	 * @return list It is Performing to findAll operation on List DB
	 */

	public List<Employee> doFindAllEmployee() {
		List<Employee> list = new LinkedList<Employee>();
		Employee employee = null;
		try {
			 Connection con = DBUtil.getDBConnection();
			 
			 String sql = "select * from pragathy_employee ";
			 PreparedStatement ps = con.prepareStatement(sql);
			 
			 ResultSet rs = ps.executeQuery();
			 while(rs.next()) {
				 employee = new Employee();
					employee.setEid(rs.getInt("eid"));
					employee.setEname(rs.getString("ename"));
					employee.setEsalary(rs.getInt("esalary"));
					
					int deptNo = rs.getInt("dno");
					Department department = departmentRepo.doFindDepartment(deptNo);
					employee.setDepartment(department);
					list.add(employee);
					
				 
			 }
		}catch(SQLException e) {
			System.out.println("Find query not executed");
		}
			return list ;
	}
}
