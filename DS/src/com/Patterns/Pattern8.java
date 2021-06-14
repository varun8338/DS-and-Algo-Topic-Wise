package com.Patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern8 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("N");
		int n=Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print("  ");
			}
			for(int j=i;j<=(2*n)-i;j++) {
				if(j==i||j==(2*n)-i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
