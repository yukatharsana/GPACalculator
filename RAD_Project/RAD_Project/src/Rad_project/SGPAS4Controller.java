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
public class SGPAS4Controller implements Initializable {

    @FXML
    private Label Sub1C;
    @FXML
    private TextField Sub1GPV;
    @FXML
    private TextField Sub2GPV;
    @FXML
    private TextField Sub3GPV;
    @FXML
    private TextField Sub4GPV;
    @FXML
    private TextField Sub5GPV;
    @FXML
    private TextField Sub6GPV;
    @FXML
    private TextField Sub7GPV;
    @FXML
    private TextField Sub8GPV;
    @FXML
    private TextField Sub1GP;
    @FXML
    private TextField Sub2GP;
    @FXML
    private TextField Sub3GP;
    @FXML
    private TextField Sub4GP;
    @FXML
    private TextField Sub5GP;
    @FXML
    private TextField Sub6GP;
    @FXML
    private TextField Sub7GP;
    @FXML
    private TextField Sub8GP;
    @FXML
    private TextField TotalGP;
    @FXML
    private TextField GPAS4;
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
    private ComboBox<?> combo3;
    @FXML
    private ComboBox<?> combo4;
    @FXML
    private ComboBox<?> combo5;
    @FXML
    private ComboBox<?> combo6;
    @FXML
    private ComboBox<?> combo7;
    @FXML
    private ComboBox<?> combo8;
    @FXML
    private Button ButtonNext;
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
           
             String sql ="INSERT INTO sgpa4 VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";  
                     
             PreparedStatement pstmt = conn.prepareStatement(sql);
           
             pstmt.setString(1,enrollnumber.getText());
             pstmt.setString(2,Sub1GPV.getText());
             pstmt.setString(3,Sub2GPV.getText());
             pstmt.setString(4,Sub3GPV.getText());
             pstmt.setString(5,Sub4GPV.getText());
             pstmt.setString(6,Sub5GPV.getText());
             pstmt.setString(7,Sub6GPV.getText());
             pstmt.setString(8,Sub7GPV.getText());
             pstmt.setString(9,Sub8GPV.getText());
             pstmt.setString(10,Sub1GP.getText());
             pstmt.setString(11,Sub2GP.getText());
             pstmt.setString(12,Sub3GP.getText());
             pstmt.setString(13,Sub4GP.getText());
             pstmt.setString(14,Sub5GP.getText());
             pstmt.setString(15,Sub6GP.getText());
             pstmt.setString(16,Sub7GP.getText());
             pstmt.setString(17,Sub8GP.getText());         
             pstmt.setString(18,TotalGP.getText());
             pstmt.setString(19,GPAS4.getText());
            
             pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null," Record Added Successfully");
              
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
    
               String sql ="UPDATE sgpa4 SET Sub1GPV=?, Sub2GPV=?, Sub3GPV=?, Sub4GPV=?, Sub5GPV=?, Sub6GPV=?, Sub7GPV=?, Sub8GPV=?,  Sub1GP=?, Sub2GP=?, Sub3GP=?, Sub4GP=?, Sub5GP=?, Sub6GP=?, Sub7GP=?, Sub8GP=?,TotalGP=?, GPAS4=? where Stu_ID=?";
             PreparedStatement pstmt = conn.prepareStatement(sql);

             pstmt.setString(1,Sub1GPV.getText());
             pstmt.setString(2,Sub2GPV.getText());
             pstmt.setString(3,Sub3GPV.getText());
             pstmt.setString(4,Sub4GPV.getText());
             pstmt.setString(5,Sub5GPV.getText());
             pstmt.setString(6,Sub6GPV.getText());
             pstmt.setString(7,Sub7GPV.getText());
             pstmt.setString(8,Sub8GPV.getText());
          
             pstmt.setString(9,Sub1GP.getText());
             pstmt.setString(10,Sub2GP.getText());
             pstmt.setString(11,Sub3GP.getText());
             pstmt.setString(12,Sub4GP.getText());
             pstmt.setString(13,Sub5GP.getText());
             pstmt.setString(14,Sub6GP.getText());
             pstmt.setString(15,Sub7GP.getText());
             pstmt.setString(16,Sub8GP.getText());
            
             pstmt.setString(17,TotalGP.getText());
             pstmt.setString(18,GPAS4.getText());
            pstmt.setString(19,enrollnumber.getText());
             
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
                String sql ="Delete from sgpa4 where Stu_ID=? ";
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
        Sub3GPV.setText("");
        Sub4GPV.setText("");
        Sub5GPV.setText("");
        Sub6GPV.setText("");
        Sub7GPV.setText("");
        Sub8GPV.setText("");
     
        Sub1GP.setText("");
        Sub2GP.setText("");
        Sub3GP.setText("");
        Sub4GP.setText("");
        Sub5GP.setText("");
        Sub6GP.setText("");
        Sub7GP.setText("");
        Sub8GP.setText("");
      
        TotalGP.setText("");
        GPAS4.setText("");
    }

    @FXML
    private void BtnSearchOnAction(ActionEvent event) {
              try {
                       Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rad","root","");
                
                String sql ="Select * from sgpa4 where Stu_ID=? ";
             PreparedStatement pstmt = conn.prepareStatement(sql);
             pstmt.setString(1,(enrollnumber.getText()));
             
             ResultSet rs= pstmt.executeQuery();
             if (rs.next())
             {
              Sub1GPV.setText(rs.getString("Sub1GPV"));
              Sub2GPV.setText(rs.getString("Sub2GPV"));
              Sub3GPV.setText(rs.getString("Sub3GPV"));
              Sub4GPV.setText(rs.getString("Sub4GPV"));
              Sub5GPV.setText(rs.getString("Sub5GPV"));
              Sub6GPV.setText(rs.getString("Sub6GPV"));
              Sub7GPV.setText(rs.getString("Sub7GPV"));
              Sub8GPV.setText(rs.getString("Sub8GPV"));
             Sub1GP.setText(rs.getString("Sub1GP"));
        Sub2GP.setText(rs.getString("Sub2GP"));
        Sub3GP.setText(rs.getString("Sub3GP"));
        Sub4GP.setText(rs.getString("Sub4GP"));
        Sub5GP.setText(rs.getString("Sub5GP"));
        Sub6GP.setText(rs.getString("Sub6GP"));
        Sub7GP.setText(rs.getString("Sub7GP"));
        Sub8GP.setText(rs.getString("Sub8GP"));
        TotalGP.setText(rs.getString("TotalGP"));   
        GPAS4.setText(rs.getString("GPAS4"));  
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
        float S1GP, S2GP, S3GP, S4GP, S5GP, S6GP, S7GP, S8GP, TGP, SGPA;
        S1GP = Float.parseFloat(Sub1GP.getText());
        S2GP = Float.parseFloat(Sub2GP.getText());
        S3GP = Float.parseFloat(Sub3GP.getText());
        S4GP = Float.parseFloat(Sub4GP.getText());
        S5GP = Float.parseFloat(Sub5GP.getText());
        S6GP = Float.parseFloat(Sub6GP.getText());
        S7GP = Float.parseFloat(Sub7GP.getText());
        S8GP = Float.parseFloat(Sub8GP.getText());
  
 
         TGP = S1GP+ S2GP+ S3GP+ S4GP+ S5GP+ S6GP+ S7GP+ S8GP;
         TotalGP.setText(String.valueOf(TGP));
         SGPA = TGP/17;
         GPAS4.setText(String.valueOf(SGPA));
    }

@Override
    public void initialize(URL location, ResourceBundle resources) {
      ObservableList List = FXCollections.observableArrayList("A+","A","A-","B+","B","B-","C+","C","C-","D+","D","E");
      combo1.setItems(List);
      combo2.setItems(List);
      combo3.setItems(List);
      combo4.setItems(List);
      combo5.setItems(List);
      combo6.setItems(List);
      combo7.setItems(List);
      combo8.setItems(List);
         
      
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
          Sub1GP.setText(Float.toString(Gpavalue*2));
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
          Sub2GP.setText(Float.toString(Gpavalue*3));
    }

    @FXML
    private void selectC3(ActionEvent event) {
          String s = combo3.getSelectionModel().getSelectedItem().toString();
        
 
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
          Sub3GPV.setText(Float.toString(Gpavalue));
           Sub3GP.setText(Float.toString(Gpavalue*3));
    }
    

    @FXML
    private void selectC4(ActionEvent event) {
          String s = combo4.getSelectionModel().getSelectedItem().toString();
        
 
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
          Sub4GPV.setText(Float.toString(Gpavalue));
       Sub4GP.setText(Float.toString(Gpavalue*2));
    }

    @FXML
    private void selectC5(ActionEvent event) {
          String s = combo5.getSelectionModel().getSelectedItem().toString();
        
 
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
          Sub5GPV.setText(Float.toString(Gpavalue));
             Sub5GP.setText(Float.toString(Gpavalue*1));
    }
    

    @FXML
    private void selectC6(ActionEvent event) {
  String s = combo6.getSelectionModel().getSelectedItem().toString();
        
 
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
          Sub6GPV.setText(Float.toString(Gpavalue));
       Sub6GP.setText(Float.toString(Gpavalue*2));
    }

    @FXML
    private void selectC7(ActionEvent event) {
          String s = combo7.getSelectionModel().getSelectedItem().toString();
        
 
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
          Sub7GPV.setText(Float.toString(Gpavalue));
      Sub7GP.setText(Float.toString(Gpavalue*2));
    }

    @FXML
    private void selectC8(ActionEvent event) {
          String s = combo8.getSelectionModel().getSelectedItem().toString();
        
 
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
          Sub8GPV.setText(Float.toString(Gpavalue));
      Sub8GP.setText(Float.toString(Gpavalue*2));
    }

    @FXML
    private void btnNextOnaction(ActionEvent event) {
          if(event.getSource() == ButtonNext){
         
                try{
                    FXMLLoader fxmlload = new FXMLLoader(getClass().getResource("SGPA5.fxml"));
                    Parent root1 = (Parent) fxmlload.load();
                    Stage stage = new Stage();
                    stage.setTitle("SGPA5");
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

    @FXML
    private void btnbackOnaction(ActionEvent event) {
         if(event.getSource() == ButtonBack){
         
                try{
                    FXMLLoader fxmlload = new FXMLLoader(getClass().getResource("SGPAS3.fxml"));
                    Parent root1 = (Parent) fxmlload.load();
                    Stage stage = new Stage();
                    stage.setTitle("SGPA3");
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
    

