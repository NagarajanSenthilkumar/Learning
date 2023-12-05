package com.kodnest.seven;

import java.util.Scanner;

public class TheMarksApp {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int marks=scan.nextInt();
		System.out.println("welome to kodnest");
		add(marks);
		scan.close();
	}
	public static void add(int marks)
	{
		if(marks>=80)
		{
			System.out.println("welcome to Tech Club");
		}
		else
		{
			System.out.println("your are not eligiblefot Tech Club");
		}
	}
}