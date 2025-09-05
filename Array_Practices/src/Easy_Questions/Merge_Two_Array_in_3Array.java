package Easy_Questions;

//Merge two array in third Array.

public class Merge_Two_Array_in_3Array {

	public static void main(String[] args) {
    int arr1[]= {1,2,3,4,5};
    int arr2[]= {6,7,8,9,10};
    int nums []=new int[arr1.length+arr2.length];
    
    for(int i=0;i<arr1.length;i++) {
    	nums[i]=arr1[i];
    }
    for(int i=0;i<arr2.length;i++) {
    	nums[arr1.length+i]=arr2[i];
    }
    System.out.println("Merge Array Is : ");
    for(int i=0;i<nums.length;i++) {
    	System.out.print(nums[i]+" ");
    }
	}

}
