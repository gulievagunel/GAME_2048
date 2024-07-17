package Lesson_14;

public class EvenPrinter extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <10 ; i+=2) {
            System.out.println("Even Thread:"+i);

        }
    }
}
