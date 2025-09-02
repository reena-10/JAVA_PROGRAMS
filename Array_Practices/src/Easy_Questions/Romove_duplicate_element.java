package Easy_Questions;

//Remove duplicates from an array

public class Romove_duplicate_element {

	public static void main(String[] args) {
    int arr[]  = {3,5,7,3,6,8};
    int result[] = new int[arr.length];
    int j=0;
    for(int i=0 ; i<arr.length ;i++) {
    boolean isDuplicate = false;
    for(int k=0; k<j; k++) {
    	if(arr[i]==result[k]) {
    		isDuplicate = true;
    		break;
    	}
    }
    if(!isDuplicate) {
    	result[j]=arr[i];
    	j++;
    }
    }
    //print unique elements
    System.out.println("Array after removing duplicates");
    for(int i=0; i<j ; i++) {
    	System.out.print(result[i]+ " ");
    }
    }

}



/*** Logic (Without Collections)

Take the original array.

Create a new temporary array (or use the same array with index shifting).

Traverse the array element by element.

For each element, check whether it already exists in the temporary array.

If it is not present, copy it to the temporary array.

If it is already present, skip it.

At the end, the temporary array will contain only unique elements.

Copy back the result into the original array if needed. ***/