package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by drorsim on 14.4.2018.
 */
public class Semester {
    private String name;
    private Date startTime;
    private Date endTime;
    private ArrayList<Course> courseArrayList;
    public Semester(String name, Date startTime, Date endTime, ArrayList<Course> courseArrayList) {

        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.courseArrayList = courseArrayList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public ArrayList<Course> getCourseArrayList() {
        return courseArrayList;
    }

    public void setCourseArrayList(ArrayList<Course> courseArrayList) {
        this.courseArrayList = courseArrayList;
    }


}
