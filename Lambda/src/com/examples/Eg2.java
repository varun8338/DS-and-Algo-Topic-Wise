package com.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

class CustomSort implements Comparator<Employee>{
	@Override
	public int compare(Employee e1,Employee e2) {
		System.out.println("E1 contains "+e1);
		System.out.println("E2 contains "+e2);
		return (int) ((int)e1.getSalary()-e2.getSalary());
	}
}

class Data{
	private Object obj;
	Data(Object obj) {
		this.obj=obj;
	}
	
	public Object getObj() {
		return this.obj;
	}
	
	public void setObj(Object obj) {
		this.obj=obj;
	}
	
}

public class Eg2 {
	public static void main(String[] args) {
		List<Employee> list=new LinkedList<Employee>();
		list.add(new Employee(1, "Varun", 24, 50000000));
		list.add(new Employee(2, "Tarun", 23, 5000000));
		list.add(new Employee(3, "Vishal", 26, 5000));
		Collections.sort(list,new CustomSort());
		for(Employee e:list)
			System.out.println(e);
		Consumer<Employee> consumer=(employee)->{
			System.out.println(employee.getName());
		};
		
		list.forEach(consumer);
		List<Employee> list2=list.stream().
				map((emp)->new Employee(emp.getId(),emp.getName(),
				emp.getAge(),emp.getSalary()))
				.collect(Collectors.toCollection(LinkedList::new));
		
		System.out.println(list2.getClass());
		
		list.stream().filter((emp)->
			(emp.getName().startsWith("v")||emp.getName().startsWith("V"))&&
			(emp.getAge()>23||emp.getAge()<27)
			
				).forEach((emp)->System.out.println(emp.getName()));
		
		Data d=new Data("Hello");
		System.out.println(d.getObj());
		
		Function<Integer,Integer> square=(a)->(a*a);
		BiFunction<Integer, Integer, Integer> addition=(a,b)->(a+b);
		int c=addition.andThen(square).apply(10,10);
		System.out.println(c);
	}
}
