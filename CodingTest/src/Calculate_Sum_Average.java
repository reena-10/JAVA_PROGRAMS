import java.util.Scanner;

public class Calculate_Sum_Average {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Size of Array :");
    //take user input to enter the size of array
     int n = sc.nextInt();
     //create an array
     int arr[] = new int[n];
     //insert the values in array
     System.out.println("Enter elements of Array :");
     for(int i=0;i<n;i++) {
    	arr[i]=sc.nextInt();
     }
     //Print array elements
     System.out.println("Array elements are :");
     for(int i=0;i<n;i++) {
    	 System.out.println(arr[i]);
     }
     //calculating sum using for loop
      int sum =0;
      for(int i=0;i<arr.length;i++) {
    	  
    	  sum=sum+arr[i];
      }
      //print the sum of array elements
      System.out.println("Sum :"+sum);
      //calculating average
      double average = sum/arr.length;
      //print the average 
      System.out.println("Average :"+average);
	}
}
	

