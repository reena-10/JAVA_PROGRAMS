package Easy_Questions;

import java.util.Arrays;

public class Find_Unique_Element_in_an_Array {
  public static int findUnique(int [] nums) {
	  Arrays.sort(nums);
	  
	  for(int i=0; i<nums.length-1; i+=2) {
		  if(nums[i]!= nums[i+1]) {
			  return nums[i];
		  }
	  }
	  return nums[nums.length-1];
  }
	public static void main(String[] args) {
	int [] nums = {1,2,4,2,1,5,7,5,4};
	System.out.println(findUnique(nums));

	}

}
