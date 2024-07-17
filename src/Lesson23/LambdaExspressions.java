package Lesson23;

import java.util.Arrays;
import java.util.function.Predicate;

public class LambdaExspressions {
    public static void main(String[] args) {
        //a
        Predicate<Integer> positive = num -> num>0;
        System.out.println(positive.test(10));
        System.out.println(positive.test(-10));

        //b.
        double[] nums = {2.2, 2.3, 2.4, 2.5, 2.6};
        Arrays.stream(nums)
                .map(a->a*a)
                .forEach(a-> System.out.println(a));

    }
}
