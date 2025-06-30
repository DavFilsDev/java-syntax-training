package _training.advanced.library_nanagement;

import java.util.UUID;

public class Book {
    private final String id;
    private final String title;
    private final String author;
    private boolean available;

    public Book(String title, String author) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return available; }

    public void markUnavailable() { this.available = false; }
    public void markAvailable() { this.available = true; }

    @Override
    public String toString() {
        return "%s by %s [%s]".formatted(title, author, available ? "Available" : "Unavailable");
    }
}
