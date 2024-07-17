package Lesson_23;

import java.util.LinkedList;
public class Alphabet {
public static LinkedList<Character> generateLowercases() {
    LinkedList<Character> listLower = new LinkedList<>();
    for (char i = 'a'; i <= 'z'; i++) {
        listLower.add(i);
    }
    return listLower;
}
public static LinkedList<Character> generateUppercases() {
    LinkedList<Character> listUpper = new LinkedList<>();
    for (char i = 'A'; i <= 'Z'; i++) {
        listUpper.add(i);
    }
    return listUpper;
}

public static LinkedList<String> mergeLists(LinkedList<Character> listLower, LinkedList<Character> listUpper) {
    LinkedList<String> mergedList = new LinkedList<>();
    for (int i = 0; i < listLower.size(); i++) {
        char lowercase = listLower.get(i);
        char uppercase = listUpper.get(i);
        mergedList.add(String.valueOf(lowercase) + uppercase);
    }
    return mergedList;
}
}

