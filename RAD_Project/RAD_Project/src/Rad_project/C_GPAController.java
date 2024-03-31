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
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 * FXML Controller class
 *
 * @author IIT19033
 */
public class C_GPAController implements Initializable {

    @FXML
    private TextField enrollnumber;
   @FXML
    private TextField txtts1;
    @FXML
    private TextField txtts2;
    @FXML
    private TextField txtts3;
    @FXML
    private TextField txtts4;
    @FXML
    private TextField txtts5;
    @FXML
    private TextField txtts6;
    @FXML
    private TextField txtts7;
    @FXML
    private TextField txtts8;
    @FXML
    private TextField txttotl;
    @FXML
    private TextField txtgpa;
    @FXML
    private Button btnaddcal;
    @FXML
    private Button btnupdate;
    @FXML
    private Button btndlt;
    @FXML
    private Button btnclear;
    @FXML
    private Button btntranscript;
    @FXML
    private Button Search_btn;
    @FXML
    private Button btncalculate;
    @FXML
    private TextField enrollnumber1;
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
    private void btnaddcalOnAction(ActionEvent event) {
         try {
                 Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rad","root","");// databaseName,user name, password
           
             String sql ="INSERT INTO cgpa VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";  
                     
             PreparedStatement pstmt = conn.prepareStatement(sql);
           
             pstmt.setString(1,enrollnumber.getText());
             pstmt.setString(2,txtts1.getText());
             pstmt.setString(3,txtts2.getText());
             pstmt.setString(4,txtts3.getText());
             pstmt.setString(5,txtts4.getText());
             pstmt.setString(6,txtts5.getText());
             pstmt.setString(7,txtts6.getText());
             pstmt.setString(8,txtts7.getText());
             pstmt.setString(9,txtts8.getText());
             pstmt.setString(10,txttotl.getText());
             pstmt.setString(11,txtgpa.getText());
            
             pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null,"Record Added Sucessfully");
              
         conn.close();
         
            }
         catch (Exception e) 
         {
            JOptionPane.showMessageDialog(null,e);
        }
        
        }

    @FXML
    private void btntranscriptOnAction(ActionEvent event) throws SQLException {
             if(event.getSource() == btntranscript){
              
                    Report1 Report = new Report1();
                    Report.show();   //DISPLAY REPORT1            
             
         }
           else{
                System.out.println("something went wrong");
            }
    }

    @FXML
    private void btnupdateOnAction(ActionEvent event) {
           try {
                 Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rad","root","");
    
               String sql ="UPDATE cgpa SET Sem1GPA=?, Sem2GPA=?, Sem3GPA=?, Sem4GPA=?, Sem5GPA=?, Sem6GPA=?, Sem7GPA=?, Sem8GPA=?,TotalGPA=? ,OverAGpa=? where Stu_ID=?";
             PreparedStatement pstmt = conn.prepareStatement(sql);

            
            pstmt.setString(1,txtts1.getText());
            pstmt.setString(2,txtts2.getText());
            pstmt.setString(3,txtts3.getText());
            pstmt.setString(4,txtts4.getText());
            pstmt.setString(5,txtts5.getText());
            pstmt.setString(6,txtts6.getText());
            pstmt.setString(7,txtts7.getText());
            pstmt.setString(8,txtts8.getText());
            pstmt.setString(9,txttotl.getText());
            pstmt.setString(10,txtgpa.getText());
            pstmt.setString(11,enrollnumber.getText());
             
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
    private void btndltOnAction(ActionEvent event) {
      int opt = JOptionPane.showConfirmDialog(null,"Do you want to delete?","Delete",JOptionPane.YES_NO_OPTION);
     if(opt==0){        
        try {
                 Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rad","root","");
                String sql ="Delete from cgpa where Stu_ID=? ";
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
    private void btnclearOnAction(ActionEvent event) {
        
        enrollnumber.setText("");
        txtts1.setText("");
        txtts2.setText("");
        txtts3.setText("");
        txtts4.setText("");
        txtts5.setText("");
        txtts6.setText("");
        txtts7.setText("");
        txtts8.setText("");
        txttotl.setText("");
        txtgpa.setText("");
    }

    

    @FXML
    private void SeachrBtnAction(ActionEvent event) {
           try {
                 Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rad","root","");
                
                String sql ="Select * from cgpa where Stu_ID=? ";
             PreparedStatement pstmt = conn.prepareStatement(sql);
             pstmt.setString(1,(enrollnumber.getText()));
             
             ResultSet rs= pstmt.executeQuery();
             if (rs.next())
             {
             
        txtts1.setText(rs.getString("Sem1GPA"));
        txtts2.setText(rs.getString("Sem2GPA"));
        txtts3.setText(rs.getString("Sem3GPA"));
        txtts4.setText(rs.getString("Sem4GPA"));
        txtts5.setText(rs.getString("Sem5GPA"));
        txtts6.setText(rs.getString("Sem6GPA"));
        txtts7.setText(rs.getString("Sem7GPA"));
        txtts8.setText(rs.getString("Sem8GPA"));
        txttotl.setText(rs.getString("TotalGPA"));
        txtgpa.setText(rs.getString("OverAGPA"));   
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
    private void btnCalOnAction(ActionEvent event) {
         
        
     // Total credits and Total(credit * GPV) should be float    
    
     float ts1,ts2,ts3,ts4,ts5,ts6,ts7,ts8, tot2;
   
        ts1=  Float.parseFloat(txtts1.getText());
        ts2=  Float.parseFloat(txtts2.getText());
        ts3=  Float.parseFloat(txtts3.getText());
        ts4=  Float.parseFloat(txtts4.getText());
        ts5=  Float.parseFloat(txtts5.getText());
        ts6=  Float.parseFloat(txtts6.getText());
        ts7=  Float.parseFloat(txtts7.getText());
        ts8=  Float.parseFloat(txtts8.getText());
       
       tot2 = ts1 + ts2 + ts3 + ts4 + ts5 + ts6 + ts7 + ts8;
        
        txttotl.setText(String.valueOf(tot2));
        
        
        float totalValue,OverallGPA;
      
        totalValue = Float.parseFloat(txttotl.getText());
    
        OverallGPA = totalValue /126;
        
        txtgpa.setText(String.valueOf(OverallGPA));
        

   
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
    
    

