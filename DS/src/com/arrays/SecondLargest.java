package com.arrays;

public class SecondLargest {
	public static void main(String[] args) {
		int[] a= {11,10,9,8,25,21};
		int max=Integer.MIN_VALUE;
		int secondMax=max;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				secondMax=max;
				max=a[i];
			}
			else if(a[i]>secondMax && a[i]!=max) {
				secondMax=a[i];
			}
		}
		
		System.out.println(secondMax);
	}
}
