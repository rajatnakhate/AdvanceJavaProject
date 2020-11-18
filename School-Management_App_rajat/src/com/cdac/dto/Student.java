package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	@GeneratedValue
	@Column(name="form_no")
	private int formNo;
	
	@Column(name="student_name")
	private String studentName;
	
	@Column(name="DOB")
	private String dateOfBirth;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="city")
	private String city;
	
	@Column(name="mob_no")
	private String mobNo;
	
	@Column(name="blood_group")
	private String bloodGroup;
	
	@Column(name="fee")
	private float feeAmount;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	public Student(int formNo) {
		super();
		this.formNo = formNo;
	}




	public int getFormNo() {
		return formNo;
	}
	public void setFormNo(int formNo) {
		this.formNo = formNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public float getFeeAmount() {
		return feeAmount;
	}
	public void setFeeAmount(float feeAmount) {
		this.feeAmount = feeAmount;
	}
	
	
	
	
}
