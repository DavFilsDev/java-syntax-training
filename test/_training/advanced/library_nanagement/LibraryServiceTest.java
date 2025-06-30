package _training.advanced.library_nanagement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryServiceTest {

    private LibraryService library;
    private Book book;
    private User user;

    @BeforeEach
    void setUp() {
        library = new LibraryService();
        book = library.addBook("The Hobbit", "J.R.R. Tolkien");
        user = library.registerUser("Bilbo Baggins");
    }

    @Test
    void testAddBookAndUser() {
        assertNotNull(book.getId());
        assertEquals("The Hobbit", book.getTitle());

        assertNotNull(user.getId());
        assertEquals("Bilbo Baggins", user.getName());
    }

    @Test
    void testBorrowBookSuccess() {
        boolean borrowed = library.borrowBook(book.getId(), user.getId());
        assertTrue(borrowed);
        assertFalse(book.isAvailable());
    }

    @Test
    void testBorrowUnavailableBookFails() {
        library.borrowBook(book.getId(), user.getId());
        User otherUser = library.registerUser("Frodo");
        boolean borrowed = library.borrowBook(book.getId(), otherUser.getId());
        assertFalse(borrowed);
    }

    @Test
    void testReturnBookSuccess() {
        library.borrowBook(book.getId(), user.getId());
        boolean returned = library.returnBook(book.getId(), user.getId());
        assertTrue(returned);
        assertTrue(book.isAvailable());
    }

    @Test
    void testReturnBookNotBorrowedFails() {
        boolean returned = library.returnBook(book.getId(), user.getId());
        assertFalse(returned);
    }

    @Test
    void testBorrowHistoryTracking() {
        library.borrowBook(book.getId(), user.getId());
        library.returnBook(book.getId(), user.getId());

        List<BorrowRecord> history = library.getHistoryForBook(book.getId());
        assertEquals(1, history.size());

        BorrowRecord record = history.get(0);
        assertEquals(user.getId(), record.getUser().getId());
        assertTrue(record.isReturned());
    }
}
