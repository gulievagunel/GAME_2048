package Lesson_23;

import java.util.ArrayList;
import java.util.Set;

import static Lesson_23.UniqueNumbers.generateRandomNums;
import static Lesson_23.UniqueNumbers.getUniqueNums;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = generateRandomNums(50, 3, 10);

        System.out.println("Random Numbers:");
        System.out.println(numbers);

        Set<Integer> uniqueNums = getUniqueNums(numbers);

        System.out.println("Unique Numbers:");
        System.out.println(uniqueNums);
    }
}
