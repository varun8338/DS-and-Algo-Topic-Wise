package com.arrays;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.obj.Employee;
public class Test2 implements MyInterface {
	public static void main(String[] args) throws FileNotFoundException {
		MyInterface mi=new Test2();
		mi.someMethod();
		MyInterface.someMethod2();
		
		List<Integer> list=new ArrayList<Integer>(2);
		list.add(1);
		list.add(2);
		list.add(3);
		Collections.sort(list);
		ListIterator<Integer> li=list.listIterator(list.size());
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
			
		System.out.println(list.size());
		
		list = list.stream().filter(x -> x>1).collect(Collectors.toList());
		System.out.println(list.size());
		
		
		Deque<Integer> dq1=new LinkedList<Integer>();
		dq1.offer(2);
		dq1.offer(3);
		dq1.offer(2);
		dq1.offer(4);
		dq1.offer(8);
		dq1.offer(6);
		dq1.offer(5);
		dq1.offer(7);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		Iterator<Integer> itr=dq1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Map<Employee,Integer> m=new HashMap<Employee,Integer>();
		System.out.println("Before putting map");
		m.put(new Employee(1,"Varun",new Date()), 1);
		
		someMethod3();
		List<Integer> sampleList=new ArrayList<Integer>();
		sampleList.add(2);
		sampleList.add(4);
		sampleList.add(5);
		sampleList.add(6);
		sampleList.add(7);
		System.out.println(sampleList);
		sampleList.add(2, 10);
		System.out.println(sampleList);	
		sampleList.set(2, 11);
		System.out.println(sampleList);
		ListIterator<Integer> it=sampleList.listIterator();
		while(it.hasNext()) {
			if(it.next()==2)
				it.add(78);
		}
		System.out.println(sampleList);
		System.out.println("***************");
		LinkedList<Integer> sampleLinkedList=new LinkedList<Integer>();
		sampleLinkedList.add(2);
		sampleLinkedList.add(4);
		sampleLinkedList.add(5);
		sampleLinkedList.add(6);
		sampleLinkedList.add(7);
		System.out.println(sampleLinkedList);
		sampleLinkedList.add(2, 10);
		System.out.println(sampleLinkedList);	
		sampleLinkedList.set(2, 11);
		System.out.println(sampleLinkedList);
		sampleLinkedList.remove();
		System.out.println(sampleLinkedList);
	}
	
	public static void someMethod3()  {
		try {
			
		}
		catch (NumberFormatException | ArithmeticException e) {
			// TODO: handle exception
		}
	}
	
	
}
