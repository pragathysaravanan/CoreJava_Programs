package com.tms.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.tms.DBUtil.DBUtil;
import com.tms.model.Subject;

public class SubjectRepoImpl implements SubjectRepo {
	public boolean doInsertSubject(Subject subject) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "insert into pragathy_subject values(?, ? )";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, subject.getSno());
			ps.setString(2, subject.getSname());

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
	 * @param Subject
	 * @return boolean It is performing operation delete subject on DB
	 */
	public boolean doDeleteSubject(int id) {

		boolean flag = false;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "delete pragathy_subject where sno =?";
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
	 * @param subject
	 * @return boolean Its is performing operation updation on DB
	 */

	public boolean doUpdateSubject(Subject subject) {
		boolean flag = false;
		try {
			Connection con = DBUtil.getDBConnection();
			String sql = "update pragathy_subject set sname = ? where sno = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, subject.getSname());
			ps.setInt(2, subject.getSno());

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
	 * @return employee It is Performing to find Particular id on DB
	 */

	public Subject doFindSubject(int id) {
		Subject subject = null;
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from pragathy_subject where sno = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);

			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				subject = new Subject();
				subject.setSno(rs.getInt("Sno"));
				subject.setSname(rs.getString("Sname"));

			}
		} catch (SQLException e) {
			System.out.println("Find query not executed");
		}
		return subject;
	}

	/**
	 * 
	 * @return list It is Performing to findAll operation on DB
	 */

	public List<Subject> doFindAllSubject() {
		List<Subject> list = new LinkedList<Subject>();
		Subject subject = null;
		try {
			Connection con = DBUtil.getDBConnection();

			String sql = "select * from pragathy_subject ";
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				subject = new Subject();
				subject.setSno(rs.getInt("sno"));
				subject.setSname(rs.getString("sname"));

				list.add(subject);

			}
		} catch (SQLException e) {
			System.out.println("Find query not executed");
		}
		return list;
	}
}
