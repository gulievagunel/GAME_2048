package Lesson13;

import java.util.Scanner;

public class PasswordValidationMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String password = sc.nextLine();
        try {
            PasswordValidation.validatePassword(password);
            System.out.println("Password is valid.");
        } catch (InvalidPasswordException e){
            System.out.println("Error:"+ e.getMessage());
        }
    }
}
