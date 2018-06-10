package Model;

import java.util.ArrayList;

/**
 * Created by drorsim on 14.4.2018.
 */
public abstract class TeachingStaff extends User{
    private ArrayList<Question> writenQbyCstaff;

    public TeachingStaff(String username, String name, String lastname, String password, String ID, String address, String phonenum, String email, ArrayList<Log> logList, ArrayList<Question> writenQbyCstaff) {

        super(username, name, lastname, password, ID, address, phonenum, email, logList);
        this.writenQbyCstaff = writenQbyCstaff;
    }

    public ArrayList<Question> getWritenQbyCstaff() {
        return writenQbyCstaff;
    }

    public void setWritenQbyCstaff(ArrayList<Question> writenQbyCstaff) {
        this.writenQbyCstaff = writenQbyCstaff;
    }

    public static TeachingStaff getTeachingStaff(){
        return null;
    }
}
