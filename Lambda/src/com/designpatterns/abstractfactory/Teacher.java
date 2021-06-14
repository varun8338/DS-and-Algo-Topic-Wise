package com.designpatterns.abstractfactory;

public class Teacher implements Profession {
	@Override
	public void print() {
		System.out.println("Teacher");
	}
}
