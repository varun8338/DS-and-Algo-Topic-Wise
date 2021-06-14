package com.inheritance;

public class Singleton {
	private static Singleton singleton=null;
	
	private String s;
	private Singleton(String s) {
		this.s=s;
	}
	
	public static Singleton Singleton(String s) {
		if(singleton==null)
			singleton=new Singleton(s);
		return singleton;	
	}
	
	
}
