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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Ishti
 */
public class UI7Controller implements Initializable {

    @FXML private Label showReport;
    @FXML private ComboBox<String> dataTypeComboBox;
    @FXML private TextField dataEntryTextField;
    @FXML private ComboBox<String> searchDataType;
    @FXML private TextField searchDataTextField;
    @FXML private Label searchDataFound;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        dataTypeComboBox.getItems().addAll("Accountant Data","Progess Data","Data Entry Data");
        searchDataType.getItems().addAll("Accountant Data","Progess Data","Data Entry Data");
    }    

    @FXML private void verifyButtonOnClick(MouseEvent event) {
        
        
    }

    @FXML private void recheckButtonOnClick(MouseEvent event) {
        
        
    }

    @FXML private void SaveALLData(MouseEvent event) throws IOException {
        
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("AdminFxml.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
        
    }

    @FXML
    private void saveDataEntryButtonOnClick(MouseEvent event){
        
    }

    @FXML
    private void searchDataOnClick(MouseEvent event) {
    }
    
}
