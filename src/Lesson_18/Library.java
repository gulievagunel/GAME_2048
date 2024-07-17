package Lesson_18;

import java.util.Set;
import java.util.HashSet;
public class Library {
    private Set<Book> books;

    public Library() {
        books = new HashSet<>();
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(Book book) {
        books.remove(book);
    }
    public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }
    public Set<Book> findBooksByAuthor(String author) {
        Set<Book> result = new HashSet<>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }
        return result;
    }
    public Set<Book> getAllBooks() {
        return books;
    }
}