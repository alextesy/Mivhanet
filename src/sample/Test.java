package sample;

import Model.Mivhanet;
import Model.SqliteHelper;
import Model.Student;
import Model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) throws Exception {
        Mivhanet alex=Mivhanet.getInstance();
        alex.addUser(new Student("dorZ","Dor","Zion","dordor","5454548","beit shemesh","054-89567854","dor@post.bgu.ac.il",null,null,null));
    }

}

