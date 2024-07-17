public class Task1 {
    public static void main(String[] args) {
        char[][] matrix = {
                {'A','B','C'},
                {'D','E','F'},
                {'G','H','I'}
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Diaqonal character: 1");
        for (int i = 0; i <matrix.length; i++) {
            System.out.println(matrix[i][i]);
        }
            System.out.println("");
            for (int i = 0; i < matrix.length; i++) {
                System.out.println(matrix[i][matrix.length-1-i]);

            }
        }

        }
