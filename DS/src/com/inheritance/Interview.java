package com.inheritance;

import java.util.HashMap;
import java.util.Map;

class Employee {
	private int eid;
	private String name;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eid;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (eid != other.eid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}

public class Interview {
	public static void main(String[] args) {
		Map<Employee,String> map=new HashMap<Employee,String>();
		map.put(new Employee(1, "Varun"),"Varun");
		map.put(new Employee(2, "Ravi"),"Ravi");
		map.put(new Employee(3, "Tarun"),"Tarun");
		map.put(new Employee(4, "Kumar"),"Kumar");
		map.put(new Employee(5, "Kunal"),"Kunal");
		
		for(Map.Entry<Employee, String> entry:map.entrySet()) {
			System.out.println(entry);
		}
		
		Employee e=null;
		for(Map.Entry<Employee, String> entry:map.entrySet()) {
			if(entry.getValue().equals("Ravi")) {
				e=entry.getKey();
				break;
			}
				
		}
		System.out.println("******************");
		map.remove(e);
		e.setName("Ravi Kishan");
		map.put(e,"Ravi");
		for(Map.Entry<Employee, String> entry:map.entrySet()) {
			System.out.println(entry);
		}
	}
}
