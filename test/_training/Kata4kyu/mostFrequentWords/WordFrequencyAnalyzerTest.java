package _training.Kata4kyu.mostFrequentWords;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class WordFrequencyAnalyzerTest {

    @Test
    public void testSimpleFrequency() {
        String text = "Hello hello world. The world is beautiful. Hello again.";
        List<String> stopwords = List.of("the", "is");

        List<String> result = WordFrequencyAnalyzer.mostFrequentWords(text, stopwords);

        assertEquals("hello", result.get(0));
        assertEquals("world", result.get(1));
        assertTrue(result.contains("again"));
        assertTrue(result.contains("beautiful"));
    }

    @Test
    public void testEmptyText() {
        String text = "";
        List<String> stopwords = List.of("the", "is");

        List<String> result = WordFrequencyAnalyzer.mostFrequentWords(text, stopwords);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testOnlyStopwords() {
        String text = "The is the is IS the THE";
        List<String> stopwords = List.of("the", "is");

        List<String> result = WordFrequencyAnalyzer.mostFrequentWords(text, stopwords);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testTieBreakAlphabeticalOrder() {
        String text = "cat dog dog cat apple";
        List<String> stopwords = List.of();

        List<String> result = WordFrequencyAnalyzer.mostFrequentWords(text, stopwords);

        // "cat" and "dog" have same frequency (2), so alphabetical order matters
        assertEquals(List.of("cat", "dog", "apple"), result.subList(0, 3));
    }
}
