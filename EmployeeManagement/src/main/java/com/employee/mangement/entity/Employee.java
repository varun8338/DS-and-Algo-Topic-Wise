package com.employee.mangement.entity;

import java.util.Date;

import javax.persistence.*;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="employee_details")
public class Employee {
	@Id
	@Column(name="emp_id")
	private int empId;
	
	@Column(name="emp_mobile_no")
	private long empMobileNo;
	
	@Column(name="emp_name")
	private String empName;
	
	@Column(name="emp_dob")
	private Date empDob;
	
	@Column(name="emp_doj")
	private Date empDoj;
	
	@Column(name="emp_city")
	private String empCity;
	
	@Column(name="emp_state")
	private String empState;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public long getEmpMobileNo() {
		return empMobileNo;
	}

	public void setEmpMobileNo(long empMobileNo) {
		this.empMobileNo = empMobileNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Date getEmpDob() {
		return empDob;
	}

	public void setEmpDob(Date empDob) {
		this.empDob = empDob;
	}

	public Date getEmpDoj() {
		return empDoj;
	}

	public void setEmpDoj(Date empDoj) {
		this.empDoj = empDoj;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public String getEmpState() {
		return empState;
	}

	public void setEmpState(String empState) {
		this.empState = empState;
	}

	public Employee(int empId, long empMobileNo, String empName, Date empDob, Date empDoj, String empCity,
			String empState) {
		super();
		this.empId = empId;
		this.empMobileNo = empMobileNo;
		this.empName = empName;
		this.empDob = empDob;
		this.empDoj = empDoj;
		this.empCity = empCity;
		this.empState = empState;
	}

	
	public Employee() {
		
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empMobileNo=" + empMobileNo + ", empName=" + empName + ", empDob="
				+ empDob + ", empDoj=" + empDoj + ", empCity=" + empCity + ", empState=" + empState + "]";
	}
	
	
	
	
	
}
