package com.arrays;

public class Bsort {
	public static void main(String[] args) {
		int[] a = {11,10,9,8,25,21,45};//25,21,11,10,9,8
		int k=2;
		for(int i=0;i<a.length;i++) {
			int t=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					t=a[j];
					a[j]=a[i];
					a[i]=t;
				}
			}
			if(i==k-1) {
				System.out.println(a[i]);
				break;
			}
				
		}
		System.out.println("**********");
		for(int i:a) {
			System.out.println(i);
		}
	}
}
