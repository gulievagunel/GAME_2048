package Lesson19;
import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();

        Integer number = Integer.valueOf(userInput);

        int doubleNumber = number * 2;

        System.out.println("The double of the entered number is:" + doubleNumber);

    }
}

