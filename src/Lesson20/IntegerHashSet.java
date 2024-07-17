package Lesson20;

import java.util.HashSet;

public class IntegerHashSet {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>();
        nums.add(5);
        nums.add(10);
        nums.add(12);
        nums.add(10);
        System.out.println("Elements: ");
        for (Integer num : nums){
            System.out.println(num);
        }
    }
}
