package com.kodnest.tests;

import java.util.Scanner;

public class DoubleApp {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int a=scan.nextInt();
		System.out.println(doubleTheNumber(a));
		scan.close();
	}
	public static int doubleTheNumber(int num)
	{
		return num*2;
	}

}
