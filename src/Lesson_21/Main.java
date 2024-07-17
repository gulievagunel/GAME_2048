package Lesson_21;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 999.99, "Electronics"),
                new Product("Smartphone", 799.99, "Electronics"),
                new Product("Desk Chair", 149.99, "Furniture")
        );
        List<Product> filter = products.stream()
                .filter(product -> product.getCategory().equals("Electronics"))
                .sorted(Comparator.comparing(p1-> p1.getPrice()))
                .toList();
        System.out.println("Sample Product List:");
        filter.forEach(product ->
                System.out.println("- Name: \"" + product.getName() + "\", Price: " + product.getPrice() + ", Category: \"" + product.getCategory() + "\""));

    }
}
