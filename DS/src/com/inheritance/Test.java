package com.inheritance;

abstract class A {
	private int x;

	A(int x) {
		System.out.println("Inside constructor A");
		System.out.println("Value of x: " + x);
	}

	abstract void m1(int x, double y);
}

class B extends A {
	private int y;

	B(int y) {
		super(10);
		System.out.println("Inside constructor B");
		System.out.println("Value of y: " + y);
	}

	void m1(int x, double y) {
		System.out.println("One");
	}

	void m2() {
		System.out.println("Inside m2 of B");
		System.out.println("Two");
		this.m1(5, 10.50);
	}
}

class C extends B {
	C() {
		super(30);
	}

	void m1(int x, double y) {
		System.out.println("Inside m1 of C");
		super.m1(10, 15.15);
		System.out.println("Three");
	}
}

public class Test implements AA, BB {
	private static int x=20;
	
	
	
	public static void main(String[] args) {
		int y=x;
		Test t=null;
		
		System.out.println(t.x);
		System.out.println(y);
		System.out.println(add());
	}

	static int add() {
		return x+x;
	}
	

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Inside m1 of interface");
	}

	@Override
	public void msg() {
		System.out.println("Hello");
		AA.super.msg();
		BB.super.msg();
	}
}