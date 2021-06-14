package com.hibernate;

import javax.persistence.Transient;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Student s1=new Student(7420, "Sid", "Berlin");
		Certificate certi1=new Certificate("Hibernate","2 weeks");
		s1.setCerti(certi1);
		
		Student s2=new Student(7421, "Ravi", "Tokyo");
		Certificate certi2=new Certificate("Python","3 weeks");
		s2.setCerti(certi2);
		
		Session session = factory.openSession();
		Transaction t=session.beginTransaction();
		session.save(s1);
		session.save(s2);
		t.commit();
		System.out.println((Student)session.get(Student.class, 7420));
		System.out.println((Student)session.get(Student.class, 7421));
		factory.close();

	}

}
