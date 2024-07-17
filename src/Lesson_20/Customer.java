package Lesson_20;

import java.util.Comparator;

public class Customer {
    String name;
    String surname;
    int age;
    public Customer(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', surname='" + surname + "', age=" + age + '}';
    }
}
class CustomerComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return Integer.compare(o1.age, o2.age);

    }
}
