package Easy_Questions;

import java.util.Scanner;
public class Check_Array_Is_sorted_In_DescendingOrder {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Size of Array");
    int size = sc.nextInt();
    
    int arr[]= new int[size];
    System.out.println("Enter the Array Elements");
    for(int i=0; i<arr.length;i++) {
    	arr[i]=sc.nextInt();
    }
    boolean issorted = true;
    for(int i=0; i<arr.length-1;i++) {
    	if(arr[i]<arr[i+1]) {
    		issorted = false;
    		break;
    	}
    }
    if(issorted) {
    	System.out.println("Array is Sorted in Descending Order");
    }else {
    	System.out.println("Array is Not Sorted in Descending order");
    }
    sc.close();
	}

}
