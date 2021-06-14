package com.designpatterns.prototype;

public class Client {
	public static void main(String[] args) {
		ProfessionCache.loadProfessionCache();
		Profession doctor=ProfessionCache.getCloneNewProfession(1);
		System.out.println(doctor);
		
		Profession engineer= ProfessionCache.getCloneNewProfession(2);
		System.out.println(engineer);
		
		Profession teacher=ProfessionCache.getCloneNewProfession(3);
		System.out.println(teacher);
		
		Profession teacher2=ProfessionCache.getCloneNewProfession(3);
		System.out.println(teacher2);
	}
}
