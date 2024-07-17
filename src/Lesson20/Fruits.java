package Lesson20;

import java.util.ArrayList;

public class Fruits {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("strawberry");
        for (String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
