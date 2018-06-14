package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
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


    @Override
    public void create() {
        Connection conn = null;
        try {
            conn = SqliteHelper.getConn();
            String query = "Insert INTO teachingAssistants VALUES(?) ;";
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1, this.getID());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
