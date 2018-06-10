package Model;

import java.util.ArrayList;

/**
 * Created by drorsim on 14.4.2018.
 */
public class CourseStaff {
    private Lecturer[] LecList=new Lecturer[5];
    private teachingAssistant[] AssisList = new teachingAssistant[3];
    private LeadingLecturer boss;
    private ArrayList<CourseInSemester> csList;

    public CourseStaff(Lecturer[] lecList, teachingAssistant[] assisList, LeadingLecturer boss, ArrayList<CourseInSemester> csList) {
        LecList = lecList;
        AssisList = assisList;
        this.boss = boss;
        this.csList = csList;
    }

    public Lecturer[] getLecList() {
        return LecList;
    }

    public void setLecList(Lecturer[] lecList) {
        LecList = lecList;
    }

    public teachingAssistant[] getAssisList() {
        return AssisList;
    }

    public void setAssisList(teachingAssistant[] assisList) {
        AssisList = assisList;
    }

    public LeadingLecturer getBoss() {
        return boss;
    }

    public void setBoss(LeadingLecturer boss) {
        this.boss = boss;
    }

    public ArrayList<CourseInSemester> getCsList() {
        return csList;
    }

    public void setCsList(ArrayList<CourseInSemester> csList) {
        this.csList = csList;
    }
}
