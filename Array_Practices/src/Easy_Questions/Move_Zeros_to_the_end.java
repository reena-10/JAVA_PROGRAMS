package Easy_Questions;

//Move all the Zero to the End.
//Approach : Shift Non Zeros + fill Zeros
import java.util.Arrays;
public class Move_Zeros_to_the_end {
    static void MoveZeros(int arr[]) {
        int size = arr.length;
        if (size == 0 || size == 1) {
            return;
        }

        int index = 0; // position to place the next non-zero

        // Step 1: Copy all non-zero elements to the front
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // Step 2: Fill remaining places with 0
        while (index < size) {
            arr[index++] = 0;
        }
    }

	public static void main(String[] args) {
    int arr[]= {0,3,2,0,4,0,5,0};
    MoveZeros(arr);
    System.out.println(Arrays.toString(arr));
	}

}
