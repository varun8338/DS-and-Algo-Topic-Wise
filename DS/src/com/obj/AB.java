package com.obj;

public class AB implements A,B {
	public static void main(String[] args) {
		AB a=new AB();
		a.show();
		A.show();
	}
	public void show() {
		System.out.println("Hello");
	}
}
