package com.designpatterns.factorypattern;

public class Doctor implements Profession {
	@Override
	public void print() {
		System.out.println("Doctor");
	}
}
