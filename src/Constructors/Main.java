package Constructors;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry");
        System.out.println("make" + car.make);
        System.out.println("model" + car.model);
    }
}
