package Lesson19;

public class Main {
    public static void main(String[] args) {
        Month currentMonth = Month.JUNE;

        if (currentMonth == Month.JUNE || currentMonth == Month.JULY || currentMonth == Month.AUGUST) {
            System.out.println("The current month is a summer month!");
        }
    }
}
