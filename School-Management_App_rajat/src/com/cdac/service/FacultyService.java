package com.cdac.service;

import com.cdac.dto.Faculty;

public interface FacultyService {
	void addFaculty(Faculty faculty);
	boolean findFaculty(Faculty faculty);
	
}
