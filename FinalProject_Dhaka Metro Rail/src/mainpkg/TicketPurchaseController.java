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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Acer
 */
public class TicketPurchaseController implements Initializable {

    @FXML
    private TextField fromStation;
    @FXML
    private DatePicker journeyDate;
    @FXML
    private ComboBox<String> chooseClassComboBox;
    @FXML
    private TextField Station;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         fromStation.getText();
         Station.getText();
         chooseClassComboBox.getItems().addAll(
         "AC_Chair" ,"Shovon-Chair", "AC_B", "AC_C", "S_Chair"
        );
      
    };    


    

    @FXML
    private void searchButtonOnClick(MouseEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("TicketPurchase2.fxml"));
                Scene scene2 = new Scene(scene2Parent);
                Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                stg2.setScene(scene2);
    }

    @FXML
    private void backButtonOnClick(MouseEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("passenger.fxml"));
                Scene scene2 = new Scene(scene2Parent);
                Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                stg2.setScene(scene2);
    }
    
}
