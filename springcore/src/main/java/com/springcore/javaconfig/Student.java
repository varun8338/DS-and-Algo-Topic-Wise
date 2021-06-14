package com.springcore.javaconfig;


public class Student {
	
	private Cycle cycle;
	
	
	
	
	public Student(Cycle cycle) {
		super();
		this.setCycle(cycle);
	}




	public void study() {
		this.cycle.display();
		System.out.println("Student is studying");
	}




	public Cycle getCycle() {
		return cycle;
	}




	public void setCycle(Cycle cycle) {
		this.cycle = cycle;
	}
}
