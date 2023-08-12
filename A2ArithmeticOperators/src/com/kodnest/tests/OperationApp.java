package com.kodnest.tests;

import java.util.Scanner;

public class OperationApp {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number for subtration");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println(subtractNumbers(a,b));
		System.out.println("enter the number for multiplication");
		int c=scan.nextInt();
		int d=scan.nextInt();
		System.out.println(multiplyNumbers(c,d));
		System.out.println("enter the number for divisble");
		int e=scan.nextInt();
		int f=scan.nextInt();
		System.out.println(divideNumbers(e,f));
		System.out.println("enter the number for find number");
		int g=scan.nextInt();
		int h=scan.nextInt();
		System.out.println(findRemainder(g,h));
		scan.close();
		
	}
	public static int subtractNumbers(int num1, int num2)
	{
		return num1-num2;
	}

	public static int multiplyNumbers(int num1, int num2)
	{
		return num1*num2;
	}

	public static double divideNumbers(int num1, int num2)
	{
		return num1/num2;
	}

	public static int findRemainder(int num1, int num2)
	{
		return num1%num2;
	}
}
