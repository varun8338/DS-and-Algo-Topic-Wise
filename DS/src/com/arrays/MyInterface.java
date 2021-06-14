package com.arrays;

public interface MyInterface {
	default void someMethod() {
		System.out.println("Print someMethod");
	}
	
	static void someMethod2() {
		System.out.println("Print someMethod2");
	}
}
