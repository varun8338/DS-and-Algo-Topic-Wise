package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standaloneconfig.xml");
		Person p=context.getBean("p1", Person.class);
		System.out.println(p);
		System.out.println(p.getFriends().getClass().getName());
		System.out.println(p.getCourses().getClass().getName());

	}

}
