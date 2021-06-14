package com.springcore.ci;

public class Addition {
	private int a;
	private int b;

	public Addition(int a, int b) {
		System.out.println("Calling Addition with int, int");
		this.a = a;
		this.b = b;
	}

	public Addition(double a, double b) {
		System.out.println("Calling Addition with double, double");
		this.a = (int) a;
		this.b = (int) b;
	}

	public Addition(String a, String b) {
		System.out.println("Calling Addition with String, String");
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);

	}

	public void sum() {
		System.out.println("Value of a is " + this.a);
		System.out.println("Valu of b is " + this.b);
		System.out.println("Sum is " + (this.a+this.b));
	}

}
