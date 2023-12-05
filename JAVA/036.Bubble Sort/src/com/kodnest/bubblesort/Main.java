package com.kodnest.bubblesort;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the array length");
		int arr[]=new int[sc.nextInt()];
		System.out.println("enter the "+arr.length+" elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("before swapping --> ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" | ");
		}
		System.out.println();
		int n=arr.length;
		for(int i=0;i<=n-2;i++)
		{
			for(int j=0;j<=n-2-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					System.out.print(arr[j+1]+" ");
				}
			}
			System.out.println();
		}
		System.out.print("After swapping --> ");
		int m=arr.length;
		for(int i=0;i<m;i++)
		{
			System.out.print(arr[i]+" | ");
		}
		System.out.println();
	}

}
