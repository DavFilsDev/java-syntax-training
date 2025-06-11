package _training.Kata7yu.heronFormula;

/**
 * This class contains a method to calculate the area of a triangle
 * using Heron's formula, given the lengths of its three sides.
 */
public class Kata {

    /**
     * Calculates the area of a triangle using Heron's formula.
     *
     * @param a side a
     * @param b side b
     * @param c side c
     * @return the area of the triangle
     * @throws IllegalArgumentException if the sides can't form a valid triangle
     */
    public static double heronFormula(double a, double b, double c) {
        if (!isValidTriangle(a, b, c)) {
            throw new IllegalArgumentException("Invalid triangle sides.");
        }

        double s = (a + b + c) / 2.0; // semi-perimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    /**
     * Checks if three sides can form a valid triangle.
     */
    private static boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static void main(String[] args) {
        double a = 3.0, b = 4.0, c = 5.0;
        double area = heronFormula(a, b, c);
        System.out.printf("The area of the triangle with sides %.1f, %.1f, %.1f is: %.2f%n", a, b, c, area);
    }
}
