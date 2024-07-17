package Game2048;

import java.util.Scanner;

import static Game2048.Game.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        startGame();
        while (true){
            System.out.println("2048 Game Board: ");
            printBoard();
            System.out.println("");
            String move = sc.nextLine();
            switch (move){
                case "q":
                    slideRight();
                    addRandom();
                    break;
                case "exit":
                    System.out.println("Game terminated.");
                    return;
                default:
                    System.out.println("Invalid move. Pls try again.");
            }
        }
    }
}
