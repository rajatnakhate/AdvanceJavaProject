package com.cdac.service;


import java.util.List;


import com.cdac.dto.Student;

public interface StudentService {
	void addStudent(Student student);
	boolean findStudent(Student student);
	//void removeStudent(String studentName);
	
	void modifyStudent( Student student);
	Student searchStudent(int formNo);
	List<Student> selectAll(int formNo);
	Student selectStudent(int formNo);
	List<Student> selectAll();
}
