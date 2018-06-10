package Model;

/**
 * Created by drorsim on 14.4.2018.
 */
public class Grade {
    private int grade;
    private Student student;
    private Test test;

    public Grade(int grade, Student student, Test test) {

        this.grade = grade;
        this.student = student;
        this.test = test;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }


}
