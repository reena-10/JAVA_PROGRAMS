package searching_Algorithm;

import java.util.Scanner;

public class Binary_Search {
	public static void main(String[] args) {
     int n, i ,item , c=0 ,beg ,end,mid=0;
     int[]a;
     Scanner sc = new Scanner(System.in);
     System.out.println("How many elements do u want to enter");
     
     n=sc.nextInt();
     a = new int[n];
     System.out.println("Enter Elements");
     for(i=0; i<n; i++)
    	 a[i]=sc.nextInt();
     System.out.println("Enter item to Find");
     item = sc.nextInt();
     beg=0; end=n-1;
     while (beg<=end) {
    	 mid=(beg+end)/2;
    	 if(item == a[mid]) 
    	 {
    		 System.out.print("item found at "+mid);
    		 break;
    	 }
    	 else if (item >a[mid])
    	 {
    		 beg=mid+1;
    	 }
    	 else if(item < a[mid])
    	 {
    		 end =mid-1;
    	 }
     }
     if(c>0) {
     System.out.print("Item found at" +mid);}
     else {
     System.out.print("Item not found at "+mid);}
   
	}

}
