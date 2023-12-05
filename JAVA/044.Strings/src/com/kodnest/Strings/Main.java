package com.kodnest.Strings;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string name");
		String scan=new String(sc.nextLine());
		char ch[]=scan.toCharArray();
		System.out.println(scan.toCharArray());
		for(char a:ch)
		{
			System.out.println(a);
		}
		sc.close();
	}
}
    