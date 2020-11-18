package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "faculty")
public class Faculty{
	@Id
	@GeneratedValue
	@Column(name = "faculty_id")
	private int facultyId;
	@Column(name = "faculty_name")
	private String facultyName;
	@Column(name = "faculty_pass")
	private String facultyPass;
	
	@Column(name="form_no")
	private int formNo;
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public String getFacultyPass() {
		return facultyPass;
	}
	public void setFacultyPass(String facultyPass) {
		this.facultyPass = facultyPass;
	}
	public int getFormNo() {
		return formNo;
	}
	public void setFormNo(int formNo) {
		this.formNo = formNo;
	}
	
}
