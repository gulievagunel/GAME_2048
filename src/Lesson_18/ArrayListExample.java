package Lesson_18;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list.size());

        for (int i = list.size()-1; i >= 0 ; i--) {
            System.out.println(list.get(i) + " ");

            if (list.contains(30)){
                System.out.println("Element found");
            }else {
                System.out.println("Element not found");
            }
            list.remove(Integer.valueOf(40));
            list.add(0 ,60);
            list.set(2,35);
            ArrayList<Integer> newList = new ArrayList<>();
            newList.add(70);
            newList.add(80);
            newList.add(90);

            list.addAll(newList);

            Collections.sort(list);
            System.out.println(list);
        }
    }
}
