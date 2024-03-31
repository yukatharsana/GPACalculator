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
public class SGPAS7Controller implements Initializable {

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
    private TextField Sub9GPV;
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
    private TextField Sub9GP;
    @FXML
    private TextField TotalGP;
    @FXML
    private TextField GPAS7;
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
    private ComboBox<?> combo9;
    @FXML
    private ComboBox<?> combo10;
    @FXML
    private ComboBox<?> combo11;
    @FXML
    private TextField Sub10GPV;
    @FXML
    private TextField Sub11GPV;
    @FXML
    private TextField Sub10GP;
    @FXML
    private TextField Sub11GP;
    @FXML
    private ComboBox<?> combo12;
    @FXML
    private ComboBox<?> combo13;
    @FXML
    private ComboBox<?> combo14;
    @FXML
    private ComboBox<?> combo15;
    @FXML
    private ComboBox<?> combo16;
    @FXML
    private ComboBox<?> combo17;
    @FXML
    private TextField Sub12GPV;
    @FXML
    private TextField Sub13GPV;
    @FXML
    private TextField Sub14GPV;
    @FXML
    private TextField Sub15GPV;
    @FXML
    private TextField Sub16GPV;
    @FXML
    private TextField Sub17GPV;
    @FXML
    private TextField Sub12GP;
    @FXML
    private TextField Sub13GP;
    @FXML
    private TextField Sub14GP;
    @FXML
    private TextField Sub15GP;
    @FXML
    private TextField Sub16GP;
    @FXML
    private TextField Sub17GP;
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
           
             String sql ="INSERT INTO sgpa7 VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";  
                     
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
             pstmt.setString(10,Sub9GPV. getText());
             pstmt.setString(11,Sub10GPV. getText());
             pstmt.setString(12,Sub11GPV. getText());
             pstmt.setString(13,Sub12GPV. getText());
             pstmt.setString(14,Sub13GPV. getText());
             pstmt.setString(15,Sub14GPV. getText());
             pstmt.setString(16,Sub15GPV. getText());
             pstmt.setString(17,Sub16GPV. getText());
             pstmt.setString(18,Sub17GPV. getText());
             pstmt.setString(19,Sub1GP.getText());
             pstmt.setString(20,Sub2GP.getText());
             pstmt.setString(21,Sub3GP.getText());
             pstmt.setString(22,Sub4GP.getText());
             pstmt.setString(23,Sub5GP.getText());
             pstmt.setString(24,Sub6GP.getText());
             pstmt.setString(25,Sub7GP.getText());
             pstmt.setString(26,Sub8GP.getText());
             pstmt.setString(27,Sub9GP.getText());
             pstmt.setString(28,Sub10GP.getText());
             pstmt.setString(29,Sub11GP.getText());
             pstmt.setString(30,Sub12GP.getText());
             pstmt.setString(31,Sub13GP.getText());
             pstmt.setString(32,Sub14GP.getText());
             pstmt.setString(33,Sub15GP.getText());
             pstmt.setString(34,Sub16GP.getText());
             pstmt.setString(35,Sub17GP.getText());
             pstmt.setString(36,TotalGP.getText());
             pstmt.setString(37,GPAS7.getText());
            
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
    
               String sql ="UPDATE sgpa7 SET Sub1GPV=?, Sub2GPV=?, Sub3GPV=?, Sub4GPV=?, Sub5GPV=?, Sub6GPV=?, Sub7GPV=?, Sub8GPV=?, Sub9GPV=?, Sub10GPV=?,Sub11GPV=?,Sub12GPV=?,Sub13GPV=?, Sub14GPV=?, Sub15GPV=?,Sub16GPV=?,Sub17GPV=?,Sub1GP=?, Sub2GP=?, Sub3GP=?, Sub4GP=?, Sub5GP=?, Sub6GP=?, Sub7GP=?, Sub8GP=?,Sub9GP=?,Sub10GP=? ,Sub11GP=?,Sub12GP=?,Sub13GP=?,Sub14GP=?,Sub15GP=?,Sub16GP=?,Sub17GP=?,TotalGP=?, GPAS7=? where Stu_ID=?";
             PreparedStatement pstmt = conn.prepareStatement(sql);

