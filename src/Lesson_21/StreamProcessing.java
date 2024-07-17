//package Lesson_21;
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class StreamProcessing {
//    public static void main(String[] args) {
//        List<String> input = Arrays.asList("hello", "world", "abcdefghij", "1234567890", "short");
//        List<String> res = input.stream()
//                .filter(a -> a.length() >= 10)
//                .sorted(Comparator.comparing(item -> item.wait()))
//                .collect(Collectors.toList());
//        res.forEach(a-> System.out.println(a));
//    }
//}
