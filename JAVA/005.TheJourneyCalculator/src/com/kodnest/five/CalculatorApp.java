package com.kodnest.five;

import java.util.Scanner;



public class CalculatorApp 
{
	

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		double a=scan.nextDouble();
		double b=scan.nextDouble();
		JourneyCalculator1.calculateDistance(a,b);
		System.out.println(JourneyCalculator1.calculateDistance(a,b));
		scan.close();
	}
	
}

 class JourneyCalculator1
{

	public static double calculateDistance(double speed, double time)
	{
		return speed*time;
	}
}
