package com.spring.jdbc.practise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.practise.dao.EmployeeDao;
import com.spring.jdbc.practise.dao.EmployeeDaoImpl;

@Configuration
public class JdbcConfig {
	//get the object of dataSource
	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		//setting the connection properties
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("root");
		return driverManagerDataSource;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getJdbcTemplate() {
		//setting the datasource in jdbc template
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	@Bean("employeeDao")
	public EmployeeDao getEmployeeDao() {
		EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
		employeeDao.setJdbcTemplate(getJdbcTemplate());
		return employeeDao;
	}
}
