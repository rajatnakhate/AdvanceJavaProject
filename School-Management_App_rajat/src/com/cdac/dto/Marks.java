package com.cdac.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="marksheet")
public class Marks {

	@Id
	@GeneratedValue
	@Column(name="form_no")
	private int formNo;
	private String English;
	private String Maths;
	private String Economics;
	private String Science;
	private String History;
	private String Geography;
	
	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Marks(int formNo) {
		super();
		this.formNo = formNo;
	}

	public int getFormNo() {
		return formNo;
	}
	public void setFormNo(int formNo) {
		this.formNo = formNo;
	}
	public String getEnglish() {
		return English;
	}
	public void setEnglish(String english) {
		English = english;
	}
	public String getMaths() {
		return Maths;
	}
	public void setMaths(String maths) {
		Maths = maths;
	}
	public String getEconomics() {
		return Economics;
	}
	public void setEconomics(String economics) {
		Economics = economics;
	}
	public String getScience() {
		return Science;
	}
	public void setScience(String science) {
		Science = science;
	}
	public String getHistory() {
		return History;
	}
	public void setHistory(String history) {
		History = history;
	}
	public String getGeography() {
		return Geography;
	}
	public void setGeography(String geography) {
		Geography = geography;
	}
	
	
	
}
