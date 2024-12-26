package com.tms.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.tms.DBUtil.DBUtil;
import com.tms.model.Subject;
import com.tms.model.Teacher;

public class TeacherRepoImpl implements TeacherRepo {
	SubjectRepo subjectRepo = new SubjectRepoImpl();;

	public boolean doInsertTeacher(Teacher teacher) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into pragathy_teacher values(?, ?, ?, ? )";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, teacher.getTid());
			ps.setString(2, teacher.getTname());
			ps.setInt(3, teacher.getTsalary());
			ps.setInt(4, teacher.getSubject().getSno());
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
	 * @param id
	 * @return boolean It is performing operation delete Teacher on DB
	 */
	public boolean doDeleteTeacher(int id) {

		boolean flag = false;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "delete pragathy_teacher where tid =?";
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
	 * @param teacher
	 * @return boolean Its is performing operation updation on DB
	 */

	public boolean doUpdateTeacher(Teacher teacher) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "update pragathy_teacher set tname = ?, tsalary = ?, sno = ? where tid = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, teacher.getTname());
			ps.setInt(2, teacher.getTsalary());
			ps.setInt(3, teacher.getSubject().getSno());
			ps.setInt(4, teacher.getTid());

			int n = ps.executeUpdate();

			if (n == 1) {
				flag = true;
			}
		} catch (SQLException e) {
			System.out.println("Update query not executed");
		}
		return flag;

	}

	/**
	 * 
	 * @param id
	 * @return teacher It is Performing to find Particular id on DB
	 */

	public Teacher doFindTeacher(int id) {
		Teacher teacher = null;
		int SNo;

		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from pragathy_teacher where tid = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				teacher = new Teacher();
				teacher.setTid(rs.getInt("tid"));
				teacher.setTname(rs.getString("tname"));
				teacher.setTsalary(rs.getInt("tsalary"));

//			SNo = rs.getInt("sno");
//			Subject subject = subjectRepo.doFindDepartment(SNo);
//			employee.setDepartment(department);

				SNo = rs.getInt("sno");
				Subject subject = subjectRepo.doFindSubject(SNo);
				teacher.setSubject(subject);

			}
		} catch (SQLException e) {
			System.out.println("Find query not executed");
		}
		return teacher;
	}

	/**
	 * 
	 * @return list It is Performing to findAll operation on DB
	 */

	public List<Teacher> doFindAllTeacher() {
		List<Teacher> list = new LinkedList<Teacher>();
		Teacher teacher = null;
		int SNo;
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from pragathy_teacher ";
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				teacher = new Teacher();
				teacher.setTid(rs.getInt("tid"));
				teacher.setTname(rs.getString("tname"));
				teacher.setTsalary(rs.getInt("tsalary"));
//					
				SNo = rs.getInt("sno");
				Subject subject = subjectRepo.doFindSubject(SNo);
				teacher.setSubject(subject);
				list.add(teacher);
//					

			}
		} catch (SQLException e) {
			System.out.println("Find query not executed");
		}
		return list;
	}
}
