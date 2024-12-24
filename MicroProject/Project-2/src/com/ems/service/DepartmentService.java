package com.ems.service;

import com.ems.model.Department;
import com.ems.model.Employee;
import com.ems.repo.DepartmentRepo;
import com.ems.repo.EmployeeRepo;


/**
 * @version 1.0 It is performing validations on CURD operation
 */

public class DepartmentService {
	 DepartmentRepo departmentRepo = new DepartmentRepo(); // -->for Repo
	//EmployeeRepo1 employeeRepo = new EmployeeRepo1();

	/**
	 * 
	 * @param employee
	 * @return String It is validating insertaion operton
	 */
	public String insertDepartmentValidation(Department department) {
		String result;
		if (department == null) {
			result = "Employee Object is null";
		}

		else if (department.getDno() == 0 || department.getDname() == null ) {
			result = "Invalid Employee Data";
		} else {
			boolean flag = departmentRepo.doInsertDepartment(department);
			if (flag) {
				result = "Employee Object Saved";
			} else {
				result = "Employee Object not saved";
			}
		}
		return result;
	}

	/**
	 * 
	 * @param id
	 * @return String It is validating Deletion operation
	 */
	public String deleteDepartmentValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";
		} else {
			boolean flag = departmentRepo.doDeleteDepartment(id);
			if (flag) {
				result = "Employee Object Deleted";
			} else {
				result = "Employee Object Not Found";
			}
		}
		return result;

	}

	/**
	 * 
	 * @param employee
	 * @return String It is validating Upadte operation
	 */
	public String updateDepartmentValidation(Department department) {
		String result;
		if (department == null) {
			result = "Department Object is null";
		}

		else if (department.getDno() == 0 || department.getDname() == null ){
			result = "Invalid Employee Data";
		} else {
			boolean flag = departmentRepo.doUpdateDepartment(department);
			if (flag) {
				result = "Department Object Updated";
			} else {
				result = "Department Object not Found";
			}
		}
		return result;
	}

	/**
	 * 
	 * @param id
	 * @return String It is validating find Particular data
	 */
	public String findDepartmentValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";
		} else {
			Department department = departmentRepo.doFindDepartment(id);
			if (department != null) {
				result = department.toString();
			} else {
				result = "Department Object Not Found";
			}
		}
		return result;

	}

	/**
	 * @return It is validating findAll Employee
	 */

	public String findAllDepartmentValidation() {
		return departmentRepo.doFindAllDepartment().toString();
	}
}
