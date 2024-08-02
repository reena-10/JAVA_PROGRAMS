import java.util.Scanner;

public class Practice_Min_Max {
   
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();

    int arr[]=new int[10];
    System.out.println("Enter elements of array");
     for(int i=0;i<n;i++) {
    	 arr[i]=sc.nextInt();
     }
     System.out.println("Elements of array are");
     int max=arr[0];
	 int min=arr[0];
	for(int i=0;i<arr.length;i++) {
    	 if(arr[i]>max) {
        	 max=arr[i];
         }
         if(arr[i]<min) {
        	 min=arr[i];
         }
    	  
	}
   System.out.println("Minimum value is "+min);
   System.out.println("Maximum value is "+max);
	} 
}
