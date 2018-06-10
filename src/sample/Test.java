package sample;

import Model.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) throws Exception {
        Mivhanet alex=Mivhanet.getInstance();
        ArrayList<Course> alex2=alex.getAllCourses(new Semester("2018-1",null,null,null));
        System.out.println(alex2.size());
        //if(alex.login("alex","1323"))
         //   System.out.println("Success");
        //alex.addUser(new Student("dorZ","Dor","Zion","dordor","5454548","beit shemesh","054-89567854","dor@post.bgu.ac.il",null,null,null));
    }

}

