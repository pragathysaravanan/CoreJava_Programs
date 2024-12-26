package com.tms.service;

import com.tms.model.Subject;

public interface SubjectService {
	public String insertSubjectValidation(Subject subject);

	public String deleteSubjectValidation(int id);

	public String updateSubjectValidation(Subject subject);

	public String findSubjectValidation(int id);

	public String findAllSubjectValidation();
}
