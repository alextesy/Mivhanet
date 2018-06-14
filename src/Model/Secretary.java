package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 * Created by drorsim on 14.4.2018.
 */
public class Secretary extends User{
    private Department worksin;

    public Secretary(String username, String name, String lastname, String password, String ID, String address, String phonenum, String email, ArrayList<Log> logList, Department worksin) {

        super(username, name, lastname, password, ID, address, phonenum, email, logList);
        this.worksin = worksin;
    }

    public Department getWorksin() {
        return worksin;
    }

    public void setWorksin(Department worksin) {
        this.worksin = worksin;
    }


    @Override
    public void create() {
        Connection conn = null;
        try {
            conn = SqliteHelper.getConn();
            String query = "Insert INTO Secretary VALUES(?) ;";
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1, this.getID());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
