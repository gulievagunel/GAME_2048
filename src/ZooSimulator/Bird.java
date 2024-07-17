package ZooSimulator;

public class Bird extends Animal {
    double wingSpan;

    public Bird(String name, int age, String sound, double wingSpan) {
        super(name, age, sound);
        this.wingSpan = wingSpan;
    }
    public void fly(){
        System.out.println(name +" "+ "flies with a wingspan of" + wingSpan +"m.");
    }
    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nSound: " + sound +"\nWingSpan:" + wingSpan;
    }
}
