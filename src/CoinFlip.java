import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;
        int gamesPlayed = 0;
        int correctguesses = 0;
        while (playAgain) {
            gamesPlayed++;
            System.out.println("Guess Heads or Tails: ");
            String user = sc.nextLine();
            int random = (int) (Math.random() * 2);
            String result = (random == 0) ? "Heads" : "Tails";
            System.out.println("Coin flip result: " + result);
            if (user.equalsIgnoreCase(result)) {
                correctguesses++;
                System.out.println("Congratulatins!");
            } else {
                System.out.println("Sorry, your guess was incorrent.");
            }
            System.out.println("Do you want to play again? ");
            String playagainRes = sc.nextLine();
            if (!playagainRes.equalsIgnoreCase("yes")){
                playAgain = false;
                System.out.println("Good Luck");
            }
        }
        System.out.println("Total games played:" + gamesPlayed);
        System.out.println("Correct guesses: " + correctguesses);
    }
}
