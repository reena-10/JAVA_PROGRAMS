package Easy_Questions;

//Find the index of the first occurrence of a given element.

public class Print_Index_of_first_Occurance_Element {
   public static int findFirstOccurrence(int[]arr, int target) {
	//Traverse the array
	for(int i=0; i< arr.length; i++) {
		if(arr[i]==target) {
			return i; //Return index as soon as found
		}
	}
	return -1; //If not found
   }
	public static void main(String[] args) {
    int [] arr = {5,2,7,2,9};
    int target = 2;
    
    int index = findFirstOccurrence(arr,target);
    
    if(index != -1) {
    	System.out.println("First occurence of "+target+" is at index : "+index);
    }else {
    		System.out.println("Element not found in array.");
    	}
    
	}

}
