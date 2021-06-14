package com.arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args)  {
		Candidate c=new Candidate(1, "ABC");
		c=new Candidate(2, "PQR");
		System.out.println(c.getId());
		Integer[] arr= {1,2,4,6,20};
		
		List<Integer> list = Stream.of(arr).collect(Collectors.toList());
		System.out.println("Size: "+list.size());
		list=list.stream().filter(i->i>4).collect(Collectors.toList());
		
		System.out.println(list.size());
	}
}
