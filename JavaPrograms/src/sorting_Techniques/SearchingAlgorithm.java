package sorting_Techniques;

public class SearchingAlgorithm {
 public static int search(int []arr,int k) {
	 for(int i=0;i<arr.length;i++) {
		 if(arr[i] == k) {
			 return i;
		 }
	 }
	 return -1;
 }
	public static void main(String[] args) {
    int arr [] = {2,4,6,8,0,46,3,5,86,9,43,55,24};
    int k = 86;
    int uttar = search(arr,k);
    System.out.println(uttar);
	}

}
