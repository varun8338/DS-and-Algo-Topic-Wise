package com.springcore.auto.wire;

public class Emp {

	private String name;
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Emp() {
		super();
	}
	
	public Emp(Address address) {
		super();
		this.address=address;
	}
	
	

	public Emp(String name, Address address) {
		super();
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
