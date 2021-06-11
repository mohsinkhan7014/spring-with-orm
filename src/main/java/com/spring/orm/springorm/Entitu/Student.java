package com.spring.orm.springorm.Entitu;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

@SuppressWarnings("deprecation")
@javax.persistence.Entity
@Table(name="studentdetails")
public class Student {
	public Student(int studentId, String studentName, String studentCity) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
	}
	@Id
	@Column(name="studnet_id")
	private int studentId;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ "]";
	}
	@Column(name="studnet_name")
	private String studentName;
	@Column(name="studnet_city")
	private String studentCity;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

}
