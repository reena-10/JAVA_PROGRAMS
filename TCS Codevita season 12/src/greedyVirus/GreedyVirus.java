import java.awt.Taskbar.State;
import java.util.*;

public class GreedyVirus {
    private static final int[][] DIRECTIONS = {
        {-1, -1}, {-1, 0}, {-1, 1},
        {0, -1},          {0, 1},
        {1, -1}, {1, 0}, {1, 1}
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read dimensions of the matrix
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        // Read the data units in the containers
        int[][] data = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                data[i][j] = scanner.nextInt();
            }
        }

        // Read the current location of the virus (1-based index)
        int startX = scanner.nextInt() - 1;
        int startY = scanner.nextInt() - 1;

        // Read the location of the dummy container (1-based index)
        int targetX = scanner.nextInt() - 1;
        int targetY = scanner.nextInt() - 1;

        // Calculate the minimum data needed to entice the virus
        int result = calculateMinimumFudgedData(data, M, N, startX, startY, targetX, targetY);
        System.out.println(result);
    }

    private static int calculateMinimumFudgedData(int[][] data, int M, int N, int startX, int startY, int targetX, int targetY) {
        PriorityQueue<State> pq = new PriorityQueue<>(Comparator.comparingInt(s -> s.fudgedData));
        Set<String> visited = new HashSet<>();
        pq.offer(new State(startX, startY, 0));
        
        while (!pq.isEmpty()) {
            State current = pq.poll();
            int x = current.x;
            int y = current.y;
            int fudgedData = current.fudgedData;

            // If we reached the target location
            if (x == targetX && y == targetY) {
                return fudgedData;
            }

            // Mark this position as visited
            visited.add(x + "," + y);

            // Get neighbors and determine the maximum data in the neighborhood
            for (int[] dir : DIRECTIONS) {
                int newX = x + dir[0];
                int newY = y + dir[1];

                if (newX >= 0 && newX < M && newY >= 0 && newY < N) {
                    if (visited.contains(newX + "," + newY)) continue;

                    int currentData = data[newX][newY];
                    int maxNeighborData = 0;

                    // Check all neighbors of (newX, newY)
                    for (int[] neighborDir : DIRECTIONS) {
                        int neighborX = newX + neighborDir[0];
                        int neighborY = newY + neighborDir[1];

                        if (neighborX >= 0 && neighborX < M && neighborY >= 0 && neighborY < N) {
                            maxNeighborData = Math.max(maxNeighborData, data[neighborX][neighborY]);
                        }
                    }

                    // If current data is less than or equal to max neighbor data, we need to fudge data
                    if (currentData <= maxNeighborData) {
                        int neededData = maxNeighborData - currentData + 1; // Make it greater than max neighbor
                        pq.offer(new State(newX, newY, fudgedData + neededData));
                    }