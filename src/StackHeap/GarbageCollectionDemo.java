package StackHeap;

public class GarbageCollectionDemo {
    public static void main(String[] args) {
        Object obyekt = new Object();
        obyekt = null;
        runGarbageCollector();
    }
    public static void runGarbageCollector(){
            System.gc();
        System.out.println("Garbage collector has been invoked.");
    }
}
