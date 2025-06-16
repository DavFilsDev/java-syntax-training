package _training.Kata3kyu.path_finder;

import java.util.*;

public class SG1 {

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

        for (int i = 0; i < rows; i++) {
            grid[i] = lines[i].toCharArray();
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 'S') {
                    start[0] = i; start[1] = j;
                }
                if (grid[i][j] == 'G') {
                    goal[0] = i; goal[1] = j;
                }
            }
        }

        PriorityQueue<Node> open = new PriorityQueue<>(Comparator.comparingDouble(n -> n.f));
        Map<String, String> cameFrom = new HashMap<>();
        Map<String, Double> gScore = new HashMap<>();

        String startKey = key(start);
        gScore.put(startKey, 0.0);
        open.add(new Node(start[0], start[1], 0.0, heuristic(start, goal)));

        while (!open.isEmpty()) {
            Node current = open.poll();
            String currKey = key(current.x, current.y);

            if (current.x == goal[0] && current.y == goal[1]) break;

            for (int[] d : DIRECTIONS) {
                int nx = current.x + d[0];
                int ny = current.y + d[1];

                if (nx < 0 || ny < 0 || nx >= rows || ny >= cols) continue;
                char c = grid[nx][ny];
                if (c != '.' && c != 'G') continue;

                double tentative_g = gScore.get(currKey) + distance(current.x, current.y, nx, ny);
                String neighborKey = key(nx, ny);
                if (tentative_g < gScore.getOrDefault(neighborKey, Double.POSITIVE_INFINITY)) {
                    gScore.put(neighborKey, tentative_g);
                    cameFrom.put(neighborKey, currKey);
                    double f = tentative_g + heuristic(new int[]{nx, ny}, goal);
                    open.add(new Node(nx, ny, tentative_g, f));
                }
            }
        }

        if (!cameFrom.containsKey(key(goal))) return NO_PATH;

        int[] curr = goal;
        while (true) {
            String currKey = key(curr);
            String prev = cameFrom.get(currKey);
            if (prev == null) break;
            String[] parts = prev.split(",");
            int px = Integer.parseInt(parts[0]);
            int py = Integer.parseInt(parts[1]);
            if (grid[px][py] != 'S') grid[px][py] = 'P';
            curr = new int[]{px, py};
        }

        StringBuilder result = new StringBuilder();
        for (char[] row : grid) {
            result.append(new String(row)).append("\n");
        }

        return result.toString().trim();
    }

    private static String key(int[] pos) {
        return pos[0] + "," + pos[1];
    }

    private static String key(int x, int y) {
        return x + "," + y;
    }

    private static double heuristic(int[] a, int[] b) {
        return distance(a[0], a[1], b[0], b[1]);
    }

    private static double distance(int x1, int y1, int x2, int y2) {
        int dx = Math.abs(x1 - x2);
        int dy = Math.abs(y1 - y2);
        return Math.sqrt(dx * dx + dy * dy);
    }

    static class Node {
        int x, y;
        double g, f;

        Node(int x, int y, double g, double f) {
            this.x = x;
            this.y = y;
            this.g = g;
            this.f = f;
        }
    }
}

