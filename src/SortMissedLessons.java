import java.util.Comparator;

public class SortMissedLessons implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o2.getMissedLessons()-o1.getMissedLessons();
    }
}