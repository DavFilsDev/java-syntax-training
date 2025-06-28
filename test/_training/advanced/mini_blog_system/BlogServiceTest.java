package _training.advanced.mini_blog_system;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BlogServiceTest {

    private BlogService blog;

    @BeforeEach
    void setUp() {
        blog = new BlogService();
    }

    @Test
    void testCreatePost() {
        Post p = blog.createPost("Hello World", "My first blog", "Alice");
        assertEquals("Alice", p.getAuthor());
        assertEquals(0, p.getComments().size());
    }

    @Test
    void testAddComment() {
        Post post = blog.createPost("News", "Important update", "Admin");
        boolean success = blog.addCommentToPost(post.getId(), "Bob", "Thanks for sharing!");
        assertTrue(success);
        assertEquals(1, post.getComments().size());
    }

    @Test
    void testGetPostById() {
        Post p = blog.createPost("Tech", "New Java version", "David");
        assertTrue(blog.getPostById(p.getId()).isPresent());
    }

    @Test
    void testGetAllPosts() {
        blog.createPost("Post 1", "Content", "User1");
        blog.createPost("Post 2", "Content", "User2");
        List<Post> all = blog.getAllPosts();
        assertEquals(2, all.size());
    }

    @Test
    void testAddCommentToUnknownPost() {
        boolean result = blog.addCommentToPost("invalid-id", "Bob", "Fake news");
        assertFalse(result);
    }
}
