package com.designpatterns.builder;

public class Client {
	public static void main(String[] args) {
		FloodResistanceBuilder flood=new FloodResistanceBuilder();
		Director d=new Director(flood);
		d.manageConstruction();
		Home home=d.getComplexObject();
		System.out.println(home.getWalls());
	}
}
