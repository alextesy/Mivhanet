package Model;

import java.util.ArrayList;

/**
 * Created by drorsim on 14.4.2018.
 */
public class Course {
    private String name;
    private String ID;
    private Department department;
    private ArrayList<Semester> semesterArrayList;
    private ArrayList<Question> questionArrayList;

    public Course(String name, String ID, Department department, ArrayList<Semester> semesterArrayList,ArrayList<Question> questionArrayList) {

        this.name = name;
        this.ID = ID;
        this.department = department;
        this.semesterArrayList = semesterArrayList;
        this.questionArrayList=questionArrayList;
    }

    public static ArrayList<Course> getAllCourses(Semester s){
        return null;
    }

    public static Course getCourseByID(String ID){
        return null;
    }

    public static Course getCourseByName(String name){
        return null;
    }

    public ArrayList<Question> getQuestionArrayList(){
        return this.questionArrayList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }


    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ArrayList<Semester> getSemesterArrayList() {
        return semesterArrayList;
    }

    public void setSemesterArrayList(ArrayList<Semester> semesterArrayList) {
        this.semesterArrayList = semesterArrayList;
    }


}
