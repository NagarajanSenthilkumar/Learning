package com.kodnest.tests;

import java.util.Scanner;

public class ScoreApp {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int score=scan.nextInt();
		Scoreclass a1=new Scoreclass();
		a1.grade(score);
		scan.close();
	}

}
