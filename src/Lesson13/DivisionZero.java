package Lesson13;

import java.util.Scanner;

public class DivisionZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        try {
            double result = Division.divideNumbers(num1,num2);
            System.out.println("Result"+ result);

        } catch (DivisionByZeroException e){
            System.out.println("Error"+e.getMessage());
        }
    }
}
