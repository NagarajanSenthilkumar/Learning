package com.kodnest.arrays.loop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the value");
			arr[i]=sc.nextInt();
		}
		System.out.println("arrays are.....");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
