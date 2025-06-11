package _training.Kata4kyu.vigenerecipherhelper;

public class Main {
    public static void main(String[] args) {
        VigenereCipher cipher = new VigenereCipher("LEMON");

        String plainText = "ATTACKATDAWN";
        String encrypted = cipher.encrypt(plainText);
        String decrypted = cipher.decrypt(encrypted);

        System.out.println("Plaintext : " + plainText);
        System.out.println("Encrypted : " + encrypted);
        System.out.println("Decrypted : " + decrypted);
    }
}
