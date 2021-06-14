package com.spring.jdbc.practise.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.practise.entities.Employee;

public class RowMapperImpl implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// maps the result set to employee object
		Employee e=new Employee();
		e.setId(rs.getInt(1));
		e.setName(rs.getString(2));
		e.setDesignation(rs.getString(3));
		e.setDoj(rs.getDate(4));
		return e;
	}

}
