package Model;

import java.util.ArrayList;

/**
 * Created by drorsim on 14.4.2018.
 */
public abstract class User {
    private String username;
    private String name;
    private String lastname;
    private String password;
    private String ID;
    private String address;
    private String phonenum;
    private String email;
    private ArrayList<Log> logList;

    public User(String username, String name, String lastname, String password, String ID, String address, String phonenum, String email, ArrayList<Log> logList) {

        this.username = username;
        this.name = name;
        this.lastname = lastname;
        this.password = password;
        this.ID = ID;
        this.address = address;
        this.phonenum = phonenum;
        this.email = email;
        this.logList = logList;
    }

    public static void checkEmail(String email){
    }

    public static Student getStudentByEmail(String email){
        return null;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Log> getLogList() {
        return logList;
    }

    public void setLogList(ArrayList<Log> logList) {
        this.logList = logList;
    }


}
