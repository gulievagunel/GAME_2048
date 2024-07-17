package Lesson17;

public class EvenOddThread {
    public static void main(String[] args) {
        Thread evenTh = new Thread(new EvenPrinter());
        Thread oddTh = new Thread(new OddPrinter());
        evenTh.start();
        oddTh.start();
    }
}
