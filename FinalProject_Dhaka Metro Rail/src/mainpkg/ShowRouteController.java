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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Acer
 */
public class ShowRouteController implements Initializable {

    @FXML
    private TextField fromStationField;
    @FXML
    private TextField toStationField;
    @FXML
    private ComboBox<String> selectComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        fromStationField.getText();
        toStationField.getText();
         selectComboBox.getItems().addAll(
         "Uttora Express" ,"Surdanban", "Ekota", "Drutaja", "Motijhil Express"
         );
    }    

    @FXML
    private void searchPeferredTrainButtonOnClicl(MouseEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("ShowRoute2.fxml"));
                Scene scene2 = new Scene(scene2Parent);
                Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                stg2.setScene(scene2);
    }

    @FXML
    private void backTohomeButtonOnClick(MouseEvent event) throws IOException {
         Parent scene2Parent = FXMLLoader.load(getClass().getResource("passenger.fxml"));
                Scene scene2 = new Scene(scene2Parent);
                Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                stg2.setScene(scene2);
    }
    
}
