import java.util.Comparator;

public class SortOfFinancedJobcenter implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.isJobcenter() != o2.isJobcenter()){
            return o2.getMissedLessons()-o1.getMissedLessons();
        }
        if (o1.isJobcenter() == o2.isJobcenter()){
            return o1.getMissedLessons()-o2.getMissedLessons();
        }
        return 0;
    }
}