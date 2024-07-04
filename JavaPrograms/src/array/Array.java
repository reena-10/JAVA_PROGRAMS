package array;

public class Array {
	public static void main(String[] args) {
        int[] arr = new int[10];

        System.out.println("Table of 23 is :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 23 * (i + 1);
           System.out.print(+arr[i]+" ");
        }
	    System.out.println();
	    
        System.out.println("Reverse the table of 23:");     
        for (int i= arr.length-1;i>=0;i--) {
        	System.out.print(+arr[i]+" ");
        }
       }
} 
       
	

