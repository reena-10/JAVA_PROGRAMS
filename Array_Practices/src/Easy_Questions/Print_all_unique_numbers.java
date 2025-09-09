package Easy_Questions;

//Print all unique elements of an array.

public class Print_all_unique_numbers {
   static void uniqueNo(int arr[]) {
	   for(int i=0;i<arr.length;i++) {
		   int count =0;
		   for(int j=0;j<arr.length;j++) {
			   if(arr[i]==arr[j]) {
				   count++;
			   }
		   }
		  if(count==1) {
			  System.out.print(arr[i]+" ");
		  }
	   }
   }
	public static void main(String[] args) {
    int arr[] = {1,2,1,3,4,5};
    System.out.println("Unique Numbers");
    uniqueNo(arr);
	}

}
