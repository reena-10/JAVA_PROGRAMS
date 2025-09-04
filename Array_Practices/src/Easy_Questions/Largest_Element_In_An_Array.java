package Easy_Questions;

import java.util.Scanner;

public class Largest_Element_In_An_Array {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the Size");
    int Size = sc.nextInt();
    
    int arr[] = new int[Size];
    System.out.println("Enter the elements of Array");
    for(int i=0;i<arr.length;i++) {
    	arr[i]=sc.nextInt();
    }
    
    int largestElement = Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++) {
    	if(arr[i]>largestElement) {
    		largestElement = arr[i];
    		
    	}
    }
    System.out.println(largestElement);
    sc.close();
	}

}
