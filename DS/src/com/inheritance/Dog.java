package com.inheritance;

import java.io.IOException;
import java.sql.SQLException;

public class Dog extends Animal {
	public void eat() {
		System.out.println("dog eats");
	}
	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
	}
}
