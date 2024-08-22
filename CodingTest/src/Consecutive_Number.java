
public class Consecutive_Number {

	public static void main(String[] args) {
		
		 int[] array = {12, 7, 6, 4, 98, 23, 45, 78, 90, 5, 33};
	        int g = 3; // The mystical number

	        int maxSum = Integer.MIN_VALUE; // Initialize with the smallest possible value

	        // Traverse the array up to the third-to-last element
	        for (int i = 0; i < array.length - 2; i++) {
	            int sum = array[i] + array[i + 1] + array[i + 2];
	            maxSum = Math.max(maxSum, sum); // Update the maximum sum
	        }

	        System.out.println("The maximum sum of three consecutive numbers: " + maxSum);
	    }
	}
