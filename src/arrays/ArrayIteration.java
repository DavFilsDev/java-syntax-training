package arrays;

public class ArrayIteration {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Mango"};

        // Iterate using for loop
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("Index " + i + ": " + fruits[i]);
        }

        // Iterate using enhanced for loop
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
