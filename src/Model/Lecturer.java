package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
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


    @Override
    public void create() {
        Connection conn = null;
        try {
            conn = SqliteHelper.getConn();
            String query = "Insert INTO Lecturers VALUES(?) ;";
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1, this.getID());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
