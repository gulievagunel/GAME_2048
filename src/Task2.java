import java.util.Scanner;

public  class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int colums = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int [][] arr = new int[rows][colums];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter element at position :  ("+ i + ", " + j + " )" );
                arr [i][j] = sc.nextInt();

            }

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        int maxElement = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (maxElement < arr[i][j]) {
                    maxElement = arr[i][j];
                }
            }
        }
        System.out.println("The biggest element: " + maxElement );
    }
}