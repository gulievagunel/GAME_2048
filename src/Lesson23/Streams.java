package Lesson23;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        //a.
        List<String> strings = Arrays.asList("book","pen","cup","notebook");
        List<String > filtered = strings
                .stream()
                .filter(s -> s.length()>=5)
                .collect(Collectors.toList());
        System.out.println(filtered);
        //b.
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        nums.stream().skip(2).forEach(num-> System.out.println(num));
    }
}
