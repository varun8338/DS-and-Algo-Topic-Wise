package com.Patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern15 {

	public static void main(String[] a) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("N");
		int n=Integer.parseInt(br.readLine());
		int count=0;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				count=count+i;
				for(int j=1;j<=3;j++) {
					System.out.print(count+" ");
					count++;
				}
			}
			else {
				count=count+i;
				for(int j=1;j<=3;j++) {
					System.out.print(count+" ");
					count--;
				}
				count++;
			}
			System.out.println();
		}
	}

}
