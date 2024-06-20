
package array;

public class Multi_D {
	    public static void main(String[] args) {
	        int[][] matrix = {
	            {2, 3, 5},
	            {6, 7, 2},
	            {2, 8, 4}
	        };

	        System.out.println("Even numbers in the matrix:");
	        for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                if (matrix[i][j] % 2 == 0) {
	                    System.out.print(matrix[i][j] + " ");
	                }
	                System.out.print("");
	            }
	        }
	    }
	}


