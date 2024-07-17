package Lesson9;

class ReverseWords {
    public static String reverseWords(String input) {
        char[] words = input.toCharArray();
        String reversed = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i];
        }
        return reversed;
    }
}