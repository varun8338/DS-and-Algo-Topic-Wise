package com.obj;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employees{
	private String name;
	private String dept;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employees(String name, String dept, double salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employees [name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	
}
public class Qm {
	public static void main(String[] args) {
		List<Employees> list=new ArrayList<Employees>();
		list.add(new Employees("varun", "IT", 25000000));
		list.add(new Employees("tarun", "IT", 2500000));
		list.add(new Employees("vishal", "IT", 25000));
		list.add(new Employees("shubham", "HR", 25000));
		list.add(new Employees("akash", "HR", 25000));
		
		//map which stores employees details with highest salary
		Map<String,List<Employees>> hm=
				list.stream().collect(Collectors.groupingBy(x->x.getDept()));
		
		
		System.out.println(hm.getClass());
		System.out.println("-----------");
		//convert to set
		Function<Entry<String, List<Employees>>,
		Employees> f=(a)->{
			Collections.sort(a.getValue(),(o1,o2)->(int)(o2.getSalary()-o1.getSalary()));
			return a.getValue().get(0);
		};
		
		Set<Map.Entry<String, List<Employees>>> set=hm.entrySet();
		
		Map<String,Employees> maxSalariedEmp=
				new HashMap<String,Employees>();
		
		for(Map.Entry<String, List<Employees>> entry:set) {
			Optional<Employees> emp=entry.getValue().
					stream().
					max((o1,o2)->(int)(o1.getSalary()-o2.getSalary()));
			if(emp.isPresent())
				maxSalariedEmp.put(entry.getKey(),emp.get());
			
		}
		
		
		System.out.println("Employees according to Dept");
		hm.forEach((k,v)->{
			System.out.println(k+" "+v);
		});
		
		System.out.println("Max salaried emp in each Dept");
		maxSalariedEmp.forEach((k,v)->{
			System.out.println(k+" "+v);
		});
		
		
		
	}
}
