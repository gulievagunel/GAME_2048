package Lesson_20;
public class Actor {
    private String name;
    private int age;
    private int actingSkill;

    public Actor(String name, int age, int actingSkill) {
        this.name = name;
        this.age = age;
        this.actingSkill = actingSkill;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getActingSkill() {
        return actingSkill;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", actingSkill=" + actingSkill +
                '}';
    }
}