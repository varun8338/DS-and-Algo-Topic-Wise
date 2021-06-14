package com.arrays;

import java.util.*;

public class M implements I1,I2 {
	
	
	public void M() {
		System.out.println("Hello");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show");
		
	}
	
	public static void main(String[] args) {
		
		Set set1=new LinkedHashSet();
		set1.add(1);
		set1.add(12);
		set1.add(1);
		set1.add("ASAS");
		set1.add(14);
		set1.add(4);
		new M().M();
		
		
		List<Integer> list1=new ArrayList();
		list1.addAll(set1);
		System.out.println(list1);
	}



	

}
