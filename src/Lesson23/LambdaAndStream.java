package Lesson23;

import java.util.Arrays;
import java.util.List;

public class LambdaAndStream {
    public static void main(String[] args) {
        //a.
        List<String> words = Arrays.asList("Strawberry","banana","orange","apple");
        double averageLength = words
                .stream()
                .mapToInt(a->a.length())
                .average().orElse(0);
        System.out.println(averageLength);
        //b.
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        int result = nums.stream()
                .reduce(1,(a,b)-> a*b);
        System.out.println(result);
    }
}
