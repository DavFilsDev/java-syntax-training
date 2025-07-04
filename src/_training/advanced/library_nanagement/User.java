package _training.advanced.library_nanagement;

import java.util.UUID;

public class User {
    private final String id;
    private final String name;

    public User(String name) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "User: " + name;
    }
}
