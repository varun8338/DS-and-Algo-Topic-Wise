package com.arrays;
import java.io.*;

public class KadaneAlgo {

	public static void main(String[] args)throws IOException {
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
			
		}

	}
	
	public static int maxSum(int[] arr,int l) {
		int sum=arr[0];
		int max=arr[0];
		for(int i=1;i<l;i++) {
			sum=Math.max(arr[i], sum+arr[i]);
			max=Math.max(max,sum);
		}
		return 0;
	}

}
