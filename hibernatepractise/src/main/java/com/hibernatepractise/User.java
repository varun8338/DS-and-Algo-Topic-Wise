package com.hibernatepractise;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
	
	@Id
	private String ntId;
	private String employeeCode;
	@OneToOne(mappedBy = "username")
	private Employee employee;
	public String getNtId() {
		return ntId;
	}
	public void setNtId(String ntId) {
		this.ntId = ntId;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
