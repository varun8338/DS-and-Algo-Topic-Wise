package com.springcore.lifecycle;

public class Car {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Car [price=" + price + "]";
	}
	
	public void randomInit() {
		System.out.println("Inside init method");
	}
	
	public void randomDestroy() {
		System.out.println("Inside destory method");
	}
}
