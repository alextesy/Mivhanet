package Model;

import java.util.ArrayList;

/**
 * Created by drorsim on 14.4.2018.
 */
public class CourseInSemester {
    private CourseStaff cs;
    private Course course;
    private Semester semester;
    private Test[] testList = new Test[3];
    private ArrayList<Student> participents;

    public CourseInSemester(CourseStaff cs, Course course, Semester semester, Test[] testList, ArrayList<Student> participents) {
        this.cs = cs;
        this.course = course;
        this.semester = semester;
        this.testList = testList;
        this.participents = participents;
    }

    public CourseStaff getCs() {
        return cs;
    }

    public void setCs(CourseStaff cs) {
        this.cs = cs;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public Test[] getTestList() {
        return testList;
    }

    public void setTestList(Test[] testList) {
        this.testList = testList;
    }

    public ArrayList<Student> getParticipents() {
        return participents;
    }

    public void setParticipents(ArrayList<Student> participents) {
        this.participents = participents;
    }
}
