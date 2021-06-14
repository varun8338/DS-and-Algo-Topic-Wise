package com.obj;

import java.util.Date;

public class Employee {
	private int id;
	private String name;
	private Date date; 
	@Override
	public int hashCode() {
		System.out.println("Inside hashcode");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public Employee(int id, String name, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
	}
	
	
}
