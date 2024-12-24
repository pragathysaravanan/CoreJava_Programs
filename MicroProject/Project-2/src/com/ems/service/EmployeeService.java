package com.ems.service;

import com.ems.model.Employee;
import com.ems.repo.EmployeeRepo;


/**
 * @version 1.0 It is performing validations on CURD operation
 */

public class EmployeeService {
	 EmployeeRepo employeeRepo = new EmployeeRepo(); // -->for Repo
	//EmployeeRepo1 employeeRepo = new EmployeeRepo1();

	/**
	 * 
	 * @param employee
	 * @return String It is validating insertaion operton
	 */
	public String insertEmployeeValidation(Employee employee) {
		String result;
		if (employee == null) {
			result = "Employee Object is null";
		}

		else if (employee.getEid() == 0 || employee.getEname() == null || employee.getEsalary() == 0 || employee.getDepartment().getDno() == 0) {
			result = "Invalid Employee Data";
		} else {
			boolean flag = employeeRepo.doInsertEmployee(employee);
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
	public String deleteEmployeeValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";
		} else {
			boolean flag = employeeRepo.doDeleteEmployee(id);
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
	public String updateEmployeeValidation(Employee employee) {
		String result;
		if (employee == null) {
			result = "Employee Object is null";
		}

		else if (employee.getEid() == 0 || employee.getEname() == null || employee.getEsalary() == 0 || employee.getDepartment().getDno() == 0) {
			result = "Invalid Employee Data";
		} else {
			boolean flag = employeeRepo.doUpdateEmployee(employee);
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
	public String findEmployeeValidation(int id) {
		String result = "";
		if (id == 0) {
			result = "Invalid Id";
		} else {
			Employee employee = employeeRepo.doFindEmployee(id);
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

	public String findAllEmployeeValidation() {
		return employeeRepo.doFindAllEmployee().toString();
	}
}
