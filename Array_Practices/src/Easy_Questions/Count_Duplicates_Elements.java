package Easy_Questions;

//Count the number of duplicate elements in an array.
public class Count_Duplicates_Elements {
  static void countDuplicate(int arr[]) {
	  int duplicatecount =0;
	  
	 for(int i=0; i<arr.length;i++) {
		 int count =1;
		 boolean alreadycounted=false;
		 
		//Check if this element was already counted as duplicate
		 for(int k=0;k<i; k++) {
			 if(arr[i]==arr[k]) {
				 alreadycounted = true;
				 break;
				 
			 }
		 }
		 if(alreadycounted) {
			 continue; //skip this element
		 }
		 
		 // count occurrences of arr[i]
		 for(int j=i+1; j<arr.length; j++) {
			 if(arr[i]==arr[j]) {
				 count++;
			 }
		 }
		 if(count>1) {
			 duplicatecount++;
		 }
	 }
	 System.out.println("Number of duplicate elements: "+duplicatecount);
  }
	public static void main(String[] args) {
    int arr[]= {1, 2, 3, 2, 4, 1, 5, 5, 3, 3};
    countDuplicate(arr);
	}

}
