/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rad_project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author IIT19033
 */
public class SelectController implements Initializable {

   
    @FXML
    private Button BtnSGPA;
    @FXML
    private Button BtnCGPA;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

 
    @FXML
    private void BtnSGPAOnAction(ActionEvent event) {
           
         if(event.getSource() == BtnSGPA){
              try{
                    FXMLLoader fxmlload = new FXMLLoader(getClass().getResource("S_GPA.fxml"));
                    Parent root1 = (Parent) fxmlload.load();
                    Stage stage = new Stage();
                    stage.setTitle("SGPA");
                    stage.setScene(new Scene(root1));
                    stage.show();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
             
         }
    }

    @FXML
    private void BtnCGPAOnAction(ActionEvent event) {
          if(event.getSource() == BtnCGPA){
              try{
                    FXMLLoader fxmlload = new FXMLLoader(getClass().getResource("C_GPA.fxml"));
                    Parent root1 = (Parent) fxmlload.load();
                    Stage stage = new Stage();
                    stage.setTitle("CGPA");
                    stage.setScene(new Scene(root1));
                    stage.show();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
             
         }
    }
    }

    

