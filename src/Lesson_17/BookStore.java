package Lesson_17;
public class BookStore {
    private static final int MAX_BOOKS = 100;
    private Book[] books;
    private int count;

    public BookStore() {
        this.books = new Book[MAX_BOOKS];
        this.count = 0;
    }

    public void addBook(Book book) {
        if (count < MAX_BOOKS) {
            books[count] = book;
            count++;
        } else {
            System.out.println("The bookstore is full.");
        }
    }

    public void listBooks() {
        if (count == 0) {
            System.out.println("No books in the bookstore.");
        } else {
            System.out.println("Listing all books:");
            for (int i = 0; i < count; i++) {
                System.out.println(books[i]);
            }
        }
    }

    public void searchBooksCategory(BookCatagory category) {
        boolean found = false;
        System.out.println("Books in category: " + category.getDescription());
        for (int i = 0; i < count; i++) {
            if (books[i].getCategory() == category) {
                System.out.println(books[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found in this category.");
        }
    }
}
