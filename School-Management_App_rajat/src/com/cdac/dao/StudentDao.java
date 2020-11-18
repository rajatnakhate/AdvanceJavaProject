package com.cdac.dao;

import java.util.List;


import com.cdac.dto.Student;

public interface StudentDao {
	void insertStudent(Student student);
	boolean checkStudent(Student student);
	//void deleteStudent(String studentName);
	Student selectStudent(int formNo);
	void updateStudent( Student student);
	List<Student> selectAll(int formNo);
	List<Student> selectAll();
}

