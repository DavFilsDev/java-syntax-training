package loops;

public class BreakContinueDemo {
    public static void main(String[] args) {
        // Use of break and continue inside a loop
        for (int i = 1; i <= 10; i++) {
            if (i == 3) continue; // skip number 3
            if (i == 7) break;    // stop the loop at 7
            System.out.println("i = " + i);
        }
    }
}
