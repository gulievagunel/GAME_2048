package Lesson_23;

import java.util.*;

public class UniqueNumbers {
    public static ArrayList<Integer> generateRandomNums(int count, int min, int max){
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i <count ; i++) {
            int randomNums = (int)(Math.random()*(max - min +1)+ min);
            nums.add(randomNums);
        }
        return nums;

    }
    public static Set<Integer> getUniqueNums(ArrayList<Integer> nums){
        Set<Integer> uniquenums = new HashSet<>(nums);
        return uniquenums;
    }
}
