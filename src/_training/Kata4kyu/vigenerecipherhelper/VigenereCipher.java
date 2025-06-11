package _training.Kata4kyu.vigenerecipherhelper;

public class VigenereCipher {
    private final String key;

    public VigenereCipher(String key) {
        this.key = key.toUpperCase();
    }

    public String encrypt(String text) {
        StringBuilder result = new StringBuilder();
        text = text.toUpperCase();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                char k = key.charAt(i % key.length());
                char e = (char) ((c + k - 2 * 'A') % 26 + 'A');
                result.append(e);
            } else {
                result.append(c); // Keep non-letters unchanged
            }
        }

        return result.toString();
    }

    public String decrypt(String text) {
        StringBuilder result = new StringBuilder();
        text = text.toUpperCase();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                char k = key.charAt(i % key.length());
                char d = (char) ((c - k + 26) % 26 + 'A');
                result.append(d);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
