package Lesson9;

import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = sc.nextLine();
        System.out.println("Enter the number of times to concatenate: ");
        int count = sc.nextInt();
        String result = "";
        for (int i = 0; i < count; i++) {

            result = result.concat(word);
        }
        System.out.println("The concatenated string is: " + result);
    }
}
