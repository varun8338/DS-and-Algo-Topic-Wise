package com.designpatterns.abstractfactory;

public class AbstractFactoryProvider {
	public static AbstractFactory getTrainee(boolean isTrainee) {
		if(isTrainee==true)
			return new TraineeProfessionAbstractFactory();
		else
			return new ProfessionAbstractFactory();
	}
}
