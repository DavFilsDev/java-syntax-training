package _training.stream.hei_PROG2;
import java.util.*;
import java.util.stream.Collectors;

public class Exercice {
    public static List<String> toUpperCase(List<String> words) {
        return words
                .stream()
                .map(word -> word.toUpperCase())
                .collect(Collectors.toList());
    }

    public static long countWordStartingWithA (List<String> words) {
        return words
                .stream()
                .filter(word -> word.startsWith("A"))
                .count();
    }
    public static List<String> sortByLenght(List<String> words) {
        return words.stream()
                .sorted(Comparator.comparingInt(s -> s.length()))
                .collect(Collectors.toList());

    }

    int sumOfSquares(List<Integer> numbers) {
        return numbers.stream().mapToInt(n -> n * n).sum();
    }

    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        return numbers.stream()
                .distinct() // supprime les doublons en gardant l'ordre d'apparition
                .collect(Collectors.toList()); // convertit en liste
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

    public static void main(String[] args) {
        List<String> listTest = Arrays.asList("Hello", "World", "Hello", "A", "Anacondra");
        System.out.println(toUpperCase(listTest));
        System.out.println(countWordStartingWithA(listTest));

    }
}
