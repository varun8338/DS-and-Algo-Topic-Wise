package com.designpatterns.builder;

public class Home {
	private String floor;
	private String walls;
	private String terrace;
	public void setFloor(String floor) {
		this.floor = floor;
	}
	public void setWalls(String walls) {
		this.walls = walls;
	}
	public void setTerrace(String terrace) {
		this.terrace = terrace;
	}
	public String getFloor() {
		return floor;
	}
	public String getWalls() {
		return walls;
	}
	public String getTerrace() {
		return terrace;
	}  
	
}