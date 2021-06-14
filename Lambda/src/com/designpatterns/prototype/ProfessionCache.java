package com.designpatterns.prototype;

import java.util.Hashtable;

public class ProfessionCache {
	private static Hashtable<Integer,Profession> professionCache=
			new Hashtable<Integer,Profession>();
	
	public static void loadProfessionCache() {
		Doctor d=new Doctor();
		d.id=1;
		professionCache.put(d.id, d);
		
		Engineer e=new Engineer();
		e.id=2;
		professionCache.put(e.id,e);
		
		Teacher t=new Teacher();
		t.id=3;
		professionCache.put(t.id,t);
		
	}
	
	public static Profession getCloneNewProfession(int id) {
		Profession p=professionCache.get(id);
		return (Profession)p.getClone();
	}
}
