package com.spring.orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	public int insert(Student student) {
		// insert operation
		int save =(Integer)this.hibernateTemplate.save(student);
		return save;
	}
}
