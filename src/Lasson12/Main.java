package Lasson12;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        int sum1 = calculator.add(5,3);
        double sum2 = calculator.add(2.3,4.5);
        double sum3 = calculator.add(2,3,4);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        double result = scientificCalculator.power(2, 3);
        System.out.println(result);


    }
}
