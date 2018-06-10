package Model;

import java.util.ArrayList;

/**
 * Created by drorsim on 14.4.2018.
 */
public class LeadingLecturer extends Lecturer {
    private ArrayList<CourseStaff> csList;

    public LeadingLecturer(String username, String name, String lastname, String password, String ID, String address, String phonenum, String email, ArrayList<Log> logList, ArrayList<Question> writenQbyCstaff, ArrayList<CourseStaff> staffArrayList, ArrayList<Test> writtenTest, ArrayList<CourseStaff> csList) {

        super(username, name, lastname, password, ID, address, phonenum, email, logList, writenQbyCstaff, staffArrayList, writtenTest);
        this.csList = csList;
    }

    public ArrayList<CourseStaff> getCsList() {
        return csList;
    }

    public void setCsList(ArrayList<CourseStaff> csList) {
        this.csList = csList;
    }


}
