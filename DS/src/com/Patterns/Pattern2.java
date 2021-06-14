package com.Patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("N");
		int n=Integer.parseInt(br.readLine());
		for(int i=1;i<=n;i++) {
			//print spaces
			for(int j=1;j<i;j++) {
				System.out.print("  ");
			}
			//print star
			for(int k=n;k>=i;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
