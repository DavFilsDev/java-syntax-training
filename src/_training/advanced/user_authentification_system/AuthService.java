package _training.advanced.user_authentification_system;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class AuthService {

    private final Set<User> users = new HashSet<>();

    public void register(String username, String password, Role role) {
        if (findUser(username).isPresent()) {
            throw new IllegalArgumentException("User already exists");
        }
        String hashed = hashPassword(password);
        users.add(new User(username, hashed, role));
    }

    public boolean authenticate(String username, String password) {
        Optional<User> userOpt = findUser(username);
        return userOpt.map(user -> user.getHashedPassword().equals(hashPassword(password))).orElse(false);
    }

    public boolean hasRole(String username, Role role) {
        return findUser(username).map(user -> user.getRole() == role).orElse(false);
    }

    private Optional<User> findUser(String username) {
        return users.stream().filter(u -> u.getUsername().equals(username)).findFirst();
    }

    private String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = digest.digest(password.getBytes(StandardCharsets.UTF_8));
            StringBuilder hex = new StringBuilder();
            for (byte b : hashBytes) {
                hex.append(String.format("%02x", b));
            }
            return hex.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Hashing algorithm not found", e);
        }
    }
}
