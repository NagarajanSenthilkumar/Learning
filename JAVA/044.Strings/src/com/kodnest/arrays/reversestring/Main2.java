package com.kodnest.arrays.reversestring;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string number");
		String str=sc.nextLine();
		str=str.toLowerCase();

		String arr[]=str.split(" ");
		String revsentence="";
		for(int i=arr.length-1;i>=0;i--)
		{
			char arr1[]=arr[i].toCharArray();
			char arr2[]=new char[arr1.length];
			for(int j=0;j<=arr1.length-1;j++)
			{
				arr2[j]=arr1[j];
			}
			String res=new String(arr2);
			revsentence=revsentence+res+" ";	
		}
		System.out.println(revsentence);
	}
}
