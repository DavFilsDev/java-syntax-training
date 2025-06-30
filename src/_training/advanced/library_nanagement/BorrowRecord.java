package _training.advanced.library_nanagement;

import java.time.LocalDate;

public class BorrowRecord {
    private final Book book;
    private final User user;
    private final LocalDate dateBorrowed;
    private LocalDate dateReturned;

    public BorrowRecord(Book book, User user) {
        this.book = book;
        this.user = user;
        this.dateBorrowed = LocalDate.now();
    }

    public Book getBook() { return book; }
    public User getUser() { return user; }
    public LocalDate getDateBorrowed() { return dateBorrowed; }
    public LocalDate getDateReturned() { return dateReturned; }

    public void returnBook() {
        this.dateReturned = LocalDate.now();
    }

    public boolean isReturned() {
        return dateReturned != null;
    }

    @Override
    public String toString() {
        return "%s borrowed by %s on %s %s".formatted(
                book.getTitle(), user.getName(), dateBorrowed,
                isReturned() ? "(returned on %s)".formatted(dateReturned) : "(not returned)"
        );
    }
}
