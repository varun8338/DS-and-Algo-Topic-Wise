package com.designpatterns.builder;

public class Director {
	private Builder builder;
	
	public Director(Builder builderType) {
		this.builder=builderType;
	}
	
	public void manageConstruction() {
		this.builder.buildFloor();
		this.builder.buildWalls();
		this.builder.buildTerrace();
	}
	
	public Home getComplexObject() {
		return this.builder.getComplexObject();
	}	
}
