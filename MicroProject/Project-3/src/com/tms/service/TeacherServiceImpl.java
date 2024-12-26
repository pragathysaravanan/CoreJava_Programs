package com.tms.service;

import com.tms.model.Teacher;
import com.tms.repo.TeacherRepoImpl;
import com.tms.repo.TeacherRepo;

public class TeacherServiceImpl implements TeacherService {
	TeacherRepo teacherRepo = new TeacherRepoImpl(); // -->for Repo

	/**
	 * 
	 * @param employee
	 * @return String It is validating insertaion operton
	 */
	public String insertTeacherValidation(Teacher teacher) {
		String result;
		if (teacher == null) {
			result = "Teacher Object is null";
		}

		else if (teacher.getTid() == 0 || teacher.getTname() == null || teacher.getTsalary() == 0
				|| teacher.getSubject().getSno() == 0) {
			result = "Invalid Teacher Data";
		} else {
			boolean flag = teacherRepo.doInsertTeacher(teacher);
			if (flag) {
				result = "Teacher Object Saved";
			} else {
				result = "Teacher Object not saved";
			}
		}
		return result;
	}

	/**
	 * 
	 * @param id
	 * @return String It is validating Deletion operation
	 */
	public String deleteTeacherValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";
		} else {
			boolean flag = teacherRepo.doDeleteTeacher(id);
			if (flag) {
				result = "Teacher Object Deleted";
			} else {
				result = "Teacher Object Not Found";
			}
		}
		return result;

	}

	/**
	 * 
	 * @param employee
	 * @return String It is validating Upadte operation
	 */
	public String updateTeacherValidation(Teacher teacher) {
		String result;
		if (teacher == null) {
			result = "Employee Object is null";
		}

		else if (teacher.getTid() == 0 || teacher.getTname() == null || teacher.getTsalary() == 0
				|| teacher.getSubject().getSno() == 0) {
			result = "Invalid Employee Data";
		} else {
			boolean flag = teacherRepo.doUpdateTeacher(teacher);
			if (flag) {
				result = "Employee Object Updated";
			} else {
				result = "Employee Object not Found";
			}
		}
		return result;
	}

	/**
	 * 
	 * @param id
	 * @return String It is validating find Particular data
	 */
	public String findTeacherValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";
		} else {
			Teacher teacher = teacherRepo.doFindTeacher(id);
			if (teacher != null) {
				result = teacher.toString();
			} else {
				result = "Employee Object Not Found";
			}
		}
		return result;

	}

	/**
	 * @return It is validating findAll Employee
	 */

	public String findAllTeacherValidation() {
		return teacherRepo.doFindAllTeacher().toString();
	}
}
