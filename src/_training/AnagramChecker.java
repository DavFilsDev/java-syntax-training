package _training;

import java.util.Arrays;

/**
 * A utility class to check if two strings are anagrams.
 */
public class AnagramChecker {

    /**
     * Checks whether two strings are anagrams of each other.
     *
     * @param first  the first string
     * @param second the second string
     * @return true if the strings are anagrams, false otherwise
     */
    public static boolean isAnagram(String first, String second) {
        if (first == null || second == null) return false;

        char[] a = first.replaceAll("\\s+", "").toLowerCase().toCharArray();
        char[] b = second.replaceAll("\\s+", "").toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        // Sample tests
        System.out.println(isAnagram("listen", "silent"));   // true
        System.out.println(isAnagram("triangle", "integral")); // true
        System.out.println(isAnagram("apple", "pale"));       // false
    }
}

