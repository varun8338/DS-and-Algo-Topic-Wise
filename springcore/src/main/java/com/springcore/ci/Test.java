package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
		Person p1=(Person)context.getBean("person1");
		System.out.println(p1);
		Addition add=(Addition)context.getBean("add3");
		add.sum();
	}

}
