package ShapeCalculator;

public class ShapeGame {
    public double calculateArea(int length, int width) {

        return length * width;
    }
    public double calculateArea(double radius) {

        return Math.PI * radius * radius;
    }
    public double calculateArea(int base, double height) {
        return 0.5 * base * height;
    }
}
