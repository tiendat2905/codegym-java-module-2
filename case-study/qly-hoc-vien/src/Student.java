import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

public class Student implements Serializable {
    private int id;
    private String name;
    private String sex;
    private Date birthday;
    private float[] score = new float[4];
    public boolean flag1 = false;
    public boolean flag2 = false;
    public boolean flag3 = false;
    public boolean flag4 = false;

    {
        Arrays.fill(score, -1);
    }

    public Student() {
    }

    public Student(int id, String name, String sex, Date birthday) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public String setSex(String sex) {
        this.sex = sex;
        return sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public float[] getScore() {
        return score;
    }

    public void setScore(float score, int index) {
        this.score[index] = score;
    }

    public float getMediumScore(){
        int scoreFactor = 0;
        float total = 0;
        for (int i = 0; i < score.length ; i++) {
            if (score[i] != -1){
                int factor =  (i == 0) ? 1 : i;
                total += score[i] * factor;
                scoreFactor += factor;
            }
        }
        return total/scoreFactor;
    }

}
