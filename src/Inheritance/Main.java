package Inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 4);
        System.out.println("Make:" + car.make);
        System.out.println("Model:" + car.model);
        System.out.println("Number of doors:" + car.numDoors);
        Bike bike = new Bike("Honda","CBR1000RR" , 2 );
        System.out.println("Make" + bike.make);
        System.out.println("Model" + bike.make);
        System.out.println("Number of wheels" + bike.numWheels);
    }
}
