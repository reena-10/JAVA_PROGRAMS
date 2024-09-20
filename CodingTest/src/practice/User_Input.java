package practice;

import java.util.Scanner;

public class User_Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		//checking for the largest number between them
		int ans =(a>b)?a:b;
		
		//checking for a smallest number that can be
       while(true) {
    	   if(ans%a==0 && ans%b==0)
    		   break;
    	   ans++;
       }
       //printing the result
       System.out.println("LCM of "+a+" and "+b+ ": "+ans);
	}

}
