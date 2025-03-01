package Override;

public class Rectangle extends Shape {
   private double length;
   private double width;
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        double shapeArea = super.calculateArea();
        double rectangleArea = length * width;
        return shapeArea + rectangleArea;
    }
}
