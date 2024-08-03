import java.util.Scanner;
import java.util.Arrays;

public class Sort_array {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Size of array");
    //take user input to enter the size of array
    int n=sc.nextInt();
    //create an array
    int arr[]=new int[n];
    //insert the values in array
    System.out.println("Elements of array");
    for(int i=0;i<n;i++) {
    	arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);//sort array in ascending order
    System.out.println("Elements of array sort in ascending order :");
    //print the sorted array using for each loop
    for(int i :arr) {
    	System.out.println(i);
    }
	}

}
