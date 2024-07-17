package Lesson8;

import java.util.Scanner;

public class CasinoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SlotMachine slotMachine = new SlotMachine();
        int credits = 100;
        int gameCost = 10;
        int score = 0;
        System.out.println("Press Enter to pull the lever. Type exit to quit. ");
        while (credits>=gameCost){
            String input = sc.nextLine();
            if ("exit".equals(input)) {
                System.out.println("Exiting the game");
                break;
            }
                slotMachine.pullLever();
                credits-= gameCost;
                score+= 10;
             if (credits<=0){
                 System.out.println("Your credits ran out. Exiting the game.");
                 break;
            }
            System.out.println("Remaining credits: " + credits);
            System.out.println("Total score: " +score);
            System.out.println("Press Enter to play again. type exit to quit.");
        }
    }
}
