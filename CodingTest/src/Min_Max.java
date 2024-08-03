import java.util.Scanner;

public class Min_Max {

	public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	int n = sc.nextInt();
	//create an array 
	int[] arr = new int [n];
	System.out.println("Enter Array Elements");
    for(int i =0;i<n;i++) {
    	arr[i]=sc.nextInt();

    }
	System.out.println("Array elements are:");
	//accessing the array element from the user

	for( int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
	int min =arr[0];
	int max =arr[0];

    for(int i=1; i<arr.length;i++) {
    	if(arr[i]>max) {
   		max=arr[i];
    	}
    	if(arr[i]<min) {
    	min=arr[i];
    	}
    	
    }
    System.out.println("Minimum element is "+min);
    System.out.println("Maximum element is "+max);
	}

}
