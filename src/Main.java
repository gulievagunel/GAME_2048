public class Main {
    public static void main(String[] args) {
Author author1 = new Author("J.K.Rowling",1965);
Book book1 = new Book("Harry Potter and the Philosopher's Stone", author1, 1967 );

Author author2 = new Author("George Orwell ", 1903);
Book book2 = new Book("1984",author1,1949);
        System.out.println(author1);
        System.out.println(book1);
        System.out.println(author2);
        System.out.println(book2);

    }
}