package com.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class Duplicates {
	public static void main(String[] args) {
		int[] a = {3,5,4,3,4,2,1,2,3,6};
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		for(int i:a) {
			if(hm.get(i)==null)
				hm.put(i,1);
			else {
				int t=hm.get(i);
				hm.put(i, t+1);
			}
		}
		Iterator<Map.Entry<Integer, Integer>> itr=hm.entrySet().iterator();
		while(itr.hasNext()) {
			int key=itr.next().getKey();
			int t=hm.get(key);
			if(t>1)
				System.out.println(key);
		}
		
		List<Object> list=new ArrayList<Object>();
		list.add("Hello");
		for(Object ob:list)
			System.out.println(ob);
		
	}
}
