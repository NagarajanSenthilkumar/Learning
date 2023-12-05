package com.kodnest.arrays.inseration;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enterr the arrays");
		int arr[]=new int[sc.nextInt()];
		System.out.println("enter the arryas elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("before swapping");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=1;i<=arr.length-1;i++)
		{
			int item=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>item)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=item;
		}
		System.out.println("afterr swapping");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
