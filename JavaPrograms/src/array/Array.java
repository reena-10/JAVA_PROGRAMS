package array;

public class Array {
	public static void main(String[] args) {
        int[] arr = new int[10];

        System.out.println("Array Elements");
        for (int i = 0; i < arr.length; i++) { 
            arr[i] = 23 * (i + 1);           //printing the table of 23.
           System.out.print(+arr[i]+" ");
        }
	    System.out.println("\n");
	    
        System.out.println("Reverse Array Element:");     
        for (int i= arr.length-1;i>=0;i--) {
        	System.out.print(+arr[i]+" ");  //print reverse table of 23.
        }
        System.out.println("\n");
        
        System.out.println("Convert Array");
        for(int i=0; i<arr.length; i++) {
        	arr[i]=17*(i+1);               //print the convert the same array into 17 table.
        	System.out.print(+arr[i]+" ");
        }
      }
} 
       
	

