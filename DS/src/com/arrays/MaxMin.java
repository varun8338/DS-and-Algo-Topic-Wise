package com.arrays;
import java.io.*;

public class MaxMin {

	static class Pair{
		int max;
		int min;
	}
	
	static Pair getMaxMin(int[] arr) {
		Pair p=new Pair();
		if(arr.length==1) {
			p.max=arr[0];
			p.min=arr[0];
			return p;
		}
		
		p.max=arr[0];
		p.min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>p.max)
				p.max=arr[i];
			if(arr[i]<p.min)
				p.min=arr[i];
		}
		return p;
	}
	
	public static void main(String[] args) throws IOException {
		int[] a= {1,2,3,4,5};
		Pair pair=getMaxMin(a);
		System.out.println("Max "+pair.max);
		System.out.println("Min "+pair.min);
	}
	
	

}
