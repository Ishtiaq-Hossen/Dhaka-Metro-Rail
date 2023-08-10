/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Acer
 */
public class HealthCareCenterController implements Initializable {

    @FXML
    private ComboBox<String> healthCenterComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
        healthCenterComboBox.getItems().addAll(
         "Gulshan2 Health Center" ,"Uttora Health Csre center ", "Motijhil Health Care center", "Ever Care Hospital "
         );
    }    

    @FXML
    private void goToNextPageButtonOnClick(MouseEvent event) throws IOException {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("HealthCenter2.fxml"));
                Scene scene2 = new Scene(scene2Parent);
                Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                stg2.setScene(scene2);
        
    }

    @FXML
    private void returnHomeButtonOnClick(MouseEvent event) throws IOException {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("StationMaster.fxml"));
                Scene scene2 = new Scene(scene2Parent);
                Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                stg2.setScene(scene2);
    }

    @FXML
    private void goToNextPageForCallButtonOnClick(MouseEvent event) throws IOException {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("HealthCenter3.fxml"));
                Scene scene2 = new Scene(scene2Parent);
                Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                stg2.setScene(scene2);
    }
    
}
