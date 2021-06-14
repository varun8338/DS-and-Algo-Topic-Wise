package com.springcore.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	private String name;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String,String> courses;
	private Properties dbConnection;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	public Employee(String name, List<String> phones, Set<String> addresses, Map<String, String> courses,
			Properties dbConnection) {
		super();
		this.name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
		this.dbConnection = dbConnection;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Properties getDbConnection() {
		return dbConnection;
	}
	public void setDbConnection(Properties dbConnection) {
		this.dbConnection = dbConnection;
	}
	
	
}