package scoreOfCells;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreOfCells {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read dimensions of the table
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        // Read the table values
        int[][] table = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                table[i][j] = scanner.nextInt();
            }
        }
        
        // Read the target score
        int k = scanner.nextInt();
        
        // Find and print cells with the specified score
        findCellsWithScore(n, m, table, k);
    }

    private static void findCellsWithScore(int n, int m, int[][] table, int k) {
        // Create a DP table to store the scores
        int[][] score = new int[n][m];

        // Fill the DP table
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // If we're at the top-left corner, there's one way to reach it
                if (i == 0 && j == 0) {
                    score[i][j] = 1;
                    continue;
                }

                // Check from where we can come to (i, j)
                if (i > 0 && table[i][j] >= table[i - 1][j]) {
                    score[i][j] += score[i - 1][j];
                }
                if (j > 0 && table[i][j] >= table[i][j - 1]) {
                    score[i][j] += score[i][j - 1];
                }
            }
        }

        // Collect the results
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (score[i][j] == k) {
                    result.add(new int[]{i, j});
                }
            }
        }

        // Print results
        if (!result.isEmpty()) {
            for (int[] cell : result) {
                System.out.println(cell[0] + " " + cell[1]);
            }
        } else {
            System.out.println("NO");
        }
    }
}