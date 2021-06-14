package com.examples;

public class Employee {
	private int id;
	private String name;
	private int age;
	private long salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Employee(int id, String name, int age, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	@Override
	public int hashCode() {
		int result=31;
		result=result+id+age;
		result=result+name==null?0:name.hashCode();
		result=(int) (result+salary);
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(this.getClass()==obj.getClass()) {
			Employee o=(Employee)obj;
			if(this.id!=o.getId()||
					this.salary!=o.getSalary()||
					this.age!=o.getAge()) {
				return false;
			}
			if(this.name==null && o.name!=null)
				return false;	
		}
		return true;
	}
	

	
	
	
	
	
}
