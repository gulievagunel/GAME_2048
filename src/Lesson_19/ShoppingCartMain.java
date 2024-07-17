package Lesson_19;

import java.util.Scanner;

public class ShoppingCartMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppinCart cart = new ShoppinCart();
        System.out.println("Enter the number of items:");
        int numItems =  sc.nextInt();
        sc.nextLine();
        for (int i = 0; i <numItems ; i++) {
            System.out.println("Enter item name:");
            String itemName = sc.nextLine();
            System.out.println("Enter item price:");
            double itemPrice = sc.nextDouble();
            sc.nextLine();
            cart.addItem(itemName, itemPrice);
        }
        double totalPrice = cart.calculateTotalPrice();
        System.out.println("Total price of items in the shopping cart:" + totalPrice);
    }
}
