package com.arrays;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.obj.Employee;

class TagicEmployee{
	private int age;
	private String name;
	private double salary;
	public TagicEmployee(int age, String name, double salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "TagicEmployee [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

public class FyndInterview {
	public static void main(String[] args) {
		List<TagicEmployee> empList = new ArrayList<TagicEmployee>();
		empList.add(new TagicEmployee(41, "Varun", 20000));
		empList.add(new TagicEmployee(62, "Tarun", 22000));
		empList.add(new TagicEmployee(73, "Vishal", 25000));
		
		TagicEmployee emp=empList.stream().filter(x->x.getName().equals("abac")).findAny().orElse(new TagicEmployee(21, "default", 0));
		System.out.println(emp);
		
		System.out.println("Before changes");
		System.out.println(empList.size());
		System.out.println("****");
		
		//converting list to array
		
		System.out.println("Converting list to array");
		Object[] te=empList.stream().toArray();
		System.out.println("te "+te);
		for(Object e:te)
			System.out.println(e);
		
		empList=empList.stream().filter(e->e.getAge()<63).collect(Collectors.toList());
		
		System.out.println(empList.size());
		System.out.println(empList.getClass());
		/*
		 * empList.stream().map(e->new TagicEmployee(e.getAge(), e.getName(),
		 * e.getSalary()+25000)) .forEach(e->System.out.println(e));
		 */
		
		/*empList=empList.stream().
		map((e)->{
			if(e.getSalary()>22000)
				return new TagicEmployee(e.getAge(), e.getName(), e.getSalary()+25000);
			else {
				return new TagicEmployee(e.getAge(), e.getName(), e.getSalary()+35000);
			}
		}).collect(Collectors.toList());
		
		System.out.println(empList);*/
		empList=empList.stream().filter(e->e.getAge()<63)
				.collect(Collectors.toCollection(LinkedList::new));
		
		//getting employee with min salary 
		TagicEmployee e=empList.stream().min((o1,o2)->(int)(o1.getSalary()-o2.getSalary())).get();
		System.out.println(e);
		
		
		List<TagicEmployee> employeeList = new ArrayList<TagicEmployee>();
		employeeList.add(new TagicEmployee(41, "Varun", 20000));
		employeeList.add(new TagicEmployee(41, "Tarun", 22000));
		employeeList.add(new TagicEmployee(73, "Vishal", 25000));
		employeeList.add(new TagicEmployee(71, "Shubham", 2500));
		
		Map<Integer,List<TagicEmployee>> maps=
				employeeList.stream().
				collect(Collectors.groupingBy(TagicEmployee::getAge));
		System.out.println("--------------");
		maps.forEach((key,value)->{
			System.out.println(value);
		});
		
		System.out.println("+++++++++++++++");
		maps.forEach((key,value)->{
			for(TagicEmployee str:value)
				System.out.print(str.getName()+" ");
			System.out.println();
		});
		
		System.out.println("@@@@@@@@@@@@");
		Integer[] arr= {1,2,3,4,5};
				

	}
	

}
