package vending.machine.simulator;

import java.util.Scanner;

public class Main {
	public static void getProduct(String productCode)
	{
	switch(productCode)
	{
	case "P00":
		System.out.println("Pespi");
		break;
	case "PO1":
		System.out.println("Cocacola");
		break;
	case "PO2":
		System.out.println("Fanta");
		break;
	case "PO3":
		System.out.println("Jaljeera");
		break;
	case "PO4":
		System.out.println("mountainDew");
		break;
	case "PO5":
		System.out.println("BoatGvava");
		break;
		
	}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the names");
		String productcode=scan.next();
		getProduct(productcode);
		scan.close();
	}
}

