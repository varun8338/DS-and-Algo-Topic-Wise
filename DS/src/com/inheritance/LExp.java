package com.inheritance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employees {
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Employees(int id,String name) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Employees other = (Employees) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employees [name=" + name + ", id=" + id + "]";
	}
	
	
	
	
}

class IdCompare implements Comparator<Employees>{

	@Override
	public int compare(Employees o1, Employees o2) {
		if(o1.getId()>o2.getId())
			return -1;
		else if(o1.getId()<o2.getId())
			return 1;
		else
			return 0;
	}
	
}
public class LExp {
	public static void main(String[] args) {
		List<Employees> list=new ArrayList<Employees>();
		list.add(new Employees(1, "Varun"));
		list.add(new Employees(2, "Ravi"));
		list.add(new Employees(3, "Piyush"));
		list.add(new Employees(4, "John"));
		list.add(new Employees(5, "Tim"));
		//Collections.sort(list,new IdCompare());
		Collections.sort(list,(Employees o1,Employees o2)->{
			if(o1.getId()>o2.getId())
				return -1;
			else if(o1.getId()<o2.getId())
				return 1;
			else
				return 0;
		});
		for(Employees e:list)
			System.out.println(e);
	}
}
