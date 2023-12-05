package com.kodnest.program.test;

import java.util.Scanner;

public class Swapoperation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Before Swapping");
		System.out.println("Enter the First number");
		int fn =scan.nextInt();
		System.out.println("Enter the second number");
		int sn =scan.nextInt();
		System.out.println("Enter the first integer"+fn);
		System.out.println("Enter the Second integer"+sn);
		System.out.println("Before Swapping: first="+fn+",Senond="+sn);
		scan.close();
		swapUsingBitwise(fn,sn);
	}
	public static void swapUsingBitwise(int a,int b)
	{
		System.out.println("After Swapping");
		 a=a^b;
		 b=a^b;
		 a=a^b;
		 System.out.println("Enter the first integer"+a);
		 System.out.println("Enter the Second integer"+b);
		 System.out.println("After Swapping: first="+a+",Senond="+b); 
	}

}
