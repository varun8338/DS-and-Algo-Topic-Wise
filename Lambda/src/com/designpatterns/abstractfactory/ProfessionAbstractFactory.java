package com.designpatterns.abstractfactory;

public class ProfessionAbstractFactory extends AbstractFactory {
	@Override
	public Profession getProfession(String type) {
		if(type.equalsIgnoreCase("teacher"))
			return new Teacher();
		else if(type.equalsIgnoreCase("engineer"))
			return new Engineer();
		else 
			return null;
	}
}
