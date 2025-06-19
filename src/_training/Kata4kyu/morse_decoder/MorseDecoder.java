package _training.Kata4kyu.morse_decoder;

import java.util.*;

public class MorseDecoder {

    private static final Map<String, String> morseMap = Map.ofEntries(
            Map.entry(".-", "A"), Map.entry("-...", "B"), Map.entry("-.-.", "C"),
            Map.entry("-..", "D"), Map.entry(".", "E"), Map.entry("..-.", "F"),
            Map.entry("--.", "G"), Map.entry("....", "H"), Map.entry("..", "I"),
            Map.entry(".---", "J"), Map.entry("-.-", "K"), Map.entry(".-..", "L"),
            Map.entry("--", "M"), Map.entry("-.", "N"), Map.entry("---", "O"),
            Map.entry(".--.", "P"), Map.entry("--.-", "Q"), Map.entry(".-.", "R"),
            Map.entry("...", "S"), Map.entry("-", "T"), Map.entry("..-", "U"),
            Map.entry("...-", "V"), Map.entry(".--", "W"), Map.entry("-..-", "X"),
            Map.entry("-.--", "Y"), Map.entry("--..", "Z")
    );

    public static List<String> decodeMorse(String code) {
        Set<String> result = new HashSet<>();
        backtrack(code, "", result, new HashMap<>());
        return new ArrayList<>(result);
    }

    private static void backtrack(String code, String path, Set<String> result, Map<String, Set<String>> memo) {
        if (code.isEmpty()) {
            result.add(path);
            return;
        }

        if (memo.containsKey(code)) {
            for (String tail : memo.get(code)) {
                result.add(path + tail);
            }
            return;
        }

        Set<String> localResults = new HashSet<>();

        for (int i = 1; i <= code.length(); i++) {
            String prefix = code.substring(0, i);
            if (morseMap.containsKey(prefix)) {
                String letter = morseMap.get(prefix);
                backtrack(code.substring(i), path + letter, result, memo);
                localResults.add(letter);
            }
        }

        memo.put(code, localResults);
    }
}

