package sample;

import Model.Mivhanet;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    public javafx.scene.control.TextField idField;
    public javafx.scene.control.TextField passwordField;
    public Stage aboutStage;




    @FXML
    public void initialize(){

        aboutStage = new Stage();
        aboutStage.setAlwaysOnTop(true);
        aboutStage.setResizable(false);
        aboutStage.setTitle("secretery Window");

        Parent root=null;
        try
        {
            //change MyView.fxml to help.fxml after designed
            root = FXMLLoader.load(getClass().getResource("../sample/secretery.fxml"));
        }
        catch(IOException e)
        {
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Exception!");
            alert.show();
        }
        aboutStage.setTitle("Secretery");
        Scene scene = new Scene(root,600,223);
        scene.getStylesheets().add(getClass().getResource("myCSSView.css").toExternalForm());
        aboutStage.setScene(scene);
        aboutStage.initModality(Modality.APPLICATION_MODAL);

    }


    public void exit(){
        Main.myExit();
    }

    public void login(){
        if(idField.getText().trim().isEmpty() || passwordField.getText().trim().isEmpty()){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("please fill User Name and Password");
            alert.show();
        }
        else {
            Mivhanet mivhanet = Mivhanet.getInstance();
            int num = mivhanet.login(idField.getText().trim(),passwordField.getText().trim());
            if(num == 0 || num == 1){
                Alert alert=new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText("you are not a secretery");
                alert.show();
            }
            else{
                //open secretery fxml
                aboutStage.show();
            }
        }
    }
}
