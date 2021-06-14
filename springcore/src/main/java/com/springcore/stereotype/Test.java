package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/springcore/stereotype/stereotypeconfig.xml");
		Student s=context.getBean("ob",Student.class);
		System.out.println(s);
		System.out.println(s.getAddresses());
		System.out.println(s.getAddresses().getClass().getName());
		System.out.println(s.getPhones());
		System.out.println(s.getPhones().getClass().getName());
		System.out.println(s.hashCode());
		Student s1=context.getBean("ob",Student.class);
		System.out.println(s1.hashCode());
		Teacher t1=context.getBean("t1",Teacher.class);
		Teacher t2=context.getBean("t1",Teacher.class);
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
	}

}
