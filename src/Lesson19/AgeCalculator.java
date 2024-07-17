package Lesson19;

import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        String ageInput = scanner.nextLine();

        try {
            int age = Integer.parseInt(ageInput);

            if (age < 18) {
                int yearsUntil18 = 18 - age;
                System.out.println("You will turn 18 in " + yearsUntil18 + " years.");
            } else {
                System.out.println("You are already 18 or older.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid age as a number.");
        }

    }
}
