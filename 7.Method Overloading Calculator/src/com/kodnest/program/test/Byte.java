package com.kodnest.program.test;

import java.util.Scanner;

public class Byte {
public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the First number");
		int a=scan.nextInt();
		System.out.println("Enter the Second number");
		int b=scan.nextInt();
		System.out.println(" Enter the operator (+, -, *, /):");
		char operator=scan.next().charAt(0);
		double addition =a+b;
		double subtraction  = a-b;
		double multiplication  = a*b;
		double division  = a/b;
		switch(operator)
	    {
	    case '+' :
	        System.out.print("Total after Addition is : "+addition);
	        break;
	    case '-' :
	        System.out.print("Total after Subtraction is : " +subtraction);
	        break;
	    case '*' :
	        System.out.print("Total after Multiplication is : "+multiplication);
	        break;
	    case '/' :
	        System.out.print("Total after Division is : "+division);
	        break;
	    default :
	        System.out.print("Please select proper operator");
	        return;
	    }
}
}










short c=scan.nextShort();
short d=scan.nextShort();
System.out.println(calculate(c,d));
int e=scan.nextInt();
int f=scan.nextInt();
System.out.println(calculate(e,f));
long g=scan.nextLong();
long h=scan.nextLong();
System.out.println(calculate(g,h));
System.out.println("select");



public static void calculate(short a,short b,char operator)
{	
	switch(operator)
	{
	case '-':
	System.out.println("addidtion of"+(a-b));
	}
}
public static void calculate(byte a,byte b,char operator)
{
	switch(operator)
	{
	case '*':
	System.out.println("addidtion of"+(a*b));
	}
}
public static void calculate(long a,long b,char operator)
{
	switch(operator)
	{
	case '/':
	System.out.println("addidtion of"+(a/b));
	}