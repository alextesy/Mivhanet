package Model;

import java.util.ArrayList;

/**
 * Created by drorsim on 14.4.2018.
 */
public class Lecturer extends TeachingStaff {
    private ArrayList<CourseStaff> staffArrayList;
    private ArrayList<Test> writtenTest;

    public Lecturer(String username, String name, String lastname, String password, String ID, String address, String phonenum, String email, ArrayList<Log> logList, ArrayList<Question> writenQbyCstaff, ArrayList<CourseStaff> staffArrayList, ArrayList<Test> writtenTest) {

        super(username, name, lastname, password, ID, address, phonenum, email, logList, writenQbyCstaff);
        this.staffArrayList = staffArrayList;
        this.writtenTest = writtenTest;
    }

    public ArrayList<CourseStaff> getStaffArrayList() {
        return staffArrayList;
    }

    public void setStaffArrayList(ArrayList<CourseStaff> staffArrayList) {
        this.staffArrayList = staffArrayList;
    }

    public ArrayList<Test> getWrittenTest() {
        return writtenTest;
    }

    public void setWrittenTest(ArrayList<Test> writtenTest) {
        this.writtenTest = writtenTest;
    }


}
