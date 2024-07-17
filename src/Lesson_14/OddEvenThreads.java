package Lesson_14;

public class OddEvenThreads {
    public static void main(String[] args) {
        Thread oddThread = new OddThread();
        Thread evenThread = new EvenThread();
        oddThread.start();
        evenThread.start();
    }
}