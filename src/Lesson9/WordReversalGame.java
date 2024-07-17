package Lesson9;

import java.util.Scanner;

public class WordReversalGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Word Reversal Game!");
        while (true) {
            System.out.println("Enter a sentence (or type 'exit' to quit.):");
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Thank you. Goodbye!");
                break;
            }
            String reversedSentence = ReverseWords.reverseWords(input);
            System.out.println("Reversed sentence:" + reversedSentence);

        }
    }
}
