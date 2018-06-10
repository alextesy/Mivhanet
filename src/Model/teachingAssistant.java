package Model;

import java.util.ArrayList;

/**
 * Created by drorsim on 14.4.2018.
 */
public class teachingAssistant extends TeachingStaff {
    private ArrayList<CourseStaff> courseStaffArrayList;
    public teachingAssistant(String username, String name, String lastname, String password, String ID, String address, String phonenum, String email, ArrayList<Log> logList, ArrayList<Question> writenQbyCstaff, ArrayList<CourseStaff> courseStaffArrayList) {

        super(username, name, lastname, password, ID, address, phonenum, email, logList, writenQbyCstaff);
        this.courseStaffArrayList = courseStaffArrayList;
    }

    public ArrayList<CourseStaff> getCourseStaffArrayList() {
        return courseStaffArrayList;
    }

    public void setCourseStaffArrayList(ArrayList<CourseStaff> courseStaffArrayList) {
        this.courseStaffArrayList = courseStaffArrayList;
    }


}
