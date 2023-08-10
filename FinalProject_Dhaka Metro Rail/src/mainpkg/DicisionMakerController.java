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
import javafx.scene.control.TextArea;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Acer
 */
public class DicisionMakerController implements Initializable {

    @FXML
    private TextArea messageFieldTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submitButtonOnClick(MouseEvent event) {
        
    }


    @FXML
    private void backButtonOnclick(MouseEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("StationMaster.fxml"));
                Scene scene2 = new Scene(scene2Parent);
                Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
                stg2.setScene(scene2);
    }
    
}
