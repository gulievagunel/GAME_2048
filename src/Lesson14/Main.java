package Lesson14;

public class Main {
    public static void main(String[] args) {
        MathOperation math = new MathOperation();

        System.out.println(math.add(5,6));
        System.out.println(math.add(2.2,4.2));
        System.out.println(math.subtract(7,3));
        System.out.println(math.subtract(4.2,2.2));
        System.out.println(math.multiply(4,2));
        System.out.println(math.multiply(9,3));
        System.out.println(math.divide(10,2));
    }
}
