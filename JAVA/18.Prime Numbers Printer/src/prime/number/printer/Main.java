package prime.number.printer;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		printPrimes(n); 
		scan.close();
	}
	
	public static void printPrimes(int n)

	{
		int count=0;
		for (int i = 1 ; count<n ; i++) 
		{
			boolean res =checks(i);
			if (res == true) 
			{
				System.out.println(i +" it is prime number ");
				count++;
			}
			
		}
	}
	public static boolean checks(int n)
	{
		for (int i = 2 ; i<n ; i++) 
		{
			if (n%i==0)
			{
				return false;
			}
		}
		return true;
	}
}

	