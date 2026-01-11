package java_maths_questions;

//Create a program that computes the sum of the digits of an integer.

import java.util.Scanner;
public class Sum_Of_Digits {
	public static int sumOfDigits(int n) {
		int sum=0;
		
		while(n>0) {
			
			n=n%10; // to find last digit number
			sum+=n; // add last digit into sum variable
			n=n/10; // remove the last digit of a number
		}
		return sum;
	}

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Calculates the Sum of a Digits \n");
    System.out.print("Enter the Number : ");
    int n = sc.nextInt();
    System.out.println("Sum of Digit is : "+sumOfDigits(n));
	}

}