             pstmt.setString(1,Sub1GPV.getText());
             pstmt.setString(2,Sub2GPV.getText());
             pstmt.setString(3,Sub3GPV.getText());
             pstmt.setString(4,Sub4GPV.getText());
             pstmt.setString(5,Sub5GPV.getText());
             pstmt.setString(6,Sub6GPV.getText());
             pstmt.setString(7,Sub7GPV.getText());
             pstmt.setString(8,Sub8GPV.getText());
             pstmt.setString(9,Sub9GPV. getText());
             pstmt.setString(10,Sub10GPV. getText());
             pstmt.setString(11,Sub11GPV. getText());
             pstmt.setString(12,Sub12GPV. getText());
             pstmt.setString(13,Sub13GPV. getText());
             pstmt.setString(14,Sub14GPV. getText());
             pstmt.setString(15,Sub15GPV. getText());
             pstmt.setString(16,Sub16GPV. getText());
             pstmt.setString(17,Sub17GPV. getText());
             pstmt.setString(18,Sub1GP.getText());
             pstmt.setString(19,Sub2GP.getText());
             pstmt.setString(20,Sub3GP.getText());
             pstmt.setString(21,Sub4GP.getText());
             pstmt.setString(22,Sub5GP.getText());
             pstmt.setString(23,Sub6GP.getText());
             pstmt.setString(24,Sub7GP.getText());
             pstmt.setString(25,Sub8GP.getText());
             pstmt.setString(26,Sub9GP.getText());
             pstmt.setString(27,Sub10GP.getText());
             pstmt.setString(28,Sub11GP.getText());
             pstmt.setString(29,Sub12GP.getText());
             pstmt.setString(30,Sub13GP.getText());
             pstmt.setString(31,Sub14GP.getText());
             pstmt.setString(32,Sub15GP.getText());
             pstmt.setString(33,Sub16GP.getText());
             pstmt.setString(34,Sub17GP.getText());
             pstmt.setString(35,TotalGP.getText());
             pstmt.setString(36,GPAS7.getText());
             pstmt.setString(37,enrollnumber.getText());
            
             
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
                String sql ="Delete from sgpa7 where Stu_ID=? ";
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
        Sub9GPV.setText("");
        Sub10GPV.setText("");
        Sub11GPV.setText("");
        Sub12GPV.setText("");
        Sub13GPV.setText("");
        Sub14GPV.setText("");
        Sub15GPV.setText("");
        Sub16GPV.setText("");
        Sub17GPV.setText("");
        Sub1GP.setText("");
        Sub2GP.setText("");
        Sub3GP.setText("");
        Sub4GP.setText("");
        Sub5GP.setText("");
        Sub6GP.setText("");
        Sub7GP.setText("");
        Sub8GP.setText("");
        Sub9GP.setText("");
        Sub10GP.setText("");
        Sub11GP.setText("");
        Sub12GP.setText("");
        Sub13GP.setText("");
        Sub14GP.setText("");
        Sub15GP.setText("");
        Sub16GP.setText("");
        Sub17GP.setText("");
        TotalGP.setText("");
        GPAS7.setText("");
    }
    

    @FXML
    private void BtnSearchOnAction(ActionEvent event) {
        try {
                       Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rad","root","");
                
                String sql ="Select * from sgpa7 where Stu_ID=? ";
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
              Sub9GPV.setText(rs.getString("Sub9GPV"));
              Sub10GPV.setText(rs.getString("Sub10GPV"));
              Sub11GPV.setText(rs.getString("Sub10GPV"));
              Sub12GPV.setText(rs.getString("Sub10GPV"));
              Sub13GPV.setText(rs.getString("Sub10GPV"));
              Sub14GPV.setText(rs.getString("Sub10GPV"));
              Sub15GPV.setText(rs.getString("Sub10GPV"));
              Sub16GPV.setText(rs.getString("Sub10GPV"));
              Sub17GPV.setText(rs.getString("Sub10GPV"));
        Sub1GP.setText(rs.getString("Sub1GP"));
        Sub2GP.setText(rs.getString("Sub2GP"));
        Sub3GP.setText(rs.getString("Sub3GP"));
        Sub4GP.setText(rs.getString("Sub4GP"));
        Sub5GP.setText(rs.getString("Sub5GP"));
        Sub6GP.setText(rs.getString("Sub6GP"));
        Sub7GP.setText(rs.getString("Sub7GP"));
        Sub8GP.setText(rs.getString("Sub8GP"));
        Sub9GP.setText(rs.getString("Sub9GP"));
        Sub10GP.setText(rs.getString("Sub10GP"));
        Sub11GP.setText(rs.getString("Sub10GP"));
        Sub12GP.setText(rs.getString("Sub10GP"));
        Sub13GP.setText(rs.getString("Sub10GP"));
        Sub14GP.setText(rs.getString("Sub10GP"));
        Sub15GP.setText(rs.getString("Sub10GP"));
        Sub16GP.setText(rs.getString("Sub10GP"));
        Sub17GP.setText(rs.getString("Sub10GP"));
        TotalGP.setText(rs.getString("TotalGP"));   
        GPAS7.setText(rs.getString("GPAS7"));  
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
        float S1GP, S2GP, S3GP, S4GP, S5GP, S6GP, S7GP, S8GP,S9GP,S10GP,S11GP,S12GP,S13GP,S14GP,S15GP,S16GP,S17GP, TGP, SGPA;
        S1GP = Float.parseFloat(Sub1GP.getText());
        S2GP = Float.parseFloat(Sub2GP.getText());
        S3GP = Float.parseFloat(Sub3GP.getText());
        S4GP = Float.parseFloat(Sub4GP.getText());
        S5GP = Float.parseFloat(Sub5GP.getText());
        S6GP = Float.parseFloat(Sub6GP.getText());
        S7GP = Float.parseFloat(Sub7GP.getText());
        S8GP = Float.parseFloat(Sub8GP.getText());
        S9GP = Float.parseFloat(Sub9GP.getText());
        S10GP = Float.parseFloat(Sub10GP.getText());
        S11GP = Float.parseFloat(Sub11GP.getText());
        S12GP = Float.parseFloat(Sub12GP.getText());
        S13GP = Float.parseFloat(Sub13GP.getText());
        S14GP = Float.parseFloat(Sub14GP.getText());
        S15GP = Float.parseFloat(Sub15GP.getText());
        S16GP = Float.parseFloat(Sub16GP.getText());
        S17GP = Float.parseFloat(Sub17GP.getText());
 
 
         TGP = S1GP+ S2GP+ S3GP+ S4GP+ S5GP+ S6GP+ S7GP+ S8GP+ S9GP+S10GP+S11GP+S12GP+S13GP+S14GP+S15GP+S16GP+S17GP;
         TotalGP.setText(String.valueOf(TGP));
         SGPA = TGP/16;
         GPAS7.setText(String.valueOf(SGPA));
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
      combo9.setItems(List);   
      combo10.setItems(List); 
      combo11.setItems(List); 
      combo12.setItems(List); 
      combo13.setItems(List); 
      combo14.setItems(List); 
      combo15.setItems(List); 
      combo16.setItems(List); 
      combo17.setItems(List); 
   
      
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
          Sub2GP.setText(Float.toString(Gpavalue*2));
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
           Sub3GP.setText(Float.toString(Gpavalue*2));
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
             Sub5GP.setText(Float.toString(Gpavalue*2));
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
    private void selectC9(ActionEvent event) {
         String s = combo9.getSelectionModel().getSelectedItem().toString();
        
 
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
          Sub9GPV.setText(Float.toString(Gpavalue));
      Sub9GP.setText(Float.toString(Gpavalue*2));
    }

    
    

    @FXML
    private void selectC10(ActionEvent event) {
         String s = combo10.getSelectionModel().getSelectedItem().toString();
        
 
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
          Sub10GPV.setText(Float.toString(Gpavalue));
      Sub10GP.setText(Float.toString(Gpavalue*2));
    }

    @FXML
    private void selectC11(ActionEvent event) {
 String s = combo11.getSelectionModel().getSelectedItem().toString();
        
 
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
          Sub11GPV.setText(Float.toString(Gpavalue));
      Sub11GP.setText(Float.toString(Gpavalue*2));
    }



    @FXML
    private void selectC12(ActionEvent event) {
         String s = combo12.getSelectionModel().getSelectedItem().toString();
        
 
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
          Sub12GPV.setText(Float.toString(Gpavalue));
      Sub12GP.setText(Float.toString(Gpavalue*2));
    }


    

    @FXML
    private void selectC13(ActionEvent event) {
         String s = combo13.getSelectionModel().getSelectedItem().toString();
        
 
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
          Sub13GPV.setText(Float.toString(Gpavalue));
      Sub13GP.setText(Float.toString(Gpavalue*2));
    }


    

    @FXML
    private void selectC14(ActionEvent event) {
     String s = combo14.getSelectionModel().getSelectedItem().toString();
        
 
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
          Sub14GPV.setText(Float.toString(Gpavalue));
      Sub14GP.setText(Float.toString(Gpavalue*2));
    }



    @FXML
    private void selectC15(ActionEvent event) {
     String s = combo15.getSelectionModel().getSelectedItem().toString();
        
 
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
          Sub15GPV.setText(Float.toString(Gpavalue));
      Sub15GP.setText(Float.toString(Gpavalue*2));
    }



    @FXML
    private void selectC16(ActionEvent event) {
     String s = combo16.getSelectionModel().getSelectedItem().toString();
        
 
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
          Sub16GPV.setText(Float.toString(Gpavalue));
      Sub16GP.setText(Float.toString(Gpavalue*2));
    }



    @FXML
    private void selectC17(ActionEvent event) {
     String s = combo17.getSelectionModel().getSelectedItem().toString();
        
 
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
          Sub17GPV.setText(Float.toString(Gpavalue));
      Sub17GP.setText(Float.toString(Gpavalue*2));
    }

    @FXML
    private void btnNextOnaction(ActionEvent event) {
          if(event.getSource() == ButtonNext){
         
                try{
                    FXMLLoader fxmlload = new FXMLLoader(getClass().getResource("SGPAS8.fxml"));
                    Parent root1 = (Parent) fxmlload.load();
                    Stage stage = new Stage();
                    stage.setTitle("SGPA8");
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
                    FXMLLoader fxmlload = new FXMLLoader(getClass().getResource("SGPAS6.fxml"));
                    Parent root1 = (Parent) fxmlload.load();
                    Stage stage = new Stage();
                    stage.setTitle("SGPA6");
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
