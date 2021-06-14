package com.obj;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Customer{
	private String name;
	private Address address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Customer(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + "]";
	}
	
	
}

class Address{
	private String street;
	private String city;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(String street, String city) {
		super();
		this.street = street;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
}

public class Fm {
	public static void main(String[] args) {
		Address a1=new Address("ABC", "Bombay");
		Address a2=new Address("ABC", "BLORE");
		Address a3=new Address("ABC", "Pune");
		Customer c1=new Customer("Varun", a1);
		Customer c2=new Customer("TArun", a2);
		Customer c3=new Customer("vishal", a3);
		Customer c4=new Customer("shuhbam", a1);
		Customer c5=new Customer("parth", a2);
		Customer c6=new Customer("raj", a3);
		
		List<Customer> list=new ArrayList<Customer>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		list.add(c6);
		
		System.out.println("Storing customers city wise");
		Map<String,List<Customer>>
		 hm=list.stream().collect(Collectors.groupingBy(x->x.getAddress().getCity()));
		hm.forEach((k,v)->{
			System.out.print(k+": ");
			v.forEach(a->System.out.print(a.getName()+", "));
			System.out.println();
		});
		
		String str="Hello how are you";
		String[] strArr=str.split(" ");
		StringJoiner stJoin=new StringJoiner("-","{","]");
		System.out.println(stJoin);
		System.out.println(stJoin.toString());
		for(String s:strArr)
			stJoin.add(s);
		System.out.println(stJoin.toString());
		System.out.println(stJoin);
		
	}
}
