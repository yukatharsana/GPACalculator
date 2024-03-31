/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rad_project;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author IIT19033
 */
public class S_GPAController implements Initializable {

    @FXML
    private Button BtnS2;
    @FXML
    private Button BtnS3;
    @FXML
    private Button BtnS1;
    @FXML
    private Button BtnS4;
    @FXML
    private Button BtnS5;
    @FXML
    private Button BtnS6;
    @FXML
    private Button BtnS7;
    @FXML
    private Button BtnS8;
    @FXML
    private Button ButtonBack;


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void BtnS2On(ActionEvent event) {
             if(event.getSource() == BtnS2){
              try{
                    FXMLLoader fxmlload = new FXMLLoader(getClass().getResource("SGPAS2.fxml"));
                    Parent root1 = (Parent) fxmlload.load();
                    Stage stage = new Stage();
                    stage.setTitle("SGPA_Sem2");
                    stage.setScene(new Scene(root1));
                    stage.show();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
             
         }
    }

    @FXML
    private void BtnS3On(ActionEvent event) {
           if(event.getSource() == BtnS3){
              try{
                    FXMLLoader fxmlload = new FXMLLoader(getClass().getResource("SGPAS3.fxml"));
                    Parent root1 = (Parent) fxmlload.load();
                    Stage stage = new Stage();
                    stage.setTitle("SGPA_Sem3");
                    stage.setScene(new Scene(root1));
                    stage.show();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
             
         }
    }

    @FXML
    private void BtnS1On(ActionEvent event) {
         if(event.getSource() == BtnS1){
              try{
                    FXMLLoader fxmlload = new FXMLLoader(getClass().getResource("SGPAS1.fxml"));
                    Parent root1 = (Parent) fxmlload.load();
                    Stage stage = new Stage();
                    stage.setTitle("SGPA_Sem1");
                    stage.setScene(new Scene(root1));
                    stage.show();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
             
         }
    }

    @FXML
    private void BtnS4On(ActionEvent event) {
             if(event.getSource() == BtnS4){
              try{
                    FXMLLoader fxmlload = new FXMLLoader(getClass().getResource("SGPAS4.fxml"));
                    Parent root1 = (Parent) fxmlload.load();
                    Stage stage = new Stage();
                    stage.setTitle("SGPA_Sem4");
                    stage.setScene(new Scene(root1));
                    stage.show();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
             
         }
    }

    @FXML
    private void BtnS5On(ActionEvent event) {
             if(event.getSource() == BtnS5){
              try{
                    FXMLLoader fxmlload = new FXMLLoader(getClass().getResource("SGPA5.fxml"));
                    Parent root1 = (Parent) fxmlload.load();
                    Stage stage = new Stage();
                    stage.setTitle("SGPA_Sem5");
                    stage.setScene(new Scene(root1));
                    stage.show();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
             
         }
    }
    

    @FXML
    private void BtnS6On(ActionEvent event) {
             if(event.getSource() == BtnS6){
              try{
                    FXMLLoader fxmlload = new FXMLLoader(getClass().getResource("SGPAS6.fxml"));
                    Parent root1 = (Parent) fxmlload.load();
                    Stage stage = new Stage();
                    stage.setTitle("SGPA_Sem6");
                    stage.setScene(new Scene(root1));
                    stage.show();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
             
         }
    }

    @FXML
    private void BtnS7On(ActionEvent event) {
             if(event.getSource() == BtnS7){
              try{
                    FXMLLoader fxmlload = new FXMLLoader(getClass().getResource("SGPAS7.fxml"));
                    Parent root1 = (Parent) fxmlload.load();
                    Stage stage = new Stage();
                    stage.setTitle("SGPA_Sem7");
                    stage.setScene(new Scene(root1));
                    stage.show();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
             
         }
    }

    @FXML
    private void BtnS8On(ActionEvent event) {
             if(event.getSource() == BtnS8){
              try{
                    FXMLLoader fxmlload = new FXMLLoader(getClass().getResource("SGPAS8.fxml"));
                    Parent root1 = (Parent) fxmlload.load();
                    Stage stage = new Stage();
                    stage.setTitle("SGPA_Sem8");
                    stage.setScene(new Scene(root1));
                    stage.show();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
             
         }
    }

    @FXML
    private void btnbackOnaction(ActionEvent event) {
            if(event.getSource() == ButtonBack){
         
                try{
                    FXMLLoader fxmlload = new FXMLLoader(getClass().getResource("select.fxml"));
                    Parent root1 = (Parent) fxmlload.load();
                    Stage stage = new Stage();
                    stage.setTitle("Select");
                    stage.setScene(new Scene(root1));
                    stage.show();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
           
            else{
                System.out.println("Something went wrong");
            }
        }
    }


    

