package java_maths_questions;

//write a function that calculates the factorial of a given number.

import java.util.Scanner;
public class Find_Factorial {
  static int factorial(int n) {
	  if(n==1) {
		  return 1;
	  }
	  return n*factorial(n-1);
  }
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Calculate Factorial");
    System.out.print("Enter the Number to Find the Factorial : ");
    int n = sc.nextInt();
    System.out.println(factorial(n));
	}

}
