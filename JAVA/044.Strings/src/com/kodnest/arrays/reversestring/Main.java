package com.kodnest.arrays.reversestring;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string number");
		String str=sc.nextLine();
		String arr[]=str.split(" ");
		String revword="";
		String revsentence="";
		for(int i=0;i<=arr.length-1;i++)
		{
			String word=arr[i];
			char arr2[]=word.toCharArray();
			char arr3[]=new char[arr2.length];
			int j=arr3.length-1;
			for(int k=0;k<=arr2.length-1;k++)
			{
				arr3[j]=arr2[k];
				j--;
			}
			str= new String(arr3);
			revword=revword+str;
		} 
		revsentence=revsentence+revword;
		System.out.println(revsentence);
	}
}
