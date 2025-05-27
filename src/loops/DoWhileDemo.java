package loops;

public class DoWhileDemo {
    public static void main(String[] args) {
        int i = 1;

        // This loop runs at least once before checking the condition
        do {
            System.out.println("do-while: " + i);
            i++;
        } while (i <= 5);
    }
}
