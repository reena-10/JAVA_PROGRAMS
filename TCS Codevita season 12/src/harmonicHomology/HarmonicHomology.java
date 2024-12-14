package harmonicHomology;

import java.util.*;

public class HarmonicHomology {
    static Map<String, String> tuneToLevel = new HashMap<>();
    static Map<String, Integer> tuneLevels = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of parent nodes
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        
        // Read the hierarchy
        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" : ");
            String parentTune = parts[0].trim();
            String[] childTunes = parts[1].trim().split(" ");
            
            // Set the level for the parent tune
            tuneToLevel.put(parentTune, "0"); // Root level is 0
            
            // Set the level for each child tune
            for (String child : childTunes) {
                tuneToLevel.put(child, parentTune);
            }
        }
        
        // Determine levels based on hierarchy
        for (String tune : tuneToLevel.keySet()) {
            int level = 0;
            String current = tune;
            while (tuneToLevel.containsKey(current)) {
                current = tuneToLevel.get(current);
                level++;
            }
            tuneLevels.put(tune, level);
        }
        
        // Read melodies
        String melody1 = scanner.nextLine();
        String melody2 = scanner.nextLine();
        
        // Read A, B, C
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        
        // Split melodies into arrays
        String[] tunes1 = melody1.split("-");
        String[] tunes2 = melody2.split("-");
        
        int m1 = tunes1.length;
        int m2 = tunes2.length;
        
        // DP array
        int[][] dp = new int[m1 + 1][m2 + 1];
        
        // Fill the DP table
        for (int i = 0; i <= m1; i++) {
            for (int j = 0; j <= m2; j++) {
                if (i > 0 && j > 0) {
                    String tune1 = tunes1[i - 1];
                    String tune2 = tunes2[j - 1];
                    
                    // Compare tunes
                    if (tune1.equals(tune2) || tuneLevels.get(tune1).equals(tuneLevels.get(tune2))) {
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + A);
                    } else {
                        dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] - B);
                    }
                }
                
                // Remove from melody1
                if (i > 0) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j] - C);
                }
                
                // Remove from melody2
                if (j > 0) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][j - 1] - C);
                }
            }
        }
        
        // The result is the maximum score possible
        System.out.println(dp[m1][m2]);
    }
}