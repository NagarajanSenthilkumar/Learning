package com.kodnest.program.tests;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the numbers");
		System.out.println("1 is addition");
		System.out.println("2 is substraction");
		System.out.println("3 is multiple");
		System.out.println("4 is division");
		int number=scan.nextInt();
		int a=scan.nextInt();
		int b=scan.nextInt();
		scan.close();
		switch(number)
		{
		case 1:
		  System.out.println(a+b);
		  break;
		case 2:
		  System.out.println(a-b);
		  break;
		case 3:
			System.out.println(a*b);
		break;
		case 4:
			System.out.println(a/b);
			break;
		} 
		}
			
	}

