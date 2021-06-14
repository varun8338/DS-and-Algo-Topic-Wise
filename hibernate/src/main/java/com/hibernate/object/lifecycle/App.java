package com.hibernate.object.lifecycle;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory f=cfg.buildSessionFactory();
		Student s=new Student();
		s.setId(1);
		s.setName("Varun");
		s.setCourse("Physics");
		//Student object entered into transient state
		Session session=f.openSession();
		session.save(s);
		Transaction tx=session.beginTransaction();
		//Student object is in persistent state
		s.setCourse("Chemistry");
		tx.commit();
		session.close();
		//Student object is in detached state
		s.setCourse("Biology");
		System.out.println(s);
		//Since the object is not present in session, it will not change in db
		f.close();
	}

}
