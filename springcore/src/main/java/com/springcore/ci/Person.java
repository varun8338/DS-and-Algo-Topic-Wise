package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certificate certi;
	private List<String> qualifications;
	public Person(String name, int personId, Certificate certi, List<String> qualifications) {
		super();
		this.name = name;
		this.personId = personId;
		this.certi = certi;
		this.qualifications = qualifications;
	}
	@Override
	public String toString() {
		return this.name+" : "+this.personId+"{ "+this.certi.name+" } "+this.qualifications;
	}
	
	
}
