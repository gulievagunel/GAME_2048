package Lesson_14;

public class OddPrinter extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <10 ; i+=2) {
            System.out.println("Odd Thread:"+i);
        }
    }
}
