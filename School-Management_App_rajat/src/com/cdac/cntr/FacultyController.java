package com.cdac.cntr;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dto.Marks;
import com.cdac.dto.Student;

import com.cdac.dto.Faculty;
import com.cdac.service.FacultyService;
import com.cdac.service.StudentService;
import com.cdac.service.MarksService;

@Controller
public class FacultyController {
	
	@Autowired
	private MarksService marksService;
	
	@Autowired
	private FacultyService facultyService;
	
	
	@Autowired
	private StudentService studentService;
	
	//it is for registration form only for display the form
	@RequestMapping(value = "/prep_fac_reg_form.htm",method = RequestMethod.GET)
	public String prepRegForm(ModelMap map) {
		map.put("faculty", new Faculty());
		return "faculty_reg_form";
	}
	
	//this is for registration for inserting the contents in table
	@RequestMapping(value = "/fac_reg.htm",method = RequestMethod.POST)
	public String register(Faculty faculty,ModelMap map) {
		facultyService.addFaculty(faculty);
		return "index";
	}
	
	//preparing that faculty login is successful or not;
	@RequestMapping(value = "/prep_fac_log_form.htm",method = RequestMethod.GET)
	public String prepLogFrom(ModelMap map) {
		map.put("faculty", new Faculty());
		return "faculty_log_form";
		
	}
	
	//checking the faculty is valid or not
	@RequestMapping(value = "/fac_log.htm",method= RequestMethod.POST)
	public String login(Faculty faculty,ModelMap map,HttpSession session) {
		boolean b = facultyService.findFaculty(faculty);
		if(b) {
			
			session.setAttribute("faculty", faculty);
			return "faculty_home";
		}else {
			map.put("faculty", new Faculty());
			return "faculty_log_form";
		}
		
	
		
	}
	
	
	@RequestMapping(value="/show_student1.htm",method = RequestMethod.GET)
	public String showstudent(ModelMap map) {
		List<Student> li=studentService.selectAll();
		
		map.put("student", li);
		
		return "showStudent";
	}
	

	@RequestMapping(value="/AddMarks.htm",method = RequestMethod.GET)
	public String Addmark(ModelMap map,HttpServletRequest req ) {
		int formNo=Integer.parseInt(req.getParameter("formno"));
		Marks mk=new Marks();
		mk.setFormNo(formNo);
		map.put("mark", mk);
		
		
		return "AddMarks";
	}
	@RequestMapping(value="/addmarksData.htm",method = RequestMethod.POST)
	public String AddmarkData(ModelMap map,Marks mark) {
		
		marksService.Addmark(mark);
		
		
		return "faculty_home";
	}
	

	
	
	
	
	
	
	
}
