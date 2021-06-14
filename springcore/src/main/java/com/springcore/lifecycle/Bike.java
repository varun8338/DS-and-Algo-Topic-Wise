package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bike implements InitializingBean, DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price of bike");
		this.price = price;
	}

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bike [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Inside init method of Bike");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside destroy method of Bike");
	}
	
}
