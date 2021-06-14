package com.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.*;

interface Drawable{
	void draw();
}

interface Addition{
	int add(int a,int b);
}

public class Eg1 {
	public static void main(String[] args) {
		Drawable d= () -> System.out.println("Drawing");//lamda expr with no-arguments
		d.draw();
		
		/*
		 * Addition add=new Addition() {
		 * 
		 * @Override public int add(int a,int b) { return 0; } };
		 */
		
		Addition ab=(a,b)->(a+b);//lamda expr with arguments
		
		Addition add = (a,b)->{
			System.out.println("Inside add method");
			int c=a+b;
			return c;
		};//lamda expr with arguments having multiple stmts
		
		System.out.println(ab.add(10, 10));
		
		Runnable run=()->System.out.println("Inside run method");
		Thread t1=new Thread(run);
		t1.start();
		
		List<String> list=new ArrayList<String>();
		list.add("C");
		list.add("C++");
		list.add("Java");
		String[] strArr= {"A","B","C"};
		List<String> strList=Arrays.asList(strArr);
		Map<String,Integer> map=Eg1.convertToMap(strList, (str)->str.length());
		System.out.println(map);
	}
	
	private static Map<String,Integer> convertToMap(List<String> list, Function<String,Integer> func)
	{
		Map<String,Integer> temp=new HashMap<String,Integer>();
		for(String t:list)
			temp.put(t,func.apply(t));
		return temp;
	}
}


