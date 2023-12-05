package com.kodnest.program.test;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the operator");
		char operator=scan.next().charAt(0);
		if (operator=='+')
		{
			System.out.println("enter the number");
			int a=scan.nextByte();
			int b=scan.nextByte();
		    calculate(a,b,operator);
			
		}
		else if(operator=='-')
		{
			short c=scan.nextShort();
			short d=scan.nextShort();
			calculate(c,d,operator);
		}
		else if(operator=='*')
		{
		byte e=scan.nextByte();
		byte f=scan.nextByte();
		calculate(e,f,operator);
		}
		else if(operator=='/')
		{
		long g=scan.nextLong();
		long h=scan.nextLong();
		calculate(g,h,operator);
		}
		else
		{
			System.out.println("error check the operator");
		}
		scan.close();	
	}
	public static void calculate(int a,int b,char operator)
	{
		switch(operator)
		{
		case '+':
		int c=a+b;	
		}
	}	
    public static void calculate(short a,short b,char operator)
    {	
	switch(operator)
	{
	case '-':
	System.out.println("substratcion of"+(a-b));
	break;
	}
}
public static void calculate(byte a,byte b,char operator)
{
	switch(operator)
	{
	case '*':
	System.out.println("mul of"+(a*b));
	break;
	}
}
public static void calculate(long a,long b,char operator)
{
	switch(operator)
	{
	case '/':
	System.out.println("div of"+(a/b));
	break;
	}
}
}
