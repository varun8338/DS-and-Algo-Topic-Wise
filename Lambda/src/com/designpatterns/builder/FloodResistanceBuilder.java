package com.designpatterns.builder;

public class FloodResistanceBuilder implements Builder {
	private Home floodHome=new Home();
	@Override
	public void buildFloor() {floodHome.setFloor("Flood floor");}
	@Override
	public void buildWalls() {floodHome.setWalls("Flood Walls");}
	@Override
	public void buildTerrace() {floodHome.setTerrace("Flood Terrace");}
	@Override
	public Home getComplexObject() {return floodHome;}
}
