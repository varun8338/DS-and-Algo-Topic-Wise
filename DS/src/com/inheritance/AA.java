package com.inheritance;

public interface AA {
	void m1();
	default void msg() {
		System.out.println("Inside msg of AA");
	}
}
