package sample;

import Model.*;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 * Created by drorsim on 11.6.2018.
 */
public class registerController {

    public javafx.scene.control.TextField id;
    public javafx.scene.control.TextField username;
    public javafx.scene.control.TextField password;
    public javafx.scene.control.TextField fname;
    public javafx.scene.control.TextField lname;
    public javafx.scene.control.TextField address;
    public javafx.scene.control.TextField phone;
    public javafx.scene.control.TextField email;
    public javafx.scene.control.ComboBox type;


    @FXML
    public void initialize(){
        type.getItems().addAll("Secretary","Student","Teaching Assistant","Lecturer");
    }

    public void submit(){
        if(id.getText().trim().isEmpty() || username.getText().trim().isEmpty() || password.getText().trim().isEmpty() || fname.getText().trim().isEmpty() || lname.getText().trim().isEmpty() || address.getText().trim().isEmpty() || phone.getText().trim().isEmpty() || email.getText().trim().isEmpty() || type.getSelectionModel().isEmpty()){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("please fill all the fields");
            alert.show();
        }
        else{
            ////////////////////////////////////////////////////////////////////////////
            String typeName = type.getValue().toString();//////////////////////////////////////here is the string of the type
            ///////////////////////////////////////////////////////////////////////////
            Mivhanet m =Mivhanet.getInstance();
            User v=null;
            switch (typeName){
                case "Student":
                    v = new Student(username.getText().trim(),fname.getText().trim(),lname.getText().trim(),password.getText().trim(),id.getText().trim(),address.getText().trim(),phone.getText().trim(),email.getText().trim(),null,null,null);
                    break;
                case "Lecturer":
                    v = new Lecturer(username.getText().trim(),fname.getText().trim(),lname.getText().trim(),password.getText().trim(),id.getText().trim(),address.getText().trim(),phone.getText().trim(),email.getText().trim(),null,null,null,null);
                case "Secretary":
                    v = new Secretary(username.getText().trim(),fname.getText().trim(),lname.getText().trim(),password.getText().trim(),id.getText().trim(),address.getText().trim(),phone.getText().trim(),email.getText().trim(),null,null);
                case "Teaching Assistant":
                    v = new teachingAssistant(username.getText().trim(),fname.getText().trim(),lname.getText().trim(),password.getText().trim(),id.getText().trim(),address.getText().trim(),phone.getText().trim(),email.getText().trim(),null,null,null);


            }
            //User.Visitor(v);
            m.addUser(v);
            Stage s = (Stage)id.getScene().getWindow();
            s.close();
        }
    }

    public void exit(){
        Stage s = (Stage)id.getScene().getWindow();
        s.close();
    }
}
