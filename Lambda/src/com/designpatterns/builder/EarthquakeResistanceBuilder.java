package com.designpatterns.builder;

public class EarthquakeResistanceBuilder implements Builder {
	private Home earthquakeHome = new Home();
	
	@Override
	public void buildFloor() {
		earthquakeHome.setFloor("Wooden");
	}
	
	@Override
	public void buildWalls() {
		earthquakeHome.setWalls("Wooden");
	}
	
	@Override
	public void buildTerrace() {
		earthquakeHome.setTerrace("Wooden");
	}
	
	@Override
	public Home getComplexObject() {
		return earthquakeHome;
	}
}
