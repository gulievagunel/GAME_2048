package Lesson_19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sentance:");
        String sentence = sc.nextLine();
        String[] words = sentence.split("\\s+");
        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            if (wordFrequency.containsKey(word)) {
                int count = wordFrequency.get(word);
                wordFrequency.put(word, count + 1);
            } else {
                wordFrequency.put(word, 1);
            }
        }
        System.out.println("Word frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

