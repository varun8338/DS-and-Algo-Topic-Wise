package com.arrays;

import java.util.ArrayList;
import java.util.List;

public class Interview {
	public static void main(String[] args) {
		char[] a = {'a','b','c','d'};
		char[] b = {'e','f','a','h'};
		int c[] = new int[5];
		System.out.println(c);
		System.out.println(containsChar(a, b));
	}
	
	public static boolean containsChar(char[] a,char[] b) {
		//convert 1st array to arraylist
		List<Character> arrayList = new ArrayList<Character>();
		for(char t:a) {
			arrayList.add(t);
		}
		
		//iterate 2nd array to check if it's present in arrayList
		for(char t:b) {
			if(arrayList.contains(t))
				return true;
		}
		return false;
	}
}
