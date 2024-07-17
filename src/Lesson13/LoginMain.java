package Lesson13;

import java.util.Scanner;

public class LoginMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = sc.nextLine();
        System.out.println("Enter your password:");
        String password = sc.nextLine();
        try {
            authenticateUser.login(username,password);
            System.out.println("Login successful.");
        } catch (AuthenticationException e){
            System.out.println("Error"+e.getMessage());
        }

    }
}
