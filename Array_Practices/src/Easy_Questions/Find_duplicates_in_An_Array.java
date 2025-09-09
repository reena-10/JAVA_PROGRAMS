package Easy_Questions;

public class Find_duplicates_in_An_Array {
   static void duplicates(int arr[]){
	  System.out.println("Duplicate Elements");
	   for(int i=0; i<arr.length; i++) {
		   int count = 0;
		   for(int j=i+1; j<arr.length; j++) {
			   if(arr[i]==arr[j]) {
				   count ++;
			   }
			  
		   }
		   if(count >0) { //It means the element appeared at least once again
			   System.out.println(arr[i]+" ");
		   }
				  
	   }
   }
	public static void main(String[] args) {
    int arr[] = {1,2,3,1,4,5,3,9};
    duplicates(arr);
	}

}
