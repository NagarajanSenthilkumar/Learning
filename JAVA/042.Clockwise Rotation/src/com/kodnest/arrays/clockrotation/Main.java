package com.kodnest.arrays.clockrotation;

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
	System.out.println("Before Clock wise Rotation array elements");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	System.out.println("Enter the n value");
	int n=sc.nextInt();
	clockrotation(arr, n);
}
public static void clockrotation(int arr[],int n)
{
	for(int i=0;i<=n;i++)
	{
	int temp=arr[arr.length-1];
	for(int j=arr.length-2;j>=0;i--)
	{
		arr[j+1]=arr[j];
	}
	arr[0]=temp;
	}
	System.out.println("After Clock wiseRotation array elements");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.print(arr[i]+" ");
	}
}

}
