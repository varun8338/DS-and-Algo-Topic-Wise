package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class JavaConfig {
	
	@Bean
	public Cycle getCycle() {
		return new Cycle();
	}
	
	@Bean(name = {"student"})
	public Student getStudent() {
		Student student=new Student(getCycle());
		return student;
	}
}
