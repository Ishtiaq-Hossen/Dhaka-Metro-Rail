
package mainpkg;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Ishti
 */
public class MainApplication extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("signup.fxml"));
        
        Scene scene = new Scene(root);        
        stage.setScene(scene);
        //==resize and named the stage name==/
        stage.setTitle("Dhaka Metro Rail");
        stage.setResizable(false);
        //=====================//
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {  
        
        launch(args);
    }
    
}
