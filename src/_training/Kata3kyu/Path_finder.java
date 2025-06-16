package _training.Kata3kyu;
import java.util.*;

public class Path_finder {

    private static final String NO_PATH = "Oh for crying out loud...";
    private static final int[][] DIRECTIONS = {
            {-1, 0}, {1, 0}, {0, -1}, {0, 1},
            {-1, -1}, {-1, 1}, {1, -1}, {1, 1}
    };

    public static String wireDHD(String existingWires) {
        String[] lines = existingWires.split("\n");
        int rows = lines.length;
        int cols = lines[0].length();

        char[][] grid = new char[rows][cols];
        int[] start = new int[2];
        int[] goal = new int[2];

        // Parse input and locate S and G
        for (int i = 0; i < rows; i++) {
            grid[i] = lines[i].toCharArray();
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 'S') {
                    start[0] = i;
                    start[1] = j;
                }
                if (grid[i][j] == 'G') {
                    goal[0] = i;
                    goal[1] = j;
                }
            }
        }

        // BFS with parent tracking
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[rows][cols];
        Map<String, String> parent = new HashMap<>();

        queue.add(start);
        visited[start[0]][start[1]] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            if (current[0] == goal[0] && current[1] == goal[1]) break;

            for (int[] d : DIRECTIONS) {
                int ni = current[0] + d[0];
                int nj = current[1] + d[1];

                if (ni >= 0 && ni < rows && nj >= 0 && nj < cols && !visited[ni][nj]) {
                    char c = grid[ni][nj];
                    if (c == '.' || c == 'G') {
                        visited[ni][nj] = true;
                        queue.add(new int[]{ni, nj});
                        parent.put(ni + "," + nj, current[0] + "," + current[1]);
                    }
                }
            }
        }

        // No path found
        if (!parent.containsKey(goal[0] + "," + goal[1])) return NO_PATH;

        // Reconstruct path
        int[] curr = goal;
        while (true) {
            String key = curr[0] + "," + curr[1];
            String p = parent.get(key);
            if (p == null) break;
            String[] ps = p.split(",");
            int pi = Integer.parseInt(ps[0]);
            int pj = Integer.parseInt(ps[1]);
            if (grid[pi][pj] != 'S') {
                grid[pi][pj] = 'P';
            }
            curr = new int[]{pi, pj};
        }

        // Build result string
        StringBuilder result = new StringBuilder();
        for (char[] row : grid) {
            result.append(new String(row)).append("\n");
        }

        return result.toString().trim();
    }
}

