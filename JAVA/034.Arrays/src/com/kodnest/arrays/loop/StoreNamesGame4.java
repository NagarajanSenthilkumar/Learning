package com.kodnest.arrays.loop;

import java.util.Scanner;

public class StoreNamesGame4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ente the number");
		double arr[][]=new double[5][];
		arr[0]=new double[5];
		arr[1]=new double[4];
		arr[2]=new double[3];
		arr[3]=new double[2];
		arr[4]=new double[1];
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("==========================================");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
			 System.out.print(arr[i][j]+" ");
			 System.out.print(" | ");
			}
			System.out.println();
		}
		System.out.println("==========================================");
	}

}
