package com.kodnest.array.anticlock;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the arr length");
		int arr[]=new int[sc.nextInt()];
		System.out.println("Enter the Array Elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Before Anticlock wise Rotation array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the n value");
		int n=sc.nextInt();
		antiClockRotation(arr,n);
	}
		public static void antiClockRotation(int arr[],int n)
		{
		for(int i=1;i<n;i++)
		{
		int temp=arr[0];
		for(int j=1;j<=arr.length-1;j++)
		{
			arr[j-1]=arr[j];
		}
		arr[arr.length-1]=temp;
		}
		System.out.println("After Anticlock wiseRotation array elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
}
}
