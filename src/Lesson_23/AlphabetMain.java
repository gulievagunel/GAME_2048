package Lesson_23;

import java.util.LinkedList;

import static Lesson_23.Alphabet.*;

public class AlphabetMain {
    public static void main(String[] args) {
        LinkedList<Character> lowercaseLetters = generateLowercases();
        LinkedList<Character> uppercaseLetters = generateUppercases();

        LinkedList<String> mergedLetters = mergeLists(lowercaseLetters, uppercaseLetters);

        System.out.println("Merged List of English Letters:");
        for (String letter : mergedLetters) {
            System.out.print(letter + ", ");
        }
    }
