package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by drorsim on 11.6.2018.
 */
public class secreteryController {

    public Stage register;
    public Stage grade;
    public javafx.scene.control.Button exitB;

    @FXML
    public void initialize(){

        register = new Stage();
        register.setAlwaysOnTop(true);
        register.setResizable(false);
        register.setTitle("register Window");

        Parent root=null;
        try
        {
            //change MyView.fxml to help.fxml after designed
            root = FXMLLoader.load(getClass().getResource("../sample/register.fxml"));
        }
        catch(IOException e)
        {
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Exception!");
            alert.show();
        }
        register.setTitle("Register");
        Scene scene = new Scene(root,328,400);
        scene.getStylesheets().add(getClass().getResource("myCSSView.css").toExternalForm());
        register.setScene(scene);
        register.initModality(Modality.APPLICATION_MODAL);


        grade = new Stage();
        grade.setAlwaysOnTop(true);
        grade.setResizable(false);
        grade.setTitle("Grade View Window");

        Parent root2=null;
        try
        {
            //change MyView.fxml to help.fxml after designed
            root2 = FXMLLoader.load(getClass().getResource("../sample/gradeView.fxml"));
        }
        catch(IOException e)
        {
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Exception!");
            alert.show();
        }
        grade.setTitle("Grade View");
        Scene scene2 = new Scene(root2,600,400);
        scene2.getStylesheets().add(getClass().getResource("myCSSView.css").toExternalForm());
        grade.setScene(scene2);
        grade.initModality(Modality.APPLICATION_MODAL);

    }

    public void register(){
        register.show();

    }

    public void exit(){
        Stage s = (Stage)exitB.getScene().getWindow();
        s.close();
    }

    public void view(){
        grade.show();
    }
}
