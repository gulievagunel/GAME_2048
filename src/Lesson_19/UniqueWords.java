package Lesson_19;

import java.util.HashSet;
import java.util.Set;

public class UniqueWords {
    public static void main(String[] args) {
        String paragraph = "The quick brown fox jumped over the lazy dog, " +
                "but the lazy dog didn't notice because the lazy dog was too busy sleeping.";

        String cleanText = paragraph.toLowerCase();

        cleanText = cleanText.replaceAll("[^a-z\\s]", "");

        String[] words = cleanText.split("\\s+");

        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                uniqueWords.add(word);
            }
        }
            System.out.println("Unique words:");
            for (String word : uniqueWords) {
                System.out.println(word);
            }
        }
    }
