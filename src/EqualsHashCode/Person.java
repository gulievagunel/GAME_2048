package EqualsHashCode;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Tural",15);
        Person person2 = new Person("Deniz",15);
        System.out.println("HashCode 1:" + person1.hashCode());
        System.out.println("HashCode 2:" + person2.hashCode());
    }
}
