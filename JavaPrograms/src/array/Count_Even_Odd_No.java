package array;
import java.util.Scanner;
public class Count_Even_Odd_No {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    
    int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter Array Elements");
    for(int i =0 ;i< arr.length;i++) {
    	arr[i]=sc.nextInt();
    }
    System.out.println("Given Array is :");
    for(int i=0;i<arr.length;i++) {
    	System.out.print(arr[i]+" ");
    }
    System.out.println(); //for space
    int evencount =0;
    int oddcount = 0;
    
    for(int i=0; i<arr.length;i++) {
    	if(arr[i]%2==0) {
    		evencount++;
    	}else {
    		oddcount++;
    	}
    }
    System.out.println("Total Even Number : "+evencount);
    System.out.println("Total Odd Number : "+oddcount);
	}

}
