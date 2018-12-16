package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable{

    @FXML
    private WebView webView;

    @FXML
    private MenuBar menuBar;

    @FXML
    private MenuItem menuHelpItemAbout;

    public MainController(){

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadPageWebView();
        setEventHanderls();
    }

    private void loadPageWebView(){
        //webView.setContextMenuEnabled(false);
        WebEngine engine = webView.getEngine();
        engine.load("http://www.google.es");
    }

    private void setEventHanderls(){
        if(menuHelpItemAbout != null){
            menuHelpItemAbout.setOnAction((ActionEvent event) -> {
                try{
                    //Parent root1 = FXMLLoader.load(getClass().getResource("Help.fxml"));
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("Help.fxml"));
                    Parent root1 = loader.load();
                    HelpController helpController = loader.<HelpController>getController();
                    helpController.setMessage("Mensaje desde 'MainController'");

                    Stage stage = new Stage();
                    stage.initModality(Modality.APPLICATION_MODAL);
                    //stage.initStyle(StageStyle.UNDECORATED);
                    stage.setTitle("Help");
                    stage.setScene(new Scene(root1));
                    stage.show();
                }
                catch(Exception ex){
                    System.out.println(ex.getMessage());
                }
            });
        }
    }

}
