package com.spring.jdbc.practise.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.practise.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public int insert(Employee employee) {
		// insert operation
		String query = "insert into employee(id,name,designation,doj) values(?,?,?,?)";
		int insert = this.jdbcTemplate.update(query, employee.getId(), employee.getName(), employee.getDesignation(),
				employee.getDoj());
		return insert;
	}

	public int change(Employee employee) {
		// update operation
		String query = "update employee set name=?, designation=? where id=?";
		int update = this.jdbcTemplate.update(query, employee.getName(), employee.getDesignation(), employee.getId());
		return update;
	}

	public int delete(int id) {
		// delete operation
		String query = "delete from employee where id=?";
		int delete = this.jdbcTemplate.update(query, id);
		return delete;
	}

	public List<Employee> getAllEmployees() {
		// returns all the employees
		String query = "select * from employee";
		RowMapper<Employee> rowMapper = new RowMapperImpl();
		List<Employee> employees = this.jdbcTemplate.query(query, rowMapper);
		return employees;
	}

	public Employee getEmployee(int id) {
		// returns employee based on id
		String query="select * from employee where id=?";
		RowMapper<Employee> rowMapper = new RowMapperImpl();
		Employee employee = this.jdbcTemplate.queryForObject(query,rowMapper,id);
		return employee;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
