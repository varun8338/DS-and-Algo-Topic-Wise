package com.Patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("N");
		int n=Integer.parseInt(br.readLine());
		int counter=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(counter+" ");
				counter++;
			}
			System.out.println();
		}
		
	}

}
