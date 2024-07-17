package Override;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of circle:"+circle.calculateArea());
        Rectangle rectangle = new Rectangle(3,5);
        System.out.println("Area of rectangle:"+rectangle.calculateArea());
    }
}
