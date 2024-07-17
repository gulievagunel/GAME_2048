package Lesson22;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("yuio",12,9));
        students.add(new Student("hjkl",13,5));
        Collections.sort(students, new GradeComperator());
        for (Student student :students){
            System.out.println(student);
        }
    }
}
