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

public class DepartmentRepo {
	/**
	 * 
	 * @param employee
	 * @return boolean It is performing opertaion create employee on DB
	 */
	public boolean doInsertDepartment(Department department) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into pragathy_department values(?, ? )";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, department.getDno());
			ps.setString(2, department.getDname());

			int n = ps.executeUpdate();

			if (n == 1) {
				flag = true;
			}
		} catch (SQLException e) {
			System.out.println("Insert query not executed");
		}
		return flag;
	}

	/**
	 * 
	 * @param employee
	 * @return boolean It is performing operation delete employee on DB
	 */
	public boolean doDeleteDepartment(int id) {

		boolean flag = false;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "delete pragathy_department where dno =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			int n = ps.executeUpdate();

			if (n == 1) {
				flag = true;
			}
		} catch (SQLException e) {
			System.out.println("Delete query not executed");
		}
		return flag;
	}

	/**
	 * 
	 * @param employee
	 * @return boolean Its is performing operation updation on List DB
	 */

	public boolean doUpdateDepartment(Department department) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "update pragathy_department set dname = ? where dno = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, department.getDname());
			ps.setInt(2, department.getDno());

			int n = ps.executeUpdate();

			if (n == 1)
				flag = true;

		} catch (SQLException e) {
			System.out.println("Update query not executed");
		}
		return flag;
	}

	/**
	 * 
	 * @param id
	 * @return employee It is Performing to find Particular id on List DB
	 */

	public Department doFindDepartment(int id) {
		Department department = null;
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from pragathy_department where dno = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				department = new Department();
				department.setDno(rs.getInt("Dno"));
				department.setDname(rs.getString("Dname"));
			

			}
		} catch (SQLException e) {
			System.out.println("Find query not executed");
		}
		return department;
	}

	/**
	 * 
	 * @return list It is Performing to findAll operation on List DB
	 */

	public List<Department> doFindAllDepartment() {
		List<Department> list = new LinkedList<Department>();
		Department department = null;
		try {
			 Connection con = DBUtil.getDBConnection();
			 
			 String sql = "select * from pragathy_department ";
			 PreparedStatement ps = con.prepareStatement(sql);
			 
			 ResultSet rs = ps.executeQuery();
			 while(rs.next()) {
				 department = new Department();
					department.setDno(rs.getInt("dno"));
					department.setDname(rs.getString("dname"));
					
					list.add(department);
					
				 
			 }
		}catch(SQLException e) {
			System.out.println("Find query not executed");
		}
			return list ;
	}
}
