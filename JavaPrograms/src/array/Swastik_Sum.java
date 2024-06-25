package array;

public class Swastik_Sum {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
        };

        // Initialize sums
        int sum1 = 0;
        int sum2 = 0;

        // Calculate sum1 for elements {1, 6, 7, 8, 9, 10, 15}
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1 || mat[i][j] == 6 || mat[i][j] == 7 ||
                    mat[i][j] == 8 || mat[i][j] == 9 || mat[i][j] == 10 ||
                    mat[i][j] == 15) {
                    sum1 += mat[i][j];
                }
            }
        }

        // Calculate sum2 for elements {11, 12, 13, 8, 3, 4, 5}
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 11 || mat[i][j] == 12 || mat[i][j] == 13 ||
                    mat[i][j] == 8 || mat[i][j] == 3 || mat[i][j] == 4 ||
                    mat[i][j] == 5) {
                    sum2 += mat[i][j];
                }
            }
        }

        System.out.println("Sum1: " + sum1);
        System.out.println("Sum2: " + sum2);
    }
}
