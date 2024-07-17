package Lesson10;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Fateh", 1500);
        Manager manager = new Manager("Deniz", 2000, 5);
        Director director = new Director("Turan", 4000, 10, 100);
        System.out.println("Employee bonus:" +employee.calculateBonus());
        employee.displayInfo();
        System.out.println("Manager bonus:"+manager.calculateBonus());
        manager.displayInfo();
        System.out.println("Director bonus:"+director.calculateBonus());
        director.displayInfo();
    }
}

