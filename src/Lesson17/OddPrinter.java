package Lesson17;

public class OddPrinter extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <10000 ; i+= 2) {
            System.out.println(i);

        }
    }
}
