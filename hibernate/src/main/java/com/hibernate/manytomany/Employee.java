package com.hibernate.manytomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	@Column(name = "employee_code")
	private String employeeCode;
	@Column(name = "employee_name")
	private String employeeName;
	@ManyToMany
	@JoinTable(name = "emp_learn", joinColumns = { @JoinColumn(name = "emp_id") }, inverseJoinColumns = {
			@JoinColumn(name = "role_id") })
	private List<Role> roles;

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}
