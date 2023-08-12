package com.kodnest.tests;

import java.util.Scanner;

public class JoinerApp {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		String a=scan.next();
		String b=scan.next();
		System.out.println(joinStrings(a,b));
		scan.close();
	}
	public static String joinStrings(String str1, String str2)
	{
		return str1+str2;
	}

}
