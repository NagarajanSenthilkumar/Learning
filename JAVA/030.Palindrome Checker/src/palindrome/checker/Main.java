package palindrome.checker;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int a=scan.nextInt();
		PalindromeChecker p1=new PalindromeChecker();
		boolean res=p1.Checkerpalindrome(a);
		scan.close();
		
		if(res==true)
		{
			System.out.println("The number is palidrome");
		}
		else
		{
			System.out.println("The number is not a palidrome");
		}
	}

}
