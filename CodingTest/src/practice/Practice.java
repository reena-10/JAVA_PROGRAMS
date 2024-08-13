package practice;

import java.util.Arrays;

public class Practice {
	
	public static void main(String[] args) {
	//Swapping two string
    String a = "Good";
    String b = "Luck";
    a =a+b;
    b = a.substring(0,a.length()-b.length()); 
   a = a.substring(b.length()); 
   System.out.println("Strings after swap: a = " +  
           a + " and b = " + b); 
	
	
	
	}  
}
