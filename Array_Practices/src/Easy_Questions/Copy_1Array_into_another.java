package Easy_Questions;

import java.util.Scanner;

public class Copy_1Array_into_another {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Size of An Array");
	int n = sc.nextInt();
	
    int arr1[]= new int [n];
    int arr2[]= new int [n];
    System.out.println("Enter the Elements ");
    for(int i=0; i<arr1.length;i++) {
    	arr1[i]= sc.nextInt();
    }
    System.out.println("Array 1 : ");
    for(int i=0;i<arr1.length;i++) {
    	System.out.print(arr1[i]+" ");
    }
    System.out.println();//For space
    System.out.println("Succesfully Copied Array 1 : ");
    for(int i=0; i<arr2.length;i++) {
    	arr2[i]= arr1[i];
    	System.out.print(arr2[i]+" ");
    }
    sc.close();
   
	}
	
}

/***🔹 Logic

Take an original array (source array).

Create another array (destination array) of the same size.

Traverse the source array element by element.

For each index i:

Copy source[i] into destination[i].

After the loop ends → destination array will have the same elements as the source array.***/
