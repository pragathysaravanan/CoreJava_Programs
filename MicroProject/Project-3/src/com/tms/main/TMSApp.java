package com.tms.main;

import java.util.Scanner;

import com.tms.model.Subject;
import com.tms.model.Teacher;
import com.tms.service.SubjectServiceImpl;
import com.tms.service.TeacherServiceImpl;
import com.tms.view.SubjectView;
import com.tms.view.TeacherView;

public class TMSApp {
	/**
	 * @author Pragathy S
	 * @version 1.0
	 */
//	static Scanner sc = new Scanner(System.in);
	/**
	 * 
	 * @return int It will display the Menu
	 */

	public static void main(String[] args) {
		TeacherServiceImpl teacherservice = new TeacherServiceImpl(); // Validation pattern
		String result = ""; // to avoid re declaration
		Teacher teacher;
		SubjectServiceImpl subjectservice = new SubjectServiceImpl();
		Subject subject;
		int id = 0;

		String msg = "";

		do {
			int choice = TeacherView.printMenu();

			switch (choice) {
			case 1:
				teacher = TeacherView.insertTeacherView();
				result = teacherservice.insertTeacherValidation(teacher);
				TeacherView.printResult(result);
				break;
			case 2:
				id = TeacherView.deleteTeacherView();
				result = teacherservice.deleteTeacherValidation(id);
				TeacherView.printResult(result);
				break;
			case 3:
				teacher = TeacherView.updateTeacherView();
				result = teacherservice.updateTeacherValidation(teacher);
				TeacherView.printResult(result);
				break;
			case 4:
				id = TeacherView.findTeacherView();
				result = teacherservice.findTeacherValidation(id);
				TeacherView.printResult(result);
				break;
			case 5:
				result = teacherservice.findAllTeacherValidation();
				TeacherView.printResult(result);
				break;
			case 6:
				subject = SubjectView.insertSubjectView();
				result = subjectservice.insertSubjectValidation(subject);
				TeacherView.printResult(result);
				break;
			case 7:
				id = SubjectView.deleteSubjectView();
				result = subjectservice.deleteSubjectValidation(id);
				TeacherView.printResult(result);
				break;
			case 8:
				subject = SubjectView.updateSubjectView();
				result = subjectservice.updateSubjectValidation(subject);
				TeacherView.printResult(result);
				break;
			case 9:
				id = SubjectView.findSubjectView();
				result = subjectservice.findSubjectValidation(id);
				TeacherView.printResult(result);
				break;
			case 10:
				result = subjectservice.findAllSubjectValidation();
				TeacherView.printResult(result);
				break;
			case 11:
				System.exit(0);
				break;
			default:
				TeacherView.printInvalid();
			}
			msg = TeacherView.wantToContinue();
		} while (msg.equalsIgnoreCase("Yes"));

	}
}
