package Lesson19;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\bS\\w+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(sentence);

        System.out.println("Words starting with 'S':");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

