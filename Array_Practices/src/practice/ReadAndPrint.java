package practice;

import java.util.Scanner;

//Java program to take an integer as input and print it
public class ReadAndPrint {
   //main function
	public static void main(String[] args) {
	//declare the variables
     int num;
     //Input the integer
     System.out.println("Enter an Integer : ");
     //create Scanner object
     Scanner s = new Scanner(System.in);
     //Read the next integer from the screen
     num = s.nextInt();
     //Display the integer
     System.out.println("Entered integer is : "+num);
	}

}
