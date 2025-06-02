package arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // Declare and initialize a 2D array (matrix)
        int[][] matrix = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        // Print the elements
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("matrix[" + i + "][" + j + "] = " + matrix[i][j]);
            }
        }
    }
}
