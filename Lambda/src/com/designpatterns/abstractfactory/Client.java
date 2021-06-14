package com.designpatterns.abstractfactory;

public class Client {
	public static void main(String[] args) {
		AbstractFactory factory = AbstractFactoryProvider.getTrainee(true);
		Profession eng=factory.getProfession("engineer");
		eng.print();
	}
}
