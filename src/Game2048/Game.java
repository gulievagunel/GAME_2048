package Game2048;

public class Game {
    private static int SIZE = 4;
    private static int[][] board = new int[SIZE][SIZE];

    static void startGame() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = 0;
            }
        }
        addRandom();
        addRandom();
    }
    static void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void addRandom() {
        while (true) {
            int row = (int) (Math.random() * SIZE);
            int col = (int) (Math.random() * SIZE);
            if (board[row][col] == 0) {
                board[row][col] = 2;
                break;
            }
        }
    }

    static void slideRight() {
        for (int i = 0; i < SIZE; i++) {
            int emptyPosition = SIZE - 1;
            for (int j = SIZE - 1; j >= 0; j--) {
                if (board[i][j] != 0) {
                    int value = board[i][j];
                    board[i][j] = 0;
                    board[i][emptyPosition] = value;
                    emptyPosition--;
                }
            }
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = SIZE - 2; j >= 0; j--) {
                if (board[i][j] == board[i][j + 1]) {
                    board[i][j + 1] *= 2;
                    board[i][j] = 0;
                }
            }
        }
    }
}
