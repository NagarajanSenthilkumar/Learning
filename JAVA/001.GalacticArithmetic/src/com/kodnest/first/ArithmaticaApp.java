package com.kodnest.first;

import java.util.Scanner;

public class ArithmaticaApp {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		long a=scan.nextLong();
		long b=scan.nextLong();
		System.out.println(galacticAddition(a,b));
		scan.close();
	}
	public static long galacticAddition(long num1, long num2)
	{
		return num1+num2;
	}

}

