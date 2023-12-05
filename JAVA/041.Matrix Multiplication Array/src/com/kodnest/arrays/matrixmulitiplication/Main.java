package com.kodnest.arrays.matrixmulitiplication;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the arrays ");
		int arr1[][]=new int[sc.nextInt()][sc.nextInt()];
		System.out.println("enter the arrays elements");
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1[i].length-1;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1[i].length-1;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		int arr2[][]=new int[arr1.length][arr1.length];
		System.out.println("enter the arrays elements");
		for(int i=0;i<=arr2.length-1;i++)
		{
			for(int j=0;j<=arr2[i].length-1;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1[i].length-1;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		int arr3[][]=new int[arr1.length][arr1.length];
		for(int i=0;i<=arr3.length-1;i++)
		{
			for(int j=0;j<=arr3[i].length-1;j++)
			{
				for(int k=0;k<=arr3.length-1;k++)
				{
					arr3[i][j]=arr3[i][j]+arr1[i][k]*arr2[k][j];
				}
				
			}
		}
		System.out.println("value of mulitiplication matrix ");
		for(int i=0;i<=arr1.length-1;i++)
		{
			for(int j=0;j<=arr1[i].length-1;j++)
			{
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
	}
}
