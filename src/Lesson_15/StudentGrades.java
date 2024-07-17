package Lesson_15;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Students:");
        int studentNum = sc.nextInt();
        int[] grades = new int[studentNum];
        for (int i = 0; i < studentNum; i++) {
            System.out.println("Student" + (i + 1));
            try {
                int grade = sc.nextInt();
                if (grade < 0 || grade > 100) {
                    throw new InvalidGradeException("0  ile 100 arasinda olmalidir.");
                }
            } catch (InvalidGradeException | NumberFormatException e) {

                System.out.println("Error" + e.getMessage());

            }
            int total = 0;
            for (int grade : grades) {
                total += grade;
            }
            double average =  total / studentNum;
            int max = grades[0];
            int min = grades[0];
            for (i = 1; i < studentNum; i++) {
                if (grades[i] > max) {
                    max = grades[i];

                }
                if (min > grades[i]) {
                    min = grades[i];
                }
            }
            System.out.println(average);
            System.out.println(max);
            System.out.println(min);
        }
    }
}