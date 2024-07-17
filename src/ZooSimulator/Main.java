package ZooSimulator;

public class Main {
    public static void main(String[] args) {
        Mammal leopard = new Mammal("Leopard", 12, "Roar", "Orange");
        System.out.println(leopard);
        Bird eagle = new Bird("Eagle", 25, "Screech", 2.5);
        System.out.println(eagle);
        Aquatic shark = new Aquatic("Shark", 50, "growl", 1100);
        System.out.println(shark);
        leopard.giveBrith();
        eagle.fly();
        shark.swim();

    }
}
