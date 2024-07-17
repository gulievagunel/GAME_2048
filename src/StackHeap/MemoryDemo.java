package StackHeap;

public class MemoryDemo {
    public static void main(String[] args) {
        StackVsHeap();
    }
    public static void StackVsHeap(){
        int num1 = 10;
        double num2 = 3.2;
        char stackChar = 'A';

        String heapString = new String();
        int[] heapArray = new int[5];

        System.out.println("Primitive data stored in stack memory: ");
        System.out.println("Int value:"+ num1);
        System.out.println("Double value:" + num2);
        System.out.println("Char value:" + stackChar);

        System.out.println("Data stored in heap memory: ");
        System.out.println("String value: " + heapString);
        System.out.println("Array value: " + heapArray.length);

    }
}
