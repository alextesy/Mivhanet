package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
        return false;
    } //TODO

    public ArrayList<Course> getAllCourses(Semester s){
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
