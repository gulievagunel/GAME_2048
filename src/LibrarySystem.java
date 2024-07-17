import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many books would you like to add?");
        int bookCount = sc.nextInt();
        sc.nextLine();
        String[][] library = new String[bookCount][2];
        for (int i = 0; i < library.length; i++) {
            System.out.println("Enter the title of the book:");
            String title = sc.nextLine();
            System.out.println("Enter the author's name:");
            String author = sc.nextLine();
            library[i][0] = title;
            library[i][1] = author;
        }
        System.out.println("Books in the library: ");
        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i][0] + " " + library[i][1]);
        }
    }
}