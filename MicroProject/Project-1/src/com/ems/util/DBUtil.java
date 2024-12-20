package com.ems.util;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.ems.model.Employee;

/**
 * @author Pragathy S
 * @version 1.0 It is used to store the data (Map as DB & Lsit as DB)
 */

public class DBUtil {

	private static List<Employee> list = new LinkedList<>();
	private static Map<Integer, Employee> map = new HashMap<>();

	public static List<Employee> getListDBInstance() {
		/**
		 * Creating a Instance for List
		 */
		return list;
	}

	public static Map<Integer, Employee> getMapDBInstance() {
		/**
		 * Creating a Instance for Map
		 */
		return map;
	}
}
