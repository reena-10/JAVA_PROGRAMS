package searching_Algorithm;

import java.util.Scanner;

public class Linear_Search1 {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter how many values you want?");
    int n=sc.nextInt();
    int [] arr = new int[n];
    System.out.println("Enter "+n+" values : ");
    for(int i=0; i<arr.length; i++)
    	arr[i] =sc.nextInt();
    System.out.println("Enter element you want to search?");
    int target = sc.nextInt();
    int position = -1;
    for(int i=0 ; i<arr.length ; i++) {
    	if(arr[i]==target) {
    		position =i;
    		break;
    	}
    }
    int i;
	if (position !=-1) {
    	System.out.println(" "+target+" found : At Position "+position );
	}else {
		System.out.println(" "+target+" not found! ");
	}
	}
}
