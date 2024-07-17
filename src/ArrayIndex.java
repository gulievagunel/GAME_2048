import java.util.Arrays;
import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in the array: ");
        int lenght = sc.nextInt();
        int[] array = new int[lenght];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < lenght; i++) {
           array[i] = sc.nextInt();
        }
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();
        int index = Arrays.binarySearch(array,target);
        if (index>=0) {
            System.out.println("Target value found at index: " + index);
        } else {
            System.out.println("Target value not found in the array.");
        }

    }
}
