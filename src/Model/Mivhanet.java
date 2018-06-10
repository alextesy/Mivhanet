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

    public ArrayList<Course> getAllCourses(Semester s){
        Connection conn = null;
        try {
            conn = SqliteHelper.getConn();

            String query = "Select cisID,courseID From coursesInSemester WHERE semesterID=?;";

            PreparedStatement ps=conn.prepareStatement(query);
            ps.setString(1, s.getName());
            ArrayList<Pair<String,String>> courses=new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                courses.add(new Pair(rs.getString("cisID"),rs.getString("courseID")));
            }
            ArrayList<Course> returnCourses=new ArrayList<>();
            for (Pair<String,String> course:courses) {
                String query1 = "Select name From Courses WHERE courseID=?;";
                PreparedStatement ps1=conn.prepareStatement(query);
                ps1.setString(1, course.getValue());
                ResultSet rs1 = ps.executeQuery();
                while (rs1.next()) {
                    returnCourses.add(new Course(rs1.getString("name"),course.getKey(),null,null,null));
                }
            }
            return returnCourses;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
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

    public static Course createNewCourse(ArrayList<String> staffID, String courseName){
        return null;
    }

    public static void editQ(String qid,int time,int difficulty){

    }

    public static ArrayList<Integer> getCourseGrades(String courseID,Semester s){ //TODO
        return null;
    }

    public static int getGrades(String c){
        return 0;
    }

}
