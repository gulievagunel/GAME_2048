package Lesson10;

public class Director extends Manager{
   private int stockOptions;

    public Director(String name, double salary, int teamSize, int stockOptions) {
        super(name, salary, teamSize);
        this.stockOptions = stockOptions;
    }

    @Override
    public double calculateBonus() {
        bonus =stockOptions*0.2;
        return bonus;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Stock options:"+stockOptions);
    }
}
