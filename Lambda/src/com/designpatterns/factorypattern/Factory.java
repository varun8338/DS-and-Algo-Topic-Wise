package com.designpatterns.factorypattern;

public class Factory {
	public Profession getProfession(String professionName) {
		if(professionName.equalsIgnoreCase("engineer"))
			return new Engineer();
		if(professionName.equalsIgnoreCase("doctor"))
			return new Doctor();
		if(professionName.equalsIgnoreCase("teacher"))
			return new Teacher();
		return null;
	}
}
