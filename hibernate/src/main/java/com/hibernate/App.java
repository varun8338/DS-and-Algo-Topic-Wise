package com.hibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Inside main method");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		/*
		 * Student s=new Student(); s.setId(101); s.setName("Varun");
		 * s.setCity("Bombay");
		 */
		 Student s=new Student(102, "Joy", "London");
		 System.out.println(s);
		// all the transaction to be done in this session

		Address ad = new Address();
		ad.setStreet("S.V Road");
		ad.setCity("Mumbai");
		ad.setOpen(true);
		ad.setDate(new Date());
		ad.setX(15.2323);
		
		//Reading image
		FileInputStream fis=new FileInputStream("src/main/java/pic.jpg");
		byte[] data=new byte[fis.available()];
		fis.read(data);
		ad.setImage(data);
		
		Session currentSession = factory.openSession();
		// start the transaction
		Transaction beginTransaction = currentSession.beginTransaction();
		// save the student object
		currentSession.save(s);
		currentSession.save(ad);
		// to store the changes in DB physically
		beginTransaction.commit();
		// close the session
		currentSession.close();

		System.out.println("Done");

	}
}
