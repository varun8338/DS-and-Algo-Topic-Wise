package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Employee emp1=(Employee)context.getBean("employee1");
		System.out.println(emp1.getName());
		System.out.println(emp1.getPhones().getClass().getName());
		System.out.println(emp1.getAddresses().getClass().getName());
		System.out.println(emp1.getCourses().getClass().getName());
		System.out.println(emp1.getDbConnection().getClass().getName());
	}

}
