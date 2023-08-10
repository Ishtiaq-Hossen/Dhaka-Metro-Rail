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
public class CustomerQueriesController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField emailextField;
    @FXML
    private ComboBox<String> querirsTypeomboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         nameTextField.getText();
         emailextField.getText();
         querirsTypeomboBox.getItems().addAll(
         " face any illegal issues" ,"lost"
        );
    }    

    @FXML
    private void submitButtonOnClick(MouseEvent event) {
    }

    @FXML
    private void returnHomePageButtonOnClick(MouseEvent event) throws IOException {
         Parent mainSceneParent = FXMLLoader.load(getClass().getResource("passenger.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene1);
        window.show();
        
    }
    
}
