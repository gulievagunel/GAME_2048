package ZooSimulator;

public class Mammal extends Animal {
    String furColor;

    public Mammal(String name, int age, String sound, String furColor) {
        super(name, age, sound);
        this.furColor = furColor;
    }
    public void giveBrith(){
        System.out.println(name+" "+ "gives birth.");
    }
    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nSound: " + sound + "\nFur Color: " + furColor;
    }
}

