package com.springcore.stereotype;

import java.util.List;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")
public class Student {
	@Value("Varun")
	private String studentName;
	@Value("Bombay")
	private String city;
	
	@Value("#{myAddresses}")
	private List<String> addresses;
	
	@Value("#{myPhones}")
	private Vector<String> phones;
	
	public Vector<String> getPhones() {
		return phones;
	}
	public void setPhones(Vector<String> phones) {
		this.phones = phones;
	}
	public List<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + "]";
	}
	
	
}
