package com.Patterns;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<8;i++) {
			if(i<=4) {
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
			}
			else {
				for(int j=i;j<8;j++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
