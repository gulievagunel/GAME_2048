package Lesson_17;
public class Book {
    private String title;
    private String author;
    private BookCatagory category;
    private double price;

    public Book(String title, String author, BookCatagory category, double price) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
    }
    public BookCatagory getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Title: " + title +
                ", Author: " + author +
                ", Category: " + category.getDescription() +
                ", Price: " + price + " AZN";
    }
}