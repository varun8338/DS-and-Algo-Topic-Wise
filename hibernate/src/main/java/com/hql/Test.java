package com.hql;

import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.hql.Student;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory f=cfg.buildSessionFactory();
	
		Session s1=f.openSession();
		Student st1=s1.get(Student.class,1);
		System.out.println(st1);
		s1.close();
		Session s2=f.openSession();
		Student st2=s2.get(Student.class, 1);
		System.out.println(st2);
		s2.close();
		f.close();

	}

}
