package Model;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Dictionary;

/**
 * Created by drorsim on 14.4.2018.
 */
public class Test {
    private String testId;
    private TestDate testDate;
    private Dictionary<Question,Integer> gradeLegend;
    private Time time;
    private Lecturer lecturercreate;
    private ArrayList<Student> students;
    private ArrayList<Lecturer> writers;
    private CourseInSemester courseInSemester;

    public Test(TestDate testDate, Dictionary<Question, Integer> gradeLegend, Time time, Lecturer lecturercreate, ArrayList<Student> students, ArrayList<Lecturer> writers, CourseInSemester courseInSemester,String testId) {
        this.testId=testId;
        this.testDate = testDate;
        this.gradeLegend = gradeLegend;
        this.time = time;
        this.lecturercreate = lecturercreate;
        this.students = students;
        this.writers = writers;
        this.courseInSemester = courseInSemester;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }


    public TestDate getTestDate() {
        return testDate;
    }

    public void setTestDate(TestDate testDate) {
        this.testDate = testDate;
    }

    public Dictionary<Question, Integer> getGradeLegend() {
        return gradeLegend;
    }

    public void setGradeLegend(Dictionary<Question, Integer> gradeLegend) {
        this.gradeLegend = gradeLegend;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Lecturer getLecturercreate() {
        return lecturercreate;
    }

    public void setLecturercreate(Lecturer lecturercreate) {
        this.lecturercreate = lecturercreate;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Lecturer> getWriters() {
        return writers;
    }

    public void setWriters(ArrayList<Lecturer> writers) {
        this.writers = writers;
    }

    public CourseInSemester getCourseInSemester() {
        return courseInSemester;
    }

    public void setCourseInSemester(CourseInSemester courseInSemester) {
        this.courseInSemester = courseInSemester;
    }


}
