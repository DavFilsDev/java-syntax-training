package _training.advanced.mini_blog_system;

import java.util.*;

public class BlogService {

    private final Map<String, Post> posts = new HashMap<>();

    public Post createPost(String title, String content, String author) {
        Post post = new Post(title, content, author);
        posts.put(post.getId(), post);
        return post;
    }

    public boolean addCommentToPost(String postId, String author, String message) {
        Post post = posts.get(postId);
        if (post == null) return false;
        post.addComment(new Comment(author, message));
        return true;
    }

    public Optional<Post> getPostById(String postId) {
        return Optional.ofNullable(posts.get(postId));
    }

    public List<Post> getAllPosts() {
        return new ArrayList<>(posts.values());
    }
}
