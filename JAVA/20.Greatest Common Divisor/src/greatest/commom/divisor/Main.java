package greatest.commom.divisor;

import java.util.Scanner;

public class Main {
	public static void findGCD(int a, int b)

	{

while(b!=0)
{
	int rem=a%b;
	a=b;
	b=rem;
	
}
int gcd=a;
System.out.println(gcd);
	}

	public static void main(String[] args)

	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the two number");
		int a=scan.nextInt();
		int b=scan.nextInt();
		findGCD(a,b);
		scan.close();
	}

}
