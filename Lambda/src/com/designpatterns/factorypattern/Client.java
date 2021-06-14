package com.designpatterns.factorypattern;

public class Client {
	public static void main(String[] args) {
		Factory professionFactory=new Factory();
		Profession doctor=professionFactory.getProfession("teacher");
		Profession eng=professionFactory.getProfession("engineer");
		doctor.print();
		eng.print();
	}
}
