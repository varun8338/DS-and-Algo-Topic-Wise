package com.designpatterns.abstractfactory;

public class TraineeProfessionAbstractFactory extends AbstractFactory {
	@Override
	public Profession getProfession(String type) {
		if(type.equalsIgnoreCase("engineer"))
			return new TraineeEngineer();
		else if(type.equalsIgnoreCase("teacher"))
			return new TraineeTeacher();
		else
			return null;
	}
}
