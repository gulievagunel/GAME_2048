package Lesson10;

public class Manager extends Employee{
   private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateBonus() {
        bonus = teamSize *0.1;
        return bonus;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Team size:" +teamSize);
    }
}
