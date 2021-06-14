package com.inheritance;

import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		ArrayList<Object> list=new ArrayList<Object>();
		list.add("Hello1");
		list.add("Hello2");
		list.add("Hello3");
		list.add("Hello4");
		list.forEach((element)->System.out.println(element));
	}
}
