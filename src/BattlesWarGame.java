import java.util.Scanner;

public class BattlesWarGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the Battleship War Game!");
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[10][10];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '*';
            }
        }
        board[0][0] = 'G';
        board[5][3] = 'G';
        board[3][6] = 'G';
        board[7][4] = 'G';
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < board.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        boolean gameOver = false;
        while (!gameOver) {
            System.out.println("Take your shot: ");
            int setir = sc.nextInt();
            int sutun = sc.nextInt();
            if (board[setir][sutun] == 'G') {
                System.out.println("HIT!");
                board[setir][sutun] = 'X';
            } else {
                System.out.println("Miss!");
                board[setir][sutun] = 'O';
            }
            gameOver = true;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == 'G') {
                        gameOver = false;
                        break;
                    }
                }
            }
        }
        System.out.println("Congratulations!");
    }
}