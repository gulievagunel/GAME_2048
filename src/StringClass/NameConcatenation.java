package StringClass;

import java.util.Scanner;

public class NameConcatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First name:");
        String firstname = sc.nextLine();

        System.out.println("Last name:");
        String lastname = sc.nextLine();
        
        String Fullname = firstname.concat(" ").concat(lastname);
        System.out.println(Fullname);
    }

}
