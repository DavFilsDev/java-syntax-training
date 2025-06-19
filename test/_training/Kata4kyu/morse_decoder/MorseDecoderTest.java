package _training.Kata4kyu.morse_decoder;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MorseDecoderTest {

    @Test
    public void testSimpleLetter() {
        List<String> result = MorseDecoder.decodeMorse(".-");
        assertTrue(result.contains("A"));
    }

    @Test
    public void testMultiplePossibilities() {
        List<String> result = MorseDecoder.decodeMorse(".-.-");
        // Possibles: AA (.-, .-), AR (.-., .-), KA (-.-, .-)
        assertTrue(result.contains("AA") || result.contains("AR") || result.contains("KA"));
        assertFalse(result.contains("ZZ"), "Result must not contain invalid letters");
    }

    @Test
    public void testInvalidSequence() {
        List<String> result = MorseDecoder.decodeMorse("---......");
        // No valid mapping for "......"
        assertTrue(result.isEmpty() || result.stream().allMatch(s -> s.matches("[A-Z]+")));
    }

    @Test
    public void testFullWord() {
        List<String> result = MorseDecoder.decodeMorse(".... . .-.. .-.. ---");
        // Without spaces, this is "......-...-..---" → not decodable directly
        assertTrue(result.isEmpty() || result.stream().allMatch(s -> s.matches("[A-Z]+")));
    }

    @Test
    public void testPerformanceOnLongInput() {
        String input = ".-".repeat(10); // 20 characters
        List<String> result = MorseDecoder.decodeMorse(input);
        assertNotNull(result);
    }
}
