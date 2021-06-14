package com.hibernatepractise;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Employee e1=new Employee();
		e1.setId(1);
		e1.setName("Varun");
		User u1=new User();
		u1.setNtId("vayadav");
		u1.setEmployeeCode("E12345");
		e1.setUsername(u1);
		Role r1=new Role();
		r1.setId(101);
		r1.setRoleName("Developer");
		Employee e2=new Employee();
		e2.setId(2);
		e2.setName("Tarun");
		User u2=new User();
		u2.setNtId("taydav");
		u2.setEmployeeCode("E12346");
		e2.setUsername(u2);
		Role r2=new Role();
		r2.setId(102);
		r2.setRoleName("Tester");
		
		List<Employee> employees=new ArrayList<Employee>();
		List<Role> roles=new ArrayList<Role>();
		employees.add(e1);
		employees.add(e2);
		
		roles.add(r1);
		roles.add(r2);
		
		e1.setRoles(roles);
		r2.setEmployee(employees);
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		session.save(e1);
		session.save(e2);
		session.save(r1);
		session.save(r2);
		tx.commit();
		
		factory.close();
	}
}
