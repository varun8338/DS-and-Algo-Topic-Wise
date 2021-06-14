package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	public static int totalMarks=90;
	
	@Value("#{22+11}")
	private int x;
	@Value("#{8<5?88:55}")
	private int y;
	
	@Value("#{ T(java.lang.Math).sqrt(5) }")
	private double z;
	
	@Value("#{ T(java.lang.Math).PI }")
	private double pi;
	
	@Value("#{ new java.lang.String('Varun') }")
	private String name;
	
	@Value("#{ T(com.springcore.spel.Demo).add(80,10) }")
	private int marks;
	
	@Value("#{ T(com.springcore.spel.Demo).totalMarks>80?'Distinction':'FirstClass' }")
	private String category;
	
	@Value("#{ 'Varun'.startsWith('V') }")
	private boolean isName;
	
	public boolean isName() {
		return isName;
	}
	public void setName(boolean isName) {
		this.isName = isName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	
	
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", pi=" + pi + ", name=" + name + ", marks=" + marks
				+ ", category=" + category + ", isName=" + isName + "]";
	}
	public void setY(int y) {
		this.y = y;
	}
	public double getPi() {
		return pi;
	}
	public void setPi(double pi) {
		this.pi = pi;
	}
	
	public static int add(int a,int b) {
		return a+b;
	}
}
