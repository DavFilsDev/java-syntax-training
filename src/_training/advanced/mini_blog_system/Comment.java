package _training.advanced.mini_blog_system;

import java.time.LocalDateTime;
import java.util.UUID;

public class Comment {
    private final String id;
    private final String author;
    private final String message;
    private final LocalDateTime createdAt;

    public Comment(String author, String message) {
        this.id = UUID.randomUUID().toString();
        this.author = author;
        this.message = message;
        this.createdAt = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "[%s] %s: %s".formatted(createdAt, author, message);
    }
}
