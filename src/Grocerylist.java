import java.util.Scanner;

public class Grocerylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Grocery List program!" + "\uD83D\uDE0A");
        System.out.println("Enter list name: ");
        String listname = sc.nextLine();
        System.out.println("How many items do you want to add?");
        int mehsulsayi = sc.nextInt();
        String[] Grocerylist = new String[mehsulsayi];

        for (int i = 0; i < mehsulsayi; i++) {
            System.out.println("Enter shopping item: ");
            Grocerylist[i] = sc.next();

        }
        System.out.println("Shoppin List" + "\uD83D\uDED2 :");
        for (int i = 0; i < mehsulsayi; i++) {
            System.out.println(Grocerylist[i]);
        }
        System.out.println("You have created your list" + listname);
    }
}