package com.spring.orm.springorm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.springorm.Entitu.Student;

public class StudentDao {
	
	HibernateTemplate hibernatTemplet;
	
	//enbale it by congif xml file tx
	@Transactional
	public int insert(Student s)
	{
		int r=(Integer) this.hibernatTemplet.save(s);
		return r;
	}
	
	//get Single data
	public Student getStudents(int studentId)
	{
		Student st=this.hibernatTemplet.load(Student.class, getClass());
		return st;
	}
	//get all student
	public List<Student> getAll()
	{
		List<Student> sts=this.hibernatTemplet.loadAll(Student.class);
		return sts;
	}
	
	//delete opertions
	@Transactional
	public void deteleStudnet(int studentID)
	{
		Student s=this.hibernatTemplet.get(Student.class, studentID);
		this.hibernatTemplet.delete(s);
	}
	
	//updating data
	@Transactional
	public void update(Student s)
	{
		this.hibernatTemplet.update(s);
	}
	public HibernateTemplate getHibernatTemplet() {
		return hibernatTemplet;
	}
	public void setHibernatTemplet(HibernateTemplate hibernatTemplet) {
		this.hibernatTemplet = hibernatTemplet;
	}

}
