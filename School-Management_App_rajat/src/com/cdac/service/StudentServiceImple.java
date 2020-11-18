package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.StudentDao;
import com.cdac.dto.Student;

@Service
public class StudentServiceImple implements StudentService {
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public void addStudent(Student student ) {
		studentDao.insertStudent(student);
	}

	@Override
	public boolean findStudent(Student student) {	
		return studentDao.checkStudent(student);
	}

	/*@Override
	public void removeStudent(String studentName) {
		studentDao.deleteStudent(studentName);
		
	}*/

	
	@Override
	public Student selectStudent(int formNo) {
		return studentDao.selectStudent(formNo);
	}

	@Override
	public void modifyStudent(Student student) {
		studentDao.updateStudent(student);
		
	}

	@Override
	public List<Student> selectAll(int formNo) {	
		return studentDao.selectAll(formNo);
	}

	@Override
	public Student searchStudent(int formNo) {
		return studentDao.selectStudent(formNo);
		
	}

	@Override
	public List<Student> selectAll() {
		
		return studentDao.selectAll();
	}
	
}

