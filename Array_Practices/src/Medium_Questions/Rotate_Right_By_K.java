package Medium_Questions;

// Rotate Array by k (to the right)
public class Rotate_Right_By_K {
   public static void rotateRightByK(int[] arr, int k) {
	   if(arr == null || arr.length <=1)
		   return;
	   int n = arr.length;
	   
	   k %= n;
	   if(k==0) 
		   return;
	   //Step 1: reverse the whole array
	   reverse(arr,0,n-1);
	   
	   //Step 2 : reverse the first k elements
	   reverse(arr , 0 ,k-1);
	   
	   //Step 3: reverse the remaining n-k elements
	   reverse(arr , k,n-1);
	   
   }
   private static void reverse(int [] a, int i, int j) {
	   while(i<j) {
		   int t = a[i];
		   a[i]=a[j];
		   a[j]=t;
		   i++;
		   j--;
	   }
   }
	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5,6,7,8,9};
         rotateRightByK(arr, 7);
         
         System.out.println("Rotate Array: ");
         for(int num : arr) {
        	 System.out.print(num+" ");
         }
	}

}
