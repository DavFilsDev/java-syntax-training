package basics;

public class TypeCastingDemo {
    public static void main(String[] args) {
        // Implicit casting: smaller type to larger type
        int myInt = 9;
        double myDouble = myInt;  // int automatically cast to double

        // Explicit casting: larger type to smaller type
        double anotherDouble = 9.78;
        int anotherInt = (int) anotherDouble;  // manually cast double to int

        // Show the results
        System.out.println("Implicit casting: int to double: " + myDouble);
        System.out.println("Explicit casting: double to int: " + anotherInt);
    }
}
