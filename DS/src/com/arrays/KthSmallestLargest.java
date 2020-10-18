package com.arrays;

import java.util.*;
import java.io.*;

public class KthSmallestLargest {
	
	static class Pair{
		int min;
		int max;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int l=Integer.parseInt(br.readLine());
			int[] arr=new int[l];
			int k=Integer.parseInt(br.readLine());
			String line=br.readLine();
			String[] lineArray=line.trim().split("\\s+");
			for(int i=0;i<l;i++)
				arr[i]=Integer.parseInt(lineArray[i]);
			KthSmallestLargest g=new KthSmallestLargest();
			Pair p=g.getKthMinMax(arr, l, k);
			System.out.println(k+"th smallest element "+p.min);
			System.out.println(k+"th largest element "+p.max);
			
		}

	}
	
	public static Pair getKthMinMax(int[] arr,int l,int k) {
		Pair minmax=new Pair();
		Arrays.sort(arr);
		minmax.min=arr[k-1];
		minmax.max=arr[l-k];
		return minmax;
	}

}
