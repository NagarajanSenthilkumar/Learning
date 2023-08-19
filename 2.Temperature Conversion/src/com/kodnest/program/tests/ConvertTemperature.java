package com.kodnest.program.tests;

import java.util.Scanner;

public class ConvertTemperature {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to the temperature conversation tool!");
		double celsius=scan.nextDouble();
		double res1=celsiusToFahrenheit(celsius);
		System.out.println(res1);
		double fahrenheit=scan.nextDouble();
		double res2=fahrenheitToCelsius(fahrenheit);
		System.out.println(res2);
		scan.close();
	}
	public static double celsiusToFahrenheit(double celsius)
	{
		double C = (celsius * 9/5) + 32;
		return C;
	}
	public static double fahrenheitToCelsius(double fahrenheit)
	{
		double F = (fahrenheit - 32) * 5/9;
		return F;
	}
}