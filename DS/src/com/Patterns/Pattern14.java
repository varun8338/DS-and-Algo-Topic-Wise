package com.Patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
*/
public class Pattern14 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		System.out.println("n");
		int n=Integer.parseInt(br.readLine());
		int sum=0;
		int temp=0;
		for(int i=1;i<=n;i++) {
			sum=n-1;
			temp=i;
			for(int j=1;j<=i;j++) {
				if(j==1)
					System.out.print(temp+" ");
				else {
					temp+=sum;
					sum--;
					System.out.print(temp+" ");
				}
			}
			System.out.println();
		}
	}

}
