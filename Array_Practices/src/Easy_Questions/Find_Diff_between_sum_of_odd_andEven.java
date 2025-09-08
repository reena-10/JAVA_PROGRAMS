package Easy_Questions;

//Find the difference between the sum of even and odd elements.

public class Find_Diff_between_sum_of_odd_andEven {
   static void find_diff_between_Odd_Even(int arr[]){
	   int even =0;
	   int odd =0;
	   for(int i=0;i<arr.length;i++) {
		   if(arr[i]%2==0) {
			   even = even+arr[i];
			   
		   }else {
			   odd = odd +arr[i];
		   }
		   
	   }
	   int difference = even - odd;
	   System.out.println("Sum of Even : " +even);
	   System.out.println("Sum of Odd : "+odd);
	   System.out.println("Difference between Sum of Odd and Sum of Even is :"+ difference );
	   
   }
	public static void main(String[] args) {
		int arr [] = {0,0,-1,2,-3,9,4};
    find_diff_between_Odd_Even(arr);
	}

}
