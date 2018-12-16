package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {



    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml")); //TODO... Usar el Bundle para la 'Localizacion'.
        primaryStage.setTitle("Hello World");
        //primaryStage.setScene(new Scene(root, 1300, 275));
        primaryStage.setScene(new Scene(root));
        primaryStage.setMaximized(true);
        primaryStage.show();

        //Abrir página en navegador predeterminado:
        //getHostServices().showDocument("http://www.yahoo.com");
    }



    public static void main(String[] args) {
        launch(args);
    }
}
