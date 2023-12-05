package com.kodnest.arrays.loop;

import java.util.Scanner;

public class StoreHeight3 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		double arr[]=new double[10];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("enter the value");
			arr[i]=sc.nextDouble();
		}
		System.out.println("arrays are.....");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}


