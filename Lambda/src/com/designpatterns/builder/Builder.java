package com.designpatterns.builder;

public interface Builder {
	public void buildFloor();
	public void buildWalls();
	public void buildTerrace();
	public Home getComplexObject();
}
