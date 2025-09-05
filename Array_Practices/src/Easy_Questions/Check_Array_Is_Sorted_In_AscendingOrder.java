package Easy_Questions;

//Check if the array is sorted (ascending).
import java.util.Scanner;
public class Check_Array_Is_Sorted_In_AscendingOrder {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Array Size");
	int size = sc.nextInt();
    int arr[] = new int[size];
    System.out.println("Enter the Array Element");
    for(int i=0;i<arr.length;i++) {
    	arr[i]=sc.nextInt();
    }
    boolean isSorted = true;
    for(int i=0;i<arr.length-1;i++) {  
    	//arr.length → goes too far and tries to access an element that doesn’t exist.
        //arr.length - 1 → stops before that and keeps it safe.
    	if(arr[i]>arr[i+1]) {
    		isSorted = false;
    		break;
    	}
    }
    if(isSorted) {
    	System.out.println("Array  is sorted in ascending order ");
    }else {
    	System.out.println("Array is not sorted in ascending order ");
    }
    sc.close();
	}

}


/***Logic

Take the array.

Start from the first element and compare it with the next element.

If at any point arr[i] > arr[i+1] → it means the array is not sorted in ascending order.

If no such case is found till the end → array is sorted.***/