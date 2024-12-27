package Strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MarksComparator implements SortingStrategy{

    @Override
    public List<Student> sort(List<Student> studentList) {
        Collections.sort(studentList, Comparator.comparingInt(Student::getMarks).reversed());
        return studentList;
    }
}
