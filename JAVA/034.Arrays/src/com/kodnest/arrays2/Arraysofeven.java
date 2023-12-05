package com.kodnest.arrays2;

import java.util.Scanner;

public class Arraysofeven {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter");
		int arr[]=new int[sc.nextInt()];
		for (int i=0;i<=arr.length-1;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<=arr.length-1;i++)
		{	if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}

	}

}
