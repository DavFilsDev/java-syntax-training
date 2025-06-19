package _training.Kata4kyu.mostFrequentWords;

import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyAnalyzer {

    public static List<String> mostFrequentWords(String text, List<String> stopwords) {
        Set<String> stop = new HashSet<>();
        for (String s : stopwords) {
            stop.add(s.toLowerCase());
        }

        Map<String, Integer> freq = new HashMap<>();

        String[] words = text.toLowerCase().replaceAll("[^a-z\\s]", "").split("\\s+");

        for (String word : words) {
            if (!word.isEmpty() && !stop.contains(word)) {
                freq.put(word, freq.getOrDefault(word, 0) + 1);
            }
        }

        return freq.entrySet().stream()
                .sorted(Comparator.<Map.Entry<String, Integer>>comparingInt(Map.Entry::getValue).reversed()
                        .thenComparing(Map.Entry::getKey))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
