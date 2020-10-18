package com.arrays;
import java.io.*;

public class DutchNationalFlagProblem {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int l=Integer.parseInt(br.readLine());
			int[] arr=new int[l];
			String line=br.readLine();
			String[] lineArray=line.trim().split("\\s+");
			for(int i=0;i<l;i++)
				arr[i]=Integer.parseInt(lineArray[i]);
			DutchNationalFlagProblem d=
					new DutchNationalFlagProblem();
			d.sort(arr, l);
			
		}

	}
	
	public static void sort(int[] arr,int l) {
		int low=0;
		int mid=0;
		int high=l-1;
		while(mid<=high) {
			switch(arr[mid]) {
			case 0:
				swap(arr,low,mid);
				low++;
				mid++;
				break;
			
			case 1:
				mid++;
				break;
				
			case 2:
				swap(arr,mid,high);
				high--;
				break;
			}
		}
		StringBuffer sb=new StringBuffer("");
		for(int i:arr)
			sb.append(i+" ");
		System.out.println(sb);
	}
	
	public static void swap(int[] arr,int a,int b) {
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}

}
