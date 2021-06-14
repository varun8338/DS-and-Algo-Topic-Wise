package com.spring.jdbc.practise.entities;

import java.sql.Date;

public class Employee {
	private int id;
	private String name;
	private String designation;
	private Date doj;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public Employee(int id, String name, String designation, Date doj) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.doj = doj;
	}
	
	
	public Employee() {
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", doj=" + doj + "]";
	}
	
}
