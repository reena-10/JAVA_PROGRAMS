package practice;

import java.util.Scanner;

public class Practice4 {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    try {
		  int x = sc.nextInt();
	      int y = sc.nextInt();
          int result = x / y;
		   System.out.println(result);
        } 
    catch (java.util.InputMismatchException e) 
    {
     System.out.println("java.util.InputMismatchException");
    } 
    catch (ArithmeticException e) 
    {
	 System.out.println("java.lang.ArithmeticException: / by zero");
    } 
    
	}
}
	