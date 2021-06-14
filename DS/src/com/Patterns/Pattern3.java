package com.Patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("N");
		int n=Integer.parseInt(br.readLine());
		for(int i=1;i<2*n;i++) {
			if(i<=n) {
				//print spaces
				for(int j=i;j<n;j++)
					System.out.print("  ");
				for(int j=1;j<=i;j++)
					System.out.print("* ");
			}
			else {
				for(int k=1;k<=i-n;k++)
					System.out.print("  ");
				for(int k=i;k<2*n;k++)
					System.out.print("* ");
			}
			System.out.println();
		}
	}

}
