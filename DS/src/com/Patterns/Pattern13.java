package com.Patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 1
 1 2 1
 1 2 3 2 1
 1 2 3 4 3 2 1
*/
public class Pattern13 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("N");
		int n=Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++)
				System.out.print(j+" ");
			for(int j=i-1;j>=1;j--)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}
