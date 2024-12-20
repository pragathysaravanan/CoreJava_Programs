package com.ems.service;

import com.ems.model.Employee;
import com.ems.repo.EmployeeRepo;
import com.ems.repo.EmployeeRepo1;

/**
 * @version 1.0 It is performing validations on CURD operation
 */

public class EmployeeService {
	// EmployeeRepo employeerepo = new EmployeeRepo(); -->for Repo
	EmployeeRepo1 employeeRepo = new EmployeeRepo1();

	/**
	 * 
	 * @param employee
	 * @return String It is validating insertaion operton
	 */
	public String insertValidation(Employee employee) {
		String result;
		if (employee == null) {
			result = "Employee Object is null";
		}

		else if (employee.getEid() == 0 || employee.getEname() == null || employee.getSalary() == 0) {
			result = "Invalid Employee Data";
		} else {
			boolean flag = employeeRepo.doInsert(employee);
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
	public String deleteValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";
		} else {
			boolean flag = employeeRepo.doDelete(id);
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
	public String updateValidation(Employee employee) {
		String result;
		if (employee == null) {
			result = "Employee Object is null";
		}

		else if (employee.getEid() == 0 || employee.getEname() == null || employee.getSalary() == 0) {
			result = "Invalid Employee Data";
		} else {
			boolean flag = employeeRepo.doUpdate(employee);
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
	public String findValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";
		} else {
			Employee employee = employeeRepo.doFind(id);
			if (employee != null) {
				result = employee.toString();
			} else {
				result = "Employee Object Not Found";
			}
		}
		return result;

	}

	/**
	 * @return It is validating findAll Employee
	 */

	public String findAllValidation() {
		return employeeRepo.doFindAll().toString();
	}
}
