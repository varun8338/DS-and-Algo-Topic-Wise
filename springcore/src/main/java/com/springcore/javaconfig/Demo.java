package com.springcore.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
		Student s=context.getBean("student",Student.class);
		s.study();
		context.close();
	}

}
