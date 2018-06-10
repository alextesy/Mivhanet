package Model;

import javafx.util.Pair;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;

/**
 * Created by drorsim on 20.5.2018.
 */
public class Mivhanet {

    public static Mivhanet instance=null;
    private Mivhanet(){

    }
    public static Mivhanet getInstance(){
        if(instance==null) {
            instance = new Mivhanet();
        }
        return instance;
    }



    public void createNewUser(String username,String name,String lastname,String address,String phonenum, String email,Department department){

    }

    public void addUser(User u){
        Connection conn = null;
        try {
            conn = SqliteHelper.getConn();

        String query = "Insert INTO User VALUES(?, ?, ?, ?, ?, ?,?,?) ;";
        PreparedStatement ps=conn.prepareStatement(query);
        ps.setString(1, u.getID());
        ps.setString(2, u.getUsername());
        ps.setString(3, u.getPassword());
        ps.setString(4, u.getName());
        ps.setString(5, u.getLastname());
        ps.setString(6, u.getAddress());
        ps.setString(7, u.getPhonenum());
        ps.setString(8, u.getEmail());
        ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public boolean login(String username,String password){
        Connection conn = null;
        try {
            conn = SqliteHelper.getConn();

            String query = "Select * From User Where userName=? AND Password=? ;";
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            if (!rs.isBeforeFirst() ) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public ArrayList<Course> getAllCourses(){
        Connection conn = null;
        try {
            conn = SqliteHelper.getConn();

            String query = "Select * From Courses";
            PreparedStatement ps=conn.prepareStatement(query);
            ArrayList<Course> courses=new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                courses.add(new Course(rs.getString("name"),rs.getString("courseID"),null,null,null));
            }
            return courses;
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }

    }



    public ArrayList<Question> getAllQuestionsList(String courseID){
        return null;
    }

    public void createQuestion(String q, HashMap<String,Boolean> map,int diff,int time){

    }

    public void addQuestion(Question q){

    }

    public ArrayList<Comment> checkQcomments(String questionID){
        return null;
    }

    public void createComment(String body,String qid){

    }

    public void addCommentToQuestion(Comment c, Question q){

    }

    public boolean checkQuestionInTest(Question q){
        return false;
    }

    public void deleteQ(Question q){

    }

    public ArrayList<TeachingStaff> getTechingStaff(){
        return null;
    }

    public boolean checkIfCourseNameIsValid(String courseName){
        return false;
    }

    public Course createNewCourse(ArrayList<String> staffID, String courseName){
        return null;
    }

    public void editQ(String qid,int time,int difficulty){

    }
    public CourseInSemester getCourseInSemester(Course course,Semester semester){
        Connection conn = null;
        try {
            conn = SqliteHelper.getConn();

            String query = "Select cisID From coursesInSemester WHERE courseID=? AND semesterID=? ;";

            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1, course.getID());
            ps.setString(2, semester.getName());
            ArrayList<Course> courses=new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            if (!rs.isBeforeFirst() ) {
                return null;
            }
            return new CourseInSemester(rs.getString("cisID"),null,course,semester,null,null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
    }
    public ArrayList<Test> getCourseInSemesterTests(CourseInSemester course){
        Connection conn = null;
        try {
            conn = SqliteHelper.getConn();

            String query = "Select * From Test WHERE courseID=? ;";
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1, course.getCisId());
            ArrayList<Test> tests=new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tests.add(new Test(null,null,null,null,null,null,null,rs.getString("TestID")));
            }
            return tests;
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
    }

    public ArrayList<Pair<Integer,Integer>> getCourseGrades(Test test){ //TODO

        Connection conn = null;
        try {
            conn = SqliteHelper.getConn();

            String query = "Select studentID, grade From studentsGrades WHERE testID=? ;";
            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1, test.getTestId());
            ArrayList<Pair<Integer,Integer>> grades=new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                grades.add(new Pair(new Integer(Integer.parseInt(rs.getString("studentID"))),new Integer(rs.getInt("grade"))));
            }
            return grades;
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
    }


    public int getGrades(String c){
        return 0;
    }

}
