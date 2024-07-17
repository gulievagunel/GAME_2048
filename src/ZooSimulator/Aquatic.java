package ZooSimulator;

public class Aquatic extends Animal {
    int swimmingDepth;

    public Aquatic(String name, int age, String sound, int swimmingDepth) {
        super(name, age, sound);
        this.swimmingDepth = swimmingDepth;
    }
    public void swim(){
        System.out.println("");
    }
    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nSound: " + sound + "\nSwimmingDepth:" + swimmingDepth;
    }

    public static class Lesson10 {
    }
}
