package com.cdac.cntr;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dao.StudentDao;

import com.cdac.dto.Faculty;

import com.cdac.dto.Student;

import com.cdac.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping(value = "/prep_stud_reg_form.htm",method = RequestMethod.GET)
	public String prepStdRegForm(ModelMap map) {
		map.put("student", new Student());
		return "student_reg_form";
	}
	
	@RequestMapping(value = "/stud_reg.htm",method = RequestMethod.POST)
	public String Studentregister(Student student,ModelMap map) {
		studentService.addStudent(student);
		return "index";
	}
	
	@RequestMapping(value = "/prep_stud_log_form.htm",method = RequestMethod.GET)
	public String prepLogFrom(ModelMap map) {
		map.put("student", new Student());
		return "student_log_form";
		
	}
	@RequestMapping(value = "/stud_log.htm",method= RequestMethod.POST)
	public String login(Student student,ModelMap map,HttpSession session ) {
		boolean b = studentService.findStudent(student);
		if(b) {
			System.out.println("/n"+student.getFormNo()+"/n");
			session.setAttribute("student",student);
			System.out.println("/n"+((Student)session.getAttribute("student")).getFormNo()+"/n");
			return "student_home";
		}else {
			
			map.put("student", new Student());
			return "student_log_form";
		}
		
	}
	
	@RequestMapping(value = "/student_show.htm",method = RequestMethod.GET)
	public String allstudent(ModelMap map,HttpSession session) {
		int formNo = ((Student) session.getAttribute("student")).getFormNo();
		
		System.out.println("/n"+formNo+"/n");
		List<Student> li = studentService.selectAll(formNo);
		map.put("studList", li);
		return "studentprof";
	
	}
	
	@RequestMapping(value = "/student_update_form.htm",method = RequestMethod.GET)
	public String StudentUpdateForm(@RequestParam int formNo,ModelMap map) {
		
		Student exp = studentService.searchStudent(formNo);
		map.put("student", exp);
		
		return "update_Student";
	}
	
	@RequestMapping(value = "/update_student.htm",method = RequestMethod.POST)
	public String expenseUpdate(Student student,ModelMap map,HttpSession session) {
		
		int formNo = ((Student)session.getAttribute("student")).getFormNo();
		student.setFormNo(formNo);
		studentService.modifyStudent(student);
			
		List<Student> li = studentService.selectAll(formNo);
		map.put("studList", li);
		return "studentprof";
	}
//	
}
