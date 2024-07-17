package Lesson_14;

public class OddEvenThreads2 {
    public static void main(String[] args) {
        Thread oddThread2 = new Thread(new OddPrinter() );
        Thread evenThread2 = new Thread(new EvenPrinter() );
        evenThread2.start();
        try {
            evenThread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        oddThread2.start();
    }
}
