package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int insert(Employee employee) {
		// TODO Auto-generated method stub
		String query="insert into employee(empId,empName,empDesignation) values(?,?,?)";
		int result = this.template.update(query,employee.getEmpId(),employee.getEmpName(),employee.getEmpDesignation());
		return result;
	}

}
