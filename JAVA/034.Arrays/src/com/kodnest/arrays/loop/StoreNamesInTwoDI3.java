package com.kodnest.arrays.loop;

import java.util.Scanner;

public class StoreNamesInTwoDI3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String arr[][]=new String [5][6];
		for (int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the age of Banks"+i+" Customer"+j);
				arr[i][j]=sc.next();
			}
		}
		System.out.println("Arrays are ....");
		for (int i=0;i<=arr.length-1;i++)
		{
			System.out.print("Banks-->"+i+" ");
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" | ");
			}
			System.out.println();
		}
	}

}
