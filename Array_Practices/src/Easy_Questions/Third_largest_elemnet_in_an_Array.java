package Easy_Questions;

//Find the third largest element in an array.

public class Third_largest_elemnet_in_an_Array {
    static void third_largest(int arr[]) {
    	int firstlargest = Integer.MIN_VALUE;
    	int secondlargest = Integer.MIN_VALUE;
    	int thirdlargest = Integer.MIN_VALUE;
    	
    	for(int i :arr) {
    		if(i>firstlargest) {
    			secondlargest = firstlargest;
    			firstlargest =i;
    		}
    		else if(i>secondlargest && i!=firstlargest) {
    			secondlargest =i;
    		}
    		else if(i>thirdlargest && i!=secondlargest) {
    			thirdlargest =i;
    		}
    		}
    	
    	if(thirdlargest == Integer.MIN_VALUE ) {
    		System.out.println("Duplicates Elements");
    	}else {
    		System.out.println("Third Largest Element : "+thirdlargest);
    	}
    }

	public static void main(String[] args) {
    int arr[] = {45,67,23,87,56,34};
    third_largest(arr);
	}

}
