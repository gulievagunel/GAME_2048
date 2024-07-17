package Lesson7;

public class Task1 {
    public static void main(String[] args) {
        String inputString = "";
        int characterCount = inputString.replaceAll("\\s","").length();
        System.out.println("Character count: " + characterCount);

        System.out.println("Uppercase string: " + inputString.toUpperCase());

        System.out.println("Lowercase string: " + inputString.toLowerCase());

        System.out.println("Starts with A:" + inputString.toUpperCase().startsWith("A"));

        System.out.println("Ends with Z:" + inputString.toUpperCase().endsWith("Z"));

        System.out.println("Replace 'e' with 'E': " + inputString.replace('e', 'E'));

    }
}
