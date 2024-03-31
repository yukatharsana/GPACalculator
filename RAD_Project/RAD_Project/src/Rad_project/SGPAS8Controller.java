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
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author IIT19033
 */
public class SGPAS8Controller implements Initializable {

    @FXML
    private Label Sub1C;
    @FXML
    private TextField Sub1GPV;
    @FXML
    private TextField Sub2GPV;
    @FXML
    private TextField Sub1GP;
    @FXML
    private TextField Sub2GP;
    @FXML
    private Label GPASem1;
    @FXML
    private Button BtnAdd;
    @FXML
    private Button BtnUpdate;
    @FXML
    private Button BtnDelete;
    @FXML
    private Button BtnClear;
    @FXML
    private TextField enrollnumber;
    @FXML
    private Button BtnSearch;
    @FXML
    private Button btnCal;
    @FXML
    private ComboBox<?> combo1;
    @FXML
    private ComboBox<?> combo2;
    @FXML
    private TextField TotalGP;
    @FXML
    private TextField GPAS8;
    @FXML
    private Button ButtonBack;

    /**
     * Initializes the controller class.
     */
      

    @FXML
    private void BtnAddOnAction(ActionEvent event) {
        try {
                 Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rad","root","");// databaseName,user name, password
           
             String sql ="INSERT INTO sgpa8 VALUES( ?, ?, ?, ?, ?, ?,?)";  
                     
             PreparedStatement pstmt = conn.prepareStatement(sql);
           
             pstmt.setString(1,enrollnumber.getText());
             pstmt.setString(2,Sub1GPV.getText());
             pstmt.setString(3,Sub2GPV.getText());
             pstmt.setString(4,Sub1GP.getText());
             pstmt.setString(5,Sub2GP.getText());
             pstmt.setString(6,TotalGP.getText());
             pstmt.setString(7,GPAS8.getText());
            
             pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null,"Record Added Successfully");
              
         conn.close();
         
            }
         catch (Exception e) 
         {
            JOptionPane.showMessageDialog(null,e);
        }
        
        }
    

    @FXML
    private void BtnUpdateOnAction(ActionEvent event) {
   try {
                 Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rad","root","");
    
               String sql ="UPDATE sgpa8 SET Sub1GPV=?, Sub2GPV=?, Sub1GP=?, Sub2GP=?,TGP=?, GPAS8=? where Stu_ID=?";
             PreparedStatement pstmt = conn.prepareStatement(sql);

             pstmt.setString(1,Sub1GPV.getText());
             pstmt.setString(2,Sub2GPV.getText()); 
             pstmt.setString(3,Sub1GP.getText());
             pstmt.setString(4,Sub2GP.getText());
             pstmt.setString(5,TotalGP.getText());
             pstmt.setString(6,GPAS8.getText());
            pstmt.setString(7,enrollnumber.getText());
             
                     pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null,"Record Updated Successfully");
                      
         conn.close();
                 } 
                 catch (Exception e) 
         {
            JOptionPane.showMessageDialog(null,e);
        }
    }

    @FXML
    private void BtnDeleteOn(ActionEvent event) {
        int opt = JOptionPane.showConfirmDialog(null,"Do you want to delete?","Delete",JOptionPane.YES_NO_OPTION);
     if(opt==0){
         try {
                 Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rad","root","");
                String sql ="Delete from sgpa8 where Stu_ID=? ";
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1,(enrollnumber.getText()));
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Record Deleted Successfully");
                    conn.close();
        }
                 catch (Exception e) 
         {
            JOptionPane.showMessageDialog(null,e);
        }
     }
    }

    @FXML
    private void BtnClearOnAction(ActionEvent event) {
          Sub1GPV.setText("");
        Sub2GPV.setText("");
       
        Sub1GP.setText("");
        Sub2GP.setText("");
       
        TotalGP.setText("");
        GPAS8.setText("");
    }

    @FXML
    private void BtnSearchOnAction(ActionEvent event) {
        try {
                       Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rad","root","");
                
                String sql ="Select * from sgpa8 where Stu_ID=? ";
             PreparedStatement pstmt = conn.prepareStatement(sql);
             pstmt.setString(1,(enrollnumber.getText()));
             
             ResultSet rs= pstmt.executeQuery();
             if (rs.next())
             {
              Sub1GPV.setText(rs.getString("Sub1GPV"));
              Sub2GPV.setText(rs.getString("Sub2GPV"));
           
             Sub1GP.setText(rs.getString("Sub1GP"));
        Sub2GP.setText(rs.getString("Sub2GP"));
       
        TotalGP.setText(rs.getString("TGP"));   
        GPAS8.setText(rs.getString("GPAS8"));  
             }
             else {
                JOptionPane.showMessageDialog(null,"record not found");
                      
             }
             conn.close();
                 } 
                 catch (Exception e)
         {
            JOptionPane.showMessageDialog(null,e);
    }
}
    

    @FXML
    private void BtnCalOnAction(ActionEvent event) {
        float S2GP, TGP, SGPA;
        
        S2GP = Float.parseFloat(Sub2GP.getText());
       
 
         TGP =  S2GP;
         TotalGP.setText(String.valueOf(TGP));
         SGPA = TGP/6;
         GPAS8.setText(String.valueOf(SGPA));
    }

   @Override
    public void initialize(URL location, ResourceBundle resources) {
      ObservableList List = FXCollections.observableArrayList("A+","A","A-","B+","B","B-","C+","C","C-","D+","D","E");
      combo1.setItems(List);
      combo2.setItems(List);
         
      
    }
    @FXML
    private void selectC1(ActionEvent event) {
         String s = combo1.getSelectionModel().getSelectedItem().toString();
        
 
         float Gpavalue =0.0f;
         switch (s){
             case "A+": Gpavalue=4.0f;
             break;
             case "A": Gpavalue =4.0f;
             break;
             case "A-": Gpavalue =3.7f;
             break;
             case "B+": Gpavalue =3.3f;
             break;
             case "B": Gpavalue =3.0f;
             break;
             case "B-": Gpavalue =2.7f;
             break;
             case "C+": Gpavalue =2.3f;
             break;
             case "C": Gpavalue =2.0f;
             break;
             case "C-": Gpavalue =1.7f;
             break;
             case "D+": Gpavalue =1.3f;
             break;
             case "D": Gpavalue =1.0f;
             break;
             case "E": Gpavalue =0.0f;
             break;
             
                 
         }
          Sub1GPV.setText(Float.toString(Gpavalue));
          Sub1GP.setText(Float.toString(Gpavalue*6));
    }

    @FXML
    private void selectC2(ActionEvent event) {
          String s = combo2.getSelectionModel().getSelectedItem().toString();
        
 
         float Gpavalue =0.0f;
         switch (s){
             case "A+": Gpavalue =4.0f;
             break;
             case "A": Gpavalue =4.0f;
             break;
             case "A-": Gpavalue =3.7f;
             break;
             case "B+": Gpavalue =3.3f;
             break;
             case "B": Gpavalue =3.0f;
             break;
             case "B-": Gpavalue =2.7f;
             break;
             case "C+": Gpavalue =2.3f;
             break;
             case "C": Gpavalue =2.0f;
             break;
             case "C-": Gpavalue =1.7f;
             break;
             case "D+": Gpavalue =1.3f;
             break;
             case "D": Gpavalue =1.0f;
             break;
             case "E": Gpavalue =0.0f;
             break;
             
                 
         }
          Sub2GPV.setText(Float.toString(Gpavalue));
          Sub2GP.setText(Float.toString(Gpavalue*6));
    }

    @FXML
    private void btnbackOnaction(ActionEvent event) {
         if(event.getSource() == ButtonBack){
         
                try{
                    FXMLLoader fxmlload = new FXMLLoader(getClass().getResource("SGPAS7.fxml"));
                    Parent root1 = (Parent) fxmlload.load();
                    Stage stage = new Stage();
                    stage.setTitle("SGPA7");
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
