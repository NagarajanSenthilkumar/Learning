package com.kodnest.array.selectionsort;

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
		}
}
