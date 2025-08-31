import java.util.*;

class SofaProblem {
    private static final int [][] MOVES = {{0,1},{1,0},{0,-1},{-1,0}};
    private static final int [][] ROTATE_MOVES ={{0,0},{0,1},{1,0},{1,1}};

    static class State {
        int x1 , y1 ,x2,y2;
        int steps;
         
        State(int x1 , int y1 , int x2 ,int y2 ,int steps){
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.steps = steps;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        scanner.nextLine();

        char[][] grid = new char[M][N];
        int startX1 = -1, startY1 = -1, startX2 = -1, startY2 = -1;
        int endX1 = -1, endY1 = -1, endX2 = -1, endY2 = -1;

        for (int i = 0; i < M; i++) {
            String line = scanner.nextLine();
            grid[i] = line.replaceAll(" ", "").toCharArray();
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 's') {
                    if (startX1 == -1) {
                        startX1 = i;
                        startY1 = j;
                    } else {
                        startX2 = i;
                        startY2 = j;
                    }
                } else if (grid[i][j] == 'S') {
                    if (endX1 == -1) {
                        endX1 = i;
                        endY1 = j;
                    } else {
                        endX2 = i;
                        endY2 = j;
                    }
                }
            }
        }

        int result = bfs(grid, M, N, startX1, startY1, startX2, startY2, endX1, endY1, endX2, endY2);
        System.out.print(result == Integer.MAX_VALUE ? "Impossible" : result);
        scanner.close();
    }

    private static int bfs(char[][] grid, int M, int N, int startX1, int startY1, int startX2, int startY2,
                           int endX1, int endY1, int endX2, int endY2) {
        Queue<State> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        State initialState = new State(startX1, startY1, startX2, startY2, 0);
        queue.add(initialState);
        visited.add(createKey(startX1, startY1, startX2, startY2));

        while (!queue.isEmpty()) {
            State current = queue.poll();

            if (current.x1 == endX1 && current.y1 == endY1 && current.x2 == endX2 && current.y2 == endY2) {
                return current.steps;
            }

            for (int[] move : MOVES) {
                int nx1 = current.x1 + move[0];
                int ny1 = current.y1 + move[1];
                int nx2 = current.x2 + move[0];
                int ny2 = current.y2 + move[1];
                if (isValidMove(grid, M, N, nx1, ny1, nx2, ny2)) {
                    String key = createKey(nx1, ny1, nx2, ny2);
                    if (!visited.contains(key)) {
                        queue.add(new State(nx1, ny1, nx2, ny2, current.steps + 1));
                        visited.add(key);
                    }
                }
            }

            for (int[] move : ROTATE_MOVES) {
                int rotationX1 = current.x1 + move[0];
                int rotationY1 = current.y1 + move[1];
                int rotationX2 = current.x1 + move[0] + 1;
                int rotationY2 = current.y1 + move[1] + 1;

                if (isValidRotation(grid, M, N, rotationX1, rotationY1, rotationX2, rotationY2)) {
                    int newX1, newY1, newX2, newY2;

                    if (move[0] == 0) {
                        newX1 = current.x1;
                        newY1 = current.y1;
                        newX2 = newX1 + 1;
                        newY2 = newY1;
                    } else {
                        newX1 = current.x2;
                        newY1 = current.y2;
                        newX2 = newX1;
                        newY2 = newY1 + 1;
                    }

                    String key = createKey(newX1, newY1, newX2, newY2);
                    if (!visited.contains(key)) {
                        queue.add(new State(newX1, newY1, newX2, newY2, current.steps + 1));
                        visited.add(key);
                    }
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    private static boolean isValidMove(char[][] grid, int M, int N, int x1, int y1, int x2, int y2) {
        return (x1 >= 0 && x1 < M && y1 >= 0 && y1 < N && grid[x1][y1] != 'H') &&
               (x2 >= 0 && x2 < M && y2 >= 0 && y2 < N && grid[x2][y2] != 'H');
    }

    private static boolean isValidRotation(char[][] grid, int M, int N, int x1, int y1, int x2, int y2) {
        return (x1 >= 0 && x1 < M && y1 >= 0 && y1 < N && grid[x1][y1] != 'H') &&
               (x1 >= 0 && x1 < M && y2 >= 0 && y2 < N && grid[x1][y2] != 'H') &&
               (x2 >= 0 && x2 < M && y1 >= 0 && y1 < N && grid[x2][y1] != 'H') &&
               (x2 >= 0 && x2 < M && y2 >= 0 && y2 < N && grid[x2][y2] != 'H');
    }

    private static String createKey(int x1, int y1, int x2, int y2) {
        return x1 + ":" + y1 + "-" + x2 + ":" + y2;
    }
}
