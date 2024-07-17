package Lesson10;

public class Employee {
     String name;
     double salary;
     double bonus;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.bonus = 0.0;
    }
    public double calculateBonus(){
        bonus = salary*0.05;
        return bonus;

    }
    public void displayInfo(){
        System.out.println("Name:"+ name);
        System.out.println("Salary:"+ salary);
        System.out.println("Bonus"+bonus);
    }
}
