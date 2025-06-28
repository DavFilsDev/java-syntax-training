package _training.stream.hei_PROG2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercice {

    public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }

    public static List<String> toUpperCase(List<String> words) {
        return words
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static long countWordStartingWithA(List<String> words) {
        return words
                .stream()
                .filter(word -> word.startsWith("A"))
                .count();
    }

    public static List<String> sortByLength(List<String> words) {
        return words.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }

    public static int sumOfSquares(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(n -> n * n)
                .sum();
    }

    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static Optional<String> findLongestString(List<String> strings) {
        return strings.stream()
                .max(Comparator.comparingInt(String::length));
    }

    public static Map<Character, List<String>> groupByFirstLetter(List<String> words) {
        return words.stream()
                .filter(word -> !word.isEmpty())
                .collect(Collectors.groupingBy(word -> word.charAt(0)));
    }

    // ✅ New methods added:

    // Check if all strings are uppercase
    public static boolean allUppercase(List<String> words) {
        return words.stream().allMatch(word -> word.equals(word.toUpperCase()));
    }

    // Check if any word contains a digit
    public static boolean anyContainsDigit(List<String> words) {
        return words.stream().anyMatch(word -> word.matches(".*\\d.*"));
    }

    // Check if no word is blank
    public static boolean noneBlank(List<String> words) {
        return words.stream().noneMatch(String::isBlank);
    }

    // Flatten a list of lists into a single list
    public static List<String> flatten(List<List<String>> nested) {
        return nested.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    // Reduce to concatenate all words with a space
    public static String joinWithSpace(List<String> words) {
        return words.stream()
                .reduce("", (a, b) -> a + " " + b).trim();
    }

    // Peek example: print each word as it passes
    public static List<String> debugUpperCase(List<String> words) {
        return words.stream()
                .peek(word -> System.out.println("Original: " + word))
                .map(String::toUpperCase)
                .peek(word -> System.out.println("Uppercase: " + word))
                .collect(Collectors.toList());
    }

    // Limit the number of elements
    public static List<String> limitFirstN(List<String> words, int n) {
        return words.stream()
                .limit(n)
                .collect(Collectors.toList());
    }

    // Skip the first N elements
    public static List<String> skipFirstN(List<String> words, int n) {
        return words.stream()
                .skip(n)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> listTest = Arrays.asList("Hello", "World", "Hello", "A", "Anaconda", "Java123", " ");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        System.out.println(toUpperCase(listTest));
        System.out.println(countWordStartingWithA(listTest));
        System.out.println(filterEvenNumbers(numbers));
        System.out.println(allUppercase(toUpperCase(listTest)));
        System.out.println(anyContainsDigit(listTest));
        System.out.println(noneBlank(listTest));
        System.out.println(flatten(List.of(List.of("A", "B"), List.of("C", "D"))));
        System.out.println(joinWithSpace(List.of("Hello", "world", "again")));
        System.out.println(debugUpperCase(List.of("debug", "me")));
        System.out.println(limitFirstN(listTest, 3));
        System.out.println(skipFirstN(listTest, 2));
    }
}
