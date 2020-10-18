package com.arrays;
import java.io.*;

public class MaxMin {
	
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
			String line=br.readLine();
			String[] lineArray=line.trim().split("\\s+");
			for(int i=0;i<l;i++)
				arr[i]=Integer.parseInt(lineArray[i]);
			MaxMin m=new MaxMin();
			Pair maxmin=m.getMaxMin(arr, l);
			System.out.println("Max: "+maxmin.max);
			System.out.println("Min: "+maxmin.min);
		}
		
	}
	
	public static Pair getMaxMin(int[] arr,int n) {
		Pair minmax=new Pair();
		int i=0;
		if(n%2==0) {
			if(arr[0]>arr[1]) {
				minmax.min=arr[1];
				minmax.max=arr[0];
			}
			else {
				minmax.min=arr[0];
				minmax.max=arr[1];
			}
			i=2;
		}
		
		else {
			minmax.max=arr[0];
			minmax.min=arr[0];
			i=1;
		}
		
		while(i<n-1) {
			if(arr[i]>arr[i+1]) {
				if(arr[i]>minmax.max)
					minmax.max=arr[i];
				if(arr[i+1]<minmax.min)
					minmax.min=arr[i+1];
			}
			
			else {
				if(arr[i]<minmax.min)
					minmax.min=arr[i];
				if(arr[i+1]>minmax.max)
					minmax.max=arr[i+1];
			}
			i+=2;
		}
		
		
		return minmax;
	}

}
