package Easy_Questions;

public class Find_Index_Of_last_Occurrence_Element {

	
    static int findLastOccurrence(int [] arr, int target) {
    	
    	for(int i=arr.length-1; i>=0; i++) {
    		if(arr[i]==target) {
    			return i;//return as soon as we find
    		}
    	}
    	return -1; //If element not found
    }
	
     public static void main(String[] args) {
    	 int arr [] = {1,3,5,3,7,9,3};
    	 int target = 3;
    	 
    	 int index = findLastOccurrence(arr,target);
    	 
    	 if(index != -1)
    		 System.out.println("Last occurence of "+target+" is at index : "+index);
    	 else
    		 System.out.println("Element not found in array.");
    		 
  }
}
