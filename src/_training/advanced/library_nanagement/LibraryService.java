package _training.advanced.library_nanagement;

import java.util.*;

public class LibraryService {
    private final List<Book> books = new ArrayList<>();
    private final List<User> users = new ArrayList<>();
    private final List<BorrowRecord> borrowRecords = new ArrayList<>();

    public Book addBook(String title, String author) {
        Book book = new Book(title, author);
        books.add(book);
        return book;
    }

    public User registerUser(String name) {
        User user = new User(name);
        users.add(user);
        return user;
    }

    public boolean borrowBook(String bookId, String userId) {
        Optional<Book> bookOpt = books.stream()
                .filter(book -> book.getId().equals(bookId) && book.isAvailable())
                .findFirst();
        Optional<User> userOpt = users.stream()
                .filter(user -> user.getId().equals(userId))
                .findFirst();

        if (bookOpt.isPresent() && userOpt.isPresent()) {
            Book book = bookOpt.get();
            User user = userOpt.get();
            book.markUnavailable();
            borrowRecords.add(new BorrowRecord(book, user));
            return true;
        }
        return false;
    }

    public boolean returnBook(String bookId, String userId) {
        for (BorrowRecord record : borrowRecords) {
            if (record.getBook().getId().equals(bookId)
                    && record.getUser().getId().equals(userId)
                    && !record.isReturned()) {
                record.returnBook();
                record.getBook().markAvailable();
                return true;
            }
        }
        return false;
    }

    public List<BorrowRecord> getHistoryForBook(String bookId) {
        return borrowRecords.stream()
                .filter(record -> record.getBook().getId().equals(bookId))
                .toList();
    }
}
