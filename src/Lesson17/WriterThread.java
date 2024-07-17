package Lesson17;
public  class WriterThread {
    public static void main(String[] args) {
        Object lock = new Object();
        String[] wordsThread1 = {"Getdim", "bir", "2", "kor", "yırtıq", "var"};
        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                for (String word : wordsThread1) {
                    try {
                        System.out.println(word);
                        lock.notify();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        String[] wordsThread2 = {"gördüm", "dərədə", "kar", "kürkü", "kirpi"};
        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                for (String word : wordsThread2) {
                    try {
                        System.out.println(word);
                        lock.notify();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });

        thread1.start();
        thread2.start();
    }
}