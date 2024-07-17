package Lesson17;

public class EvenPrinter extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <10000 ; i+= 2) {
            System.out.println(i);

        }
    }
}
