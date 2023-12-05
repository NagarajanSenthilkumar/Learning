package com.kodnest.arrays2;

import java.util.Scanner;

public class Rotatearrays {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first block number");
		int arr1[]=new int[sc.nextInt()];

		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(int i=arr1.length-1;i>=arr1.length-1;i--)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		sc.close();
		
	}

}
