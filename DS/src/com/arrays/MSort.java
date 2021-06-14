package com.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MSort {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Arr length");
		int l=Integer.parseInt(br.readLine());
		int[] arr=new int[l];
	
		for(int i=0;i<l;i++) {
			System.out.println("Enter "+i+" element");
			arr[i]=Integer.parseInt(br.readLine());
		}
			
		MSort m=new MSort();
		m.sort(arr);
		for(int i:arr)
			System.out.println(i);
	}
	public void sort(int[] arr) {
		int low=0;
		int high=arr.length-1;
		divide(arr, low, high);
	}
	public void divide(int[] arr,int low,int high) {
		if(low<high) {
			int mid=(low+high)/2;
			divide(arr,low,mid);
			divide(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
	}
	public void merge(int[] arr,int low, int mid,int high) {
		int i=low;
		int j=mid+1;
		int k=low;
		int[] temp=new int[arr.length];
		while(i<=mid && j<=high) {
			if(arr[i]<arr[j]) {
				temp[k]=arr[i];
				i++;k++;
			}
			else {
				temp[k]=arr[j];
				j++;k++;
			}
		}
		while(i<=mid) {
			temp[k]=arr[i];
			i++;k++;
		}
		
		while(j<=high) {
			temp[k]=arr[j];
			j++;k++;
		}
		for(int a=low;a<=high;a++)
			arr[a]=temp[a];
	}
}
