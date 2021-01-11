import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Nam", 20, "HN");
        Student student4 = new Student("Nam", 20, "HN");
        Student student2 = new Student("Hung", 19, "HCM");
        Student student3 = new Student("Thang", 23, "H");

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(8569,student1);
        studentMap.put(65363,student2);
        studentMap.put(9559,student3);
        studentMap.put(9752,student1);

        for (Integer id : studentMap.keySet()){
            System.out.println(id + "=" + studentMap.get(id));
        }
        System.out.println(".........Set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        for (Student student : students){
            System.out.println(student.toString());
        }
    }
}
