import java.util.Comparator;
import java.util.List;

public class SortStudentByMediumScore implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getMediumScore() < o2.getMediumScore()){
            return 1;
        }
        return -1;
    }

}
