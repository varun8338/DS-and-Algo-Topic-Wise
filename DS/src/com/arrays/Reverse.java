package com.arrays;
import java.io.*;

public class Reverse {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int t=Integer.parseInt(br.readLine());
		while(t-->0) {
			int l=Integer.parseInt(br.readLine());
			String line=br.readLine();
			String[] lineArray=line.trim().split("\\s+");
			for(int i=l-1;i>=0;i--)
				System.out.print(lineArray[i]+" ");
		}

	}

}
