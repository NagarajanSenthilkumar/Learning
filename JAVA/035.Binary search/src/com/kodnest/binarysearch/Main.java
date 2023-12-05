package com.kodnest.binarysearch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter arys length");
		int arr[]=new int[sc.nextInt()];
		System.out.println("enter arys elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter key value");
		int key=sc.nextInt();
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
		
			int mid=(low+high)/2;
			int arr1[]=new int[mid];
			if(key==arr[mid])
			{
				System.out.println(key+" key "+mid+" Found");
			return ;
			}
				else if (key>arr[mid])
				{
					low=mid+1;
		
				}
				else if(key<arr[mid])
				{
					high=mid-1;

				}
		}
		System.out.println("Key not found");

	}

}
