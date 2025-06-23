package _training.beginner;
import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {

    public static String encode(String word) {
        word = word.toLowerCase(); // Case-insensitive
        Map<Character, Integer> charCount = new HashMap<>();

        // Count occurrences of each character
        for (char c : word.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Build result string
        StringBuilder result = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (charCount.get(c) > 1) {
                result.append(')');
            } else {
                result.append('(');
            }
        }

        return result.toString();
    }

    // Example usage
    public static void main(String[] args) {
        System.out.println(encode("din"));      // (((
        System.out.println(encode("recede"));   // ()()()
        System.out.println(encode("Success"));  // )())())
        System.out.println(encode("(( @"));     // ))((
    }
}

