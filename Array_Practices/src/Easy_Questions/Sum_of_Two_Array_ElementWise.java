package Easy_Questions;

public class Sum_of_Two_Array_ElementWise {

	public static void main(String[] args) {
    int arr1[] = {2,4,6,8};
    int arr2[]= {10,12,14,16,18};
    int nums[]=new int[Math.max(arr1.length, arr2.length)];
    
    for(int i=0;i<arr1.length;i++) {
    	nums[i]=nums[i]+arr1[i];
    }
    for(int i=0;i<arr2.length;i++) {
    	nums[i]=nums[i]+arr2[i];
    }
    
    for(int i=0;i<nums.length;i++) {
    	System.out.print(nums[i]+" ");
    }
    
    
	}

}
