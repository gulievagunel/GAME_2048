package Lesson22;

import java.util.ArrayList;
import java.util.Collections;

public class BookMain {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("hjk","tyuj",5));
        books.add(new Book("fghj","uioo",7));
        books.add(new Book("tyui","yuio",4));

        Collections.sort(books);
        for (Book book :books){
            System.out.println(book);
        }
    }
}
