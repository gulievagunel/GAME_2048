package Lesson13;

public class Division {
    static double divideNumbers(int num1, int num2) throws DivisionByZeroException{
        if (num2 == 0) {
            throw new DivisionByZeroException("Division by zero is not allowed.");

        }
        return num1/num2;
    }
}
