package com.ems.repo;

import java.util.Iterator;
import java.util.List;

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
	 * @return boolean It is performing create employee on List DB
	 */
	public boolean doInsert(Employee employee) {

		List<Employee> list = DBUtil.getListDBInstance();
		return list.add(employee);
	}

	/**
	 * 
	 * @param employee
	 * @return boolean It is performing delete employee on List DB
	 */
	public boolean doDelete(int id) {
		boolean flag = false;
		List<Employee> list = DBUtil.getListDBInstance();
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			Employee temp = it.next();
			if (temp.getEid() == id) {
				it.remove();
				flag = true;
				break;
			}
		}
		return flag;

	}

	/**
	 * 
	 * @param employee
	 * @return boolean Its is performing updation on List DB
	 */

	public boolean doUpdate(Employee employee) {
		boolean flag = false;
		int index = 0;
		List<Employee> list = DBUtil.getListDBInstance();
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			Employee temp = it.next();
			if (temp.getEid() == employee.getEid()) {
				list.set(index, employee); // for replace
				flag = true;
				break;
			}
			index++;
		}
		return flag;

	}

	/**
	 * 
	 * @param id
	 * @return employee It is Performing to find Particular id on List DB
	 */

	public Employee doFind(int id) {
		Employee employee = null;

		List<Employee> list = DBUtil.getListDBInstance();
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			Employee temp = it.next();
			if (temp.getEid() == id) {
				employee = temp;
				break;
			}
		}
		return employee;
	}

	/**
	 * 
	 * @return list It is Performing to findAll operation on List DB
	 */

	public List<Employee> doFindAll() {
		return DBUtil.getListDBInstance();
	}
}
