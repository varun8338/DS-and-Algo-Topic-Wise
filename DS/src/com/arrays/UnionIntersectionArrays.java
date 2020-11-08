package com.arrays;
import java.io.*;
import java.util.*;

public class UnionIntersectionArrays {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("Test Cases");
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			System.out.println("Arrays lengths");
			//String length=br.readLine();
			String line1=br.readLine();
			String line2=br.readLine();
			String[] lineArray1=line1.trim().split("\\s+");
			String[] lineArray2=line2.trim().split("\\s+");
			int[] arr1=new int[lineArray1.length];
			int[] arr2=new int[lineArray2.length];
			for(int i=0;i<lineArray1.length;i++)
				arr1[i]=Integer.parseInt(lineArray1[i]);
			for(int i=0;i<lineArray2.length;i++)
				arr2[i]=Integer.parseInt(lineArray2[i]);
			UnionIntersectionArrays u=new UnionIntersectionArrays();
			System.out.println("Union: "+u.getUnion(arr1, arr2));
			System.out.println("Intersection: "+u.getIntersection(arr1, arr2));
			
		}
	}
	
	public int getUnion(int[] arr1,int[] arr2) {
		Set<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<arr1.length;i++)
			hs.add(arr1[i]);
		for(int j=0;j<arr2.length;j++)
			hs.add(arr2[j]);
		return hs.size();
	}
	
	public int getIntersection(int[] arr1,int[] arr2) {
		int counter=0;
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		//Map<Integer,Integer> hm2=new HashMap<Integer,Integer>();
		for(int i=0;i<arr1.length;i++) {
			Integer count=hm.get(arr1[i]);
			if(count==null)
				hm.put(arr1[i],1);
			else
				hm.put(arr1[i],count+1);
		}
		
		for(int i=0;i<arr2.length;i++) {
			Integer count=hm.get(arr2[i]);
			if(count==null)
				hm.put(arr2[i],1);
			else
				hm.put(arr2[i],count+1);
		}
		
		System.out.println(hm);
		
		for(Map.Entry<Integer,Integer> es:hm.entrySet()) {
			if(es.getValue()>1)
				counter++;
		}
		
		hm=null;
		
		return counter;
	}

}
