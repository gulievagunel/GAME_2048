package Lesson_17;

public class BookStoreMain {
    public static void main(String[] args) {
        BookStore bookstore = new BookStore();
        bookstore.addBook(new Book("1984", "George Orwell", BookCatagory.FICTION, 19.00));
        bookstore.addBook(new Book("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", BookCatagory.HISTORY, 24.00));
        bookstore.addBook(new Book("The Hobbit", "J.R.R. Tolkien", BookCatagory.FANTASY, 14.00));
        bookstore.addBook(new Book("Introduction to Psychology", "James W. Kalat", BookCatagory.PSYCHOLOGY, 15.00));

        bookstore.listBooks();
        bookstore.searchBooksCategory(BookCatagory.FICTION);
        bookstore.searchBooksCategory(BookCatagory.PSYCHOLOGY);
        bookstore.searchBooksCategory(BookCatagory.FANTASY);
    }
}


