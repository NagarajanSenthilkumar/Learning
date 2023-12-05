package fibonacci.series;

import java.util.Scanner;

public class Main {
	public static void printFibonacciSeries(int n)
	{
		int first=0;
		int second=1;
		if(n==1)
		{
			System.out.println(first);
		}
		else if(n==2)
		{
			System.out.println(second);
		}
		else
		{
			System.out.println(first);
			System.out.println(second);
		for(int i=3;i<=n;++i)
		{
			int nextterm=first +second;
			System.out.println(nextterm);
			first=second;
			second=nextterm;
		}
		
		}
		
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n =scan.nextInt();
		printFibonacciSeries(n);
scan.close();
	}
}
