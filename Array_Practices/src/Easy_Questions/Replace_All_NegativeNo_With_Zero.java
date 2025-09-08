package Easy_Questions;

//Replace all negative numbers with 0.

public class Replace_All_NegativeNo_With_Zero {
  static void replaceNegativeToZero(int[]arr ) {
	  System.out.println("\nAfter Replace :");
	  for(int i =0; i<arr.length ; i++) {
		  if(arr[i]<0)
			  arr[i]=0;      
		  System.out.print(arr[i]+" ");
	  }
  }
	public static void main(String[] args) {
    int arr[]= {2,-1,9,4,-3,-2,8};
    System.out.println("Before Replace : ");
    for(int i=0;i<arr.length;i++) {
    	System.out.print(arr[i]+" ");
    }
    replaceNegativeToZero(arr);
	}

}
