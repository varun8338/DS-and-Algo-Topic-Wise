package org.interfaces;

public interface Interface2 {
	default void someMethod() {
		System.out.println("SomeMethod of Interface 2");
	}
	
	void someMethod1();
	
	public static void someMethod3() {
		System.out.println("Method 3 in Interface 2");
	}
}
