// Search for an element in an array (linear search).
public class LinearSearch {
	public static void main(String [] args) {
	int arr[] = {2, 3, 4, 7, 11, 23,54};
	int target = 11;
	boolean Found= false;
	for(int i=0;i<arr.length;i++) {
		if(target == arr[i]) {
			System.out.println(arr[i]+" found at index "+i);
			Found=true;
			break;
		} 
	   }
	if(!Found) {
		System.out.println("Element Not found");
	}
		
	
	}
}