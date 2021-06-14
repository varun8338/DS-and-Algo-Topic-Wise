package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		//Car c1=(Car)context.getBean("car1");
		//System.out.println(c1);
		
		//registering shutdown hook
		//Bike b1=(Bike)context.getBean("bike1");
		//System.out.println(b1);
		Truck t1=(Truck)context.getBean("truck1");
		System.out.println(t1);
		context.registerShutdownHook();
		
	}

}
