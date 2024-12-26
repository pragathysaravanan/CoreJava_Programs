package com.tms.repo;

import java.util.List;

import com.tms.model.Subject;

public interface SubjectRepo {
	public boolean doInsertSubject(Subject subject);

	public boolean doDeleteSubject(int id);

	public boolean doUpdateSubject(Subject subject);

	public Subject doFindSubject(int id);

	public List<Subject> doFindAllSubject();

}
