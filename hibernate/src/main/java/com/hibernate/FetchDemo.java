package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		//fetching object using get method
		Student student = (Student)session.get(Student.class, 102);
		System.out.println(student);
		//fetching object using load method
		Address ad = (Address)session.load(Address.class, 1);
		System.out.println(ad);
		
		session.close();
		factory.close();
	}
}
