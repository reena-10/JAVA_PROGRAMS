package array;
import java.util.Scanner;
public class Reverse_Array {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of element");
    //Input size
    int size = sc.nextInt();
    
    int arr[] = new int[size];
    
    System.out.println("Enter the element of Array");
    for(int i=0; i<arr.length; i++) {
    	arr[i] = sc.nextInt();
    }
    
    System.out.println("Original Array");
    for(int i=0; i<arr.length;i++) {
    	System.out.print(arr[i]+" ");
    }
    
    System.out.println();//For space
    
    //Reverse the array in place
    int start = 0, end = arr.length-1;
    
    while(start<end) {
    	int temp = arr[start];
    	arr[start]= arr[end];
    	arr[end]= temp;
    	
    	start++;
    	end--;
    }
    System.out.println("Reversed array");
    for(int i=0;i<arr.length;i++) {
    	System.out.print(arr[i]+" ");
    }
	}

}
