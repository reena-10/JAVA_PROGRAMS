package Easy_Questions;

//Find Maximum and minimum number in an Array.
//Time complexity = O(n)
//Space complexity =O(1) ,Because we use 2 variables only.

public class Min_Max_Element {

	public static void main(String[] args) {
    int arr[] = {2, 3, 48, 56,34, 78};
    int max = arr[0];
    int min =arr[0];
    
    for(int i=0; i<arr.length; i++) {
    	
    		if(arr[i]>max) {
    			max = arr[i];
    		}
    	if(arr[i]<min) {
    		min = arr[i];
    	}
    }
    System.out.println("Maximun Value :" +max);
    System.out.println("Minimum Value :"+min);
    
	}

}
