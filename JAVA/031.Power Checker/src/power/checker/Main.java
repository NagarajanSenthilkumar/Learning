package power.checker;

import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
  Scanner scan=new Scanner(System.in);
  System.out.println("enter the number");
  int num=scan.nextInt();
  PowerChecker a1=new PowerChecker();
  int digi=a1.Checks(num);
  int res1=a1.LastDigit(num, digi);
  System.out.println(digi);
  System.out.println(res1);
  if(res1==num) {
   System.out.println("true");
  }
  else {
   System.out.println("false");
  }
  

 }

}