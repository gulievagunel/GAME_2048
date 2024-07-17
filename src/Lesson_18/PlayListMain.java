package Lesson_18;

import java.util.Scanner;

public class PlayListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PlayList playlist = new PlayList();
        while (true){
            System.out.println("Choose an option:");
            System.out.println("1. Add a song to the playlist");
            System.out.println("2. Remove a song from the playlist");
            System.out.println("3. Display the current playlist");
            System.out.println("4. Exit");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the song name to add.");
                    String add = sc.nextLine();
                    playlist.addSong(add);
                    break;
                case 2:
                    System.out.println("Enter the song name to remove.");
                    String remove = sc.nextLine();
                    playlist.addSong(remove);
                    break;
                case 3:
                    playlist.display();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                default:
                    System.out.println("Invalid choice. ");
            }
        }
    }
}
