package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dto.Student;
import com.cdac.dao.FacultyDao;
import com.cdac.dao.StudentDao;
import com.cdac.dto.Faculty;

@Service
public class FacultyServiceImple implements FacultyService {
	
	@Autowired
	private FacultyDao facultyDao;
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public void addFaculty(Faculty faculty ) {
		facultyDao.insertFaculty(faculty);
	}

	@Override
	public boolean findFaculty(Faculty faculty) {
		return facultyDao.checkFaculty(faculty);
	}

	
	
}

