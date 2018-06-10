package Model;

import java.util.ArrayList;

/**
 * Created by drorsim on 14.4.2018.
 */
public class Department {
    private String name;
    private ArrayList<Course> DcourseList;
    private ArrayList<Secretary> sList;

    public Department(String name, ArrayList<Course> dcourseList, ArrayList<Secretary> sList) {

        this.name = name;
        DcourseList = dcourseList;
        this.sList = sList;
    }

    public ArrayList<Department> getAllDepartments(){return null;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Course> getDcourseList() {
        return DcourseList;
    }

    public void setDcourseList(ArrayList<Course> dcourseList) {
        DcourseList = dcourseList;
    }

    public ArrayList<Secretary> getsList() {
        return sList;
    }

    public void setsList(ArrayList<Secretary> sList) {
        this.sList = sList;
    }


}
