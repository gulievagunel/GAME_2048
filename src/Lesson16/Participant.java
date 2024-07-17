package Lesson16;

public class Participant {
    private String name;
    private int age;
    private String email;

    public Participant(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;

    }
    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
