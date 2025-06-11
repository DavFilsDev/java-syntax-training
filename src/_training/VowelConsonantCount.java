package _training;

/**
 * Counts vowels and consonants in a given string.
 */
public class VowelConsonantCount {

    public static int[] count(String str) {
        int vowels = 0, consonants = 0;
        String lower = str.toLowerCase();
        for (char c : lower.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        String test = "Hello World!";
        int[] counts = count(test);
        System.out.println("Vowels: " + counts[0] + ", Consonants: " + counts[1]);
    }
}
