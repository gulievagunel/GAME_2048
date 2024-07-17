package ShapeCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShapeGame calculator = new ShapeGame();
        int score = 0;

        System.out.println("Welcome to Shape Challenge!");
        while (true) {
            System.out.println("Please select the shape you want to calculate: ");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.println("3. Triangle");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            double area;

            switch (choice) {
                case 1:
                    System.out.println("Enter the length and width of the rectangle:");
                    int length = (int) sc.nextDouble();
                    int width = (int) sc.nextDouble();
                    area = calculator.calculateArea(length, width);
                    score += 3;
                    break;
                case 2:
                    System.out.println("Enter the radius of the circle:");
                    double radius = sc.nextDouble();
                    area = calculator.calculateArea(radius);
                    score += 5;
                    break;
                case 3:
                    System.out.println("Enter the base and height of the triangle:");
                    int base = (int) sc.nextDouble();
                    double height = sc.nextDouble();
                    area = calculator.calculateArea(base, height);
                    score += 10;
                    break;
                case 4:
                    System.out.println(" Goodbye!");
                    System.out.println("Total Score: " + score);
                    return;
                default:
                    System.out.println("Invalid choice. Please choose again.");
                    continue;
            }

            System.out.println("Area: " + area);
            System.out.println("Score: " + score);
        }
    }
}
