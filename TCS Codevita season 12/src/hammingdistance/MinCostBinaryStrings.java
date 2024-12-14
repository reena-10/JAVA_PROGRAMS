package hammingdistance;

import java.util.Scanner;

public class MinCostBinaryStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of test cases
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume the newline
        
        for (int i = 0; i < T; i++) {
            String binaryString = scanner.nextLine();
            String[] costs = scanner.nextLine().split(" ");
            int A = Integer.parseInt(costs[0]);
            int B = Integer.parseInt(costs[1]);
            
            // Validate binary string
            if (!isValidBinaryString(binaryString)) {
                System.out.println("INVALID");
                continue;
            }
            
            // Count 0s and 1s
            int count0 = 0;
            int count1 = 0;
            for (char c : binaryString.toCharArray()) {
                if (c == '0') {
                    count0++;
                } else {
                    count1++;
                }
            }
            
            // Calculate costs
            int cost1 = A * count0; // Cost if arranged as "111...000"
            int cost2 = B * count1; // Cost if arranged as "000...111"
            
            // Determine minimum cost and Hamming distance
            int minCost = Math.min(cost1, cost2);
            int hammingDistance;
            if (minCost == cost1) {
                hammingDistance = count1; // All '1's will differ
            } else {
                hammingDistance = count0; // All '0's will differ
            }
            
            // Output the Hamming distance
            System.out.println(hammingDistance);
        }
        
        scanner.close();
    }

    // Method to validate if the string is a binary string
    private static boolean isValidBinaryString(String str) {
        for (char c : str.toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }
}