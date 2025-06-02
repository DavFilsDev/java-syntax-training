package arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 90};

        int sum = 0;
        int max = scores[0];
        int min = scores[0];

        for (int score : scores) {
            sum += score;
            if (score > max) max = score;
            if (score < min) min = score;
        }

        System.out.println("Total: " + sum);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
