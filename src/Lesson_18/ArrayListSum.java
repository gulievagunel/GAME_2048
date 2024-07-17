package Lesson_18;

import java.util.ArrayList;

public class ArrayListSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        double avarge = (double)( sum / list.size());
        System.out.println(sum);
        System.out.println(avarge);
    }
}
