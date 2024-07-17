package Lesson_18;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("9780451524935", "The Catcher in the Rye", "J.D. Salinger");
        Book book2 = new Book("9780062315007", "The Fault in Our Stars", "John Green");
        Book book3 = new Book("9780141439556", "1984", "George Orwell");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

    }
}
