package com.arrays;
import java.io.*;
import java.util.WeakHashMap;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ReverseArray {

	public static void main(String[] args) throws IOException, InterruptedException {
		WeakHashMap<MyKey, Integer> wm=new WeakHashMap<MyKey,Integer>();
		MyKey k1=new MyKey();
		MyKey k2=new MyKey();
		wm.put(k1,12);
		wm.put(k2,20);
		System.out.println(wm);
		k1=null;
		System.gc();
		//Thread.sleep(1000);
		System.out.println(wm);
		
		BiFunction<String, String, Boolean> bif=(s1,s2)->{
			s1=s1.concat(s2);
			return s1.contains(s2);
		};
		
		System.out.println(bif.apply("abababa", "baba"));
		
		BiFunction<Integer, Integer, Integer> add=(a,b)->a+b;
		Function<Integer, Integer> sq=(a)->a*a;
		BiFunction<Integer, Integer, Integer> sub=(a,b)->a-b;
		System.out.println(sub.andThen(sq).apply(30,20));

	}

}

class MyKey{
	
	@Override
	public String toString() {
		return "key1";
	}
		
}
