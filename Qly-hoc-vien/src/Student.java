import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Student implements Serializable {
    private int id;
    private String name;
    private boolean sex;
    private Date birthday;
    private float studentScore1 = -1;
    private float studentScore2 = -1;
    private float studentScore3;
    private float studentScore4;
    private float[] score = new float[4];

    public boolean checkScore1 = false;
    public boolean checkScore2 = false;
    public boolean checkScore3 = false;
    public boolean checkScore4 = false;

    private ArrayList<StudentScore> studentScoreList = new ArrayList<>();


    public Student() {
    }

    public Student(int id, String name) {
        this.name = name;
        this.id = id;
//        StudentScore score1 = new StudentScore(0, 1);
//        StudentScore score2 = new StudentScore(0, 1);
//        StudentScore score3 = new StudentScore(0, 2);
//        StudentScore score4 = new StudentScore(0, 3);
//        studentScoreList.add(score1);
//        studentScoreList.add(score2);
//        studentScoreList.add(score3);
//        studentScoreList.add(score4);

    }

//    public void getPoint1(){
//        studentScoreList.get(getId());
//    }


    public boolean getStudentScoreList() {
        return false;
    }

    public void setStudentScoreList(ArrayList<StudentScore> studentScoreList) {
        this.studentScoreList = studentScoreList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getStudentScore1() {
        return studentScore1;
    }

    public float setStudentScore1(float studentScore1) {
        this.studentScore1 = studentScore1;
        return 0;
    }

    public double getStudentScore2() {
        return studentScore2;
    }

    public float setStudentScore2(float studentScore2) {
        this.studentScore2 = studentScore2;
        return 0;
    }

    public double getStudentScore3() {
        return studentScore3;
    }

    public float setStudentScore3(float studentScore3) {
        this.studentScore3 = studentScore3;
        return 0;
    }

    public double getStudentScore4() {
        return studentScore4;
    }

    public float setStudentScore4(float studentScore4) {
        this.studentScore4 = studentScore4;
        return 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMediumScore() {
        return (this.studentScore1 + this.studentScore2 + this.studentScore3*2 + this.studentScore4*3) / 7;
    }

}
