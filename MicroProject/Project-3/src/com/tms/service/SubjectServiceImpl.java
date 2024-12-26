package com.tms.service;

import com.tms.model.Subject;
import com.tms.repo.SubjectRepoImpl;
import com.tms.repo.SubjectRepo;

public class SubjectServiceImpl implements SubjectService{
	SubjectRepo subjectRepo = new SubjectRepoImpl(); // -->for Repo


		/**
		 * 
		 * @param subject
		 * @return String It is validating insertaion opertion
		 */
		public String insertSubjectValidation(Subject subject) {
			String result;
			if (subject == null) {
				result = "Subject Object is null";
			}

			else if (subject.getSno() == 0 || subject.getSname() == null ) {
				result = "Invalid Subject Data";
			} else {
				boolean flag = subjectRepo.doInsertSubject(subject);
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
		public String deleteSubjectValidation(int id) {
			String result = "";
			if (id == 0) {
				result = "Invalid Id";
			} else {
				boolean flag = subjectRepo.doDeleteSubject(id);
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
		 * @param subject
		 * @return String It is validating Upadte operation
		 */
		public String updateSubjectValidation(Subject subject) {
			String result;
			if (subject == null) {
				result = "Department Object is null";
			}

			else if (subject.getSno() == 0 || subject.getSname() == null ){
				result = "Invalid Employee Data";
			} else {
				boolean flag = subjectRepo.doUpdateSubject(subject);
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
		public String findSubjectValidation(int id) {
			String result = "";
			if (id == 0) {
				result = "Invalid Id";
			} else {
				Subject subject = subjectRepo.doFindSubject(id);
				if (subject != null) {
					result = subject.toString();
				} else {
					result = "Subject Object Not Found";
				}
			}
			return result;

		}

		/**
		 * @return It is validating findAll Subject
		 */

		public String findAllSubjectValidation() {
			return subjectRepo.doFindAllSubject().toString();
		}
}
