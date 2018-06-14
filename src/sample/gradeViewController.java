package sample;

import Model.*;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.util.Pair;

import java.util.ArrayList;

/**
 * Created by drorsim on 12.6.2018.
 */
public class gradeViewController {

    public javafx.scene.control.ComboBox sbox;
    public javafx.scene.control.ComboBox cbox;
    public javafx.scene.control.ListView mylist;


    @FXML
    public void initialize(){
        /*CourseInSemester alex2=alex.getCourseInSemester(c,s);
        //System.out.println(alex2.getCisId());
        ArrayList<Test> tests=alex.getCourseInSemesterTests(alex2);
        for (Test t:tests) {
            ArrayList<Pair<Integer,Integer>> lior=alex.getCourseGrades(t);
            for (Pair<Integer,Integer> grade:lior) {
                System.out.println(grade.getKey()+" "+grade.getValue());
            }

        }*/
        Mivhanet m = Mivhanet.getInstance();
        ArrayList<Semester> slist = m.getAllSemesters();
        ArrayList<Course> clist = m.getAllCourses();

        for(int i = 0; i < slist.size(); i++){
            sbox.getItems().add(slist.get(i).getName());
        }
        for(int i = 0; i < clist.size(); i++){
            cbox.getItems().add(clist.get(i).getName());
        }
    }

    public void back(){
        mylist.getItems().clear();
        Stage s = (Stage)sbox.getScene().getWindow();
        s.close();
    }

    public void showG(){
        if(sbox.getSelectionModel().isEmpty() || cbox.getSelectionModel().isEmpty()){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("please choose course and semester");
            alert.show();
        }
        else{
            String coursename = cbox.getValue().toString();
            String semestername = sbox.getValue().toString();

            Mivhanet m = Mivhanet.getInstance();
            ArrayList<Semester> slist = m.getAllSemesters();
            ArrayList<Course> clist = m.getAllCourses();

            Course c = new Course(null,null,null,null,null);
            Semester s = new Semester(null,null,null,null);

            for(int i = 0; i < slist.size(); i++){
                if(slist.get(i).getName().equals(semestername)){
                    s = slist.get(i);
                }
            }

            for(int i = 0; i < clist.size(); i++){
                if(clist.get(i).getName().equals(coursename)){
                    c = clist.get(i);
                }
            }

            mylist.getItems().clear();
            if(!c.getName().equals(null) && !s.getName().equals(null)){
                CourseInSemester cs=m.getCourseInSemester(c,s);
                if(cs!=null){

                    ArrayList<Test> tests=m.getCourseInSemesterTests(cs);
                    if(tests.size() == 0){
                        mylist.getItems().add("no grades to view");
                    }
                    for (int i = 0; i< tests.size(); i++) {
                        ArrayList<Pair<Integer,Integer>> lior=m.getCourseGrades(tests.get(i));
                        for (Pair<Integer,Integer> grade:lior) {
                            //System.out.println(grade.getKey()+" "+grade.getValue());
                            mylist.getItems().add(grade.getKey()+" "+grade.getValue());
                        }

                    }
                }
                else{
                    mylist.getItems().add("no grades to view");
                }
            }
            else{
                mylist.getItems().add("no grades to view");
            }
        }
    }
}
