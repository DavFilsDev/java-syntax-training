package _training.beginner;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Filters names starting with a specific letter and sorts them alphabetically.
 */
public class FilterSortNames {

    /**
     * Filters a list of names to only those starting with a given letter,
     * then sorts them alphabetically.
     *
     * @param names the list of names
     * @param letter the starting letter to filter by (case-insensitive)
     * @return a sorted list of filtered names
     */
    public static List<String> filterAndSort(List<String> names, char letter) {
        return names.stream()
                .filter(name -> name.toLowerCase().startsWith(Character.toString(letter).toLowerCase()))
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie", "alex");
        System.out.println(filterAndSort(names, 'a')); // Output: [Alex, Alice, Anna]
    }
}
