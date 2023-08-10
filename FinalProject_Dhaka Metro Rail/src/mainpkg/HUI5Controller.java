/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Ishti
 */
public class HUI5Controller implements Initializable {

    @FXML
    private Label lostThingsTextField;
    @FXML
    private Label foundThingsTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void transferLostButtonClick(MouseEvent event) {
    }

    @FXML
    private void InformScecurityOnClick(MouseEvent event) {
    }
    
}
