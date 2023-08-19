package com.kodnest.program.test;

import java.util.Scanner;

public class Taxcalculator {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the  amount");
		double d1=scan.nextDouble();
		System.out.println("Enter the purchase amount:"+d1);
		double d2=scan.nextDouble();
		System.out.println("Enter the tax rate (in decimal form):"+d2);
		double res=calculateTotalWithTax(d1,d2);
		System.out.println(res);
		scan.close();
	}
	public static double calculateTotalWithTax(double a,double b)
	{
		double c=a*b;
		double calculate=c+a;
		return calculate;
		
	}

}
