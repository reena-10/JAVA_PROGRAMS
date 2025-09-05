package Easy_Questions;

import java.util.Scanner;
public class Second_largest_Number {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Size of Element");
	int size = sc.nextInt();
	int ar[]= new int[size];
	System.out.println("Enter the Array Elements");
	for(int i=0; i<ar.length;i++) {
      ar[i] = sc.nextInt();
	}
    int firstlargest =Integer.MIN_VALUE;
    int secondlargest = Integer.MIN_VALUE;
    
    for(int i : ar) {
    	if(i>firstlargest) {
    		secondlargest=firstlargest;
    		firstlargest=i;
    		if(i>secondlargest && i != firstlargest) {
    			secondlargest=i;
    		}
    	}
    }
    if(secondlargest == Integer.MIN_VALUE) {
		System.out.println("No Second Largest Element");
	}else {
		System.out.println("Second largest element "+secondlargest);
	}
    sc.close();
	}

}

/***Logic

We want the largest and the second largest element.

Initialize two variables:

firstLargest = smallest possible value

secondLargest = smallest possible value

Traverse the array element by element:

If the current element is greater than firstLargest:

Update secondLargest = firstLargest

Update firstLargest = current element

Else if the current element is greater than secondLargest AND not equal to firstLargest:

Update secondLargest = current element

At the end → secondLargest will hold the second largest element.***/