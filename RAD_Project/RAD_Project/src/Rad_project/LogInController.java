package Rad_project;


import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class LogInController {

    @FXML
    private Button LoginBtn;

    @FXML
    private FontAwesomeIconView cancel_btn;

    @FXML
    private Button close_btn;

    @FXML
    private PasswordField password;

    @FXML
    private Hyperlink resetpassword;

    @FXML
    private TextField username;
    public String Adminname = "Admin";
    public String Password = "Password"; 
    @FXML
    void LoginBtnAction(ActionEvent event) {
        if(event.getSource() == LoginBtn){
            if(username.getText().equals(Adminname) && password.getText().equals(Password)){
                try{
                    FXMLLoader fxmlload = new FXMLLoader(getClass().getResource("Registertionform.fxml"));
                    Parent root1 = (Parent) fxmlload.load();
                    Stage stage = new Stage();
                    stage.setTitle("Registrtion");
                    stage.setScene(new Scene(root1));
                    stage.show();
                }
                catch(IOException e){
                    e.printStackTrace();
                }
            }
            else if(password.getText().isEmpty() || username.getText().isEmpty()){
                System.out.println("Username or password is empty");
            }
            else{
                System.out.println("user name or password is incorrect");
            }
        }
       
    }

    private static class FontAwesomeIconView {

        public FontAwesomeIconView() {
        }
    }

}
