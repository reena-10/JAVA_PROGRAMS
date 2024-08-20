
public class Sum_of_element {

	public static void main(String[] args) {
		int[] arr = {12, 7, 6, 4, 5, 33};
        
		for (int i = 0; i < arr.length; i++) {
		    for (int j = i + 1; j < arr.length; j++) {
		        if (arr[i] + arr[j] == 12) {
		            System.out.println(arr[i] + " and " + arr[j]+" sum is 12");
		        }
		    }
		}
	}

}
