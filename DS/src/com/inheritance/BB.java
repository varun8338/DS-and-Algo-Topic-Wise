package com.inheritance;

public interface BB {
	void m1();
	default void msg() {
		System.out.println("Inside msg of BB");
	}
}
