package _training.advanced.mini_blog_system;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Post {
    private final String id;
    private final String title;
    private final String content;
    private final String author;
    private final List<Comment> comments = new ArrayList<>();

    public Post(String title, String content, String author) {
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    @Override
    public String toString() {
        return """
                Post: %s
                Author: %s
                Content: %s
                Comments: %d
                """.formatted(title, author, content, comments.size());
    }
}
