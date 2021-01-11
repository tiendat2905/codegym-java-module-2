import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.HashMap;

public class StudentFile {
    static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public static void saveList() {
        try (FileWriter fileWriter = new FileWriter("st.json")) {
            gson.toJson(StudentManage.list, fileWriter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readList() {
        try (FileReader fileReader = new FileReader("st.json")) {
            Type studentTable = new TypeToken<HashMap<Integer, Student>>() {}.getType();
            StudentManage.list = gson.fromJson(fileReader, studentTable);
            if (StudentManage.list  == null) {
                StudentManage.list  = new HashMap<Integer, Student>();
            }else {
                int maxId = 0;
                for (Student st : StudentManage.list.values()){
                    if(st.getId() > maxId){
                        maxId = st.getId();
                    }
                }
                AddStudent.currentId = maxId;
            }
        } catch (IOException e) {
            StudentManage.list  = new HashMap<Integer, Student>();
        }
    }
}

