package Test;

import java.util.Scanner;

public class ArmStrong_Number {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
     int n;
     int c =0;
     int arm=0;
     System.out.print("Enter a Number");
     n =s.nextInt();
     c=n;
     while(n<0) {
    	int remainder=n%10;
    	arm=(remainder*remainder*remainder)+arm;
    	n=n/10;
     }
     if(c==arm) {
         System.out.println("ArmStrong Number");
     }
      else {
    	 System.out.println("Not a ArmStrong Number");
     }
    	 
	}

}
