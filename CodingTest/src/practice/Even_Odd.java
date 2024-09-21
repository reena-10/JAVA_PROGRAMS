package practice;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if(x%2==0) {
    	System.out.println(+x+" is a Even Number");
    }else {
    	System.out.println(+x+" is not a Even Number");
    	
    }
	}
}
