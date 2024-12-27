package Strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 85));
        students.add(new Student(2, "Arjun", 78));
        students.add(new Student(3, "Bob", 90));
        students.add(new Student(4, "Anita", 88));
        students.add(new Student(5, "Charlie", 65));
        students.add(new Student(6, "Aarav", 92));

        System.out.println(Student.sort(students, new MarksComparator()));
        System.out.println(Student.sort(students, new RollNoStrategy()));

    }
}
