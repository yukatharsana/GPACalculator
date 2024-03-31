package Rad_project;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

public class RegisterController {

    @FXML
    private TextField Acedemic;

    @FXML
    private Button Add_btn;

    @FXML
    private AnchorPane Anchorpane2;

    @FXML
    private Button clear_btn;

    @FXML
    private TextField degree;

    @FXML
    private TextField department;

    @FXML
    private TextField duration;

    @FXML
    private TextField enrollnumber;

    @FXML
    private TextField faculty;

    @FXML
    private TextField firstname;

    @FXML
    private TextField lastname;

    @FXML
    private Button next_btn;

    @FXML
    private Button update_btn;
    @FXML
    private Button DltBtn;
    @FXML
    private Button Search_btn;
    


   

    @FXML
    private void NextBtnAction(ActionEvent event) {
         if(event.getSource() ==next_btn ){
              try{
                    FXMLLoader fxmlload = new FXMLLoader(getClass().getResource("select.fxml"));
                    Parent root1 = (Parent) fxmlload.load();
                    Stage stage = new Stage();
                    stage.setTitle("Selection");
                    stage.setScene(new Scene(root1));
                    stage.show();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
             
         }
    }

        
    /**
     *
     * @return
     */
    public Connection getConnection () {
            Connection conn;
            try {
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rad","root","");// databaseName,user name, password
                return conn; //return connection object
            } catch (Exception ex) {
                System.out.println("Error:" + ex.getMessage());
                return null;
            }

        }
    
    
    @FXML
    private void AddBtnAction(ActionEvent event) {
       
            try {
                 Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rad","root","");// databaseName,user name, password
           
             String sql ="INSERT INTO students VALUES( ?, ?, ?, ?, ?, ?, ?, ?)";
             PreparedStatement pstmt = conn.prepareStatement(sql);
             pstmt.setString(1,(enrollnumber.getText()));
             pstmt.setString(2,firstname.getText());
             pstmt.setString(3,lastname.getText());
             pstmt.setString(4,degree.getText());
             pstmt.setString(5,Acedemic.getText());
             pstmt.setString(6,faculty.getText());
             pstmt.setString(7,department.getText());
             pstmt.setString(8,duration.getText());
            
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
    private void ClearBtnAction(ActionEvent event) {
             enrollnumber.setText("");
             firstname.setText(" ");
             lastname.setText(" ");
             degree.setText(" ");
             Acedemic.setText(" ");
             faculty.setText(" ");
             department.setText(" ");
             duration.setText(" ");
           
    } 

    @FXML
    private void UpdateBtnAction(ActionEvent event) {
                 try {
                 Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rad","root","");
    
               String sql ="UPDATE students SET First_Name=?, Last_Name=?, Degree=?, Academic_Year=?, Faculty=?, Department=?, Duration=? where Stu_ID=?";
             PreparedStatement pstmt = conn.prepareStatement(sql);

             pstmt.setString(1,firstname.getText());
             pstmt.setString(2,lastname.getText());
             pstmt.setString(3,degree.getText());
             pstmt.setString(4,Acedemic.getText());
             pstmt.setString(5,faculty.getText());
             pstmt.setString(6,department.getText());
             pstmt.setString(7,duration.getText());
             pstmt.setString(8,enrollnumber.getText());
             
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
    private void DltBtnAction(ActionEvent event) {
     int opt = JOptionPane.showConfirmDialog(null,"Do you want delete?","delete",JOptionPane.YES_NO_OPTION);
     if(opt==0){
        try {
                 Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rad","root","");
                String sql ="Delete from students where Stu_ID=? ";
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
    private void SeachrBtnAction(ActionEvent event) {
        
        try {
                 Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rad","root","");
                
                String sql ="Select * from students where Stu_ID=? ";
             PreparedStatement pstmt = conn.prepareStatement(sql);
             pstmt.setString(1,(enrollnumber.getText()));
             
             ResultSet rs= pstmt.executeQuery();
             if (rs.next())
             {
             firstname.setText(rs.getString("First_Name"));
             lastname.setText(rs.getString("Last_Name"));
             degree.setText(rs.getString("Degree"));
             Acedemic.setText(rs.getString("Academic_Year"));
             faculty.setText(rs.getString("Faculty"));
             department.setText(rs.getString("Department"));
             duration.setText(rs.getString("Duration"));
           
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
        
    
}
         
       


     

    

            
          


    
   
        

    


