package com.springcore.auto.wire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	
	private String name;
	@Autowired
	@Qualifier("address2")
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		System.out.println("Inside setter method");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Emp(String name, Address address) {
		super();
		System.out.println("Inside constructor");
		this.name = name;
		this.address = address;
	}

	

	@Override
	public String toString() {
		return "Emp [name=" + name + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
