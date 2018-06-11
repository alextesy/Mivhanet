package sample;

import Model.*;
import javafx.util.Pair;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Test1 {

    public static void main(String[] args) throws Exception {
        Mivhanet alex=Mivhanet.getInstance();
        Semester s=new Semester("2018-2",null,null,null);
        Course c=new Course("data mining","1051",null, null,null);

        CourseInSemester alex2=alex.getCourseInSemester(c,s);
        //System.out.println(alex2.getCisId());
        ArrayList<Test> tests=alex.getCourseInSemesterTests(alex2);
        for (Test t:tests) {
            ArrayList<Pair<Integer,Integer>> lior=alex.getCourseGrades(t);
            for (Pair<Integer,Integer> grade:lior) {
                System.out.println(grade.getKey()+" "+grade.getValue());
            }

        }
        ArrayList<Semester> lior=alex.getAllSemesters();
        for (Semester s1:
             lior) {
            System.out.println(s1.getName());
        }
        //if(alex.login("alex","1323"))
         //   System.out.println("Success");
        //alex.addUser(new Student("dorZ","Dor","Zion","dordor","5454548","beit shemesh","054-89567854","dor@post.bgu.ac.il",null,null,null));
    }

}

