package discount.applicability;

import java.util.Scanner;

public class DiscountApp {
	public static void checkDiscount(double purchaseAmount)

	{
System.out.println("discount applicable");

	}

	public static void main(String[] args)

	{
		Scanner scan=new Scanner(System.in);
		System.out.println("start");
	 double i=scan.nextDouble();
	 if (i<=100)
	 {
		 System.out.println(i);
		 System.out.println("applicabele");
	 }
	else if (i>=100)
		  {
			  System.out.println(i);
				checkDiscount(i);

		  }
	 }
	 

	}
