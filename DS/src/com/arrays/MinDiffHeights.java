package com.arrays;
import java.io.*;
import java.util.Arrays;

public class MinDiffHeights {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int t=Integer.parseInt(br.readLine());//testcases
		while(t-->0) {
			int k=Integer.parseInt(br.readLine());
			int l=Integer.parseInt(br.readLine());
			int[] arr=new int[l];
			String line=br.readLine();
			String[] lineArray=line.trim().split("\\s+");
			for(int i=0;i<l;i++)
				arr[i]=Integer.parseInt(lineArray[i]);
			MinDiffHeights m=new MinDiffHeights();
			System.out.println(m.getMinDiff(arr, k, l));
		}

	}
	
	public static int getMinDiff(int[] arr,int k, int l) {
		Arrays.sort(arr);
		int ans=arr[l-1]-arr[0];
		int small=arr[0]+k;
		int big=arr[l-1]-k;
		int temp=0;
		if(small>big) {
			temp=big;
			big=small;
			small=big;
		}
		for(int i=1;i<l-1;i++) {
			int add=arr[i]+k;
			int subtract=arr[i]-k;
			if(subtract>=small || add<=big)
				continue;
			if(big-subtract<=add-small)
				small=subtract;
			else
				big=add;
		}
		return Math.min(ans, big-small);
	}

}
