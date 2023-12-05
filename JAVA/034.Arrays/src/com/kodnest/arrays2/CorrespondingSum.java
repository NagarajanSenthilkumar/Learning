package com.kodnest.arrays2;

import java.util.Scanner;

public class CorrespondingSum {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		sc.close();
		System.out.println("Enter the first block number");
		int arr1[]=new int[sc.nextInt()];
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		System.out.println("enter the second block number");
		int arr2[]=new int[sc.nextInt()];
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<=arr2.length-1;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		int arr3[]=new int[arr1.length+arr2.length];
		System.out.println("combine the arrays");
		for(int i=0;i<=arr3.length-1;i++)
		{
			arr3[i]=arr1[i]+arr2[i];
			System.out.print(arr3[i]+" ");
		}

		
	}

}
