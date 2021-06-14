package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Truck {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Truck() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Truck [price=" + price + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting truck method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Ending truck method");
	}
}
