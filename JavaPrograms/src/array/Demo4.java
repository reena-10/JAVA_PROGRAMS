package array;

public class Demo4 {
	public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length+1; j++) {
            	System.out.println(matrix[i][j]+1);
            }
            }    
}
}