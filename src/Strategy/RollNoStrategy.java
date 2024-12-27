package Strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RollNoStrategy implements SortingStrategy{

    @Override
    public List<Student> sort(List<Student> studentList) {
        Collections.sort(studentList, Comparator.comparingInt(Student::getRollNo));
        return studentList;
    }
}
