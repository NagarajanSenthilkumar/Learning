package factoial.calculator;

import java.util.Scanner;

public class Main {
	public static void calculateFactorial(int n)

	{
		int i,fact=1;
		int number=n;
		for(i=1;i<=number;i++)
			
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args)

	{

		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int n=scan.nextInt();
		calculateFactorial(n);
		scan.close();
		
	}

}
