package Lesson20;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTask {
   public static void main(String[] args) {
        Queue<String> taskQueue = new LinkedList<>();
        taskQueue.add("Task1:");
        taskQueue.add("Task2:");
        taskQueue.add("Task3:");
        System.out.println("Tapsiriqlar:");
        while (taskQueue.isEmpty()){
            String task = taskQueue.poll();
            System.out.println(task);
        }
    }
}
