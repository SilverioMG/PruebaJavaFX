package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class HelpController implements Initializable {
    @FXML
    private Text text1;


    private String message = "";

    public HelpController(){

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        text1.setText(message);
    }

    public String getMessage(){
        return message;
    };
    public void setMessage(String message){
        this.message = message;
        this.text1.setText(message);
    }
}
