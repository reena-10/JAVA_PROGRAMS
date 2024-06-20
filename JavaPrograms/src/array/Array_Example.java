package array;

public class Array_Example {
	    public static void main(String[] args) {
	        int[][] matrix = new int[3][3];
	        int count = 1;

	        // Initialize the matrix
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                matrix[i][j] = count++;
	            }
	        }

	        // Print the matrix
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}


