package searching_Algorithm;

public class BinarySearch2 {

	public static void main(String[] args) {
    int arr [] = { 2,5,6,12,16,23,38,45,56,72};
    int target = 16;
    int result = binarySearch(arr, target);
    
    if (result == -1){
    	System.out.println(target+"not found in the array.");
    }else {
    	System.out.println(target+" found at index: "+result);
    }
	} 
	
	public static int binarySearch(int[] arr,int target) {
		
		int start =0;
		int end = arr.length-1;
		
		while(start <= end) {
			int mid = (end + start)/2;
			
			if(target > arr[mid]) {
				start = mid+1;
			}else if(target < arr[mid]) {
				end = mid+1;
				
			}else {
				return mid;
		}
		}return -1;
	}

}
