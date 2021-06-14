package com.arrays;

public class CheckRotatedStrings {
	public static void main(String[] args) {
		String str1="abba";
		String str2="baba";
		
		str1=str1.concat(str1);
		if(str1.contains(str2))
			System.out.println("Equal when rotated");
		else 
			System.out.println("No");
	}
}
