package _training;

public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        // Step 1: Clean the string: remove spaces and make lowercase
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Reverse the string
        String reversed = new StringBuilder(cleaned).reverse().toString();

        // Step 3: Compare the cleaned string with the reversed string
        return cleaned.equals(reversed);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isPalindrome("radar"));         // true
        System.out.println(isPalindrome("Hello"));         // false
        System.out.println(isPalindrome("Madam"));         // true
        System.out.println(isPalindrome("A man a plan a canal Panama")); // true
    }

}
