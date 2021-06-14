package com.spring.jdbc.practise.dao;

import java.util.List;

import com.spring.jdbc.practise.entities.Employee;

public interface EmployeeDao {
	public int insert(Employee employee);
	public int change(Employee employee);
	public int delete(int id);
	public List<Employee> getAllEmployees();
	public Employee getEmployee(int id);
}
