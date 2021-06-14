package com.hibernate.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Employee e1=new Employee();
		Employee e2=new Employee();
		e1.setEmployeeCode("E12345");
		e1.setEmployeeName("Varun Yadav");
		
		
		e2.setEmployeeCode("E12346");
		e2.setEmployeeName("Striver");
		
		Role r1=new Role();
		Role r2=new Role();
		r1.setRoleId(1);
		r1.setRoleName("Developer");
		
		r2.setRoleId(2);
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
		
	}
}
