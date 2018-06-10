package Model;
import java.util.ArrayList;

/**
 * Created by drorsim on 14.4.2018.
 */
public class Student extends User {
    private ArrayList<CourseInSemester> courseInSemesterArrayList;
    private ArrayList<Test> testArrayList;
    public Student(String username, String name, String lastname, String password, String ID, String address, String phonenum, String email, ArrayList<Log> logList, ArrayList<CourseInSemester> courseInSemesterArrayList, ArrayList<Test> testArrayList) {

        super(username, name, lastname, password, ID, address, phonenum, email, logList);
        this.courseInSemesterArrayList = courseInSemesterArrayList;
        this.testArrayList = testArrayList;
    }

    public ArrayList<CourseInSemester> getCourseInSemesterArrayList() {
        return courseInSemesterArrayList;
    }

    public void setCourseInSemesterArrayList(ArrayList<CourseInSemester> courseInSemesterArrayList) {
        this.courseInSemesterArrayList = courseInSemesterArrayList;
    }

    public ArrayList<Test> getTestArrayList() {
        return testArrayList;
    }

    public void setTestArrayList(ArrayList<Test> testArrayList) {
        this.testArrayList = testArrayList;
    }


}
