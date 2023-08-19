package com.kodnest.program.test;

import java.util.Scanner;

public class Registrationsystem {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("check the valdity");
		System.out.println("enter the input valid");
		boolean a =scan.nextBoolean();
		System.out.println("enter the input meet a certain condition");
		boolean b =scan.nextBoolean();
		boolean res=isValidInput(a, b);
		System.out.println("is input valid "+a);
		System.out.println("Does input meet a certain condition "+b);
		scan.close();
		if(res||a)
		{
			System.out.println("input is valid");
		}
		else
		{
			System.out.println("input is not valid");
		}
	}
	public static boolean isValidInput(boolean a,boolean b)
	{
		boolean c=a||b;
		return c;
	}
}
